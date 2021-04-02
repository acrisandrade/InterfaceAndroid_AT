package com.example.interfaceandroid_at.UI.ExperienciaProfissional

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ExperienciProfissionalViewModel :ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = " Empresa:Google\n Cargo: "
    }
    val text: LiveData<String> = _text
}