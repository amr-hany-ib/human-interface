package com.btech.authentication.login

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.btech.presentation.theme.BtechTheme

@Composable
fun AccountLoginHeader(
    name: String?,
    mobileNumber: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.padding(BtechTheme.spacing.extraLargePadding),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LoginProfilePicture(name = name)

        Spacer(Modifier.height(BtechTheme.spacing.largePadding))

        Text(
            text = name ?: mobileNumber,
            style = BtechTheme.typography.heading.heading4xl,
            color = BtechTheme.colors.text.textSecondary
        )
    }
}

@Preview
@Composable
fun AccountLoginPreview() {
    AccountLoginHeader(name = "Mohab Nadim", mobileNumber = "01098488223")
}
