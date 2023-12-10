package com.btech.checkout.common

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import com.btech.presentation.Lambda
import com.btech.presentation.divider.HorizontalDivider
import com.btech.presentation.theme.BtechTheme

@Preview(showBackground = true)
@Composable
fun HeaderPreview() {
    Header(
        title = "ادخل رمز عربة التسوق",
        subtitle = "Choose your installment plan"
    )
}

@Composable
fun Header(
    title: String,
    subtitle: String,
    modifier: Modifier = Modifier,
    titleStyle: TextStyle = BtechTheme.typography.heading.heading4xl,
    subtitleStyle: TextStyle = BtechTheme.typography.body.bodyLg,
    contentPadding: PaddingValues = PaddingValues(horizontal = BtechTheme.spacing.horizontalPadding),
    showSpacer: Boolean = false
) {
    Column(modifier) {
        Column(
            modifier = Modifier
                .padding(contentPadding)
                .padding(vertical = BtechTheme.spacing.spacing2),
            verticalArrangement = Arrangement.spacedBy(BtechTheme.spacing.spacing12)
        ) {
            Text(
                text = title,
                style = titleStyle,
                modifier = Modifier.fillMaxWidth()
            )

            Text(
                text = subtitle,
                style = subtitleStyle,
                modifier = Modifier.fillMaxWidth()
            )
        }
        if (showSpacer) {
            Spacer(Modifier.height(BtechTheme.spacing.tagVerticalPadding))
            HorizontalDivider(modifier = Modifier.padding(horizontal = BtechTheme.spacing.horizontalPadding))
        }
    }
}

@Composable
fun Header(
    title: String,
    subtitle: @Composable Lambda,
    modifier: Modifier = Modifier,
    titleStyle: TextStyle = BtechTheme.typography.heading.heading4xl,
    contentPadding: PaddingValues = PaddingValues(horizontal = BtechTheme.spacing.horizontalPadding),
    showSpacer: Boolean = false
) {
    Column(modifier) {
        Column(
            modifier = Modifier.padding(contentPadding),
            verticalArrangement = Arrangement.spacedBy(BtechTheme.spacing.spacing12)
        ) {
            Text(
                text = title,
                style = titleStyle,
                color = BtechTheme.colors.text.textPrimary,
                modifier = Modifier.fillMaxWidth()
            )

            subtitle()
        }
        if (showSpacer) {
            Spacer(Modifier.height(BtechTheme.spacing.tagVerticalPadding))
            HorizontalDivider(modifier = Modifier.padding(horizontal = BtechTheme.spacing.horizontalPadding))
        }
    }
}
