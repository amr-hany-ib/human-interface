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
    Font(R.font.noto_sans_arabic_regular, FontWeight.Normal),
    Font(R.font.noto_sans_arabic_semi_bold, FontWeight.SemiBold),
    Font(R.font.noto_sans_arabic_bold, FontWeight.Bold)
)

data class BtechTypography(
    val display: DisplayStyle = DisplayStyle(),
    val heading: HeadingStyle = HeadingStyle(),
    val body: BodyStyle = BodyStyle(),
    val utility: UtilityStyle = UtilityStyle(),
    val tokenlessStyle: TokenLessStyle = TokenLessStyle(),
    val medium: MediumStyle = MediumStyle()

)

data class DisplayStyle(
    val displayMd: TextStyle = TextStyle(
        fontSize = 60.sp,
        lineHeight = 66.sp,
        fontFamily = notoSansFontFamily,
        fontWeight = FontWeight.Bold,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )
)

data class MediumStyle(
    val mediumLg: TextStyle = TextStyle(
        fontSize = 16.sp,
        lineHeight = 22.sp,
        fontFamily = notoSansFontFamily,
        fontWeight = FontWeight(500),
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )

    )
)

data class HeadingStyle(
    val heading8xl: TextStyle = TextStyle(
        fontSize = 48.sp,
        lineHeight = 54.sp,
        fontFamily = notoSansFontFamily,
        fontWeight = FontWeight.Bold,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    ),
    val heading7xl: TextStyle = TextStyle(
        fontSize = 42.sp,
        lineHeight = 52.sp,
        fontFamily = notoSansFontFamily,
        fontWeight = FontWeight.Bold,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    ),
    val heading5xl: TextStyle = TextStyle(
        fontSize = 32.sp,
        lineHeight = 40.sp,
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
    val headingXl: TextStyle = TextStyle(
        fontSize = 18.sp,
        lineHeight = 24.sp,
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
        fontWeight = FontWeight.SemiBold,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    ),
    val utilitySm: TextStyle = TextStyle(
        fontFamily = notoSansFontFamily,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        fontWeight = FontWeight.SemiBold,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )
)

data class TokenLessStyle(
    val twelveTwenty400: TextStyle = TextStyle(
        fontSize = 12.sp,
        lineHeight = 20.sp,
        fontFamily = notoSansFontFamily,
        fontWeight = FontWeight.Normal
    ),
    val twelveNone500: TextStyle = TextStyle(
        fontSize = 12.sp,
        fontFamily = notoSansFontFamily,
        fontWeight = FontWeight(500)
    ),
    val eighteenNone600: TextStyle = TextStyle(
        fontSize = 18.sp,
        fontFamily = notoSansFontFamily,
        fontWeight = FontWeight(600)
    ),
    val twelveTwentyOne400: TextStyle = TextStyle(
        fontSize = 12.sp,
        lineHeight = 21.sp,
        fontFamily = notoSansFontFamily,
        fontWeight = FontWeight.Normal
    ),
    val twentyTwoNone700: TextStyle = TextStyle(
        fontSize = 22.sp,
        fontFamily = notoSansFontFamily,
        fontWeight = FontWeight.Bold
    ),
    val fourteenTwenty600: TextStyle = TextStyle(
        fontSize = 14.sp,
        lineHeight = 20.3.sp,
        fontFamily = notoSansFontFamily,
        fontWeight = FontWeight(600)
    ),
    val sixteenThirteen400: TextStyle = TextStyle(
        fontSize = 16.52.sp,
        lineHeight = 13.77.sp,
        fontFamily = notoSansFontFamily,
        fontWeight = FontWeight(400)
    ),
    val fourteenTwenty400: TextStyle = TextStyle(
        fontSize = 14.sp,
        lineHeight = 20.3.sp,
        fontFamily = notoSansFontFamily,
        fontWeight = FontWeight(400)

    )
)

val LocalTypography = staticCompositionLocalOf {
    BtechTypography()
}
