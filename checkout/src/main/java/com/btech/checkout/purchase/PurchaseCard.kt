package com.btech.checkout.purchase

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.btech.checkout.R
import com.btech.presentation.Lambda
import com.btech.presentation.buttons.PrimaryButton
import com.btech.presentation.divider.HorizontalDivider
import com.btech.presentation.theme.BtechTheme
import com.btech.presentation.theme.shadow200

@Preview
@Composable
fun PurchaseCardPreview() {
    PurchaseCard(
        paidAmount = "2500",
        transactionId = "1244666lll3388",
        date = "Mon, 12 July 2023",
        time = "at 11:23 PM",
        downpaymentAmount = "3000"
    )
}

@Composable
fun PurchaseCard(
    paidAmount: String,
    transactionId: String,
    date: String,
    time: String,
    downpaymentAmount: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier
            .padding(horizontal = 30.dp)
            .shadow200(borderRadius = 12.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        shape = RoundedCornerShape(12.dp)
    ) {
        Column(
            Modifier
                .fillMaxWidth()
                .padding(vertical = 24.dp)
        ) {
            PurchaseCardHeader(
                paidAmount = paidAmount,
                modifier = Modifier.padding(horizontal = 12.dp)
            )
            Spacer(Modifier.height(8.dp))

            HorizontalDivider()

            Spacer(Modifier.height(24.dp))

            TransactionDetails(
                label = stringResource(id = R.string.transaction_id),
                value = transactionId,
                modifier = Modifier.padding(horizontal = 12.dp)
            )

            Spacer(Modifier.height(24.dp))

            TransactionDetails(
                label = stringResource(id = R.string.downpayment_amount),
                value = stringResource(
                    id = R.string.egp_value,
                    formatArgs = arrayOf(downpaymentAmount)
                ),
                modifier = Modifier.padding(horizontal = 12.dp),
                trailingIcon = null
            )

            Spacer(Modifier.height(45.dp))

            PrimaryButton(
                text = stringResource(id = R.string.print_receipt),
                contentPadding = PaddingValues(
                    vertical = BtechTheme.spacing.extraLargePadding,
                    horizontal = 24.dp
                ),
                modifier = Modifier
                    .padding(horizontal = 12.dp)
                    .align(Alignment.CenterHorizontally)
            ) {
            }
        }
    }
}

@Composable
private fun TransactionDetails(
    label: String,
    value: String,
    modifier: Modifier = Modifier,
    trailingIcon: @Composable Lambda? = {
        Image(
            painter = painterResource(id = R.drawable.ic_copy),
            contentDescription = "copy"
        )
    }
) {
    Row(
        modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
            Text(
                text = label,
                style = BtechTheme.typography.utility.utilityMd
            )

            Text(
                text = value,
                style = BtechTheme.typography.utility.utilityMd
            )
        }

        trailingIcon?.let {
            it()
        }
    }
}

@Composable
fun PurchaseCardHeader(
    paidAmount: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
            // Support/Success/support-success-inverse
            // #5FB040
            Image(
                painter = painterResource(id = R.drawable.ic_success),
                contentDescription = "Success"
            )
            Column() {
                Text(
                    text = stringResource(
                        id = R.string.paid_egp_value,
                        formatArgs = arrayOf(
                            paidAmount
                        )
                    ),
                    style = BtechTheme.typography.heading.headingLg
                )

                Text(
                    text = "Mon, 12 July 2023",
                    style = BtechTheme.typography.body.bodySm
                )
            }
        }

        Text(
            text = "at 11:23 PM",
            style = BtechTheme.typography.body.bodySm,
            modifier = Modifier.align(Alignment.Bottom)
        )
    }
}
