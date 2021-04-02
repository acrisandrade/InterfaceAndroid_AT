package com.example.interfaceandroid_at.UI.Cursos

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CursosViewModel : ViewModel(){
    private val _text = MutableLiveData<String>().apply {
        value = "Nome do Curso: Android com Kotlin\n Duração:6 Meses"
    }
    val text: LiveData<String> = _text
}