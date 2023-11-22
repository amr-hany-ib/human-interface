package com.btech.presentation.common

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.util.Log
import android.widget.Toast

fun Context.makeShortToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

fun Context.makeLongToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}

fun Context.getDeviceDefaultLocale(): String {
    return try {
        val defaultPhoneLocale = resources.configuration.locales.get(0).language
        if (defaultPhoneLocale != enLocale && defaultPhoneLocale != arLocale) {
            arLocale
        } else {
            defaultPhoneLocale
        }
    } catch (e: Exception) {
        Log.e("getDeviceDefaultLocale()", e.stackTraceToString())
        arLocale
    }
}

fun Context.openMapIntent(
    name: String,
    lat: Double,
    lng: Double
) {
    try {
        val gmmIntentUri =
            Uri.parse("$GEO$lat,${lng}$QUERY${Uri.encode(name)}")
        val intent = Intent(
            Intent.ACTION_VIEW,
            gmmIntentUri
        )
        startActivity(intent)
    } catch (e: Exception) {
        val intent = Intent(
            Intent.ACTION_VIEW,
            Uri.parse("$GOOGLE_MAPS_SEARCH_WEBLINK$name/@$lat,$lng")
        )
        startActivity(intent)
    }
}

fun Context.openMapIntent(
    url: String
) {
    val i = Intent(Intent.ACTION_VIEW)
    i.data = Uri.parse(url)
    startActivity(i)
}
