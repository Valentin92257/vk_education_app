package org.valy.myapplication.data

import org.valy.myapplication.R
import org.valy.myapplication.model.AppCategory
import org.valy.myapplication.model.AppInfo

object AppsDataSource {

    val apps: List<AppInfo> = listOf(
        AppInfo(
            id = "app-1",
            iconRes = R.drawable.ic_app_1,
            name = "Гильдия Героев",
            description = "Легендарный рейд героев в фэнтези-РПГ. Собери отряд и победи мастера подземелья!",
            category = AppCategory.GAME,
        ),
        AppInfo(
            id = "app-2",
            iconRes = R.drawable.ic_app_2,
            name = "ВКонтакте Чат",
            description = "Быстрые сообщения, голосовые звонки и групповые чаты с друзьями и коллегами.",
            category = AppCategory.SOCIAL,
        ),
        AppInfo(
            id = "app-3",
            iconRes = R.drawable.ic_app_3,
            name = "Заметки Про",
            description = "Записывайте идеи, составляйте списки дел и синхронизируйте их между устройствами.",
            category = AppCategory.PRODUCTIVITY,
        ),
        AppInfo(
            id = "app-4",
            iconRes = R.drawable.ic_app_4,
            name = "Английский за 10 минут",
            description = "Короткие ежедневные уроки, карточки со словами и тренировка произношения.",
            category = AppCategory.EDUCATION,
        ),
        AppInfo(
            id = "app-5",
            iconRes = R.drawable.ic_app_5,
            name = "Плеер Волна",
            description = "Миллионы треков, персональные подборки и офлайн-режим для прослушивания без интернета.",
            category = AppCategory.MUSIC,
        ),
        AppInfo(
            id = "app-6",
            iconRes = R.drawable.ic_app_6,
            name = "Фото Студия",
            description = "Мощный редактор фотографий: фильтры, коррекция цвета и коллажи в пару касаний.",
            category = AppCategory.PHOTOGRAPHY,
        ),
        AppInfo(
            id = "app-7",
            iconRes = R.drawable.ic_app_7,
            name = "Шагомер Плюс",
            description = "Считает шаги и калории, ведёт статистику активности и помогает достигать целей.",
            category = AppCategory.HEALTH,
        ),
        AppInfo(
            id = "app-8",
            iconRes = R.drawable.ic_app_8,
            name = "Мой Бюджет",
            description = "Учёт доходов и расходов, категории трат, наглядные графики и напоминания о платежах.",
            category = AppCategory.FINANCE,
        ),
        AppInfo(
            id = "app-9",
            iconRes = R.drawable.ic_app_9,
            name = "Попутчик",
            description = "Планируйте поездки, сохраняйте маршруты и бронируйте жильё в одном приложении.",
            category = AppCategory.TRAVEL,
        ),
        AppInfo(
            id = "app-10",
            iconRes = R.drawable.ic_app_10,
            name = "Чистильщик",
            description = "Освобождает память устройства, находит дубликаты файлов и очищает кэш приложений.",
            category = AppCategory.UTILITIES,
        ),
    )
}
