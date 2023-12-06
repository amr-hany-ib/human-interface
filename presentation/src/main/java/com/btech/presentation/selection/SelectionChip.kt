package com.btech.presentation.selection

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.LocalMinimumInteractiveComponentEnforcement
import androidx.compose.material3.SelectableChipColors
import androidx.compose.material3.SelectableChipElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import com.btech.presentation.Lambda
import com.btech.presentation.theme.BtechTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SelectionChip(
    selected: Boolean,
    label: String,
    modifier: Modifier = Modifier,
    minHeight: Dp = BtechTheme.spacing.spacing40,
    elevation: SelectableChipElevation? = FilterChipDefaults.filterChipElevation(),
    shape: Shape = RoundedCornerShape(BtechTheme.spacing.hugePadding),
    leadingIcon: @Composable Lambda? = null,
    trailingIcon: @Composable Lambda? = null,
    colors: SelectableChipColors = FilterChipDefaults.filterChipColors(
        containerColor = BtechTheme.colors.containerColors.grey200,
        labelColor = BtechTheme.colors.text.textPrimary,
        selectedContainerColor = BtechTheme.colors.action.actionPrimary,
        selectedLabelColor = BtechTheme.colors.text.textOnColor
    ),
    onClick: Lambda
) {
    CompositionLocalProvider(
        LocalMinimumInteractiveComponentEnforcement provides false
    ) {
        FilterChip(
            selected = selected,
            onClick = onClick,
            label = {
                Text(
                    text = label,
                    style = BtechTheme.typography.body.bodyMd,
                    textAlign = TextAlign.Center,
                    modifier = modifier
                )
            },
            modifier = modifier.heightIn(min = minHeight),
            border = null,
            shape = shape,
            leadingIcon = leadingIcon,
            trailingIcon = trailingIcon,
            elevation = elevation,
            colors = colors
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun SelectionChipPreview() {
    Column() {
        LazyRow() {
            items(20) {
                SelectionChip(
                    selected = true,
                    label = "Allllllllllllll"
                    // modifier = Modifier.weight(1f)
                ) {
                }
            }
        }

        Row() {
            SelectionChip(
                selected = true,
                label = "Allllllllllllll",
                modifier = Modifier.weight(1f)
                // modifier = Modifier.weight(1f)
            ) {
            }

            SelectionChip(
                selected = true,
                label = "Allllllllllllll",
                modifier = Modifier.weight(1f)
                // modifier = Modifier.weight(1f)
            ) {
            }
        }
    }
}
