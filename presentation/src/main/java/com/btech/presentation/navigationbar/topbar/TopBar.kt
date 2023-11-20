package com.btech.presentation.navigationbar.topbar

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.btech.presentation.Lambda
import com.btech.presentation.R
import com.btech.presentation.theme.BtechTheme

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun TopBarPreview() {
    TopBar(
        onBackClick = {},
        title = {
            Text("title")
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(
    modifier: Modifier = Modifier,
    title: @Composable () -> Unit = {},
    actionText: String = stringResource(id = R.string.cancel),
    actions: @Composable RowScope.() -> Unit = {},
    colors: TopAppBarColors = TopAppBarDefaults.topAppBarColors(
        containerColor = BtechTheme.colors.background.backgroundColor,
        actionIconContentColor = BtechTheme.colors.action.actionPrimary,
        navigationIconContentColor = BtechTheme.colors.action.actionPrimary
    ),
    windowInsets: WindowInsets = WindowInsets(0.dp),
    onBackClick: Lambda
) {
    TopAppBar(
        title = title,
        colors = colors,
        actions = actions,
        windowInsets = windowInsets,
        navigationIcon = {
            Text(
                text = actionText,
                modifier = Modifier.clickable { onBackClick() },
                style = BtechTheme.typography.body.bodyMd
            )
        },
        modifier = modifier
    )
}
