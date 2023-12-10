package com.btech.presentation.buttons

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.btech.presentation.Lambda
import com.btech.presentation.theme.BtechTheme

@Preview(locale = "ar")
@Composable
fun PrimaryButtonPreview() {
    PrimaryButton(
        isEnabled = false,
        text = "المتابعة",
        onClick = {},
        trailingContent = {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = null,
                modifier = Modifier
                    .padding(4.dp)
                    .size(BtechTheme.spacing.spacing16)
            )
        }
    )
}

@Composable
fun PrimaryButton(
    text: String,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(horizontal = BtechTheme.spacing.verticalPadding),
    isEnabled: Boolean = true,
    shape: Shape = RoundedCornerShape(100),
    minHeight: Dp = BtechTheme.spacing.spacing52,
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
