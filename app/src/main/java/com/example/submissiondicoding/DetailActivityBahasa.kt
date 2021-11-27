package com.example.submissiondicoding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivityBahasa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_bahasa)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val dataBahasa = intent.getParcelableExtra<DataBahasa>(MainActivity.INTENT_PARCELABLE)
        val imageBahasa = findViewById<ImageView>(R.id.ivBahasa)
        val namaBahasa = findViewById<TextView>(R.id.tvJudulBahasa)
        val DescBahasa = findViewById<TextView>(R.id.tvDeskripsiBahasa)

        imageBahasa.setImageResource(dataBahasa?.imageBahasa!!)
        namaBahasa.text = dataBahasa.namaBahasa
        DescBahasa.text = dataBahasa.DescBahasa

    }

    override  fun onSupportNavigateUp(): Boolean{
        onBackPressed()
        return true
    }
}