package com.btech.authentication.creditactivation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.btech.authentication.R
import com.btech.presentation.Lambda
import com.btech.presentation.theme.BtechTheme

@Composable
fun StoreLocationItem(
    name: String,
    location: String,
    modifier: Modifier = Modifier,
    onClick: Lambda
) {
    Row(
        modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(BtechTheme.spacing.spacing12))
            .clickable { onClick() }
            .border(
                border = BorderStroke(
                    width = Dp.Hairline,
                    color = BtechTheme.colors.borderColors.borderSubtle
                ),
                shape = RoundedCornerShape(BtechTheme.spacing.spacing12)
            )
            .padding(
                vertical = BtechTheme.spacing.spacing12,
                horizontal = BtechTheme.spacing.spacing16
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(BtechTheme.spacing.spacing6)
        ) {
            Text(
                text = name,
                style = BtechTheme.typography.heading.headingLg
            )

            Text(
                text = location,
                style = BtechTheme.typography.tokenlessStyle.fourteenTwenty400,
                color = BtechTheme.colors.text.textSecondary
            )
        }

        Spacer(Modifier.width(BtechTheme.spacing.spacing8))

        Box(
            modifier = Modifier
                .size(42.dp)
                .clip(RoundedCornerShape(BtechTheme.spacing.spacing16))
                .background(BtechTheme.colors.action.actionPrimary),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_map),
                contentDescription = "Map",
                tint = BtechTheme.colors.text.textOnColor
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun StoreLocationItemPreview() {
    StoreLocationItem(
        name = "dsljhfsj",
        location = "sldfjhskjhflskdfjlskdjflksjfsldfjhskjhflskdfjlskdjflksjfsldfjhskjhflskdfjlskdjflksjfsldfjhskjhflskdfjlskdjflksjfsldfjhskjhflskdfjlskdjflksjfsldfjhskjhflskdfjlskdjflksjf",
        onClick = {}
    )
}
