package com.btech.checkout.offerselection.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.btech.checkout.R
import com.btech.presentation.theme.BtechTheme

@Preview
@Composable
fun MerchantOfferCardPreview() {
    MerchantOfferCard(
        "B.tech",
        2000,
    )
}

@Composable
fun MerchantOfferCard(
    merchantName: String,
    cartAmount: Int,
    // downPayment: Int,
    modifier: Modifier = Modifier
) {
    Box(
        modifier
            .padding(vertical = 12.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(BtechTheme.colors.gray.gray100)
    ) {
        Row(
            Modifier
                .padding(BtechTheme.spacing.extraLargePadding)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Box(
                    modifier = Modifier
                        .size(56.dp)
                        .clip(CircleShape)
                        .border(1.dp, Color.White, CircleShape)
                )

                Text(
                    text = merchantName,
                    style = BtechTheme.typography.heading.headingLg
                )
            }

            Text(
                text = stringResource(
                    id = R.string.egp_value,
                    formatArgs = arrayOf(
                        cartAmount
                    )
                ),
                style = BtechTheme.typography.heading.headingLg,
                color = BtechTheme.colors.gray.gray800
            )
        }
    }
}
