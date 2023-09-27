package com.btech.presentation.divider

import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import com.btech.presentation.theme.BtechTheme

@Composable
fun HorizontalDivider(
    modifier: Modifier = Modifier,
    color: Color = BtechTheme.colors.gray.gray200
) {
    Divider(
        thickness = Dp.Hairline,
        color = color,
        modifier = modifier
    )
}
