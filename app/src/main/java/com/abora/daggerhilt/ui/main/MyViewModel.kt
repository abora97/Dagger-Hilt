package com.abora.daggerhilt.ui.main

import androidx.lifecycle.ViewModel
import com.abora.daggerhilt.domain.repository.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(private val repository: MyRepository) : ViewModel() {


}