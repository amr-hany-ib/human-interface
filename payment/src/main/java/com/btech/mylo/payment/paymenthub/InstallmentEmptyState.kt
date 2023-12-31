package com.btech.mylo.payment.paymenthub

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
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
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Spacer(modifier = Modifier.weight(1f))
            Image(
                painter = painterResource(id = resource),
                contentDescription = null,
                modifier = Modifier
                    .widthIn(max = 600.dp)
                    .fillMaxWidth(),
                contentScale = ContentScale.FillWidth
            )

            Spacer(modifier = Modifier.height(BtechTheme.spacing.spacing16))

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

            Spacer(modifier = Modifier.height(BtechTheme.spacing.spacing8))

            Text(
                text = subtitle,
                style = BtechTheme.typography.body.bodyMd,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.weight(1f))
        }
    }
}
