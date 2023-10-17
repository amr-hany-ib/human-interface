package com.btech.checkout.home.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.btech.checkout.R
import com.btech.checkout.common.components.RoundedBox
import com.btech.presentation.theme.BtechTheme

@Preview
@Composable
fun PreviewCurrentBalance() {
    CurrentBalance(
        text = stringResource(
            id = R.string.egp_value,
            formatArgs = arrayOf(30000)
        )
    )
}

@Composable
fun CurrentBalance(
    text: String,
    modifier: Modifier = Modifier
) {
    RoundedBox(modifier) {
        Column(
            Modifier.fillMaxWidth()
                .padding(vertical = BtechTheme.spacing.horizontalPadding)
        ) {
            Text(
                text = stringResource(id = R.string.current_balance),
                style = BtechTheme.typography.utility.utilityLg
            )
            Text(
                text = text,
                style = BtechTheme.typography.heading.heading7xl
            )
        }
    }
}
