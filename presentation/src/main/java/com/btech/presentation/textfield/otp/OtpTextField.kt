package com.btech.presentation.textfield.otp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.text.isDigitsOnly
import com.btech.presentation.animation.shake.ShakeConfig
import com.btech.presentation.animation.shake.rememberShakeController
import com.btech.presentation.animation.shake.shake
import com.btech.presentation.theme.BtechTheme

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
    text: String,
    modifier: Modifier = Modifier,
    isError: Boolean = false,
    textStyle: TextStyle = BtechTheme.typography.heading.heading8xl,
    otpCount: Int = 6,
    keyboardOptions: KeyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
    onValueChange: (String) -> Unit
) {
    val shakeController = rememberShakeController()
    LaunchedEffect(key1 = isError, block = {
        if (isError) {
            shakeController.shake(ShakeConfig(10, translateX = 5f))
        }
    })
    BasicTextField(
        value = text,
        textStyle = textStyle,
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
                            index >= text.length -> ""
                            else -> text[index].toString()
                        }
                    }

                    OtpCharacter(
                        textStyle = textStyle,
                        isError = isError,
                        char = char,
                        index = index,
                        otpCount = otpCount,
                        modifier = Modifier.weight(1f)
                    )
                }
            }
        },
        modifier = modifier.shake(shakeController)
    )
}

@Composable
fun OtpTextField(
    textFieldValue: TextFieldValue,
    modifier: Modifier = Modifier,
    isError: Boolean = false,
    textStyle: TextStyle = BtechTheme.typography.heading.heading8xl,
    otpCount: Int = 6,
    keyboardOptions: KeyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
    onValueChange: (TextFieldValue) -> Unit
) {
    val shakeController = rememberShakeController()
    LaunchedEffect(key1 = isError, block = {
        if (isError) {
            shakeController.shake(ShakeConfig(10, translateX = 5f))
        }
    })
    BasicTextField(
        value = textFieldValue,
        textStyle = textStyle,
        onValueChange = {
            if (it.text.length <= otpCount && it.text.isDigitsOnly()) {
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
                    val isFocused = textFieldValue.text.length == index

                    val char = if (isFocused) {
                        ""
                    } else {
                        when {
                            index >= textFieldValue.text.length -> ""
                            else -> textFieldValue.text[index].toString()
                        }
                    }

                    OtpCharacter(
                        textStyle = textStyle,
                        isError = isError,
                        char = char,
                        index = index,
                        otpCount = otpCount,
                        modifier = Modifier.weight(1f)
                    )
                }
            }
        },
        modifier = modifier.shake(shakeController)
    )
}
