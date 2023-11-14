package com.btech.checkout.transaction

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.btech.checkout.R

@Composable
fun FailedTransactionItem(
    modifier: Modifier = Modifier,
    title: String = stringResource(id = R.string.failed_transaction_title),
    subtitle: String = stringResource(id = R.string.failed_transaction_subtitle)
) {
    TransactionItem(
        modifier = modifier,
        drawableRes = R.drawable.ic_failure,
        title = title,
        subtitle = subtitle
    )
}

@Preview
@Composable
fun FailedTransactionItemPreview() {
    FailedTransactionItem()
}
