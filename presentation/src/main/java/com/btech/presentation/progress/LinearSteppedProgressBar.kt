package com.btech.presentation.progress

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.btech.presentation.theme.BtechTheme

@Composable
fun LinearSteppedProgressBar(
    numberOfSteps: Int,
    currentStep: Int,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        for (step in 0..numberOfSteps) {
            Step(
                modifier = Modifier.weight(1F),
                isCompleted = step < currentStep,
                isCurrent = step == currentStep,
                isFinalStep = step == numberOfSteps
            )
        }
    }
}

@Composable
fun Step(
    modifier: Modifier = Modifier,
    isCompleted: Boolean,
    isCurrent: Boolean,
    isFinalStep: Boolean
) {
    val color by animateColorAsState(
        targetValue = if (isCompleted || isCurrent) {
            BtechTheme.colors.text.textTertiary
        } else {
            BtechTheme.colors.background.backgroundColor
        },
        animationSpec = tween(durationMillis = 700),
        label = ""
    )

    BoxWithConstraints(modifier = modifier) {
        // Line
        Divider(
            modifier = Modifier
                .align(Alignment.CenterStart)
                .width(
                    if (isCompleted) {
                        this.maxWidth
                    } else if (isFinalStep) {
                        this.maxWidth.times(0.75f)
                    } else {
                        this.maxWidth / 3
                    }
                )
                .zIndex(1f),
            color = color,
            thickness = BtechTheme.spacing.tinyPadding
        )

        Divider(
            modifier = Modifier.align(Alignment.CenterStart),
            color = BtechTheme.colors.background.backgroundColor,
            thickness = BtechTheme.spacing.tinyPadding
        )
    }
}

@Preview
@Composable
fun StepsProgressBarPreview() {
    val currentStep = remember { mutableStateOf(1) }
    LinearSteppedProgressBar(
        modifier = Modifier.fillMaxWidth(),
        numberOfSteps = 5,
        currentStep = currentStep.value
    )
}
