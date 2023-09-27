package com.btech.presentation.buttons

import androidx.compose.foundation.BorderStroke
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.btech.presentation.Lambda
import com.btech.presentation.theme.BtechTheme

@Preview
@Composable
fun PrimaryOutlinedButtonPreview() {
    PrimaryOutlinedButton(
        text = "Preview",
        onClick = {}
    )
}

@Composable
fun PrimaryOutlinedButton(
    text: String,
    modifier: Modifier = Modifier,
    onClick: Lambda
) {
    OutlinedIconButton(
        onClick = onClick,
        modifier = modifier,
        colors = IconButtonDefaults.outlinedIconButtonColors(
            contentColor = BtechTheme.colors.action.actionPrimary
        ),
        border = BorderStroke(
            2.dp,
            BtechTheme.colors.action.actionPrimary
        ),
        shape = RectangleShape
    ) {
        Text(
            text = text,
            style = BtechTheme.typography.heading.headingMd
        )
    }
}
