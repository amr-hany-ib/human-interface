package com.btech.presentation.common

import android.content.Context
import android.widget.Toast

fun Context.makeShortToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

fun Context.makeLongToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}
