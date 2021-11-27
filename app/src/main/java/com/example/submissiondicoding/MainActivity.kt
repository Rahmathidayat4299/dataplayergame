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
                "Fungsi Javascript termasuk istimewa, karena mampu mengembangkan website yang menarik dan interaktif."
            ),
            DataBahasa(
                R.drawable.bahasar,
                "BahasaR",
                "Bahasa R merupakan bahasa pemrograman berbasis interpreter, sehingga eksekusi suatu aplikasi/fungsi yang ditulis dengan bahasa R terutama aplikasi/fungsi yang membutuhkan program code yang panjang akan membutuhkan waktu yang relatif lama."
            ),
            DataBahasa(
                R.drawable.cplus,
                "C#",
                " C# atau dibaca C Sharp menggabungkan prinsip C dan C++ dan dikembangkan oleh Miscrosoft."
            ),
            DataBahasa(
                R.drawable.csharp,
                "csharp",
                " merupakan sebuah bahasa pemrograman yang berorientasi objek yang dikembangkan oleh Microsoft sebagai bagian dari inisiatif kerangka "
            ),
            DataBahasa(
                R.drawable.objective,
                "objective C",
                "Objective – C merupakan bahasa pemrograman yang dikembangkan pada era 1983, oleh Brad Cox dan Tom Love"
            ),DataBahasa(
                R.drawable.php,
                "PHP",
                "PHP menjadi bahasa komputer yang populer di kalangan web developer untuk mengembangkan website"
            ),DataBahasa(
                R.drawable.python,
                "Python",
                "JPython banyak digunakan oleh perusahaan besar dalam pengembangannya seperti NASA, Instragam, Google, Yahoo, Reddit, dan juga situs streaming video populer YouTube."
            ), DataBahasa(
                R.drawable.swift,
                "Swift",
                "Bahasa Swift merupakan bahasa pengantar untuk pengembang Mac, dan iOS dan menjadi platform utama Apple."
            ), DataBahasa(
                R.drawable.typescript,
                "Typescript",
                "TypeScript adalah suatu bahasa pemrograman yang dibangun berdasarkan JavaScript."
            ), DataBahasa(
                R.drawable.vba,
                "VBA",
                "VBA merupakan kombinasi yang terintegrasi antara lingkungan pemrograman (Visual Basic Editor) dengan bahasa pemrograman (Visual Basic)"
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