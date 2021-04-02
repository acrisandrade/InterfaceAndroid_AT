package com.example.interfaceandroid_at.UI.Formacao

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.interfaceandroid_at.R
import com.example.interfaceandroid_at.UI.InfoPessoais.InfoPessoaisViewModel


class FormacaoFragment : Fragment() {
    private lateinit var formacaoViewModel: FormacaoViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        formacaoViewModel =
            ViewModelProvider(this).get(FormacaoViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_formacao, container, false)
        val textView: TextView = root.findViewById(R.id.text_formacao)
        formacaoViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}