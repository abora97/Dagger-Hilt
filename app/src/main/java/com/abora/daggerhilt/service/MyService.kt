package com.abora.daggerhilt.service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.abora.daggerhilt.domain.repository.MyRepository
import javax.inject.Inject


class MyService :Service() {

    @Inject
    lateinit var repository: MyRepository

    override fun onCreate() {
        super.onCreate()
//        repository.doNetworkCall()
    }

    override fun onBind(p0: Intent?): IBinder? {
   return null
    }
}