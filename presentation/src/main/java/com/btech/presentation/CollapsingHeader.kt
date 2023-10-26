package com.btech.presentation

import androidx.annotation.DrawableRes
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.Indication
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ripple.rememberRipple
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.btech.presentation.theme.BtechTheme

@Preview
@Composable
fun CollapsingHeaderPreview() {
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
}

@Composable
fun CollapsingHeader(
    modifier: Modifier = Modifier,
    title: String,
    surfaceColor: Color = MaterialTheme.colorScheme.background,
    @DrawableRes collapsedIcon: Int = R.drawable.ic_chevron_down,
    @DrawableRes expandedIcon: Int = R.drawable.ic_chevron_up,
    content: @Composable (() -> Unit)? = null
) {
    var isContentVisible by remember { mutableStateOf(false) }

    Surface(
        color = surfaceColor
    ) {
        Column(
            modifier = Modifier
                .clickable {
                    isContentVisible = !isContentVisible
                }
        ) {
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
        Column(
            modifier = Modifier
                .clickable(
                    onClick = onClick,
                )
        ) {
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
