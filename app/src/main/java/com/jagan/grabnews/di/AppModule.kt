package com.jagan.grabnews.di

import android.app.Application
import androidx.room.Room
import com.jagan.grabnews.util.LiveDataCallAdapterFactory
import com.jagan.grabnews.api.NewsService
import com.jagan.grabnews.db.ArticleDao
import com.jagan.grabnews.db.GrabNewsDb
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module(includes = [ViewModelModule::class])
class AppModule {
    @Singleton
    @Provides
    fun provideNewsService(): NewsService {
        return Retrofit.Builder()
            .baseUrl("https://newsapi.org/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(LiveDataCallAdapterFactory())
            .build()
            .create(NewsService::class.java)
    }

    @Singleton
    @Provides
    fun provideDb(app: Application): GrabNewsDb {
        return Room
                .databaseBuilder(app, GrabNewsDb::class.java, "grabNews.db")
                .fallbackToDestructiveMigration()
                .build()
    }

    @Singleton
    @Provides
    fun provideArticleDao(db: GrabNewsDb): ArticleDao {
        return db.articleDao()
    }
}
