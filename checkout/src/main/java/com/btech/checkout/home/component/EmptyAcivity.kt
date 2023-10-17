package com.btech.checkout.home.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
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
import com.btech.checkout.common.components.RoundedBox
import com.btech.presentation.theme.BtechTheme

@Preview
@Composable
fun PreviewEmptyActivity() {
    EmptyActivity()
}

@Composable
fun EmptyActivity(modifier: Modifier = Modifier) {
    RoundedBox(modifier) {
        Column(
            verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.Top),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(vertical = 48.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_receipt_long),
                contentDescription = "Receipt Long"
            )
            Text(
                text = stringResource(id = R.string.empty_activity),
                style = BtechTheme.typography.body.bodyMd,
                textAlign = TextAlign.Center

            )
        }
    }
}
