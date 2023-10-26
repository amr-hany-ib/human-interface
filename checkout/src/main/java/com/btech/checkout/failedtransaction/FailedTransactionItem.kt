package com.btech.checkout.failedtransaction

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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.btech.checkout.R
import com.btech.presentation.theme.BtechTheme

@Composable
fun FailedTransactionItem(modifier: Modifier = Modifier) {
    Column(
        modifier.fillMaxWidth().padding(horizontal = 30.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.ic_failure),
            contentDescription = null
        )

        Spacer(Modifier.height(BtechTheme.spacing.extraLargePadding))

        Text(
            text = stringResource(id = R.string.failed_transaction_title),
            style = BtechTheme.typography.heading.heading3xl,
            textAlign = TextAlign.Center
        )
        Spacer(Modifier.height(8.dp))

        Text(
            text = stringResource(id = R.string.failed_transaction_subtitle),
            style = BtechTheme.typography.body.bodyLg,
            textAlign = TextAlign.Center
        )
    }
}

@Preview
@Composable
fun FailedTransactionItemPreview() {
    FailedTransactionItem()
}
