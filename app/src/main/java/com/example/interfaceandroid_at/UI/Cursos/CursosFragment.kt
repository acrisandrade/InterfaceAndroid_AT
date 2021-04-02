package com.example.interfaceandroid_at.UI.Cursos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.interfaceandroid_at.R
import com.example.interfaceandroid_at.UI.ExperienciaProfissional.ExperienciProfissionalViewModel


class CursosFragment : Fragment() {
    lateinit var cursosViewModel: CursosViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        cursosViewModel =
            ViewModelProvider(this).get(CursosViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_cursos, container, false)
        val textView: TextView = root.findViewById(R.id.text_curso)
        cursosViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
        // Inflate the layout for this fragment
}