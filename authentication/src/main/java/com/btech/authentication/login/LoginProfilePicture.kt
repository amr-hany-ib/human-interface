package com.btech.authentication.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.btech.presentation.R
import com.btech.presentation.common.getInitialsFromName
import com.btech.presentation.theme.BtechTheme
import com.btech.presentation.theme.notoSansFontFamily

@Composable
fun LoginProfilePicture(
    name: String?,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .size(88.dp)
            .clip(CircleShape)
            .background(BtechTheme.colors.text.textSecondary.copy(alpha = 0.1f)),
        contentAlignment = Alignment.Center
    ) {
        if (name.isNullOrEmpty()) {
            Icon(
                painter = painterResource(id = R.drawable.ic_account_active),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                tint = BtechTheme.colors.text.textSecondary
            )
        } else {
            Text(
                text = name.getInitialsFromName(),
                style = TextStyle(
                    fontSize = 34.62.sp,
                    lineHeight = 28.85.sp,
                    fontFamily = notoSansFontFamily,
                    fontWeight = FontWeight.Normal,
                    color = BtechTheme.colors.text.textSecondary,
                    textAlign = TextAlign.Center
                )
            )
        }
    }
}

@Preview()
@Composable
private fun LoginAvatarPreview() {
    Column() {
        LoginProfilePicture("Mohab Nadim")
        LoginProfilePicture("")
    }
}
