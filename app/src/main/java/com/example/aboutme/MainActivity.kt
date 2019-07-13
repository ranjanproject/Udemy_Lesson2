package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton = findViewById<Button>(R.id.button)

        myButton.setOnClickListener {
            addText(it)
        }

    }

    fun addText(view: View){
      val myText = findViewById<EditText>(R.id.myText)
      val show = findViewById<TextView>(R.id.show)

        show.text = myText.text
//        myText.visibility = View.GONE
//        view.visibility = View.GONE
        show.visibility = View.VISIBLE

        //hide keyboard from UI

        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)

    }
}
