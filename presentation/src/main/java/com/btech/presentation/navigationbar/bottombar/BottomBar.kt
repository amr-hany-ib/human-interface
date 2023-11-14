package com.btech.presentation.navigationbar.bottombar

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Icon
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.btech.presentation.IntLambda
import com.btech.presentation.divider.HorizontalDivider
import com.btech.presentation.theme.BtechTheme

@Preview(showBackground = true)
@Composable
fun BottomBarPreview() {
    BottomBar(
        selectedTabIndex = 0,
        onSelection = {}
    )
}

@Composable
fun BottomBar(
    selectedTabIndex: Int,
    modifier: Modifier = Modifier,
    destinations: List<BottomBarModel> = MyloBottomBarDestination().destinations,
    onSelection: IntLambda
) {
    Row(
        modifier
    ) {
        destinations.forEachIndexed { index, destination ->
            val isSelected = selectedTabIndex == index
            Column(
                Modifier.weight(1f)
            ) {
                HorizontalDivider()
                TabRowDefaults.Indicator(
                    color = if (isSelected) {
                        BtechTheme.colors.action.actionPrimary
                    } else {
                        Color.Unspecified
                    },
                    height = 2.dp
                )
                Tab(
                    selected = isSelected,
                    onClick = { onSelection(index) },
                    text = {
                        Text(
                            text = stringResource(id = destination.labelResource),
                            color = if (isSelected) {
                                BtechTheme.colors.action.actionPrimary
                            } else {
                                BtechTheme.colors.text.textPrimary
                            },
                            style = BtechTheme.typography.utility.utilitySm
                        )
                    },
                    icon = {
                        Icon(
                            painter = painterResource(id = destination.getSelectedIcon(isSelected)),
                            contentDescription = null,
                            tint = if (isSelected) {
                                BtechTheme.colors.action.actionPrimary
                            } else {
                                BtechTheme.colors.text.textPrimary
                            }
                        )
                    }
                )
            }
        }
    }
}
