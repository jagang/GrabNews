package com.jagan.grabnews.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

import com.jagan.grabnews.view.NewsViewModel
import com.jagan.grabnews.viewmodel.GrabNewsViewModelFactory

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Suppress("unused")
@Module
abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(NewsViewModel::class)
    abstract fun bindNewsViewModel(userViewModel: NewsViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: GrabNewsViewModelFactory): ViewModelProvider.Factory
}
