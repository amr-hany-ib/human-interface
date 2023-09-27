package com.btech.presentation.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Preview(showSystemUi = true)
@Composable
fun ShadowPreview() {
    Column(
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(16.dp))
        Surface(
            color = Color.White,
            modifier = Modifier
                .size(50.dp)
                .background(Color.White)
                .shadow100()
        ) {}
        Surface(
            color = Color.White,
            modifier = Modifier
                .size(50.dp)
                .background(Color.White)
                .shadow50()
        ) {}
        Surface(
            color = Color.White,
            modifier = Modifier
                .size(50.dp)
                .background(Color.White)
                .upShadow100()
        ) {}
        Surface(
            color = Color.White,
            modifier = Modifier
                .size(50.dp)
                .background(Color.White)
                .shadow200()
        ) {}
        Surface(
            color = Color.White,
            modifier = Modifier
                .size(50.dp)
                .background(Color.White)
                .shadow250()
        ) {}
        Surface(
            color = Color.White,
            modifier = Modifier
                .size(50.dp)
                .background(Color.White)
                .shadow300()
        ) {}
        Surface(
            color = Color.White,
            modifier = Modifier
                .size(50.dp)
                .background(Color.White)
                .upShadow250()
        ) {}
    }
}
fun Modifier.symmetricShadow(
    color: Color = Color.Black.copy(alpha = 0.12f),
    alpha: Float = 0.25f,
    borderRadius: Dp = 4.dp,
    shadowRadius: Dp = 4.dp,
    offsetY: Dp = 0.dp,
    offsetX: Dp = 0.dp
): Modifier {
    val shadowColor = color.copy(alpha = alpha).toArgb()
    val transparent = color.copy(alpha = 0f).toArgb()

    return this.drawBehind {
        this.drawIntoCanvas {
            val paint = Paint()
            val frameworkPaint = paint.asFrameworkPaint()
            frameworkPaint.color = transparent

            frameworkPaint.setShadowLayer(
                shadowRadius.toPx(),
                offsetX.toPx(),
                offsetY.toPx(),
                shadowColor
            )
            it.drawRoundRect(
                0f,
                0f,
                this.size.width,
                this.size.height,
                borderRadius.toPx(),
                borderRadius.toPx(),
                paint
            )
        }
    }
}

fun Modifier.shadow100(borderRadius: Dp = 0.dp): Modifier {
    return this.symmetricShadow(
        color = Color.Black,
        alpha = 0.12f,
        borderRadius = borderRadius,
        shadowRadius = 3.dp,
        offsetY = 3.dp,
        offsetX = 0.dp
    )
}

fun Modifier.shadow50(borderRadius: Dp = 0.dp): Modifier {
    return this.symmetricShadow(
        color = Color.Black,
        alpha = 0.06f,
        borderRadius = borderRadius,
        shadowRadius = 4.dp,
        offsetY = 1.dp,
        offsetX = 0.dp
    )
}

fun Modifier.upShadow100(borderRadius: Dp = 0.dp): Modifier {
    return this.symmetricShadow(
        color = Color.Black,
        alpha = 0.12f,
        borderRadius = borderRadius,
        shadowRadius = 3.dp,
        offsetY = (-1).dp,
        offsetX = 0.dp
    )
}

fun Modifier.shadow200(borderRadius: Dp = 0.dp): Modifier {
    return this.symmetricShadow(
        color = Color.Black,
        alpha = 0.10f,
        borderRadius = borderRadius,
        shadowRadius = 4.dp,
        offsetY = 2.dp,
        offsetX = 0.dp
    )
}

fun Modifier.shadow250(borderRadius: Dp = 0.dp): Modifier {
    return this.symmetricShadow(
        color = Color.Black,
        alpha = 0.10f,
        borderRadius = borderRadius,
        shadowRadius = 12.dp,
        offsetY = 2.dp,
        offsetX = 0.dp
    )
}

fun Modifier.upShadow250(borderRadius: Dp = 0.dp): Modifier {
    return this.symmetricShadow(
        color = Color.Black,
        alpha = 0.10f,
        borderRadius = borderRadius,
        shadowRadius = 12.dp,
        offsetY = (-2).dp,
        offsetX = 0.dp
    )
}

fun Modifier.shadow300(
    borderRadius: Dp = 0.dp
): Modifier {
    return this.symmetricShadow(
        color = Color.Black,
        alpha = 0.10f,
        borderRadius = borderRadius,
        shadowRadius = 16.dp,
        offsetY = 8.dp,
        offsetX = 0.dp
    )
}
