package com.btech.presentation.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class BtechSpacing(
    val spacing0: Dp = 0.dp,
    val spacing2: Dp = 2.dp,
    val spacing3: Dp = 3.dp,
    val spacing4: Dp = 4.dp,
    val spacing6: Dp = 6.dp,
    val spacing8: Dp = 8.dp,
    val spacing10: Dp = 10.dp,
    val spacing40: Dp = 40.dp,
    val spacing12: Dp = 12.dp,
    val spacing16: Dp = 16.dp,
    val spacing20: Dp = 20.dp,
    val spacing24: Dp = 24.dp,
    val spacing32: Dp = 32.dp,
    val spacing88: Dp = 88.dp,
    val spacing52: Dp = 52.dp,
    val horizontalPadding: Dp = 32.dp,
    val tagVerticalPadding: Dp = 8.dp,
    val verticalPadding: Dp = 16.dp,
    val spacing66: Dp = 66.dp,
    val spacing42: Dp = 42.dp
)

val LocalSpacing = staticCompositionLocalOf {
    BtechSpacing()
}
