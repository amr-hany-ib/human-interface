package com.btech.presentation.dialog

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.btech.presentation.R
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
    shape: Shape = RectangleShape,
    elevation: CardElevation = CardDefaults.cardElevation(
        defaultElevation = 8.dp
    ),
    positiveButtonTitle: String = stringResource(id = R.string.confirm),
    negativeButtonTitle: String = stringResource(id = R.string.cancel),
    contentPadding: PaddingValues = PaddingValues(horizontal = BtechTheme.spacing.extraLargePadding),
    onPositiveClick: () -> Unit,
    onNegativeClick: () -> Unit
) {
    Dialog(
        onDismissRequest = { }
    ) {
        Card(
            elevation = elevation,
            shape = shape,
            modifier = Modifier
                .padding(contentPadding)
                .fillMaxWidth()
        ) {
            Column(
                modifier = Modifier
                    .background(BtechTheme.colors.background.backgroundColor)
                    .padding(
                        vertical = BtechTheme.spacing.verticalPadding,
                        horizontal = BtechTheme.spacing.horizontalPadding
                    )
            ) {
                Text(
                    text = title,
                    style = BtechTheme.typography.heading.headingLg,
                    textAlign = TextAlign.Start,
                    color = BtechTheme.colors.text.textPrimary,
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(BtechTheme.spacing.extraLargePadding))

                Text(
                    text = message,
                    textAlign = TextAlign.Start,
                    style = BtechTheme.typography.body.bodyMd,
                    color = BtechTheme.colors.text.textPrimary,
                    modifier = Modifier
                        .fillMaxWidth()
                        .sizeIn(minHeight = 85.dp)
                )

                Row(
                    modifier = Modifier
                        .align(Alignment.End)
                        .padding(top = 8.dp)
                ) {
                    Text(
                        text = negativeButtonTitle,
                        modifier = Modifier.padding(4.dp).clickable {
                            onNegativeClick()
                        },
                        style = BtechTheme.typography.body.bodyMd,
                        color = BtechTheme.colors.action.actionDanger
                    )

                    Spacer(modifier = Modifier.width(32.dp))

                    Text(
                        text = positiveButtonTitle,
                        modifier = Modifier.padding(4.dp).clickable {
                            onPositiveClick()
                        },
                        style = BtechTheme.typography.body.bodyMd,
                        color = BtechTheme.colors.action.actionPrimary
                    )
                }
            }
        }
    }
}
