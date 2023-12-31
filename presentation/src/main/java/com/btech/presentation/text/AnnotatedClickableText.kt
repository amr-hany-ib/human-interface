package com.btech.presentation.text

import androidx.compose.foundation.text.ClickableText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import com.btech.presentation.Lambda
import com.btech.presentation.theme.BtechTheme

const val DEFAULT_CLICK_ANNOTATION = "click"

@Composable
fun AnnotatedClickableText(
    modifier: Modifier = Modifier,
    text: String,
    clickableText: String,
    textStyle: TextStyle = BtechTheme.typography.body.bodyMd.copy(color = BtechTheme.colors.text.textPrimary),
    clickableTextStyle: TextStyle = BtechTheme.typography.body.bodyMd.copy(color = BtechTheme.colors.text.textPrimary),
    onClick: Lambda
) {
    val annotatedString = remember {
        buildClickableString(
            text,
            clickableText,
            textStyle = textStyle,
            clickableTextStyle = clickableTextStyle
        )
    }

    ClickableText(
        text = annotatedString,
        onClick = { offset ->
            annotatedString.getStringAnnotations(
                DEFAULT_CLICK_ANNOTATION,
                start = offset,
                end = offset
            ).firstOrNull()?.let {
                onClick()
            }
        },
        modifier = modifier
    )
}

fun buildClickableString(
    text: String,
    clickableText: String,
    textStyle: TextStyle,
    clickableTextStyle: TextStyle
): AnnotatedString {
    return buildAnnotatedString {
        withStyle(
            style = textStyle.toSpanStyle()
        ) {
            append(text)
        }

        append(" ")

        pushStringAnnotation(
            tag = DEFAULT_CLICK_ANNOTATION,
            annotation = DEFAULT_CLICK_ANNOTATION
        )
        withStyle(
            style = clickableTextStyle.toSpanStyle()
        ) {
            append(clickableText)
        }
        pop()
    }
}

fun buildCustomizableStyleString(
    text: String,
    customizableText: String,
    textStyle: TextStyle,
    customizableTextStyle: TextStyle
): AnnotatedString {
    return buildAnnotatedString {
        withStyle(
            style = textStyle.toSpanStyle()
        ) {
            append(text)
        }

        addStyle(
            style = customizableTextStyle.toSpanStyle(),
            start = text.indexOf(customizableText).coerceAtLeast(0),
            end = text.indexOf(customizableText) + customizableText.length
        )
    }
}

// add multiple clickable annotations to the same string
@Composable
fun getAnnotatedString(
    text: String,
    clickableText: Array<AnnotatedClickableTextModel>
): AnnotatedString {
    return buildAnnotatedString {
        withStyle(style = BtechTheme.typography.body.bodyMd.toSpanStyle()) {
            append(text)
        }
        clickableText.forEach { annotation ->
            addStringAnnotation(
                tag = annotation.text,
                annotation = annotation.annotation,
                start = text.indexOf(annotation.text).coerceAtLeast(0),
                end = text.indexOf(annotation.text) + annotation.text.length
            )
            addStyle(
                style = BtechTheme.typography.body.bodyMd.copy(textDecoration = TextDecoration.Underline)
                    .toSpanStyle(),
                start = text.indexOf(annotation.text).coerceAtLeast(0),
                end = text.indexOf(annotation.text) + annotation.text.length
            )
        }
    }
}
