package com.btech.checkout.common

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.btech.checkout.R
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

        Spacer(Modifier.height(BtechTheme.spacing.extraLargePadding))

        Text(
            text = subtitle,
            style = BtechTheme.typography.heading.headingLg
        )

        Spacer(Modifier.height(BtechTheme.spacing.hugePadding))

        Text(
            text = stringResource(id = R.string.egp),
            style = BtechTheme.typography.heading.heading4xl,
            color = BtechTheme.colors.text.textSecondary
        )

        Spacer(Modifier.height(BtechTheme.spacing.smallPadding))

        Text(
            text = amount,
            style = BtechTheme.typography.display.displayMd,
            color = BtechTheme.colors.text.textSecondary
        )
    }
}
