package com.btech.presentation.navigationbar.bottombar

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.painterResource

data class BottomBarModel(
    val selectedIcon: Int,
    val unSelectedIcon: Int,
    val labelResource: Int
) {
    fun getSelectedIcon(isSelected: Boolean): Int {
        return if (isSelected) {
            selectedIcon
        } else {
            unSelectedIcon
        }
    }
}

class IconResource private constructor(
    @DrawableRes private val resID: Int?,
    private val imageVector: ImageVector?
) {

    @Composable
    fun asPainterResource(): Painter {
        resID?.let {
            return painterResource(id = resID)
        }
        return rememberVectorPainter(image = imageVector!!)
    }

    companion object {
        fun fromDrawableResource(@DrawableRes resID: Int): IconResource {
            return IconResource(resID, null)
        }

        fun fromImageVector(imageVector: ImageVector?): IconResource {
            return IconResource(null, imageVector)
        }
    }
}
