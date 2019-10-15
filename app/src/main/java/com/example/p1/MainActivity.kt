package com.example.p1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //onCreate = main();
    //: = extends
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView create the UI
        //R = resources

        setContentView(R.layout.activity_main)
        //TODO Continue Your Work here
        val buttonHelloWorld : Button = findViewById(R.id.buttonHelloWorld)
        buttonHelloWorld.setOnClickListener { showMessage() }
        val buttonReset : Button = findViewById(R.id.buttonReset)
        buttonReset.setOnClickListener { showReset() }
    }

    private fun showReset() {
        val textViewMessage : TextView = findViewById(R.id.textViewMessage)
        textViewMessage.setText(getString(R.string.reset))
    }

    private fun showMessage() {
        val textViewMessage : TextView = findViewById(R.id.textViewMessage)
        textViewMessage.setText("Hello <Your name here>")
    }
}
