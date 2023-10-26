package com.btech.presentation.common

import android.icu.text.CompactDecimalFormat
import java.lang.ClassCastException
import java.math.BigDecimal
import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.Locale

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

fun Number.formatCentsToPoundsDouble(): String {
    val dec = getDecimalFormat()
    val priceInPounds = this.toDouble().toBigDecimal().divide(BigDecimal(100))
    return dec.format(priceInPounds)
}

fun Int.formatCentsToPounds(): String {
    val dec = getDecimalFormat()
    val priceInPounds = this.toBigDecimal().divide(BigDecimal(100))
    return dec.format(priceInPounds)
}

fun String.formatPoundsToCents(): Int {
    val dec = getDecimalFormat()
    return ((dec.parse(this) ?: 0f).toDouble() * 100).toInt()
}

fun getDecimalFormat(): DecimalFormat {
    val decimalSymbol = DecimalFormatSymbols()

    if (Locale.getDefault().language == "ar") {
        decimalSymbol.decimalSeparator = ','
        decimalSymbol.groupingSeparator = '،'
    } else {
        decimalSymbol.decimalSeparator = '.'
    }
    val decimalFormat = DecimalFormat("#,##0.00")
    decimalFormat.decimalFormatSymbols = decimalSymbol
    return decimalFormat
}
