package com.btech.checkout

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.btech.presentation.theme.BtechTheme

@Composable
fun CartAuthorizationLoading(
    modifier: Modifier = Modifier,
    title: String = stringResource(R.string.awaiting_authorization),
    subtitle: String = stringResource(R.string.awaiting_authorization_message)
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CircularProgressIndicator(
            color = BtechTheme.colors.action.actionPrimary,
            modifier = Modifier.size(BtechTheme.spacing.spacing88)
                .align(Alignment.CenterHorizontally),
            strokeWidth = BtechTheme.spacing.spacing8
        )

        Spacer(Modifier.height(BtechTheme.spacing.spacing32))

        Text(
            text = title,
            style = BtechTheme.typography.heading.heading4xl,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )

        Spacer(Modifier.height(BtechTheme.spacing.spacing12))

        Text(
            text = subtitle,
            style = BtechTheme.typography.body.bodyLg,
            textAlign = TextAlign.Center
        )
    }
}

@Preview
@Composable
fun CartAuthorizationLoadingPreview() {
    CartAuthorizationLoading()
}
