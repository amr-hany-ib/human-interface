package com.btech.checkout.offerselection.components.installmentoption

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.btech.checkout.R
import com.btech.presentation.Lambda
import com.btech.presentation.theme.BtechTheme

@Preview(showBackground = true)
@Composable
fun InstallmentOptionPreview() {
    InstallmentOption(
        title = "3 Months",
        subtitle = "EGP 6250",
        onSelection = {}
    )
}

@Composable
fun InstallmentOption(
    title: String,
    subtitle: String,
    modifier: Modifier = Modifier,
    isSelected: Boolean = false,
    onSelection: Lambda
) {
    val color = if (isSelected) {
        BtechTheme.colors.focusColors.focusInverse
    } else {
        BtechTheme.colors.text.textPrimary
    }

    Column(
        modifier = modifier
            .clip(RoundedCornerShape(12.dp))
            .border(
                width = 0.5.dp,
                color = if (isSelected) BtechTheme.colors.focusColors.focusInverse else BtechTheme.colors.layerColors.layerBackgroundHighlight,
                shape = RoundedCornerShape(size = 12.dp)
            )
            .clickable {
                onSelection()
            }
            .padding(horizontal = 25.dp, vertical = 12.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            style = BtechTheme.typography.heading.heading3xl,
            color = color,
            textAlign = TextAlign.Center
        )
        Spacer(Modifier.height(4.dp))

        Text(
            text = stringResource(id = R.string.months),
            style = BtechTheme.typography.body.bodySm,
            color = color,
            textAlign = TextAlign.Center
        )

        Spacer(Modifier.height(12.dp))

        Divider(
            thickness = 1.dp,
            modifier = Modifier.widthIn(65.dp).fillMaxWidth(),
            color = if (isSelected) BtechTheme.colors.focusColors.focusInverse else BtechTheme.colors.gray.gray400
        )

        Spacer(Modifier.height(12.dp))

        Text(
            text = subtitle,
            style = BtechTheme.typography.heading.heading3xl,
            color = color,
            textAlign = TextAlign.Center
        )

        Spacer(Modifier.height(4.dp))

        Text(
            text = stringResource(id = R.string.egp_per_month),
            style = BtechTheme.typography.body.bodySm,
            color = color,
            textAlign = TextAlign.Center
        )

        Spacer(Modifier.height(4.dp))

        Text(
            text = stringResource(id = R.string.in_total),
            style = BtechTheme.typography.body.bodySm,
            color = color,
            textAlign = TextAlign.Center
        )
    }
}
