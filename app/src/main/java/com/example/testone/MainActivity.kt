package com.example.testone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testone.databinding.ActivityMainBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnOne.setOnClickListener(){

            MaterialAlertDialogBuilder(this)
                .setTitle("Alert Dialog")
                .setMessage("Are You Sure ?")

                .setNeutralButton("Cancel"){ _ , _ ->
                    Snackbar.make(it,"CANCEL",Snackbar.LENGTH_SHORT).show()
                }
                .setNegativeButton("No"){ _ , _ ->
                    Snackbar.make(it,"NO",Snackbar.LENGTH_SHORT).show()
                }
                .setPositiveButton("Yes"){ _ , _ ->
                    Snackbar.make(it,"YES",Snackbar.LENGTH_SHORT).show()
                }
                .show()

        }
    }
}