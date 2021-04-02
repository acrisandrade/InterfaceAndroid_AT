package com.example.interfaceandroid_at.UI.Formacao

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FormacaoViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = " Faculdade: Infnet\n Curso: Engenharia da computação"
    }
    val text: LiveData<String> = _text
}