package com.dnar.dicodingsubmissionbfaa.di.app

import com.dnar.dicodingsubmissionbfaa.data.db.provider.UserContentProvider
import com.dnar.dicodingsubmissionbfaa.di.ui.main.MainActivityBuilderModule
import com.dnar.dicodingsubmissionbfaa.di.ui.main.MainModule
import com.dnar.dicodingsubmissionbfaa.di.ui.main.MainViewModelModule
import com.dnar.dicodingsubmissionbfaa.ui.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

// Activity Builder Module; Keyword : Dagger2
@Module
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector(
        modules = [
            MainActivityBuilderModule::class,
            MainViewModelModule::class,
            MainModule::class
        ]
    )
    abstract fun contributeMainActivity(): MainActivity

    @ContributesAndroidInjector
    abstract fun contributeUserContentProvider(): UserContentProvider

}