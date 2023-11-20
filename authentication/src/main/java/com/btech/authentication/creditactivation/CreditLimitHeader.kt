package com.btech.authentication.creditactivation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import com.btech.authentication.R
import com.btech.presentation.Lambda
import com.btech.presentation.navigationbar.topbar.TopBar
import com.btech.presentation.theme.BtechTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreditLimitTopBar(
    title: String,
    currency: String,
    creditLimit: String,
    modifier: Modifier = Modifier,
    onBack: Lambda
) {
    Column(
        modifier
            .clip(
                RoundedCornerShape(
                    bottomEnd = BtechTheme.spacing.hugePadding,
                    bottomStart = BtechTheme.spacing.hugePadding
                )
            )
            .background(BtechTheme.colors.containerColors.green)
    ) {
        TopBar(
            actionText = stringResource(id = R.string.back),
            onBackClick = onBack,
            modifier = Modifier.padding(horizontal = BtechTheme.spacing.horizontalPadding),
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = BtechTheme.colors.containerColors.green,
                actionIconContentColor = BtechTheme.colors.text.textTertiary,
                navigationIconContentColor = BtechTheme.colors.text.textTertiary
            )
        )
        Text(
            text = title,
            color = BtechTheme.colors.text.textOnColor,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            style = BtechTheme.typography.body.bodyMd
        )
        Spacer(Modifier.height(BtechTheme.spacing.largePadding))

        CreditActivationLimitTitle(currency, creditLimit, Modifier.fillMaxWidth())

        Spacer(Modifier.height(BtechTheme.spacing.extraHugePadding))
    }
}
