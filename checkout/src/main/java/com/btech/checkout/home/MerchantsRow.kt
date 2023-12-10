package com.btech.checkout.home

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.btech.checkout.common.RoundedBox
import com.btech.presentation.Lambda
import com.btech.presentation.theme.BtechTheme

@Preview
@Composable
fun PreviewMerchantRow() {
    MerchantRow(onClick = {})
}

@Composable
fun MerchantRow(
    modifier: Modifier = Modifier,
    onClick: Lambda
) {
    RoundedBox(
        modifier = modifier,
        paddingValues = PaddingValues(BtechTheme.spacing.spacing16)
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(vertical = BtechTheme.spacing.spacing16),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            repeat(4) {
                Box(
                    modifier = Modifier
                        .clip(shape = CircleShape)
                        .sizeIn(minHeight = 70.dp, minWidth = 70.dp)
                        .background(Color.Black)
                        .clickable { onClick() }
                )
                Spacer(Modifier.width(5.dp))
            }
        }
    }
}
