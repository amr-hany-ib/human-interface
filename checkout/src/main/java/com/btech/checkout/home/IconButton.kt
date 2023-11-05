package com.btech.checkout.home

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalMinimumInteractiveComponentEnforcement
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.btech.checkout.R
import com.btech.presentation.Lambda
import com.btech.presentation.theme.BtechTheme

@Preview
@Composable
fun PreviewIconButton() {
    IconButton(onClick = {})
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IconButton(
    onClick: Lambda
) {
    CompositionLocalProvider(
        LocalMinimumInteractiveComponentEnforcement provides false
    ) {
        Button(
            colors = ButtonDefaults.buttonColors(
                containerColor = BtechTheme.colors.blue.blue500
            ),
            onClick = onClick,
            contentPadding = PaddingValues(
                horizontal = 12.dp,
                vertical = 6.dp
            )
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_qr_code_scanner),
                contentDescription = "Scan"
            )
            Text(text = "Scan")
        }
    }
}
