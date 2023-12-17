package com.btech.presentation.selection

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.drawscope.ContentDrawScope
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.btech.presentation.theme.BtechTheme

fun ContentDrawScope.drawWithLayer(block: ContentDrawScope.() -> Unit) {
    with(drawContext.canvas.nativeCanvas) {
        val checkPoint = saveLayer(null, null)
        block()
        restoreToCount(checkPoint)
    }
}

@Composable
fun TextSwitcher(
    selectedIndex: Int,
    items: List<String>,
    selectedTextStyle: TextStyle,
    unselectedTextStyle: TextStyle,
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(100),
    backgroundColor: Color = BtechTheme.colors.text.textQuaternary,
    selectionBackgroundColor: Color = BtechTheme.colors.background.backgroundColor,
    height: Dp = BtechTheme.spacing.spacing40,
    onSelectionChange: (Int) -> Unit
) {
    BoxWithConstraints(
        modifier
            .height(height)
            .clip(shape)
            .background(backgroundColor)
    ) {
        if (items.isNotEmpty()) {
            val maxWidth = this.maxWidth
            val tabWidth = maxWidth / items.size

            val indicatorOffset by animateDpAsState(
                targetValue = tabWidth * selectedIndex,
                animationSpec = tween(durationMillis = 250, easing = FastOutSlowInEasing),
                label = "indicator offset"
            )

            Box(
                modifier = Modifier
                    .offset(x = indicatorOffset)
                    .width(tabWidth)
                    .fillMaxHeight()
                    .padding(Dp.Hairline)
                    .shadow(BtechTheme.spacing.spacing2, shape)
                    .background(selectionBackgroundColor)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .zIndex(1f)
            ) {
                items.forEachIndexed { index, text ->
                    Box(
                        modifier = Modifier
                            .width(tabWidth)
                            .fillMaxHeight()
                            .clickable(
                                interactionSource = remember {
                                    MutableInteractionSource()
                                },
                                indication = null,
                                onClick = {
                                    onSelectionChange(index)
                                }
                            )
                            .zIndex(1f),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = text,
                            style = if (index == selectedIndex) {
                                selectedTextStyle
                            } else {
                                unselectedTextStyle
                            }
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
private fun TextSwitcherPreview() {
    TextSwitcher(
        selectedIndex = 0,
        selectedTextStyle = BtechTheme.typography.utility.utilityMd.copy(color = BtechTheme.colors.action.actionPrimary),
        unselectedTextStyle = BtechTheme.typography.medium.mediumMd,
        items = listOf(
            "Upcoming",
            "Paid"
        ),
        onSelectionChange = {
        },
        shape = RoundedCornerShape(100),
        backgroundColor = BtechTheme.colors.containerColors.grey200
    )
}
