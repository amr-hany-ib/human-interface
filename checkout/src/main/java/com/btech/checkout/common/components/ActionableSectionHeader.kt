package com.btech.checkout.common.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.btech.checkout.R
import com.btech.presentation.theme.BtechTheme

@Preview
@Composable
fun PreviewActionableSectionHeader() {
    ActionableSectionHeader(text = "hello", onClick = {})
}

@Composable
fun ActionableSectionHeader(
    text: String,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = BtechTheme.typography.heading.heading2xl,
    actionText: String = stringResource(id = R.string.see_all),
    actionTextStyle: TextStyle = BtechTheme.typography.heading.headingMd,
    onClick: () -> Unit
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = BtechTheme.spacing.horizontalPadding)
    ) {
        Text(
            text = text,
            style = textStyle
        )

        Text(
            text = actionText,
            modifier = Modifier
                .clickable { onClick() }
                .padding(horizontal = 8.dp),
            style = actionTextStyle,
            color = BtechTheme.colors.action.actionPrimary
        )
    }
}
