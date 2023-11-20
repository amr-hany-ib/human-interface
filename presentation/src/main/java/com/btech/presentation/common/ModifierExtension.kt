package com.btech.presentation.common

import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.layout
import androidx.compose.ui.unit.Dp

fun Modifier.ignoreHorizontalParentPadding(horizontal: Dp): Modifier {
    return try {
        this.layout { measurable, constraints ->
            val overriddenWidth = constraints.maxWidth + 2 * horizontal.roundToPx()

            val placeable =
                measurable.measure(constraints.copy(maxWidth = if (overriddenWidth >= constraints.minWidth) overriddenWidth else constraints.maxWidth))
            layout(placeable.width, placeable.height) {
                placeable.place(0, 0)
            }
        }
    } catch (e: Exception) {
        Modifier
    }
}
