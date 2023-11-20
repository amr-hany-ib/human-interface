package com.btech.authentication.creditactivation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import com.btech.presentation.theme.BtechTheme

@Composable
fun CreditActivationLimitTitle(
    currency: String,
    creditLimit: String,
    modifier: Modifier = Modifier
) {
    ConstraintLayout(modifier) {
        val (currencyLabel, amount) = createRefs()
        Text(
            text = currency,
            color = BtechTheme.colors.text.textTertiary,
            style = BtechTheme.typography.heading.heading3xl,
            modifier = Modifier.constrainAs(currencyLabel) {
                top.linkTo(amount.top)
                bottom.linkTo(amount.bottom)
                end.linkTo(amount.start)
            }.padding(end = BtechTheme.spacing.mediumPadding)
        )

        Text(
            text = creditLimit,
            color = BtechTheme.colors.text.textTertiary,
            style = BtechTheme.typography.display.displayMd,
            modifier = Modifier.constrainAs(amount) {
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
                end.linkTo(parent.end)
                start.linkTo(parent.start)
            }
        )
    }
}

@Preview
@Composable
private fun CreditActivationLimitTitlePreview() {
    CreditActivationLimitTitle(currency = "EGP", creditLimit = "1000")
}
