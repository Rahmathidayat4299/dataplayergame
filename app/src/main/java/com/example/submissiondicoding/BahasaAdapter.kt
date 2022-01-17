package com.example.submissiondicoding

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.submissiondicoding.BahasaAdapter.*
import java.security.AccessControlContext

class BahasaAdapter(
    private val context: Context,
    private val dataBahasa: List<DataBahasa>,
    val listener: (DataBahasa) -> Unit
) : RecyclerView.Adapter<BahasaAdapter.DataBahasaViewHolder>() {


    class DataBahasaViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageBahasa = view.findViewById<ImageView>(R.id.ImageBahasa)
        val namaBahasa = view.findViewById<TextView>(R.id.namaBahasa)
        val DescBahasa = view.findViewById<TextView>(R.id.deskripsiBahasa)
        fun bindView(dataBahasa: DataBahasa, listener: (DataBahasa) -> Unit) {
            imageBahasa.setImageResource(dataBahasa.imageBahasa)
            namaBahasa.text = dataBahasa.namaBahasa
            DescBahasa.text = dataBahasa.DescBahasa
            itemView.setOnClickListener { listener(dataBahasa) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataBahasaViewHolder {
        return DataBahasaViewHolder(
            LayoutInflater.from(context).inflate(R.layout.bahasa_pemrograman, parent, false)
        )
    }

    override fun onBindViewHolder(holder: DataBahasaViewHolder, position: Int) {
        holder.bindView(dataBahasa[position], listener)
    }

    override fun getItemCount(): Int = dataBahasa.size
}


