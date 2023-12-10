package com.btech.checkout.offerselection

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.btech.checkout.R
import com.btech.presentation.CollapsingHeader
import com.btech.presentation.Lambda
import com.btech.presentation.divider.HorizontalDivider
import com.btech.presentation.theme.BtechTheme

@Preview(showBackground = true)
@Composable
fun CommercialOfferPreview() {
    CommercialOffer(
        payment = "3 Months",
        downPayment = "4000",
        tenure = 3,
        tenureDuration = "months",
        interestRate = "12%",
        totalPayments = "444444",
        adminFees = "100",
        financedAmount = "1000909",
        totalInterest = "1222",
        onSelection = {}
    )
}

@Composable
fun CommercialOffer(
    downPayment: String,
    payment: String,
    tenure: Int,
    tenureDuration: String,
    financedAmount: String,
    interestRate: String,
    totalInterest: String,
    totalPayments: String,
    adminFees: String,
    modifier: Modifier = Modifier,
    isSelected: Boolean = false,
    onSelection: Lambda
) {
    Column(
        modifier = modifier
            .clip(RoundedCornerShape(12.dp))
            .border(
                width = 2.dp,
                color = if (isSelected) BtechTheme.colors.borderColors.borderInteractive else Color.Unspecified,
                shape = RoundedCornerShape(size = 12.dp)
            )
            .background(BtechTheme.colors.field.fieldBackground)
            .clickable {
                onSelection()
            }
            .padding(horizontal = 16.dp, vertical = 12.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            CommercialOfferMonthlyPaymentItem(amount = payment)

            Text(
                text = stringResource(
                    id = R.string.for_x_duration,
                    formatArgs = arrayOf(tenure, tenureDuration)
                ),
                style = BtechTheme.typography.body.bodySm,
                color = BtechTheme.colors.text.textPrimary,
                textAlign = TextAlign.Center
            )
        }

        Spacer(Modifier.height(BtechTheme.spacing.spacing24))

        OfferTag(downPaymentAmount = downPayment)

        Spacer(Modifier.height(BtechTheme.spacing.spacing12))

        HorizontalDivider()

        CollapsingHeader(
            surfaceColor = BtechTheme.colors.field.fieldBackground,
            title = stringResource(R.string.breakdown),
            isContentVisible = isSelected,
            onClick = {
                onSelection()
            }
        ) {
            OfferBreakdown(
                financedAmount,
                interestRate,
                totalInterest,
                tenure,
                totalPayments,
                adminFees
            )
        }
    }
}
