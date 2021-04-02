package com.example.interfaceandroid_at.UI.Publicacoes

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PublicacoesViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Titulo:\n Tipo: \n Descriação:"
    }
    val text: LiveData<String> = _text
}