package com.btech.presentation.textfield.passcode

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.text.isDigitsOnly
import com.btech.presentation.animation.shake.ShakeConfig
import com.btech.presentation.animation.shake.rememberShakeController
import com.btech.presentation.animation.shake.shake
import com.btech.presentation.theme.BtechTheme

@Composable
fun PassCodeTextField(
    modifier: Modifier = Modifier,
    text: String,
    otpCount: Int = 6,
    isError: Boolean = false,
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
        onValueChange = {
            if (it.length <= otpCount && it.isDigitsOnly()) {
                onValueChange(it)
            }
        },
        keyboardOptions = keyboardOptions,
        decorationBox = { _ ->
            Row(
                horizontalArrangement = Arrangement.spacedBy(
                    BtechTheme.spacing.extraLargePadding,
                    alignment = Alignment.CenterHorizontally
                ),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.heightIn(min = 56.dp)
            ) {
                repeat(otpCount) { index ->
                    PassCodeCharacter(
                        isFilled = text.getOrNull(index)?.isDigit() == true,
                        isError = isError
                    )
                }
            }
        },
        modifier = modifier.shake(shakeController)
    )
}

@Preview
@Composable
fun PassCodeTextFieldPreview() {
    PassCodeTextField(text = "", onValueChange = {}, isError = false)
}
