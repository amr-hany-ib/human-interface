package com.btech.checkout.common

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.btech.checkout.R
import com.btech.presentation.theme.BtechTheme
import com.skydoves.landscapist.coil.CoilImage

@Preview
@Composable
fun CarSummaryPreview() {
    CartSummary(
        merchantImage = null,
        title = "B.tech",
        subtitle = "2 items",
        total = "552000"
    )
}

@Composable
fun CartSummary(
    modifier: Modifier = Modifier,
    merchantImage: Any?,
    title: String,
    subtitle: String,
    total: String
) {
    Row(
        modifier
            .fillMaxWidth()
            .background(BtechTheme.colors.layerColors.layerBackground)
            .padding(
                horizontal = BtechTheme.spacing.verticalPadding,
                vertical = BtechTheme.spacing.horizontalPadding
            ),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(BtechTheme.spacing.verticalPadding)
        ) {
            Box(
                modifier = Modifier.clip(CircleShape).background(BtechTheme.colors.white.white)
                    .size(56.dp)
                    .padding(4.dp),
                contentAlignment = Alignment.Center
            ) {
                CoilImage(
                    imageModel = {
                        merchantImage ?: R.drawable.ic_storefront
                    },
                    modifier = Modifier
                        .padding(4.dp)
                        .matchParentSize()
                )
            }

            Column() {
                Text(
                    text = title,
                    style = BtechTheme.typography.heading.headingLg,
                    color = BtechTheme.colors.text.textPrimary
                )

                Text(
                    text = subtitle,
                    style = BtechTheme.typography.body.bodySm,
                    color = BtechTheme.colors.text.textPrimary
                )
            }
        }

        Text(
            text = total,
            style = BtechTheme.typography.heading.heading2xl,
            color = BtechTheme.colors.text.textPrimary
        )
    }
}
