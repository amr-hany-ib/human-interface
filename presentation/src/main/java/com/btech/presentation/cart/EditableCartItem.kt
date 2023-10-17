package com.btech.presentation.cart

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.btech.presentation.Lambda
import com.btech.presentation.R
import com.btech.presentation.divider.HorizontalDivider
import com.btech.presentation.theme.BtechTheme

@Preview(showBackground = true)
@Composable
fun EditableCartItemPreview() {
    EditableCartItem(
        title = "Iphone 14 pro max",
        subtitle = "550000",
        quantity = 1,
        onAdd = {},
        onMinus = {}
    )
}

@Composable
fun EditableCartItem(
    title: String,
    subtitle: String,
    quantity: Int,
    modifier: Modifier = Modifier,
    showDivider: Boolean = true,
    onAdd: Lambda,
    onMinus: Lambda
) {
    Column(modifier) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
                .background(BtechTheme.colors.gray.gray100)
                .padding(BtechTheme.spacing.verticalPadding)
        ) {
            Column() {
                Text(
                    text = title,
                    style = BtechTheme.typography.heading.headingLg,
                    color = BtechTheme.colors.text.textPrimary
                )
                Text(
                    text = subtitle,
                    style = BtechTheme.typography.body.bodyMd,
                    color = BtechTheme.colors.text.textPrimary
                )
            }

            CartItemControls(
                quantity,
                onAdd = onAdd,
                onMinus = onMinus
            )
        }

        if (showDivider) {
            HorizontalDivider()
        }
    }
}

@Composable
fun CartItemControls(
    quantity: Int,
    modifier: Modifier = Modifier,
    onAdd: Lambda,
    onMinus: Lambda
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.background(Color(0xFFE2E2E2))
            .heightIn(min = 36.dp)
    ) {
        IconButton(onClick = onMinus) {
            if (quantity == 1) {
                Icon(
                    painter = painterResource(
                        R.drawable.ic_delete
                    ),
                    contentDescription = "delete"
                )
            } else {
                Icon(
                    imageVector = Icons.Default.Remove,
                    contentDescription = ""
                )
            }
        }

        Box(Modifier.padding(BtechTheme.spacing.tagVerticalPadding)) {
            Text(
                text = quantity.toString(),
                style = BtechTheme.typography.heading.headingLg,
                color = BtechTheme.colors.text.textPrimary
            )
        }

        IconButton(onClick = onAdd) {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = "delete"
            )
        }
    }
}
