package com.btech.presentation.dropdown

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.PopupProperties
import com.btech.presentation.Lambda
import com.btech.presentation.R
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
                .clickable { onClick() }
                .fillMaxWidth()
                .background(BtechTheme.colors.field.fieldBackground)
                .padding(
                    vertical = BtechTheme.spacing.verticalPadding,
                    horizontal = BtechTheme.spacing.horizontalPadding
                ),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = dropdownTitle,
                style = BtechTheme.typography.heading.headingMd
            )

            Icon(
                painter = painterResource(id = if (expanded) R.drawable.ic_chevron_up else R.drawable.ic_chevron_down),
                contentDescription = null
            )
        }

        DropdownMenuNoPaddingVertical(
            expanded = expanded,
            onDismissRequest = onDismissRequest,
            offset = offset,
            properties = properties,
            modifier = Modifier.background(Color.Unspecified).fillMaxWidth()
        ) {
            content()
        }
    }
}
