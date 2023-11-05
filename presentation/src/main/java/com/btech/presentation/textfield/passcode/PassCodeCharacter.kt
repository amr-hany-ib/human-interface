package com.btech.presentation.textfield.passcode

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.btech.presentation.theme.BtechTheme

@Composable
fun PassCodeCharacter(
    isFilled: Boolean,
    isError: Boolean = false,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .background(
                color = if (isFilled) {
                    if (isError) {
                        BtechTheme.colors.background.backgroundColor
                    } else {
                        BtechTheme.colors.action.actionPrimary
                    }
                } else {
                    BtechTheme.colors.background.backgroundColor
                },
                shape = CircleShape
            )
            .border(
                width = 2.dp,
                color =
                if (isError) {
                    BtechTheme.colors.action.actionDanger
                } else {
                    BtechTheme.colors.borderColors.borderInteractive
                },
                shape = CircleShape
            )
            .clip(CircleShape)
            .size(24.dp)
            .aspectRatio(1f)
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewPassCodeCharacter() {
    Row {
        repeat(4) {
            PassCodeCharacter(
                isFilled = false,
                isError = false
            )
        }
    }
}
