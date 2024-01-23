package com.btech.authentication.creditactivation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import com.btech.presentation.theme.BtechTheme

@Composable
fun PartnerLocationItem(
    title: String,
    subtitle: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .clip(RoundedCornerShape(BtechTheme.spacing.spacing12))
            .background(BtechTheme.colors.layerColors.layerBackground)
            .padding(
                horizontal = BtechTheme.spacing.spacing12,
                vertical = BtechTheme.spacing.spacing16
            ),
        verticalArrangement = Arrangement.spacedBy(BtechTheme.spacing.spacing4)
    ) {
        Text(
            text = title,
            style = BtechTheme.typography.body.bodyMd
        )

        Text(
            text = subtitle,
            style = BtechTheme.typography.body.bodySm,
            color = BtechTheme.colors.text.textSecondary
        )
    }
}

@Preview
@Composable
fun PartnerLocationItemPreview() {
    PartnerLocationItem(
        title = "Assiut",
        subtitle = "24 Assyata Street"
    )
}
