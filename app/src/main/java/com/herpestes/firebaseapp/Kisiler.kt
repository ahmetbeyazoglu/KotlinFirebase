package com.herpestes.firebaseapp

import com.google.firebase.database.IgnoreExtraProperties


@IgnoreExtraProperties
data class Kisiler(var kisi_ad: String? = "", var kisi_yas:Int? =0) {
}