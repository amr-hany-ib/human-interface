package com.btech.checkout.planreview.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.btech.checkout.R
import com.btech.presentation.theme.BtechTheme

@Preview(showBackground = true)
@Composable
fun PlanBreakdownItemPreview() {
    PlanBreakdownItemRow(
        downPayment = 500,
        toBeFinancedAmount = 500,
        adminFeesAmount = 100
    )
}

@Composable
fun PlanBreakdownItemRow(
    downPayment: Int,
    toBeFinancedAmount: Int,
    adminFeesAmount: Int,
    modifier: Modifier = Modifier
) {
    Column(modifier) {
        Text(
            text = stringResource(R.string.breakdown),
            style = BtechTheme.typography.utility.utilitySm
        )

        Spacer(Modifier.height(8.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .border(
                    width = Dp.Hairline,
                    shape = RoundedCornerShape(12.dp),
                    color = BtechTheme.colors.gray.gray400
                )
                .padding(
                    horizontal = 16.dp,
                    vertical = 16.dp
                )
                .height(IntrinsicSize.Min),
            verticalAlignment = Alignment.CenterVertically
            // horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            PlanBreakdownItem(
                title = stringResource(id = R.string.down_payment),
                subtitle = stringResource(
                    id = R.string.egp_value,
                    formatArgs = arrayOf(downPayment)
                )
            )

            Spacer(Modifier.width(12.dp))
            Divider(
                thickness = Dp.Hairline,
                modifier = Modifier
                    .padding(vertical = 6.dp)
                    .fillMaxHeight()
                    .width(1.dp)
            )
            Spacer(Modifier.width(12.dp))
            PlanBreakdownItem(
                title = stringResource(id = R.string.to_be_financed),
                subtitle = stringResource(
                    id = R.string.egp_value,
                    formatArgs = arrayOf(toBeFinancedAmount)
                )
            )
            Spacer(Modifier.width(12.dp))
            Divider(
                thickness = Dp.Hairline,
                modifier = Modifier
                    .padding(vertical = 6.dp)
                    .fillMaxHeight()
                    .width(1.dp)
            )
            Spacer(Modifier.width(12.dp))

            PlanBreakdownItem(
                title = stringResource(id = R.string.admin_fees),
                subtitle = stringResource(
                    id = R.string.egp_value,
                    formatArgs = arrayOf(adminFeesAmount)
                )
            )
        }
    }
}

@Composable
fun PlanBreakdownItem(
    title: String,
    subtitle: String

) {
    Column() {
        Text(
            text = title,
            style = BtechTheme.typography.utility.utilitySm
        )

        Text(
            text = subtitle,
            style = BtechTheme.typography.heading.headingSm
        )
    }
}
