package com.btech.presentation.buttons

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.btech.presentation.Lambda
import com.btech.presentation.theme.BtechTheme

@Preview
@Composable
fun PrimaryButtonPreview() {
    PrimaryButton(
        isEnabled = false,
        text = "Preview",
        onClick = {},
        trailingContent = {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = null,
                modifier = Modifier.padding(4.dp).size(16.dp)
            )
        }
    )
}

@Composable
fun PrimaryButton(
    text: String,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(BtechTheme.spacing.verticalPadding),
    isEnabled: Boolean = true,
    shape: Shape = RectangleShape,
    colors: ButtonColors = ButtonDefaults.buttonColors(
        containerColor = BtechTheme.colors.action.actionPrimary,
        contentColor = BtechTheme.colors.text.textOnColor,
        disabledContainerColor = BtechTheme.colors.field.fieldBackgroundDisabled,
        disabledContentColor = BtechTheme.colors.text.textOnColorDisabled
    ),
    trailingContent: @Composable Lambda? = null,
    onClick: Lambda
) {
    Button(
        shape = shape,
        enabled = isEnabled,
        contentPadding = contentPadding,
        colors = colors,
        onClick = onClick,
        content = {
            Text(
                text = text,
                style = BtechTheme.typography.heading.headingMd
            )

            trailingContent?.let {
                it()
            }
        },
        modifier = modifier
    )
}
