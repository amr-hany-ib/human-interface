package com.btech.authentication.creditactivation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.btech.presentation.theme.BtechTheme

@Composable
fun CreditActivationLimitTitle(
    title: String,
    currency: String,
    creditLimit: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(BtechTheme.spacing.largePadding),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            color = BtechTheme.colors.text.textOnColor,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            style = BtechTheme.typography.body.bodyMd
        )

        Text(
            text = creditLimit,
            color = BtechTheme.colors.text.textTertiary,
            style = BtechTheme.typography.display.displayMd,
            textAlign = TextAlign.Center
        )
        Text(
            text = currency,
            color = BtechTheme.colors.text.textTertiary,
            style = BtechTheme.typography.heading.heading3xl,
            modifier = Modifier.padding(end = BtechTheme.spacing.mediumPadding),
            textAlign = TextAlign.Center
        )
    }
}

@Preview
@Composable
private fun CreditActivationLimitTitlePreview() {
    CreditActivationLimitTitle(
        title = "You have an approved credit limit",
        currency = "EGP",
        creditLimit = "1000"
    )
}
