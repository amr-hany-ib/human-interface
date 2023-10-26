package com.btech.checkout.cartreview.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.btech.checkout.R
import com.btech.presentation.divider.HorizontalDivider
import com.btech.presentation.theme.BtechTheme

@Preview
@Composable
fun CartListItemPreview() {
    CartListItem(
        title = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
        quantity = 2,
        price = "20000"
    )
}

@Composable
fun CartListItem(
    title: String,
    quantity: Int,
    price: String,
    modifier: Modifier = Modifier
) {
    Column(modifier) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth().padding(vertical = BtechTheme.spacing.extraLargePadding)
        ) {
            Text(
                text = title,
                modifier = Modifier.weight(1f)
            )

            Spacer(modifier = Modifier.width(8.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(4.dp, alignment = Alignment.CenterHorizontally ),
                //modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = stringResource(
                        id = R.string.quantity_x,
                        formatArgs = arrayOf(quantity)
                    ),
                    style = BtechTheme.typography.body.bodySm
                )
                Text(
                    text = stringResource(
                        id = R.string.egp_value,
                        formatArgs = arrayOf(price)
                    ),
                    style = BtechTheme.typography.heading.headingLg
                )
            }
        }

        HorizontalDivider()
    }
}
