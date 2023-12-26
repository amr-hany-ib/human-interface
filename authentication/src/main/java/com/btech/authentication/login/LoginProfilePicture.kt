package com.btech.authentication.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.btech.presentation.R
import com.btech.presentation.common.getInitialsFromName
import com.btech.presentation.theme.BtechTheme

@Composable
fun LoginProfilePicture(
    name: String?,
    modifier: Modifier = Modifier,
    style: TextStyle = BtechTheme.typography.heading.heading4xl.copy(
        color = BtechTheme.colors.accent.accent1000,
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.Normal
    ),
    background: Color = BtechTheme.colors.accent.accent1000.copy(alpha = 0.1f)
) {
    Box(
        modifier = modifier
            .size(88.dp)
            .clip(CircleShape)
            .background(background),
        contentAlignment = Alignment.Center
    ) {
        if (name.isNullOrEmpty()) {
            Icon(
                painter = painterResource(id = R.drawable.ic_account_active),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                tint = BtechTheme.colors.accent.accent1000
            )
        } else {
            Text(
                text = name.getInitialsFromName(),
                style = style,
                maxLines = 1,
                modifier = Modifier.offset(y = BtechTheme.spacing.spacing2)
            )
        }
    }
}

@Preview(
    showBackground = true
)
@Composable
private fun LoginAvatarPreview() {
    Column() {
        LoginProfilePicture("Mohab Nadim")
        LoginProfilePicture("")
    }
}
