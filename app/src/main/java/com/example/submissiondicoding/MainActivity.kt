package com.example.submissiondicoding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity(), View.OnClickListener {


    private lateinit var btnProfile: ImageButton
    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnProfile = findViewById(R.id.btnProfile)
        btnProfile.setOnClickListener(this)

        val bahasaPemrograman = listOf<DataBahasa>(
            DataBahasa(
                R.drawable.javascript,
                "javascript",
                "Javascript adalah bahasa terpopuler"
            ),
            DataBahasa(
                R.drawable.javascript,
                "Rahmat hidayat",
                "Rahmat hidayat adalah bahasa terpopuler"
            ),
            DataBahasa(
                R.drawable.javascript,
                "javascript",
                "Javascript adalah bahasa terpopuler"
            ),
            DataBahasa(
                R.drawable.javascript,
                "javascript",
                "Javascript adalah bahasa terpopuler"
            ),
            DataBahasa(
                R.drawable.javascript,
                "javascript",
                "Javascript adalah bahasa terpopuler"
            ),DataBahasa(
                R.drawable.javascript,
                "javascript",
                "Javascript adalah bahasa terpopuler"
            ),DataBahasa(
                R.drawable.javascript,
                "javascript",
                "Javascript adalah bahasa terpopuler"
            )




        )
        val recyclerView = findViewById<RecyclerView>(R.id.rcBahasa)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = BahasaAdapter(this, bahasaPemrograman) {
            val intentBahasa = Intent (this,DetailActivityBahasa::class.java)
            intentBahasa.putExtra(INTENT_PARCELABLE,it)
            startActivity(intentBahasa)


        }


    }


    override fun onClick(v: View) {
        when (v.id) {
            R.id.btnProfile -> {
                val intentProfile = Intent(this@MainActivity, ProfilDicoding::class.java)
                startActivity(intentProfile)
            }
        }
    }
}