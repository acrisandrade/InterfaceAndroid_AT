package com.example.interfaceandroid_at

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.interfaceandroid_at.UI.NavDrawerActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button2.setOnClickListener {
            if(editTextTextPersonName5.text.toString().isEmpty()){
                Toast.makeText(this, "Pelomenos o Nome devera estar preenchido!", Toast.LENGTH_LONG)
                        .show()
            } else {
                val cadastrar = Intent(this, NavDrawerActivity::class.java)
                cadastrar.putExtra("Nome", editTextTextPersonName5.text.toString())
                startActivity(cadastrar)
            }

        }
    }
}