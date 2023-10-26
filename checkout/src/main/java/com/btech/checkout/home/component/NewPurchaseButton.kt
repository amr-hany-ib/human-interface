package com.btech.checkout.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.btech.checkout.R
import com.btech.presentation.Lambda
import com.btech.presentation.theme.BtechTheme

@Preview
@Composable
fun NewPurchaseButtonPreview() {
    NewPurchaseButton(
        onClick = {}
    )
}

@Composable
fun NewPurchaseButton(
    modifier: Modifier = Modifier,
    onClick: Lambda
) {
    Column(
        modifier = modifier
            .clip(RoundedCornerShape(12.dp))
            .background(BtechTheme.colors.white.white)
            .clickable {
                onClick()
            }
            .padding(
                vertical = BtechTheme.spacing.verticalPadding,
                horizontal = 14.dp
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(BtechTheme.spacing.extraLargePadding)
    ) {
        Image(
            painter = painterResource(
                id = R.drawable.ic_add_shopping_cart
            ),
            contentDescription = "new purchase"
        )
        Text(
            text = stringResource(id = R.string.new_purchase),
            style = BtechTheme.typography.body.bodySm
        )
    }
}
