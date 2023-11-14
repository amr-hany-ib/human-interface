package com.btech.presentation.buttons

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.btech.presentation.Lambda
import com.btech.presentation.dashedBorder
import com.btech.presentation.theme.BtechTheme

@Composable
fun TertiaryButton(
    text: String,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(horizontal = BtechTheme.spacing.verticalPadding),
    isEnabled: Boolean = true,
    shape: Shape = RoundedCornerShape(100),
    minHeight: Dp = BtechTheme.spacing.buttonMinHeight,
    colors: ButtonColors = ButtonDefaults.outlinedButtonColors(
        containerColor = Color.Unspecified,
        contentColor = BtechTheme.colors.action.actionPrimary,
        disabledContainerColor = Color.Unspecified,
        disabledContentColor = BtechTheme.colors.text.textOnColorDisabled
    ),
    trailingContent: @Composable Lambda? = null,
    onClick: Lambda
) {
    OutlinedButton(
        shape = shape,
        enabled = isEnabled,
        contentPadding = contentPadding,
        colors = colors,
        border = null,
        onClick = onClick,
        content = {
            Text(
                text = text,
                style = BtechTheme.typography.utility.utilityMd
            )

            trailingContent?.let {
                it()
            }
        },
        modifier = modifier.dashedBorder(
            2.dp,
            BtechTheme.colors.borderColors.borderSubtle,
            shape,
            BtechTheme.spacing.largePadding,
            BtechTheme.spacing.largePadding
        ).heightIn(min = minHeight)
    )
}

@Preview
@Composable
fun TertiaryButtonPreview() {
    Column() {
        TertiaryButton(
            isEnabled = false,
            text = "Preview",
            onClick = {},
            trailingContent = {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = null,
                    modifier = Modifier.padding(4.dp).size(BtechTheme.spacing.extraLargePadding)
                )
            }
        )
        InactiveTertiaryButton(
            text = "Preview",
            trailingContent = {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = null,
                    modifier = Modifier.padding(4.dp).size(BtechTheme.spacing.extraLargePadding)
                )
            }
        )
    }
}

@Composable
fun InactiveTertiaryButton(
    text: String,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(horizontal = BtechTheme.spacing.verticalPadding),
    shape: Shape = RoundedCornerShape(100),
    minHeight: Dp = BtechTheme.spacing.buttonMinHeight,
    trailingContent: @Composable Lambda? = null
) {
    TertiaryButton(
        text = text,
        onClick = {},
        isEnabled = false,
        contentPadding = contentPadding,
        shape = shape,
        colors = ButtonDefaults.outlinedButtonColors(
            containerColor = Color.Unspecified,
            contentColor = BtechTheme.colors.action.actionPrimary,
            disabledContainerColor = Color.Unspecified,
            disabledContentColor = BtechTheme.colors.text.textPrimary
        ),
        trailingContent = trailingContent,
        modifier = modifier,
        minHeight = minHeight
    )
}
