package com.btech.checkout.offerselection.components.offer

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.btech.checkout.R
import com.btech.presentation.divider.HorizontalDivider
import com.btech.presentation.list.TextListItem
import com.btech.presentation.theme.BtechTheme

@Preview
@Composable
private fun OfferBreakdownPrview() {
    OfferBreakdown(
        financedAmount = "100000",
        interestRate = "10%",
        totalInterest = "222",
        tenure = 3,
        totalPayments = "2230",
        adminFees = "100"
    )
}

@Composable
fun OfferBreakdown(
    financedAmount: String,
    interestRate: String,
    totalInterest: String,
    tenure: Int,
    totalPayments: String,
    adminFees: String,
    modifier: Modifier = Modifier
) {
    Column(modifier) {
        HorizontalDivider()

        Spacer(Modifier.height(BtechTheme.spacing.extraLargePadding))

        Column(verticalArrangement = Arrangement.spacedBy(BtechTheme.spacing.smallPadding)) {
            TextListItem(
                title = stringResource(id = R.string.amount_to_be_financed),
                label = financedAmount
            )

            TextListItem(
                title = stringResource(id = R.string.interest_rate_apy),
                label = interestRate
            )

            TextListItem(
                title = stringResource(id = R.string.total_interest),
                label = totalInterest
            )

            TextListItem(
                title = stringResource(
                    id = R.string.total_of_x_payments,
                    formatArgs = arrayOf(
                        tenure
                    )
                ),
                label = totalPayments
            )

            TextListItem(
                title = stringResource(id = R.string.admin_fees),
                label = adminFees
            )

            Spacer(Modifier.height(BtechTheme.spacing.extraSmallPadding))
        }
    }
}
