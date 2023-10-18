package com.btech.checkout.common.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.btech.presentation.divider.HorizontalDivider
import com.btech.presentation.theme.BtechTheme

@Preview
@Composable
fun HeaderPreview() {
    Header(
        title = "Payment request",
        subtitle = "Choose your installment plan"
    )
}

@Composable
fun Header(
    title: String,
    subtitle: String,
    modifier: Modifier = Modifier,
    showSpacer: Boolean = true,
    style: TextStyle = BtechTheme.typography.heading.heading4xl
) {
    Column(modifier) {
        Column(
            modifier = Modifier.padding(
                horizontal = BtechTheme.spacing.tagVerticalPadding,
                vertical = 12.dp
            ),
            verticalArrangement = Arrangement.spacedBy(BtechTheme.spacing.tagVerticalPadding)
        ) {
            Text(
                text = title,
                style = style
            )
            Text(
                text = subtitle,
                style = BtechTheme.typography.body.bodyMd
            )
        }
        if (showSpacer) {
            Spacer(Modifier.height(BtechTheme.spacing.tagVerticalPadding))

            HorizontalDivider(modifier = Modifier.padding(horizontal = BtechTheme.spacing.horizontalPadding))
        }
    }
}
