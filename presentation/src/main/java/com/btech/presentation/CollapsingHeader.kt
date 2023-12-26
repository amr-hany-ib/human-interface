package com.btech.presentation

import androidx.annotation.DrawableRes
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.btech.presentation.theme.BtechTheme
import com.btech.presentation.theme.LocalColors

@Preview
@Composable
fun CollapsingHeaderPreview() {
    Column(Modifier.padding(30.dp)) {
        CollapsingHeader(
            title = "Product overview",
            content = {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(250.dp)
                        .background(Color.Cyan)
                )
            }
        )

        CollapsingRoundedHeader(
            title = "Product overviewoverviewoverviewoverviewoverview",
            titleBackgroundShape = RoundedCornerShape(16.dp),
            titleBackgroundColor = BtechTheme.colors.accent.accent1000,
            contentPadding = PaddingValues(
                vertical = BtechTheme.spacing.verticalPadding,
                horizontal = BtechTheme.spacing.spacing16
            ),
            content = {
                Text(
                    text = "Test content",
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.Cyan)
                        .padding(1.dp)
                )
            }
        )
    }
}

@Composable
fun CollapsingHeader(
    modifier: Modifier = Modifier,
    title: String,
    surfaceColor: Color = MaterialTheme.colorScheme.background,
    shape: Shape = RectangleShape,
    @DrawableRes collapsedIcon: Int = R.drawable.ic_chevron_down,
    @DrawableRes expandedIcon: Int = R.drawable.ic_chevron_up,
    content: @Composable (() -> Unit)? = null
) {
    var isContentVisible by remember { mutableStateOf(false) }

    Surface(
        color = surfaceColor,
        shape = shape
    ) {
        Column(
            modifier = Modifier
                .clickable {
                    isContentVisible = !isContentVisible
                }
        ) {
            Row(
                modifier = modifier
                    .clip(shape = shape)
                    .fillMaxWidth()
                    .clip(shape = shape)
                    .padding(
                        vertical = BtechTheme.spacing.verticalPadding
                    ),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = title,
                    style = BtechTheme.typography.heading.headingSm
                )

                Image(
                    painter = painterResource(
                        id = if (isContentVisible) {
                            expandedIcon
                        } else {
                            collapsedIcon
                        }
                    ),
                    contentDescription = "icon"
                )
            }

            content?.let {
                AnimatedVisibility(visible = isContentVisible) {
                    it()
                }
            }
        }
    }
}

@Composable
fun CollapsingHeader(
    modifier: Modifier = Modifier,
    title: String,
    surfaceColor: Color = MaterialTheme.colorScheme.background,
    isContentVisible: Boolean = false,
    @DrawableRes collapsedIcon: Int = R.drawable.ic_chevron_down,
    @DrawableRes expandedIcon: Int = R.drawable.ic_chevron_up,
    onClick: Lambda,
    content: @Composable (() -> Unit)? = null
) {
    Surface(
        color = surfaceColor
    ) {
        Column(modifier = Modifier.clickable(onClick = onClick)) {
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(
                        vertical = BtechTheme.spacing.verticalPadding
                    ),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = title,
                    style = BtechTheme.typography.heading.headingSm
                )

                Image(
                    painter = painterResource(
                        id = if (isContentVisible) {
                            expandedIcon
                        } else {
                            collapsedIcon
                        }
                    ),
                    contentDescription = "icon"
                )
            }

            content?.let {
                AnimatedVisibility(visible = isContentVisible) {
                    it()
                }
            }
        }
    }
}

@Composable
fun CollapsingRoundedHeader(
    modifier: Modifier = Modifier,
    title: String,
    titleTextStyle: TextStyle = BtechTheme.typography.heading.headingSm,
    titleBackgroundColor: Color = BtechTheme.colors.accent.accent1000,
    titleBackgroundShape: Shape = RectangleShape,
    titleClippingRadius: Dp = BtechTheme.spacing.spacing16,
    contentColor: Color = BtechTheme.colors.background.backgroundColor,
    contentPadding: PaddingValues = PaddingValues(),
    @DrawableRes collapsedIcon: Int = R.drawable.ic_chevron_down,
    @DrawableRes expandedIcon: Int = R.drawable.ic_chevron_up,
    content: @Composable (() -> Unit)? = null
) {
    var isContentVisible by remember { mutableStateOf(false) }
    Column(
        modifier = modifier
    ) {
        Row(
            modifier = Modifier
                .background(
                    color = if (isContentVisible) {
                        contentColor
                    } else {
                        Color.Unspecified
                    },
                    shape = RoundedCornerShape(
                        topStart = titleClippingRadius,
                        topEnd = titleClippingRadius
                    )
                )
                .background(
                    color = if (isContentVisible) {
                        titleBackgroundColor
                    } else {
                        contentColor
                    },
                    shape = titleBackgroundShape
                )
                .clip(shape = titleBackgroundShape)
                .clickable {
                    isContentVisible = !isContentVisible
                }
                .fillMaxWidth()
                .padding(contentPadding),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = title,
                style = titleTextStyle,
                color = if (isContentVisible) {
                    titleTextStyle.color
                } else {
                    LocalColors.current.text.textPrimary
                },
                modifier = Modifier.weight(1f)
            )

            Icon(
                painter = painterResource(
                    id = if (isContentVisible) {
                        expandedIcon
                    } else {
                        collapsedIcon
                    }
                ),
                contentDescription = "icon",
                tint = if (isContentVisible) {
                    titleTextStyle.color
                } else {
                    LocalColors.current.text.textPrimary
                }
            )
        }

        content?.let {
            AnimatedVisibility(
                visible = isContentVisible
            ) {
                it()
            }
        }
    }
}
