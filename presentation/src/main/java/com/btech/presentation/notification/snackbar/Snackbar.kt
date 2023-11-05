package com.btech.presentation.notification.snackbar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.Icon
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarVisuals
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.btech.presentation.R
import com.btech.presentation.theme.BtechTheme

@Composable
fun NoInternetSnackbar() {
    Row(
        modifier = Modifier
            .padding(horizontal = BtechTheme.spacing.smallPadding)
            .clip(RoundedCornerShape(100))
            .background(BtechTheme.colors.action.actionPrimary)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(
            BtechTheme.spacing.extraSmallPadding,
            alignment = Alignment.CenterHorizontally
        )
    ) {
        Icon(
            imageVector = Icons.Default.Warning,
            contentDescription = "",
            tint = BtechTheme.colors.text.textOnColor
        )

        Text(
            text = stringResource(R.string.no_internet_message),
            style = BtechTheme.typography.body.bodySm,
            color = BtechTheme.colors.text.textOnColor
        )
    }
}

@Preview(showBackground = true)
@Composable
fun NoInternetSnackbarPreview() {
    NoInternetSnackbar()
}

class SnackbarVisualsWithError(
    override val message: String,
    val isError: Boolean
) : SnackbarVisuals {
    override val actionLabel: String
        get() = if (isError) "Error" else "OK"
    override val withDismissAction: Boolean
        get() = false
    override val duration: SnackbarDuration
        get() = SnackbarDuration.Indefinite
}
