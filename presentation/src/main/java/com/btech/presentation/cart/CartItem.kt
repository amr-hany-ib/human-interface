package com.btech.presentation.cart

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.btech.presentation.theme.BtechTheme

@Preview(showBackground = true)
@Composable
fun CartItemPreview() {
    Column {
//
        CartItem(
            title = "Iphone 14 prohyyyyyyyyyprohyyyyyyyyyprohyyyyyyyyyprohyyyyyyyyyprohyyyyyyyyyprohyyyyyyyyyprohyyyyyyyyy max",
            subtitle = "550000",
            trailingValue = "500000"
        )
        CartItem(
            title = "Iphone 14 prohyyyyyyyyyprohyyyyyyyyyprohyyyyyyyyyprohyyyyyyyyyprohyyyyyyyyyprohyyyyyyyyyprohyyyyyyyyy max",
            subtitle = "550000",
            trailingValue = "500000"
        )
    }
}

@Composable
fun CartItem(
    title: String,
    subtitle: String?,
    titleStyle: TextStyle = BtechTheme.typography.heading.headingMd,
    subtitleStyle: TextStyle = BtechTheme.typography.body.bodySm,
    trailingValueStyle: TextStyle = BtechTheme.typography.body.bodyMd,
    trailingValue: String,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(horizontal = BtechTheme.spacing.horizontalPadding)
) {
    Column(modifier) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(contentPadding)
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = title,
                    style = titleStyle,
                    color = BtechTheme.colors.text.textPrimary
                )
                if (subtitle != null && subtitle != "null") {
                    Text(
                        text = subtitle,
                        style = subtitleStyle,
                        color = BtechTheme.colors.text.textPrimary
                    )
                }
            }

            Modifier.width(8.dp)

            Text(
                text = trailingValue,
                style = trailingValueStyle,
                color = BtechTheme.colors.text.textPrimary
            )
        }
    }
}
