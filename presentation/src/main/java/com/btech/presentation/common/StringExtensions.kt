package com.btech.presentation.common

import android.icu.text.CompactDecimalFormat
import java.lang.ClassCastException

fun Number.formatNumber(): String {
    return try {
        CompactDecimalFormat.getInstance().format(this)
    } catch (e: NumberFormatException) {
        this.toString()
    } catch (e: ClassCastException) {
        this.toString()
    } catch (e: Exception) {
        this.toString()
    }
}
