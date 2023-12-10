package com.btech.checkout.transaction

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.btech.presentation.theme.BtechTheme

@Composable
fun TransactionItem(
    modifier: Modifier = Modifier,
    @DrawableRes drawableRes: Int,
    title: String,
    subtitle: String
) {
    Column(
        modifier.fillMaxWidth().padding(horizontal = 30.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(drawableRes),
            contentDescription = null
        )

        Spacer(Modifier.height(BtechTheme.spacing.spacing16))

        Text(
            text = title,
            style = BtechTheme.typography.heading.heading3xl,
            textAlign = TextAlign.Center
        )
        Spacer(Modifier.height(8.dp))

        Text(
            text = subtitle,
            style = BtechTheme.typography.body.bodyLg,
            textAlign = TextAlign.Center
        )
    }
}
