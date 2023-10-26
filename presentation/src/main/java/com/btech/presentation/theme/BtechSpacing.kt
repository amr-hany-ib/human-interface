package com.btech.presentation.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class BtechSpacing(
    val zeroPadding: Dp = 0.dp,
    val extraSmallPadding: Dp = 4.dp,
    val smallPadding: Dp = 6.dp,
    val mediumPadding: Dp = 8.dp,
    val largePadding: Dp = 12.dp,
    val extraLargePadding: Dp = 16.dp,
    val hugePadding: Dp = 24.dp,
    val extraHugePadding: Dp = 32.dp,
    val circularProgressPadding: Dp = 88.dp,
    val buttonMinHeight: Dp = 52.dp,
    val horizontalPadding: Dp = 32.dp,
    val tagVerticalPadding: Dp = 8.dp,
    val verticalPadding: Dp = 16.dp
)

val LocalSpacing = staticCompositionLocalOf {
    BtechSpacing()
}
