package com.btech.checkout.common

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

@Composable
fun ClickableIcon(
    icon: Int,
    onClick: () -> Unit
) {
    Box(
        Modifier
            .clickable { onClick() }
    ) {
        Icon(
            painter = painterResource(icon),
            contentDescription = "Settings"
        )
    }
}
