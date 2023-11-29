package com.btech.presentation.theme

import androidx.annotation.Keep
import androidx.compose.runtime.Composable

@Keep
object BtechTheme {
    val typography
        @Composable
        get() = LocalTypography.current

    val colors
        @Composable
        get() = LocalColors.current

    val spacing
        @Composable
        get() = LocalSpacing.current
}
