package com.example.submissiondicoding

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DataBahasa(
    val imageBahasa : Int,
    val namaBahasa : String,
    val DescBahasa : String
) : Parcelable




