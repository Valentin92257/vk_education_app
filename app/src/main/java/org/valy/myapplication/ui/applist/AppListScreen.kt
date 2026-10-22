package org.valy.myapplication.ui.applist

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.valy.myapplication.data.AppsDataSource
import org.valy.myapplication.model.AppInfo
import org.valy.myapplication.ui.theme.MyApplicationTheme

@Composable
fun AppListScreen(
    apps: List<AppInfo>,
    modifier: Modifier = Modifier,
) {
    Scaffold(
        modifier = modifier,
        topBar = { AppListToolbar() },
    ) { innerPadding ->
        LazyColumn(
            contentPadding = innerPadding,
            modifier = Modifier.fillMaxSize(),
        ) {
            items(items = apps, key = { it.id }) { app ->
                AppListItem(app = app)
                HorizontalDivider(modifier = Modifier.padding(start = 96.dp))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun AppListScreenPreview() {
    MyApplicationTheme {
        AppListScreen(apps = AppsDataSource.apps)
    }
}
