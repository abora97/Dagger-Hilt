package com.abora.daggerhilt.data.repository

import android.app.Application
import android.util.Log
import com.abora.daggerhilt.R
import com.abora.daggerhilt.data.remote.MyApi
import com.abora.daggerhilt.domain.repository.MyRepository
import javax.inject.Inject

class MyRepositoryImp @Inject constructor(private val api: MyApi, private val appContext: Application) : MyRepository {

    init {
        val appName = appContext.getString(R.string.app_name)
        println("Hello from the repository. The app name is $appName")
        Log.d("MyRepositoryImp","Hello from the repository . this name is $appName")
    }

    override suspend fun doNetworkCall() {

    }

}