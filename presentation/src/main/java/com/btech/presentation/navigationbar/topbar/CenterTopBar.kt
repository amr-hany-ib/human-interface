package com.btech.presentation.navigationbar.topbar

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.btech.presentation.Lambda
import com.btech.presentation.R
import com.btech.presentation.divider.HorizontalDivider
import com.btech.presentation.theme.BtechTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CenterTopBar(
    modifier: Modifier = Modifier,
    title: @Composable () -> Unit = {},
    actionText: String = stringResource(id = R.string.cancel),
    colors: TopAppBarColors = TopAppBarDefaults.topAppBarColors(
        containerColor = MaterialTheme.colorScheme.background
    ),
    showSpacer: Boolean = false,
    windowInsets: WindowInsets = WindowInsets(0.dp),
    onBackClick: Lambda
) {
    Column {
        CenterAlignedTopAppBar(
            title = title,
            colors = colors,
            navigationIcon = {
                Text(
                    text = actionText,
                    modifier = Modifier.clickable { onBackClick() },
                    style = BtechTheme.typography.body.bodyMd
                )
            },
            modifier = modifier,
            windowInsets = windowInsets
        )

        if (showSpacer) {
            HorizontalDivider()
        }
    }
}
