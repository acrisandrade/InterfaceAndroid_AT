package com.example.interfaceandroid_at.UI.InfoPessoais

import android.media.Image
import android.widget.ImageView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.interfaceandroid_at.R

class InfoPessoaisViewModel : ViewModel() {



    private val _text = MutableLiveData<String>().apply {
        value ="Nome:Cristina\n Idade:21 anos\n Data de nascimento: 15/06/1998\n Estado civil: Solteira\n " +
        "telefone:(21)0000-0000"
    }
   val text: LiveData<String> = _text


}