package com.btech.presentation.navigationbar.bottombar

import com.btech.presentation.R

abstract class BottomBarDestination {
    abstract val destinations: List<BottomBarModel>
}

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
                R.drawable.ic_account_active,
                R.drawable.ic_account_inactive,
                R.string.bottom_navbar_account
            )
        )
}
