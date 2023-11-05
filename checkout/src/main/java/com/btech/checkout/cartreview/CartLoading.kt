package com.btech.checkout.cartreview

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import com.btech.checkout.R
import com.btech.checkout.common.CoilImageLoader
import com.btech.presentation.theme.BtechTheme
import com.skydoves.landscapist.coil.CoilImage

@Composable
fun CartLoading() {
    val context = LocalContext.current

    Box(Modifier.fillMaxSize()) {
        Column(
            Modifier.fillMaxWidth()
                .align(Alignment.Center)
                .padding(horizontal = BtechTheme.spacing.horizontalPadding),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CoilImage(
                imageModel = {
                    R.raw.loading_cart
                },
                imageLoader = {
                    CoilImageLoader.getImageLoader(context)
                }
            )

            Text(
                text = "Retrieving cart",
                style = BtechTheme.typography.heading.heading4xl,
                textAlign = TextAlign.Center
            )

            Text(
                text = "Please wait while we fetch your cart information for checkout.",
                style = BtechTheme.typography.body.bodyLg,
                textAlign = TextAlign.Center
            )
        }
    }
}
