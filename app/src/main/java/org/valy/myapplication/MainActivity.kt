package org.valy.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import org.valy.myapplication.ui.theme.MyApplicationTheme
import android.content.Context
import android.content.Intent
import android.util.Patterns
import androidx.compose.material3.Button
import androidx.core.net.toUri


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding),
                        this
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier, context: Context) {
    var text by remember { mutableStateOf("") }

    fun validatePhone(): Boolean {
        val phone = text.trim()
        return when {
            phone.isEmpty() -> {
                false
            }
            !Patterns.PHONE.matcher(phone).matches() ||
                    phone.count { it.isDigit() } !in 7..15 -> {
                        false
                    }
                    else -> {
                        true
                    }
        }
    }

    Column(
        modifier = modifier
    ) {
        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            label = { Text("Введите номер") }
        )

        Button(
            onClick = {
                val intent = Intent(context, SecondActivity::class.java)
                intent.putExtra("text", text)
                context.startActivity(intent)
            }
        ) {
            Text("Открыть второй экран")
        }

        Button(
            onClick = {
                if (validatePhone()) {
                    val intent = Intent(
                        Intent.ACTION_DIAL,
                        "tel:$text".toUri()
                    )
                    context.startActivity(intent)
                }
            }
        ) {
            Text("Позвонить другу")
        }

        Button(
            onClick = {
                val sendIntent = Intent(Intent.ACTION_SEND).apply {
                    type = "text/plain"
                    putExtra(Intent.EXTRA_TEXT, text)
                }

                val chooser = Intent.createChooser(
                    sendIntent,
                    "Поделиться через..."
                )

                context.startActivity(chooser)
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Поделиться текстом")
        }
    }
}