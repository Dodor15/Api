package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.databinding.ActivitySelectBinding

class SelectActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySelectBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelectBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button2.setOnClickListener{
            if(binding.nonStule.isChecked==true){

            }

            if(binding.armanRadio.isChecked==true){

            }

            if(binding.Vinni.isChecked==true){

            }

            if(binding.vova.isChecked==true){

            }

            if(binding.petya.isChecked==true){

            }

            if(binding.rjjevsk.isChecked==true){

            }

            if(binding.cheburashka.isChecked==true){

            }

            if(binding.sherlock.isChecked==true){

            }

            if(binding.shtirlec.isChecked==true){

            }
        }




    }

}