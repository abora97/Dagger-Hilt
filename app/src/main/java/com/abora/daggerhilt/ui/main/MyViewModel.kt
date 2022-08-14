package com.abora.daggerhilt.ui.main

import androidx.lifecycle.ViewModel
import com.abora.daggerhilt.domain.repository.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import dagger.Lazy

@HiltViewModel
class MyViewModel @Inject constructor(private val repository: Lazy<MyRepository>) : ViewModel() {

    init {
        repository.get()
    }


}