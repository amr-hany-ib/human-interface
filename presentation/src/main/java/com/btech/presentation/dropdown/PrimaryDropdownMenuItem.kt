package com.btech.presentation.dropdown

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MenuDefaults
import androidx.compose.material3.MenuItemColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
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
        horizontal = BtechTheme.spacing.horizontalPadding,
        vertical = 0.dp
    ),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    androidx.compose.material3.DropdownMenuItem(
        contentPadding = contentPadding,
        modifier = modifier
            .fillMaxWidth()
            .background(BtechTheme.colors.layerColors.layerBackground),
        text = text,
        onClick = onClick,
        colors = colors,
        enabled = enabled,
        trailingIcon = trailingIcon,
        leadingIcon = leadingIcon,
        interactionSource = interactionSource
    )
}
