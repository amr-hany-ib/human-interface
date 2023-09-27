package com.btech.presentation.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.btech.presentation.R

val notoSansFontFamily = FontFamily(
    Font(R.font.noto_sans, FontWeight.Normal),
    Font(R.font.noto_sans_bold, FontWeight.Bold)
)

data class BtechTypography(
    val heading: HeadingStyle = HeadingStyle(),
    val body: BodyStyle = BodyStyle(),
    val utility: UtilityStyle = UtilityStyle()
)

data class HeadingStyle(
    val heading7xl: TextStyle = TextStyle(
        fontSize = 42.sp,
        lineHeight = 52.sp,
        fontFamily = notoSansFontFamily,
        fontWeight = FontWeight.Bold,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    ),
    val heading4xl: TextStyle = TextStyle(
        fontSize = 28.sp,
        lineHeight = 34.sp,
        fontFamily = notoSansFontFamily,
        fontWeight = FontWeight.Bold,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    ),
    val heading3xl: TextStyle = TextStyle(
        fontSize = 24.sp,
        lineHeight = 32.sp,
        fontFamily = notoSansFontFamily,
        fontWeight = FontWeight.Bold,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    ),
    val heading2xl: TextStyle = TextStyle(
        fontSize = 20.sp,
        lineHeight = 26.sp,
        fontFamily = notoSansFontFamily,
        fontWeight = FontWeight.Bold,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    ),
    val headingLg: TextStyle = TextStyle(
        fontFamily = notoSansFontFamily,
        fontSize = 16.sp,
        lineHeight = 22.sp,
        fontWeight = FontWeight.Bold,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    ),
    val headingMd: TextStyle = TextStyle(
        fontFamily = notoSansFontFamily,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        fontWeight = FontWeight.Bold,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    ),
    val headingSm: TextStyle = TextStyle(
        fontFamily = notoSansFontFamily,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        fontWeight = FontWeight.Bold,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    ),
    val title2: TextStyle = TextStyle(
        fontSize = 24.sp,
        lineHeight = 32.sp,
        fontFamily = notoSansFontFamily,
        fontWeight = FontWeight.SemiBold,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    ),
    val subtitle2: TextStyle = TextStyle(
        fontSize = 18.sp,
        lineHeight = 24.sp,
        fontFamily = notoSansFontFamily,
        fontWeight = FontWeight.Normal,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )
)

data class BodyStyle(
    val bodyLg: TextStyle = TextStyle(
        fontSize = 16.sp,
        lineHeight = 22.sp,
        fontFamily = notoSansFontFamily,
        fontWeight = FontWeight.Normal,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    ),
    val bodyMd: TextStyle = TextStyle(
        fontSize = 14.sp,
        lineHeight = 20.sp,
        fontFamily = notoSansFontFamily,
        fontWeight = FontWeight.Normal,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    ),
    val bodySm: TextStyle = TextStyle(
        fontSize = 12.sp,
        lineHeight = 16.sp,
        fontFamily = notoSansFontFamily,
        fontWeight = FontWeight.Normal,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )
)

data class UtilityStyle(
    val headingSm: TextStyle = TextStyle(
        fontFamily = notoSansFontFamily,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        fontWeight = FontWeight.Normal,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    ),
    val utilityLg: TextStyle = TextStyle(
        fontSize = 16.sp,
        lineHeight = 22.sp,
        fontFamily = notoSansFontFamily,
        fontWeight = FontWeight.Normal,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    ),

    val utilityMd: TextStyle = TextStyle(
        fontFamily = notoSansFontFamily,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        fontWeight = FontWeight.Normal,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    ),
    val utilitySm: TextStyle = TextStyle(
        fontFamily = notoSansFontFamily,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        fontWeight = FontWeight.Normal,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )
)

val LocalTypography = staticCompositionLocalOf {
    BtechTypography()
}
