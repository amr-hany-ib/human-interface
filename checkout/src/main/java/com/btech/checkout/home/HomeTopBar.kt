package com.btech.checkout.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.btech.checkout.R
import com.btech.presentation.Lambda
import com.btech.presentation.theme.BtechTheme

@Preview
@Composable
fun PreviewHomeTopBar() {
    HomeTopBar(title = "OL", onSettingsClick = {})
}

@Composable
fun HomeTopBar(
    title: String,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(horizontal = BtechTheme.spacing.horizontalPadding),
    onSettingsClick: Lambda
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(contentPadding),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = title,
            style = BtechTheme.typography.heading.headingXl
        )

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)

        ) {
            androidx.compose.material3.IconButton(onClick = onSettingsClick) {
                Icon(
                    painter = painterResource(
                        id = R.drawable.ic_settings
                    ),
                    contentDescription = "new purchase"
                )
            }
        }
    }
}
