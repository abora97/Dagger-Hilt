package com.abora.daggerhilt.di

import android.app.Application
import com.abora.daggerhilt.data.remote.MyApi
import com.abora.daggerhilt.data.repository.MyRepositoryImp
import com.abora.daggerhilt.domain.repository.MyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideMyApi():MyApi{
        return  Retrofit.Builder()
            .baseUrl("test")
            .build()
            .create(MyApi::class.java)
    }

    @Provides
    @Singleton
    fun provideMyRepository(api :MyApi,app:Application):MyRepository{
        return MyRepositoryImp(api,app)
    }

    @Provides
    @Singleton
    @Named("hello1")
    fun provideString1()= "hello 1"

    @Provides
    @Singleton
    @Named("hello1")
    fun provideString2()= "hello 2"

}