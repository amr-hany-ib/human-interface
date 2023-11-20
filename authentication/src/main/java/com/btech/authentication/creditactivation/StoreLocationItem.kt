package com.btech.authentication.creditactivation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.btech.authentication.R
import com.btech.presentation.Lambda
import com.btech.presentation.theme.BtechTheme
import com.btech.presentation.theme.notoSansFontFamily

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
            .clip(RoundedCornerShape(BtechTheme.spacing.largePadding))
            .clickable { onClick() }
            .border(
                border = BorderStroke(
                    width = Dp.Hairline,
                    color = BtechTheme.colors.borderColors.borderSubtle
                ),
                shape = RoundedCornerShape(BtechTheme.spacing.largePadding)
            )
            .padding(
                vertical = BtechTheme.spacing.largePadding,
                horizontal = BtechTheme.spacing.extraLargePadding
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = name,
                style = TextStyle(
                    fontSize = 16.sp,
                    lineHeight = 20.sp,
                    fontFamily = notoSansFontFamily,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF171717)
                )
            )

            Text(
                text = location,
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 17.5.sp,
                    fontFamily = notoSansFontFamily,
                    fontWeight = FontWeight.Normal,
                    color = Color(0xFF171717)
                )
            )
        }

        Spacer(Modifier.width(BtechTheme.spacing.mediumPadding))

        Box(
            modifier = Modifier
                .size(42.dp)
                .clip(RoundedCornerShape(BtechTheme.spacing.extraLargePadding))
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
