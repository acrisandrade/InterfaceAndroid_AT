package com.example.interfaceandroid_at.UI.Publicacoes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.interfaceandroid_at.R




class PublicacoesFragment : Fragment() {
    lateinit var publicacoesViewModel: PublicacoesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        publicacoesViewModel=
            ViewModelProvider(this).get(PublicacoesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_publicacoes, container, false)
        val textView: TextView = root.findViewById(R.id.text_publicacoes)
        publicacoesViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}