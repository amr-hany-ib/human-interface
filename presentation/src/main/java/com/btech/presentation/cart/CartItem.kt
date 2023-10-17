package com.btech.presentation.cart

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.btech.presentation.divider.HorizontalDivider
import com.btech.presentation.theme.BtechTheme

@Preview(showBackground = true)
@Composable
fun CartItemPreview() {
    CartItem(
        title = "Iphone 14 pro max",
        subtitle = "550000",
        trailingValue = "1"
    )
}

@Composable
fun CartItem(
    title: String,
    subtitle: String,
    trailingValue: String,
    modifier: Modifier = Modifier,
    showDivider: Boolean = true

) {
    Column(modifier) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .background(BtechTheme.colors.gray.gray100)
                .padding(
                    vertical = BtechTheme.spacing.verticalPadding,
                    horizontal = BtechTheme.spacing.tagVerticalPadding
                )
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = title,
                    style = BtechTheme.typography.heading.headingLg,
                    color = BtechTheme.colors.text.textPrimary
                )
                Text(
                    text = subtitle,
                    style = BtechTheme.typography.body.bodyMd,
                    color = BtechTheme.colors.text.textPrimary
                )
            }

            Modifier.width(8.dp)

            Box(
                modifier = Modifier.background(BtechTheme.colors.gray.gray200)
                    .padding(BtechTheme.spacing.tagVerticalPadding)
            ) {
                Text(
                    text = trailingValue,
                    style = BtechTheme.typography.heading.headingLg,
                    color = BtechTheme.colors.text.textPrimary
                )
            }
        }

        if (showDivider) {
            HorizontalDivider()
        }
    }
}
