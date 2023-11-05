package com.btech.presentation.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val LightColorPalette = BtechColors()

val DarkColorPalette = BtechColors()

val LocalColors = staticCompositionLocalOf {
    LightColorPalette
}

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
    val borderColors: BorderColors = BorderColors()
)

data class AccentColors(
    val accent600: Color = Color(0xFF006AFF)
)

data class ActionColors(
    val actionPrimary: Color = Color(0xFF0C3E42),
    val disabledActionPrimary: Color = Color(0xFFE0E0E0),
    val actionDanger: Color = Color(0xFFEA3A34)
)

data class TextColors(
    val textOnColor: Color = Color(0xFFFFFFFF),
    val textOnColorDisabled: Color = Color(0xFFA9A9A9),
    val textPrimary: Color = Color(0xFF1F1F1F),
    val textSecondary: Color = Color(0xFF0C3E42),
    val textPlaceholder: Color = Color(0xFFA9A9A9),
    val textDanger: Color = Color(0xFFEA3A34)
)

data class FieldColors(
    val fieldBackground: Color = Color(0xFFF3F3F3),
    val fieldBackgroundDisabled: Color = Color(0xFFCBCBCB)
)

data class BackgroundColors(
    val backgroundColor: Color = Color(0xFFFFFFFF),
    val backgroundInverse: Color = Color(0xFF282828)
)

data class GrayColors(
    val gray100: Color = Color(0xFFF3F3F3),
    val gray200: Color = Color(0xFFE2E2E2),
    val gray400: Color = Color(0xFFA9A9A9),
    val gray800: Color = Color(0xFF3A3A3A),
    val gray900: Color = Color(0xFF282828),
    val gray1000: Color = Color(0xFF1F1F1F)
)

data class BlueColors(
    val blue200: Color = Color(0xFFCCE1FF),
    val blue500: Color = Color(0xFF2982FF),
    val blue600: Color = Color(0xFF006AFF)
)

data class WhiteColors(
    val white: Color = Color(0xFFFFFFFF)
)

data class OtpColors(
    val otpNum: Color = Color(0xFF747980),
    val otpBorder: Color = Color(0xFFCDCED1),
    val otpBackground: Color = Color(0xFFF5F6F7)
)

data class SupportColors(
    val info: Color = Color(0xFF006AFF),
)

data class FocusColors(
    val focusInverse: Color = Color(0xFF0051C2)
)

data class LayerColors(
    val layerBackgroundHighlight: Color = Color(0xFFCCE1FF),
    val layerBackground: Color = Color(0xFFF3F3F3)
)

data class TagColors(
    val tagGray: TagGray = TagGray(),
    val tagYellowBackground: Color = Color(0xFFFCCC00)
)

data class TagGray(
    val tagGrayBackground: Color = Color(0xFFE2E2E2)
)

data class BorderColors(
    val borderInteractive: Color = Color(0xFF6F6F6F),
    val borderSubtle: Color = Color(0xFFE2E2E2)
)
