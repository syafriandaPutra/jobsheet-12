package com.example.belajarandroid

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var nameEditText: EditText
    private lateinit var buttonButton: Button
    private lateinit var buttonTextView: TextView

    private fun initComponents(){
        nameEditText = findViewById(R.id.nameEditText)
        buttonButton = findViewById(R.id.buttonButton)
        buttonTextView = findViewById(R.id.buttonTextView)
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_world)

        initComponents()

        buttonTextView.text = "Halo"

        buttonButton.setOnClickListener{
            val name = nameEditText.text.toString()
            buttonTextView.text = resources.getString(R.string.buttonTextView, name)
            resources.getStringArray(R.array.names).forEach {
                Log.i("PZN",it)
            }
        }
    }
}