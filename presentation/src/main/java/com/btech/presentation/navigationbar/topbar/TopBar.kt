package com.btech.presentation.navigationbar.topbar

import androidx.compose.foundation.clickable
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.btech.presentation.Lambda
import com.btech.presentation.theme.BtechTheme

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun TopBarPreview() {
    TopBar(onBackClick = {})
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(
    modifier: Modifier = Modifier,
    title: @Composable () -> Unit = {},
    colors: TopAppBarColors = TopAppBarDefaults.topAppBarColors(
        containerColor = MaterialTheme.colorScheme.background
    ),
    onBackClick: Lambda,
    actionText: String = "Cancel"
) {
    TopAppBar(
        title = title,
        colors = colors,
        navigationIcon = {
            Text(
                text = actionText,
                modifier.clickable { onBackClick() },
                style = BtechTheme.typography.body.bodyMd
            )
        },
        modifier = modifier
    )
}
