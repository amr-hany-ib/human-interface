package com.btech.presentation.dropdown

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.PopupProperties
import com.btech.presentation.Lambda
import com.btech.presentation.theme.BtechTheme

@Preview
@Composable
fun DropdownPreview() {
    Dropdown(
        expanded = true,
        onDismissRequest = { },
        dropdownTitle = "Select a category",
        onClick = {},
        content = {
            Text(
                text = "test",
                style = BtechTheme.typography.heading.headingMd
            )
        }
    )
}

@Composable
fun Dropdown(
    expanded: Boolean,
    dropdownTitle: String,
    modifier: Modifier = Modifier,
    label: String? = null,
    offset: DpOffset = DpOffset(0.dp, 0.dp),
    properties: PopupProperties = PopupProperties(
        focusable = true
    ),
    onClick: Lambda,
    onDismissRequest: () -> Unit,
    content: @Composable Lambda
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        label?.let {
            Text(
                text = it,
                style = BtechTheme.typography.utility.headingSm,
                color = BtechTheme.colors.text.textPrimary
            )
        }

        Row(
            Modifier
                .clip(RoundedCornerShape(BtechTheme.spacing.spacing12))
                .clickable { onClick() }
                .fillMaxWidth()
                .background(BtechTheme.colors.field.fieldBackground)
                .padding(
                    vertical = BtechTheme.spacing.verticalPadding,
                    horizontal = BtechTheme.spacing.horizontalPadding
                ),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = dropdownTitle,
                style = BtechTheme.typography.heading.headingMd
            )

            Icon(
                imageVector = if (expanded) Icons.Default.KeyboardArrowUp else Icons.Default.KeyboardArrowDown,
                contentDescription = if (expanded) "Collapse" else "Expand"
            )
        }

        DropdownMenuNoPaddingVertical(
            expanded = expanded,
            onDismissRequest = onDismissRequest,
            offset = offset,
            properties = properties,
            modifier = modifier.fillMaxWidth()
        ) {
            Column(Modifier.padding(horizontal = BtechTheme.spacing.horizontalPadding)) {
                content()
            }
        }
    }
}
