package com.vdvapp.myworkingtimetracker.ui.history

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HistoryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Это фрагмент отображжения истории учета рабочего времени, иначе табеля"
    }
    val text: LiveData<String> = _text
}