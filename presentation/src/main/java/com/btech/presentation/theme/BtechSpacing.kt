package com.btech.presentation.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class BtechSpacing(
    val horizontalPadding: Dp = 24.dp,
    val tagVerticalPadding: Dp = 8.dp,
    val verticalPadding: Dp = 16.dp
)

val LocalSpacing = staticCompositionLocalOf {
    BtechSpacing()
}
