package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {



    private lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var nonStule: RadioButton
        lateinit var armanRadio: RadioButton
        lateinit var Vinni: RadioButton
        lateinit var vova: RadioButton
        lateinit var petya: RadioButton
        lateinit var rjjevsk: RadioButton
        lateinit var cheburashka: RadioButton
        lateinit var sherlock: RadioButton
        lateinit var shtirlec: RadioButton



        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



     btn= findViewById(R.id.button)


        btn.setOnClickListener{
            val intent = Intent(this, SelectActivity::class.java)
            startActivity(intent)
        }
    }




}