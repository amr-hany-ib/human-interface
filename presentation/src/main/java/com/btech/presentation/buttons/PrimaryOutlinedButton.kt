package com.btech.presentation.buttons

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.btech.presentation.Lambda
import com.btech.presentation.theme.BtechTheme

@Preview
@Composable
fun PrimaryOutlinedButtonPreview() {
    PrimaryOutlinedButton(
        text = "Preview",
        onClick = {},
        trailingContent = {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = null,
                modifier = Modifier.padding(4.dp).size(BtechTheme.spacing.spacing16)
            )
        }
    )
}

@Composable
fun PrimaryOutlinedButton(
    text: String,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(horizontal = BtechTheme.spacing.verticalPadding),
    isEnabled: Boolean = true,
    shape: Shape = RoundedCornerShape(100),
    minHeight: Dp = BtechTheme.spacing.spacing52,
    contentColor: Color = BtechTheme.colors.action.actionPrimary,
    trailingContent: @Composable Lambda? = null,
    onClick: Lambda
) {
    OutlinedButton(
        onClick = onClick,
        modifier = modifier.heightIn(min = minHeight),
        colors = ButtonDefaults.outlinedButtonColors(
            contentColor = contentColor,
            disabledContentColor = BtechTheme.colors.text.textOnColorDisabled
        ),
        border = BorderStroke(
            BtechTheme.spacing.spacing2,
            if (isEnabled) {
                contentColor
            } else {
                BtechTheme.colors.field.fieldBackgroundDisabled
            }
        ),
        shape = shape,
        enabled = isEnabled,
        contentPadding = contentPadding
    ) {
        Text(
            text = text,
            style = BtechTheme.typography.utility.utilityMd,
            modifier = Modifier.align(Alignment.CenterVertically)
        )

        trailingContent?.let {
            it()
        }
    }
}
