package com.thanhuhiha.picasso.models

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

//@Parcelize
//data class SunsetPhoto(val url: String) : Parcelable {
//
//    constructor(parcel: Parcel) : this(parcel.readString()!!)
//
//    override fun writeToParcel(parcel: Parcel, flags: Int) {
//        parcel.writeString(url)
//    }
//
//    override fun describeContents(): Int {
//        return 0
//    }
//
//    companion object CREATOR : Parcelable.Creator<SunsetPhoto> {
//        override fun createFromParcel(parcel: Parcel): SunsetPhoto {
//            return SunsetPhoto(parcel)
//        }
//
//        override fun newArray(size: Int): Array<SunsetPhoto?> {
//            return arrayOfNulls(size)
//        }
//
//        fun getSunsetPhotos(): Array<SunsetPhoto> {
//            return arrayOf<SunsetPhoto>(SunsetPhoto("https://goo.gl/32YN2B"),
//                SunsetPhoto("https://goo.gl/Wqz4Ev"),
//                SunsetPhoto("https://goo.gl/U7XXdF"),
//                SunsetPhoto("https://goo.gl/ghVPFq"),
//                SunsetPhoto("https://goo.gl/qEaCWe"),
//                SunsetPhoto("https://goo.gl/vutGmM"))
//        }
//    }
//}

@Parcelize
data class SunsetPhoto(val url: String) : Parcelable {

    companion object {
        fun getSunsetPhotos(): Array<SunsetPhoto> {
            return arrayOf<SunsetPhoto>(SunsetPhoto("https://goo.gl/32YN2B"),
                SunsetPhoto("https://goo.gl/Wqz4Ev"),
                SunsetPhoto("https://goo.gl/U7XXdF"),
                SunsetPhoto("https://goo.gl/ghVPFq"),
                SunsetPhoto("https://goo.gl/qEaCWe"),
                SunsetPhoto("https://goo.gl/vutGmM"))
        }
    }
}