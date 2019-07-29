package com.jagan.grabnews.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.jagan.grabnews.model.Article

/**
 * Interface for database access on Article related operations.
 */
@Dao
abstract class ArticleDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insert(vararg article: Article)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insertArticles(articles: List<Article>)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract fun createArticleIfNotExists(article: Article): Long

    @Query("""SELECT * FROM Article""")
    abstract fun loadRepositories(): LiveData<List<Article>>

}
