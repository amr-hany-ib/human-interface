package com.btech.checkout.common

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import com.btech.presentation.theme.BtechTheme

@Composable
fun CenteredPaymentAmount(
    subtitle: String,
    amount: String,
    modifier: Modifier = Modifier,
    spacing: Dp = BtechTheme.spacing.spacing16

) {
    Column(
        modifier,
        verticalArrangement = Arrangement.spacedBy(spacing),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = subtitle,
            style = BtechTheme.typography.heading.heading4xl.copy(
                textAlign = TextAlign.Center
            ),
            color = BtechTheme.colors.accent.accent1000
        )

        Text(
            text = amount,
            style = BtechTheme.typography.display.displayMd.copy(
                textAlign = TextAlign.Center
            ),
            color = BtechTheme.colors.accent.accent1000
        )
    }
}
