package com.btech.presentation.dropdown

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.MenuDefaults
import androidx.compose.material3.MenuItemColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.btech.presentation.Lambda
import com.btech.presentation.theme.BtechTheme

@Composable
fun PrimaryDropdownMenuItem(
    text: @Composable Lambda,
    modifier: Modifier = Modifier,
    onClick: Lambda,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    enabled: Boolean = true,
    colors: MenuItemColors = MenuDefaults.itemColors(
        textColor = BtechTheme.colors.text.textPrimary
    ),
    contentPadding: PaddingValues = PaddingValues(
        horizontal = 0.dp,
        vertical = 0.dp
    ),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    androidx.compose.material3.DropdownMenuItem(
        contentPadding = contentPadding,
        modifier = modifier,
        text = text,
        onClick = onClick,
        colors = colors,
        enabled = enabled,
        trailingIcon = trailingIcon,
        leadingIcon = leadingIcon,
        interactionSource = interactionSource
    )
}
