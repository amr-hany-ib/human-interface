package com.btech.presentation.theme

import androidx.annotation.Keep
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

@Keep
val LightColorPalette = BtechColors()

@Keep
val DarkColorPalette = BtechColors()

@Keep
val LocalColors = staticCompositionLocalOf {
    LightColorPalette
}

@Keep
data class BtechColors(
    val action: ActionColors = ActionColors(),
    val text: TextColors = TextColors(),
    val field: FieldColors = FieldColors(),
    val background: BackgroundColors = BackgroundColors(),
    val gray: GrayColors = GrayColors(),
    val blue: BlueColors = BlueColors(),
    val white: WhiteColors = WhiteColors(),
    val accent: AccentColors = AccentColors(),
    val supportColors: SupportColors = SupportColors(),
    val focusColors: FocusColors = FocusColors(),
    val layerColors: LayerColors = LayerColors(),
    val otpColors: OtpColors = OtpColors(),
    val tagColors: TagColors = TagColors(),
    val borderColors: BorderColors = BorderColors(),
    val containerColors: ContainerColors = ContainerColors(),
    val neutralColors: NeutralColors = NeutralColors(),
    val tokenlessColors: TokenlessColors = TokenlessColors(),
    val utilitiesColors: UtilitiesColors = UtilitiesColors(),
    val skeletonColors: SkeletonColors = SkeletonColors()
)

@Keep
data class AccentColors(
    val accent100: Color = Color(0xFFE6EBEC),
    val accent300: Color = Color(0xffB6C5C6),
    val accent600: Color = Color(0xFF006AFF),
    val accent1000: Color = Color(0xFF0C3E42)
)

@Keep
data class Base(
    val baseText: Color = Color(0xff54777A),
    val baseBackground: Color = Color(0xFFE6EBEC)
)

@Keep
data class UtilitiesColors(
    val base: Base = Base()
)

@Keep
data class SkeletonColors(
    val grey: Color = Color(0xFFF2F4F7),
    val white: Color = Color(0xFFFFFFFF),
    val skeletonBackground: Color = Color(0xFFE2E2E2),
    val green100: Color = Color(0xFF0C3E42),
    val green200: Color = Color(0xFF3A5154)
)

@Keep
data class ActionColors(
    val actionPrimary: Color = Color(0xFF0C3E42),
    val actionPrimaryHover: Color = Color(0xFF3C6467),
    val disabledActionPrimary: Color = Color(0xFFE0E0E0),
    val actionDanger: Color = Color(0xFFEA3A34)
)

@Keep
data class TextColors(
    val textOnColor: Color = Color(0xFFFFFFFF),
    val textOnColorDisabled: Color = Color(0xFFA9A9A9),
    val textPrimary: Color = Color(0xFF1F1F1F),
    val textSecondary: Color = Color(0xFF6F6F6F),
    val textTertiary: Color = Color(0xFFFCCC00),
    val textQuaternary: Color = Color(0xFF6F6F6F),
    val textPlaceholder: Color = Color(0xFFA9A9A9),
    val textDanger: Color = Color(0xFFEA3A34)
)

@Keep
data class FieldColors(
    val fieldBackground: Color = Color(0xFFF3F3F3),
    val fieldBackgroundDisabled: Color = Color(0xFFCBCBCB)
)

@Keep
data class BackgroundColors(
    val backgroundColor: Color = Color(0xFFFFFFFF),
    val backgroundInverse: Color = Color(0xFF282828),
    val baseBackgroundColor: Color = Color(0xFFE6EBEC)
)

@Keep
data class GrayColors(
    val gray100: Color = Color(0xFFF3F3F3),
    val gray200: Color = Color(0xFFE2E2E2),
    val gray400: Color = Color(0xFFA9A9A9),
    val gray800: Color = Color(0xFF3A3A3A),
    val gray900: Color = Color(0xFF282828),
    val gray1000: Color = Color(0xFF1F1F1F)
)

@Keep
data class BlueColors(
    val blue200: Color = Color(0xFFCCE1FF),
    val blue500: Color = Color(0xFF2982FF),
    val blue600: Color = Color(0xFF006AFF)
)

@Keep
data class WhiteColors(
    val white: Color = Color(0xFFFFFFFF)
)

@Keep
data class OtpColors(
    val otpNum: Color = Color(0xFF747980),
    val otpBorder: Color = Color(0xFFCDCED1),
    val otpBackground: Color = Color(0xFFF5F6F7)
)

@Keep
data class SupportColors(
    val info: Color = Color(0xFF006AFF)
)

@Keep
data class FocusColors(
    val focusInverse: Color = Color(0xFF0051C2)
)

@Keep
data class LayerColors(
    val layerBackgroundHighlight: Color = Color(0xFFCCE1FF),
    val layerBackground: Color = Color(0xFFF8F7F6)
)

@Keep
data class TagColors(
    val tagGray: TagGray = TagGray(),
    val tagOrangeBackground: Color = Color(0xFFFF5000),
    val tagOrangeText: Color = Color(0xFFFF5000),
    val tagYellowBackground: Color = Color(0xFFFCCC00),
    val tagRed: TagRed = TagRed(),
    val tagYellow: TagYellow = TagYellow()
)

@Keep
data class TagGray(
    val tagGrayBackground: Color = Color(0xFFE2E2E2)
)

@Keep
data class TagRed(
    val tagRedText: Color = Color(0xFF541513),
    val tagRedHighContrastText: Color = Color(0xFFFFFFFF),
    val tagRedBackground: Color = Color(0xFFFBD8D6),
    val tagRedHighContrastBackground: Color = Color(0xFFEA3A34)
)

@Keep
data class TagYellow(
    val tagYellowText: Color = Color(0xFF624904),
    val tagYellowHighContrastText: Color = Color(0xFF1F1F1F),
    val tagYellowHighContrastBackground: Color = Color(0xFFF5B600),
    val tagYellowBackground: Color = Color(0xFFFFF2CE)
)

@Keep
data class BorderColors(
    val borderInteractive: Color = Color(0xFF6F6F6F),
    val borderSubtle: Color = Color(0xFFE2E2E2)
)

@Keep
data class ContainerColors(
    val green: Color = Color(0xFF06292C),
    val green100: Color = Color(0xFF0C3E42),
    val green200: Color = Color(0xFF3A5154),
    val grey: Color = Color(0xFFF2F2F2),
    val grey100: Color = Color(0xFF888888),
    val grey200: Color = Color(0xFFFAFAFA),
    val grey300: Color = Color(0xFFE7E7E7),
    val orange: Color = Color(0xFFFF5000),
    val orange100: Color = Color(0xFFFFE9DE)
)

@Keep
data class NeutralColors(
    val neutral10: Color = Color(0xFF1A1A1A),
    val neutral80: Color = Color(0xFFCCCCCC),
    val neutral100: Color = Color(0xFFFFFFFF)
)

@Keep
data class TokenlessColors(
    val e7e7e7: Color = Color(0xFFE7E7E7),
    val ff5000: Color = Color(0xFFFF5000),
    val ffe9de: Color = Color(0xFFFFE9DE),
    val fafafa: Color = Color(0xFFFAFAFA),
    val ff666666: Color = Color(0xFF666666),
    val ff818181: Color = Color(0xFF818181),
    val fff4f4f4: Color = Color(0xFFF4F4F4),
    val fff4feff: Color = Color(0xFFF4FEFF),
    val ffe9e9e9: Color = Color(0xFFE9E9E9)
)
