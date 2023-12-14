package com.btech.mylo.home.presentation.partners

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.btech.authentication.R
import com.btech.presentation.theme.BtechTheme
import com.btech.presentation.theme.notoSansFontFamily

@Composable
fun PartnerItem(
    partnerName: String,
    category: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .clip(RoundedCornerShape(BtechTheme.spacing.spacing12))
            .background(BtechTheme.colors.containerColors.grey200)
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

        Column(verticalArrangement = Arrangement.spacedBy(BtechTheme.spacing.spacing8)) {
            Text(
                text = partnerName,
                style = TextStyle(
                    fontSize = 18.sp,
                    lineHeight = 16.sp,
                    fontFamily = notoSansFontFamily,
                    fontWeight = FontWeight(500)
                ),
                color = BtechTheme.colors.text.textPrimary
            )

            Text(
                text = category,
                maxLines = 1,
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 16.sp,
                    fontFamily = notoSansFontFamily,
                    fontWeight = FontWeight(400)
                ),
                color = BtechTheme.colors.containerColors.grey100,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

@Preview()
@Composable
fun PartnerBottomSheetItemPreview() {
    Surface() {
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
