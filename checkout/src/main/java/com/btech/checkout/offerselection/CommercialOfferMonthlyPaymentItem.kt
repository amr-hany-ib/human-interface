package com.btech.checkout.offerselection

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import com.btech.checkout.R
import com.btech.presentation.common.getDecimalFormat
import com.btech.presentation.theme.BtechTheme

@Preview
@Composable
private fun CommercialOfferMonthlyPaymentItemPreview() {
    CommercialOfferMonthlyPaymentItem(
        getDecimalFormat().format(2000)
    )
}

@Composable
fun CommercialOfferMonthlyPaymentItem(
    amount: String,
    modifier: Modifier = Modifier,
    delimiter: String = "."
) {
    Column(modifier) {
        Text(
            text = stringResource(id = R.string.egp),
            style = BtechTheme.typography.heading.headingMd
        )

        Spacer(Modifier.height(BtechTheme.spacing.spacing6))

        DifferentSizingPrice(amount = amount, delimiter = delimiter)
    }
}

@Composable
fun DifferentSizingPrice(
    amount: String,
    mainTextStyle: TextStyle = BtechTheme.typography.heading.heading3xl,
    supportingTextStyle: TextStyle = BtechTheme.typography.heading.headingMd,
    delimiter: String = "."
) {
    val splitDecimal = amount.split(delimiter)

    val annotatedString =
        buildAnnotatedString {
            withStyle(
                style = SpanStyle(
                    color = mainTextStyle.color,
                    fontFamily = mainTextStyle.fontFamily,
                    fontWeight = mainTextStyle.fontWeight,
                    fontSize = mainTextStyle.fontSize
                )
            ) {
                append(splitDecimal.first())
            }
            withStyle(
                style = SpanStyle(
                    color = supportingTextStyle.color,
                    fontFamily = supportingTextStyle.fontFamily,
                    fontWeight = supportingTextStyle.fontWeight,
                    fontSize = supportingTextStyle.fontSize
                )
            ) {
                append("$delimiter${splitDecimal.last()} ${stringResource(id = R.string.slash_per_month)}")
            }
        }
    Text(
        text = annotatedString,
        style = BtechTheme.typography.heading.heading3xl
    )
}
