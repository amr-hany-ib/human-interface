package com.btech.checkout.common.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.btech.checkout.R
import com.btech.presentation.Lambda
import com.btech.presentation.buttons.PrimaryButton
import com.btech.presentation.theme.BtechTheme

@Preview
@Composable
fun ActionBottomBarPreview() {
    ActionBottomBar {
    }
}

@Composable
fun ActionBottomBar(
    modifier: Modifier = Modifier,
    isEnabled: Boolean = true,
    text: String = stringResource(id = R.string.continue_button),
    onClick: Lambda
) {
    Column(modifier.padding(bottom = 48.dp)) {
        PrimaryButton(
            text = text,
            modifier = Modifier
                .padding(horizontal = BtechTheme.spacing.horizontalPadding)
                .height(52.dp)
                .fillMaxWidth(),
            isEnabled = isEnabled,
            onClick = onClick
        )
    }
}
