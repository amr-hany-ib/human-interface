package com.btech.presentation.list

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import com.btech.presentation.theme.BtechTheme

@Composable
fun TextListItem(
    title: String,
    titleStyle: TextStyle = BtechTheme.typography.body.bodySm,
    label: String,
    labelStyle: TextStyle = BtechTheme.typography.heading.headingSm,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = title,
            style = titleStyle
        )

        Text(
            text = label,
            style = labelStyle
        )
    }
}
