package com.jagan.grabnews.di


import com.jagan.grabnews.view.NewsFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class FragmentBuildersModule {
    @ContributesAndroidInjector
    abstract fun contributeRepoFragment(): NewsFragment

}
