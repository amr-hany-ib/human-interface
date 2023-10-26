package com.btech.presentation.tabs

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.btech.presentation.IntLambda

@Composable
fun TabbedRow(
    selectedTabIndex: Int,
    tabTitles: List<String>,
    modifier: Modifier = Modifier,
    onClick: IntLambda
) {
//    TabRow(
//        modifier = modifier,
//        selectedTabIndex = selectedTabIndex,
//        indicator = { tabPositions ->
//            TabRowDefaults.Indicator(
//                modifier = Modifier.tabIndicatorOffset(tabPositions[selectedTabIndex]),
//                color = BtechTheme.colors.text.textPrimary,
//                height = 2.dp
//            )
//        }
//    ) {
//        tabTitles.forEachIndexed { index, title ->
//            Tab(
//                modifier = Modifier,
//                selected = selectedTabIndex == index,
//                onClick = { onClick(index) },
//                text = {
//                    Row(verticalAlignment = Alignment.CenterVertically) {
//                        Text(
//                            text = title,
//                            color = if (selectedTabIndex == index) {
//                                BtechTheme.colors.neutral.neutral900
//                            } else {
//                                BtechTheme.colors.neutral.neutral600
//                            },
//                            style = BtechTheme.typography.body1Highlight
//                        )
//                    }
//                },
//                icon = {
//
//                }
//            )
//        }
//    }
}
