package com.zfuncode.chaptertiga_.topicdua

import android.os.Parcel
import android.os.Parcelable

data class PersonParcelable(val nama : String, val umur : Int, val kota : String) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString().toString(),
        parcel.readInt(),
        parcel.readString().toString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nama)
        parcel.writeInt(umur)
        parcel.writeString(kota)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PersonParcelable> {
        override fun createFromParcel(parcel: Parcel): PersonParcelable {
            return PersonParcelable(parcel)
        }

        override fun newArray(size: Int): Array<PersonParcelable?> {
            return arrayOfNulls(size)
        }
    }
}