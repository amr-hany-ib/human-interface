package com.btech.presentation.textfield

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.btech.presentation.R
import com.btech.presentation.StringLambda
import com.btech.presentation.theme.BtechTheme

@Preview(showBackground = true)
@Composable
fun PrimaryTextFieldPreview() {
    PrimaryTextField(
        value = "Text",
        label = "Label",
        supportingText = "Supporting text",
        onValueChange = {},
        isError = true
    )
}

@Composable
fun PrimaryTextField(
    value: String,
    onValueChange: StringLambda,
    modifier: Modifier = Modifier,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    placeholderText: String? = null,
    label: String? = null,
    supportingText: String? = null,
    isError: Boolean = false,
    shape: Shape = RoundedCornerShape(12.dp),
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    singleLine: Boolean = false,
    maxLines: Int = if (singleLine) 1 else Int.MAX_VALUE,
    minLines: Int = 1
) {
    Column(
        modifier.background(BtechTheme.colors.background.backgroundColor),
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        label?.let {
            Text(
                text = it,
                style = BtechTheme.typography.utility.headingSm,
                color = BtechTheme.colors.text.textPrimary
            )
        }
        TextField(
            value = value,
            onValueChange = onValueChange,
            leadingIcon = leadingIcon,
            trailingIcon = {
                if (isError) {
                    errorIcon()
                } else {
                    trailingIcon?.let { it() }
                }
            },
            placeholder = {
                placeholderText?.let {
                    Text(
                        text = placeholderText,
                        style = BtechTheme.typography.body.bodyMd,
                        color = BtechTheme.colors.text.textPlaceholder
                    )
                }
            },
            isError = isError,
            minLines = minLines,
            maxLines = maxLines,
            keyboardActions = keyboardActions,
            keyboardOptions = keyboardOptions,
            visualTransformation = visualTransformation,
            shape = shape,
            colors = TextFieldDefaults.colors(
                focusedContainerColor = BtechTheme.colors.field.fieldBackground,
                unfocusedContainerColor = BtechTheme.colors.field.fieldBackground,
                focusedIndicatorColor = Color.Unspecified,
                unfocusedIndicatorColor = Color.Unspecified,
                errorIndicatorColor = Color.Unspecified,
                errorContainerColor = BtechTheme.colors.field.fieldBackground,
                errorSupportingTextColor = BtechTheme.colors.text.textDanger,
                errorTrailingIconColor = BtechTheme.colors.text.textDanger
            ),
            modifier = Modifier.fillMaxWidth()
                .border(
                    2.dp,
                    if (isError) {
                        BtechTheme.colors.text.textDanger
                    } else {
                        Color.Unspecified
                    },
                    shape
                )
        )
        supportingText?.let {
            Text(
                text = it,
                style = BtechTheme.typography.utility.utilitySm,
                color = if (isError) {
                    BtechTheme.colors.text.textDanger
                } else {
                    BtechTheme.colors.text.textPrimary
                }
            )
        }
    }
}

@Composable
fun errorIcon() {
    Icon(
        painter = painterResource(id = R.drawable.ic_error),
        contentDescription = "error icon"
    )
}
