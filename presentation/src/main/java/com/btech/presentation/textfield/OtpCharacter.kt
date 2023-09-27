package com.btech.presentation.textfield

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.btech.presentation.theme.BtechTheme

@Composable
fun OtpCharacter(
    char: String,
    index: Int,
    otpCount: Int,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .heightIn(56.dp)
            .height(IntrinsicSize.Max)
            .background(
                color = BtechTheme.colors.otpColors.otpBackground,
                shape = RoundedCornerShape(6.dp)
            )
            .border(
                width = Dp.Hairline,
                color = BtechTheme.colors.otpColors.otpBorder,
                shape = RoundedCornerShape(6.dp)
            ),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = char,
            color = BtechTheme.colors.otpColors.otpNum,
            textAlign = TextAlign.Center,
            modifier = Modifier.align(Alignment.Center),
            softWrap = false
        )
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
