package com.btech.checkout.offerselection

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.btech.checkout.R
import com.btech.presentation.theme.BtechTheme
import com.btech.presentation.theme.notoSansFontFamily

@Composable
fun OfferTag(
    downPaymentAmount: String,
    modifier: Modifier = Modifier,
    tagColor: Color = BtechTheme.colors.tagColors.tagYellowBackground
) {
    Row(
        modifier
            .clip(RoundedCornerShape(100))
            .background(tagColor)
            .padding(
                vertical = BtechTheme.spacing.spacing8,
                horizontal = BtechTheme.spacing.spacing16
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = stringResource(id = R.string.down_payment),
            style = TextStyle(
                fontFamily = notoSansFontFamily,
                fontSize = 10.sp,
                lineHeight = 10.16.sp,
                fontWeight = FontWeight.Normal,
                platformStyle = PlatformTextStyle(
                    includeFontPadding = false
                )
            ),
            color = BtechTheme.colors.text.textPrimary,
            textAlign = TextAlign.Center
        )

        Spacer(Modifier.width(4.dp))

        Text(
            text = stringResource(
                id = R.string.egp_value,
                formatArgs = arrayOf(downPaymentAmount)
            ),
            style = TextStyle(
                fontFamily = notoSansFontFamily,
                fontSize = 10.sp,
                lineHeight = 10.16.sp,
                fontWeight = FontWeight.Bold,
                platformStyle = PlatformTextStyle(
                    includeFontPadding = false
                )
            ),
            color = BtechTheme.colors.text.textPrimary,
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun OfferTag() {
    OfferTag(downPaymentAmount = "3000")
}
