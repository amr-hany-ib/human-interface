package com.btech.authentication.login

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextDirection
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import com.btech.presentation.theme.BtechTheme

@Composable
fun AccountLoginHeader(
    name: String?,
    mobileNumber: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.padding(BtechTheme.spacing.spacing16),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LoginProfilePicture(name = name)

        Spacer(Modifier.height(BtechTheme.spacing.spacing12))

        Text(
            text = name ?: mobileNumber,
            style = BtechTheme.typography.heading.heading4xl.copy(
                textDirection = if (name == null) {
                    TextDirection.Ltr
                } else {
                    TextDirection.ContentOrLtr
                }
            ),
            color = BtechTheme.colors.accent.accent1000,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }
}

@Preview(
    locale = "en"
)
@Composable
fun AccountLoginPreview() {
    Column() {
        AccountLoginHeader(name = "Mohab Nadim", mobileNumber = "01098488223")
        AccountLoginHeader(name = null, mobileNumber = "+201098488223")
    }
}
