package com.btech.presentation.divider

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.btech.presentation.theme.BtechTheme

@Composable
fun VerticalDivider(
    modifier: Modifier = Modifier,
    color: Color = BtechTheme.colors.gray.gray200
) {
    Divider(
        thickness = Dp.Hairline,
        color = color,
        modifier = modifier
            .fillMaxHeight()
            .width(1.dp)
    )
}
