package com.btech.presentation.textfield.otp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.btech.presentation.theme.BtechTheme

@Composable
fun OtpCharacter(
    char: String,
    index: Int,
    otpCount: Int,
    modifier: Modifier = Modifier,
    isError: Boolean = false,
    textStyle: TextStyle = BtechTheme.typography.heading.heading8xl
) {
    Box(
        modifier = modifier
            .heightIn(56.dp)
            .height(IntrinsicSize.Max),
        contentAlignment = Alignment.Center
    ) {
        if (char.isEmpty()) {
            Box(
                Modifier
                    .size(BtechTheme.spacing.mediumPadding)
                    .clip(CircleShape)
                    .background(
                        if (isError) {
                            Color.Red
                        } else {
                            BtechTheme.colors.action.actionPrimary
                        }
                    )
            )
        } else {
            Text(
                text = char,
                textAlign = TextAlign.Center,
                modifier = Modifier.align(Alignment.Center),
                softWrap = false,
                style = textStyle,
                color = BtechTheme.colors.action.actionPrimary
            )
        }
    }
    if (index < otpCount - 1) {
        Spacer(Modifier.width(8.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewOtpCharacter() {
    Row {
        OtpCharacter(
            char = "q",
            index = 0,
            otpCount = 6,
            Modifier.weight(1F)
        )
    }
}
