package com.btech.presentation.buttons

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.btech.presentation.Lambda
import com.btech.presentation.theme.BtechTheme

@Preview
@Composable
fun SecondaryButtonPreview() {
    SecondaryButton(text = "Preview", onClick = {})
}

@Composable
fun SecondaryButton(
    text: String,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = ButtonDefaults.ContentPadding,
    isEnabled: Boolean = true,
    onClick: Lambda
) {
    Button(
        enabled = isEnabled,
        contentPadding = contentPadding,
        colors = ButtonDefaults.buttonColors(
            containerColor = BtechTheme.colors.blue.blue200,
            contentColor = BtechTheme.colors.accent.accent600,
            disabledContainerColor = BtechTheme.colors.field.fieldBackgroundDisabled,
            disabledContentColor = BtechTheme.colors.text.textOnColorDisabled
        ),
        onClick = onClick,
        content = {
            Text(
                text = text,
                style = BtechTheme.typography.heading.headingSm
            )
        },
        modifier = modifier
    )
}
