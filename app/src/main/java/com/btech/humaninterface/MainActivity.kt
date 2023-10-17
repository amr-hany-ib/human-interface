package com.btech.humaninterface

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.*
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import com.btech.checkout.common.components.CartSummary
import com.btech.humaninterface.ui.theme.HumanInterfaceTheme
import com.btech.presentation.buttons.PrimaryButton
import com.btech.presentation.buttons.PrimaryOutlinedButton
import com.btech.presentation.cart.CartItem
import com.btech.presentation.dropdown.Dropdown
import com.btech.presentation.dropdown.PrimaryDropdownMenuItem
import com.btech.presentation.textfield.DecimalFormatter
import com.btech.presentation.textfield.NumberFormatVisualTransformation
import com.btech.presentation.textfield.PrimaryTextField
import com.btech.presentation.theme.BtechTheme

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
    var isExpanded by remember { mutableStateOf(true) }
    Column(
        modifier.fillMaxSize()
            .padding(horizontal = BtechTheme.spacing.horizontalPadding)
    ) {
        Dropdown(
            label = "test label",
            content = {
                PrimaryDropdownMenuItem(
                    text = {
                        Text(
                            text = "Hello $name!"
                        )
                    },
                    onClick = {
                    }
                )

                PrimaryDropdownMenuItem(
                    text = {
                        Text(
                            text = "Hello $name!"
                        )
                    },
                    onClick = {
                    }
                )
            },
            expanded = isExpanded,
            dropdownTitle = "testdsjfnsjlfnvsjl",
            onClick = {
                isExpanded = !isExpanded
            },
            onDismissRequest = {
                isExpanded = false
            }
        )

        Row() {
            PrimaryOutlinedButton(text = "Test", isEnabled = false) {
//
            }

            PrimaryButton(text = "Test") {
//
            }
        }

        CartItem(
            title = "Iphone 14 pro max",
            subtitle = "550000",
            trailingValue = "1"
        )

        var value by remember { mutableStateOf("") }

        PrimaryTextField(
            singleLine = true,
            value = value,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done
            ),
            onValueChange = { price ->
                value = DecimalFormatter().cleanup(price)
            },
            modifier = Modifier.weight(1f),
            visualTransformation = NumberFormatVisualTransformation()
        )

        CartSummary(
            merchantImage = null,
            title = "B.tech",
            subtitle = "2 items",
            total = "552000"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HumanInterfaceTheme {
        Greeting("Android")
    }
}
