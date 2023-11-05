package com.btech.checkout.offerselection

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.btech.checkout.R
import com.btech.presentation.theme.BtechTheme

@Preview
@Composable
fun InstallmentPerMonthItemPreview() {
    InstallmentPerMonthItem(
        text = "40000"
    )
}

@Composable
fun InstallmentPerMonthItem(
    text: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier
            .padding(horizontal = BtechTheme.spacing.horizontalPadding)
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(BtechTheme.colors.layerColors.layerBackground)
            .padding(
                horizontal = BtechTheme.spacing.tagVerticalPadding,
                vertical = BtechTheme.spacing.horizontalPadding
            ),
        contentAlignment = Alignment.Center
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = text,
                style = BtechTheme.typography.heading.heading3xl
            )
            Text(
                text = stringResource(id = R.string.egp_per_month),
                style = BtechTheme.typography.heading.headingLg
            )
        }
    }
}
