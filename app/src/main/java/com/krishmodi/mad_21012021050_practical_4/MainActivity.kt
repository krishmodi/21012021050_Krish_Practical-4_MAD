package com.krishmodi.mad_21012021050_practical_4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var med1:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        med1=findViewById(R.id.edittext)
    }

    fun LaunchSetActivity(view: View) {
        intent = Intent(this,SetActivity::class.java)
        startActivity(intent)
    }
}