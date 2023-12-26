package com.btech.presentation.bottomsheet

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.btech.presentation.Lambda
import com.btech.presentation.common.ignoreHorizontalParentPadding
import com.btech.presentation.divider.HorizontalDivider
import com.btech.presentation.theme.BtechTheme

@Composable
fun BottomSheetHeader(
    title: String,
    modifier: Modifier = Modifier,
    onDismiss: Lambda
) {
    Column(modifier = modifier) {
        Text(
            text = title,
            modifier = Modifier
                .padding(vertical = BtechTheme.spacing.spacing16)
                .clickable {
                    onDismiss()
                },
            style = BtechTheme.typography.body.bodyMd,
            color = BtechTheme.colors.action.actionPrimary
        )

        HorizontalDivider(modifier = Modifier.ignoreHorizontalParentPadding(BtechTheme.spacing.horizontalPadding))
    }
}

@Preview
@Composable
private fun BottomSheetHeaderPreview() {
    BottomSheetHeader(title = "close", onDismiss = {})
    BottomSheetHeader(title = "close", modifier = Modifier.background(Color.White), onDismiss = {})
}
