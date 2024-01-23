package com.btech.authentication.creditactivation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.btech.authentication.R
import com.btech.presentation.Lambda
import com.btech.presentation.theme.BtechTheme

@Composable
fun PartnerItem(
    partnerName: String,
    category: String,
    modifier: Modifier = Modifier,
    trailingIcon: @Composable Lambda? = null,
    onClick: Lambda? = null
) {
    Row(
        modifier = modifier
            .clip(RoundedCornerShape(BtechTheme.spacing.spacing12))
            .background(BtechTheme.colors.containerColors.grey200)
            .clickable(onClick = onClick ?: {}, enabled = onClick != null)
            .padding(BtechTheme.spacing.spacing16)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(BtechTheme.spacing.spacing16)
    ) {
        Box(
            modifier = Modifier
                .clip(CircleShape)
                .background(BtechTheme.colors.containerColors.grey)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_partner_placeholder),
                contentDescription = null,
                modifier = Modifier.size(40.dp)
            )
        }

        Column(
            verticalArrangement = Arrangement.spacedBy(BtechTheme.spacing.spacing8),
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = partnerName,
                style = BtechTheme.typography.medium.mediumLg,
                color = BtechTheme.colors.text.textPrimary
            )

            Text(
                text = category,
                maxLines = 1,
                style = BtechTheme.typography.body.bodySm,
                color = BtechTheme.colors.text.textSecondary,
                overflow = TextOverflow.Ellipsis
            )
        }

        trailingIcon?.let {
            it()
        }
    }
}

@Preview()
@Composable
fun PartnerBottomSheetItemPreview() {
    Surface {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            PartnerItem(
                partnerName = "B.TECH",
                category = "Electronics"
            )

            PartnerItem(
                partnerName = "B.TECH",
                category = "Electronics"
            )
        }
    }
}
