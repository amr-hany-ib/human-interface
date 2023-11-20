package com.btech.presentation.progress

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.zIndex
import com.btech.presentation.theme.BtechTheme

@Preview
@Composable
fun CircularProgressIndicatorPreview() {
    CircularProgressIndicator()
}

@Composable
fun CircularProgressIndicator(
    color: Color = BtechTheme.colors.action.actionPrimary,
    size: Dp = BtechTheme.spacing.circularProgressPadding,
    strokeWidth: Dp = BtechTheme.spacing.mediumPadding
) {
    androidx.compose.material3.CircularProgressIndicator(
        color = color,
        modifier = Modifier
            .size(size)
            .zIndex(1f),
        strokeWidth = strokeWidth
    )
}
