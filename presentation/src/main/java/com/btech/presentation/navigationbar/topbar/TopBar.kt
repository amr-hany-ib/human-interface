package com.btech.presentation.navigationbar.topbar

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.btech.presentation.Lambda
import com.btech.presentation.R
import com.btech.presentation.divider.HorizontalDivider
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
        containerColor = MaterialTheme.colorScheme.background,
        actionIconContentColor = BtechTheme.colors.action.actionPrimary
    ),
    showSpacer: Boolean = false,
    onBackClick: Lambda
) {
    Column {
        TopAppBar(
            title = title,
            colors = colors,
            actions = actions,
            navigationIcon = {
                Text(
                    text = actionText,
                    modifier = Modifier.clickable { onBackClick() },
                    style = BtechTheme.typography.body.bodyMd,
                    color = BtechTheme.colors.action.actionPrimary
                )
            },
            modifier = modifier
        )

        if (showSpacer) {
            HorizontalDivider()
        }
    }
}
