package com.btech.mylo.payment.paymenthub

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.Dp
import com.btech.presentation.theme.BtechTheme

@Composable
fun InstallmentDetailsLabel(
    text: String,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = BtechTheme.typography.body.bodyMd.copy(
        textDecoration = TextDecoration.Underline
    ),
    iconSize: Dp = BtechTheme.spacing.spacing16,
    horizontalArrangement: Arrangement.Horizontal = Arrangement.spacedBy(BtechTheme.spacing.spacing4)
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = horizontalArrangement,
        modifier = modifier
    ) {
        Text(
            text = text,
            style = textStyle
        )

        Icon(
            imageVector = Icons.AutoMirrored.Filled.ArrowForward,
            contentDescription = "view details",
            tint = textStyle.color,
            modifier = Modifier.size(iconSize)
        )
    }
}
