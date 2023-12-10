package com.btech.checkout.common

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import com.btech.presentation.theme.BtechTheme

@Composable
fun CenteredPaymentTitle(
    title: String,
    subtitle: String,
    amount: String,
    modifier: Modifier = Modifier,
    titleStyle: TextStyle = BtechTheme.typography.heading.heading3xl.copy(color = BtechTheme.colors.text.textPrimary)
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            style = titleStyle
        )

        Spacer(Modifier.height(BtechTheme.spacing.spacing24))

        CenteredPaymentAmount(subtitle, amount)
    }
}

@Preview()
@Composable
fun CenteredPaymentTitlePreview() {
    CenteredPaymentTitle("Test", "Subtitle", "3000")
}
