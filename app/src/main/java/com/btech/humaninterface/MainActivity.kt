package com.btech.humaninterface

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.btech.checkout.offerselection.components.offer.CommercialOfferMonthlyPaymentItem
import com.btech.humaninterface.ui.theme.HumanInterfaceTheme
import com.btech.presentation.common.getDecimalFormat

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HumanInterfaceTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = getDecimalFormat().format(20000.90)
    )

    CommercialOfferMonthlyPaymentItem(
        getDecimalFormat().format(2000)
    )
//    var isExpanded by remember { mutableStateOf(true) }
//    Column(
//        modifier
//            .fillMaxSize()
//            .padding(horizontal = BtechTheme.spacing.horizontalPadding)
//    ) {
//        PrimaryButton(text = "المتابعةContinuet") {
//        }
//
//        TertiaryButton(text = "COde", isEnabled = false) {
//        }
//
//        PrimaryButton(
//            text = "المتابعةContinue",
//            modifier = Modifier
//                .heightIn(min = 52.dp)
//        ) {
//        }
//        Dropdown(
//            label = "test label",
//            content = {
//                PrimaryDropdownMenuItem(
//                    text = {
//                        Text(
//                            text = "Hello $name!"
//                        )
//                    },
//                    onClick = {
//                    }
//                )
//
//                PrimaryDropdownMenuItem(
//                    text = {
//                        Text(
//                            text = "Hello $name!"
//                        )
//                    },
//                    onClick = {
//                    }
//                )
//            },
//            expanded = isExpanded,
//            dropdownTitle = "testdsjfnsjlfnvsjl",
//            onClick = {
//                isExpanded = !isExpanded
//            },
//            onDismissRequest = {
//                isExpanded = false
//            }
//        )

//    var isError by remember { mutableStateOf(false) }
//    var value by remember { mutableStateOf("") }
//    PassCodeTextField(
//        text = value,
//        otpCount = 7,
//        isError = isError,
//        onValueChange = {
//            value = it
//            isError = it.length > 6
//        }
//    )

//        Row() {
//            PrimaryOutlinedButton(text = "Test", isEnabled = false) {
// //
//            }
//
//            PrimaryButton(text = "Test") {
// //
//            }
//        }
//
//        CartItem(
//            title = "Iphone 14 pro max",
//            subtitle = "550000",
//            trailingValue = "1"
//        )
//
//        var value by remember { mutableStateOf("") }
//
//        PrimaryTextField(
//            singleLine = true,
//            value = value,
//            keyboardOptions = KeyboardOptions(
//                keyboardType = KeyboardType.Number,
//                imeAction = ImeAction.Done
//            ),
//            onValueChange = { price ->
//                value = DecimalFormatter().cleanup(price)
//            },
//            modifier = Modifier.weight(1f),
//            visualTransformation = NumberFormatVisualTransformation()
//        )
//
//        CartSummary(
//            merchantImage = null,
//            title = "B.tech",
//            subtitle = "2 items",
//            total = "552000"
//        )

//        var selectedIndex by remember { mutableStateOf(-1) }
//        repeat(2) {
//            CommercialOffer(
//                payment = "5,0000",
//                downPayment = "4000",
//                tenure = 3,
//                tenureDuration = "months",
//                interestRate = "12%",
//                totalPayments = "444444",
//                adminFees = "100",
//                financedAmount = "1000909",
//                totalInterest = "1222",
//                onSelection = { selectedIndex = it },
//                isSelected = it == selectedIndex
//            )
//        }
//
//        CartItem(
//            title = "Iphone 14 pro max",
//            subtitle = "550000",
//            trailingValue = "500000"
//        )
//
//        CommercialOfferMonthlyPaymentItem(
//            "2000"
//        )
//
//        val num = 500
//        InstallmentPerMonthItem(
//            text = num.formatCentsToPounds()
//        )
//        Spacer(Modifier.weight(1f))
//
//        var x by remember { mutableStateOf(0) }
//        BottomBar(selectedTabIndex = x, onSelection = {
//            x = it
//        })
//
//        var input by remember { mutableStateOf("") }
//        PassCodeTextField(text = input, onValueChange = { input = it })
//
//        TertiaryButton(text = "text", modifier = Modifier.fillMaxWidth()) {}
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HumanInterfaceTheme {
        Greeting("Android")
    }
}
