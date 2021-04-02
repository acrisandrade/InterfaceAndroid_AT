package com.example.interfaceandroid_at.UI.InfoPessoais

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.interfaceandroid_at.R


class InformacaoPessoalFragment : Fragment() {
    private lateinit var infoPessoaisViewModel: InfoPessoaisViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
               infoPessoaisViewModel =
            ViewModelProvider(this).get(InfoPessoaisViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_informacao_pessoal, container, false)
        val textView: TextView = root.findViewById(R.id.text_info)
        infoPessoaisViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

}

