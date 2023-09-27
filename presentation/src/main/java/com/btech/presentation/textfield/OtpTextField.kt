package com.btech.presentation.textfield

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.text.isDigitsOnly

@Preview(showBackground = true)
@Composable
fun PreviewOtpTextField() {
    OtpTextField(
        text = "",
        onValueChange = { _ -> }
    )
}

@Composable
fun OtpTextField(
    modifier: Modifier = Modifier,
    text: String,
    otpCount: Int = 6,
    keyboardOptions: KeyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
    onValueChange: (String) -> Unit
) {
    BasicTextField(
        value = text,
        onValueChange = {
            if (it.length <= otpCount && it.isDigitsOnly()) {
                onValueChange(it)
            }
        },
        keyboardOptions = keyboardOptions,
        decorationBox = {
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.heightIn(min = 56.dp)
            ) {
                repeat(otpCount) { index ->
                    val isFocused = text.length == index

                    val char = if (isFocused) {
                        ""
                    } else {
                        when {
                            index >= text.length -> "-"
                            else -> text[index].toString()
                        }
                    }

                    OtpCharacter(
                        char = char,
                        index = index,
                        otpCount = otpCount,
                        modifier = Modifier.weight(1f)
                    )
                }
            }
        },
        modifier = modifier
    )
}
