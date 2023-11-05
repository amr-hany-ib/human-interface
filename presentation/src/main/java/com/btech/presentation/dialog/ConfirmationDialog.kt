package com.btech.presentation.dialog

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.btech.presentation.R
import com.btech.presentation.buttons.PrimaryButton
import com.btech.presentation.buttons.SecondaryButton
import com.btech.presentation.divider.HorizontalDivider
import com.btech.presentation.theme.BtechTheme

@Preview
@Composable
fun ConfirmationDialogPreview() {
    ConfirmationDialog(
        "Title",
        "messsage",
        onNegativeClick = {},
        onPositiveClick = {}
    )
}

@Composable
fun ConfirmationDialog(
    title: String,
    message: String,
    shape: Shape = RoundedCornerShape(BtechTheme.spacing.extraLargePadding),
    elevation: CardElevation = CardDefaults.cardElevation(
        defaultElevation = BtechTheme.spacing.mediumPadding
    ),
    positiveButtonTitle: String = stringResource(id = R.string.confirmation_popup_confirm),
    negativeButtonTitle: String = stringResource(id = R.string.confirmation_popup_decline),
    contentPadding: PaddingValues = PaddingValues(horizontal = BtechTheme.spacing.extraLargePadding),
    onPositiveClick: () -> Unit,
    onNegativeClick: () -> Unit,
    onDismissRequest: () -> Unit = {}
) {
    Dialog(
        onDismissRequest = onDismissRequest
    ) {
        Card(
            elevation = elevation,
            shape = shape,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Column(
                modifier = Modifier
                    .background(BtechTheme.colors.background.backgroundColor)
                    .padding(
                        vertical = BtechTheme.spacing.verticalPadding
                    )
            ) {
                Text(
                    text = title,
                    style = BtechTheme.typography.heading.headingLg,
                    textAlign = TextAlign.Start,
                    color = BtechTheme.colors.text.textPrimary,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(BtechTheme.spacing.extraLargePadding)
                )

                Text(
                    text = message,
                    textAlign = TextAlign.Start,
                    style = BtechTheme.typography.body.bodyMd,
                    color = BtechTheme.colors.text.textPrimary,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            top = BtechTheme.spacing.extraSmallPadding,
                            bottom = BtechTheme.spacing.extraLargePadding
                        )
                        .padding(contentPadding)
                )

                HorizontalDivider()

                Row(
                    modifier = Modifier
                        .align(Alignment.End)
                        .padding(top = BtechTheme.spacing.extraLargePadding)
                        .padding(contentPadding)
                ) {
                    PrimaryButton(
                        text = positiveButtonTitle,
                        modifier = Modifier.weight(1f)
                    ) {
                        onPositiveClick()
                    }

                    Spacer(Modifier.width(BtechTheme.spacing.extraSmallPadding))

                    SecondaryButton(
                        negativeButtonTitle,
                        modifier = Modifier.weight(1f)
                    ) {
                        onNegativeClick()
                    }
                }
            }
        }
    }
}
