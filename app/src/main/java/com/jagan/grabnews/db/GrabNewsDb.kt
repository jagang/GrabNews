package com.jagan.grabnews.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.jagan.grabnews.model.Article
import com.jagan.grabnews.model.News

/**
 * Main database description.
 */
@Database(
        entities = [Article::class],
        version = 1,
        exportSchema = false
)
abstract class GrabNewsDb : RoomDatabase() {

    abstract fun articleDao(): ArticleDao

}