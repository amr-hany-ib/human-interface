package com.btech.mylo.payment.paymenthub

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.btech.presentation.theme.BtechTheme
import com.btech.presentation.theme.notoSansFontFamily

@Composable
fun InstallmentEmptyState(
    @DrawableRes resource: Int,
    title: String,
    subtitle: String,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Image(
            painter = painterResource(id = resource),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .widthIn(max = 500.dp),
            contentScale = ContentScale.FillWidth
        )

        Spacer(modifier = Modifier.height(BtechTheme.spacing.extraLargePadding))

        Text(
            text = title,
            style = TextStyle(
                fontSize = 22.sp,
                lineHeight = 34.sp,
                fontFamily = notoSansFontFamily,
                fontWeight = FontWeight(700),
                textAlign = TextAlign.Center
            )
        )

        Spacer(modifier = Modifier.height(BtechTheme.spacing.mediumPadding))

        Text(
            text = subtitle,
            style = BtechTheme.typography.body.bodyMd,
            textAlign = TextAlign.Center
        )
    }
}
