package com.btech.checkout.transaction

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.btech.checkout.R

@Composable
fun FailedTransactionItem(modifier: Modifier = Modifier) {
    TransactionItem(
        modifier = modifier,
        drawableRes = R.drawable.ic_failure,
        title = stringResource(id = R.string.failed_transaction_title),
        subtitle = stringResource(id = R.string.failed_transaction_subtitle)
    )
}

@Preview
@Composable
fun FailedTransactionItemPreview() {
    FailedTransactionItem()
}
