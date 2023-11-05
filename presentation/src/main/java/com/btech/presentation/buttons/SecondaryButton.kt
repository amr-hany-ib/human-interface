package com.btech.presentation.buttons

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
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
    contentPadding: PaddingValues = PaddingValues(horizontal = BtechTheme.spacing.verticalPadding),
    isEnabled: Boolean = true,
    shape: Shape = RoundedCornerShape(100),
    minHeight: Dp = BtechTheme.spacing.buttonMinHeight,
    colors: ButtonColors = ButtonDefaults.buttonColors(
        containerColor = BtechTheme.colors.field.fieldBackground,
        contentColor = BtechTheme.colors.text.textSecondary,
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
                style = BtechTheme.typography.utility.utilityMd,
                modifier = Modifier.align(Alignment.CenterVertically)
            )
            trailingContent?.let {
                it()
            }
        },
        modifier = modifier.heightIn(min = minHeight)
    )
}
