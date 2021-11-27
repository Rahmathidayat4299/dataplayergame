package com.example.submissiondicoding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ProfilDicoding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil_dicoding)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }

    override fun onSupportNavigateUp():Boolean{
        onBackPressed()
        return true
    }

}