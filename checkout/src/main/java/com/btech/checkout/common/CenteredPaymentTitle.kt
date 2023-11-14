package com.btech.checkout.common

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.btech.presentation.theme.BtechTheme

@Composable
fun CenteredPaymentTitle(
    title: String,
    subtitle: String,
    amount: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            style = BtechTheme.typography.heading.heading3xl
        )

        Spacer(Modifier.height(BtechTheme.spacing.hugePadding))

        CenteredPaymentAmount(subtitle, amount)
    }
}
