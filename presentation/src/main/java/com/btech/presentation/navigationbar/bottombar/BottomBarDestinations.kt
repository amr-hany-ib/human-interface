package com.btech.presentation.navigationbar.bottombar

import androidx.annotation.Keep
import com.btech.presentation.R

@Keep
abstract class BottomBarDestination {
    abstract val destinations: List<BottomBarModel>
}

@Keep
class MyloCashierBottomDestinations() : BottomBarDestination() {
    override val destinations: List<BottomBarModel>
        get() = listOf(
            BottomBarModel(
                R.drawable.ic_home_active,
                R.drawable.ic_home_inactive,
                R.string.bottom_navbar_home
            ),
            BottomBarModel(
                R.drawable.ic_bag_active,
                R.drawable.ic_bag_inactive,
                R.string.bottom_navbar_new_purchase
            )
        )
}

@Keep
class MyloBottomBarDestination() : BottomBarDestination() {
    override val destinations: List<BottomBarModel>
        get() = listOf(
            BottomBarModel(
                R.drawable.ic_home_active,
                R.drawable.ic_home_inactive,
                R.string.bottom_navbar_home
            ),
            BottomBarModel(
                R.drawable.ic_scan,
                R.drawable.ic_scan,
                R.string.bottom_navbar_scan
            ),
            BottomBarModel(
                R.drawable.ic_payment_hub_active,
                R.drawable.ic_payment_hub_inactive,
                R.string.bottom_navbar_payment_hub
            )
        )
}
