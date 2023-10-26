package com.btech.presentation.common

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.Dp

fun DrawScope.drawQrBorderCanvas(
    borderColor: Color = Color.White,
    curve: Dp,
    strokeWidth: Dp,
    capSize: Dp,
    cap: StrokeCap = StrokeCap.Square,
    lineCap: StrokeCap = StrokeCap.Square
) {
    val curvePx = curve.toPx()

    val mCapSize = capSize.toPx()

    val width = size.width
    val height = size.height

    val sweepAngle = (90 / 2).toFloat()

    strokeWidth.toPx().toInt()

    val mCurve = curvePx * 1

    drawArc(
        color = borderColor,
        style = Stroke(strokeWidth.toPx(), cap = cap),
        startAngle = 0f,
        sweepAngle = sweepAngle,
        useCenter = false,
        size = Size(mCurve, mCurve),
        topLeft = Offset(
            width - mCurve,
            height - mCurve
        )
    )
    drawArc(
        color = borderColor,
        style = Stroke(strokeWidth.toPx(), cap = cap),
        startAngle = 90 - sweepAngle,
        sweepAngle = sweepAngle,
        useCenter = false,
        size = Size(mCurve, mCurve),
        topLeft = Offset(
            width - mCurve,
            height - mCurve
        )
    )

    drawArc(
        color = borderColor,
        style = Stroke(strokeWidth.toPx(), cap = cap),
        startAngle = 90f,
        sweepAngle = sweepAngle,
        useCenter = false,
        size = Size(mCurve, mCurve),
        topLeft = Offset(
            0f,
            height - mCurve
        )
    )
    drawArc(
        color = borderColor,
        style = Stroke(strokeWidth.toPx(), cap = cap),
        startAngle = 180 - sweepAngle,
        sweepAngle = sweepAngle,
        useCenter = false,
        size = Size(mCurve, mCurve),
        topLeft = Offset(
            0f,
            height - mCurve
        )
    )

    drawArc(
        color = borderColor,
        style = Stroke(strokeWidth.toPx(), cap = cap),
        startAngle = 180f,
        sweepAngle = sweepAngle,
        useCenter = false,
        size = Size(mCurve, mCurve),
        topLeft = Offset(
            0f,
            0f
        )
    )

    drawArc(
        color = borderColor,
        style = Stroke(strokeWidth.toPx(), cap = cap),
        startAngle = 270 - sweepAngle,
        sweepAngle = sweepAngle,
        useCenter = false,
        size = Size(mCurve, mCurve),
        topLeft = Offset(
            0f,
            0f
        )
    )

    drawArc(
        color = borderColor,
        style = Stroke(strokeWidth.toPx(), cap = cap),
        startAngle = 270f,
        sweepAngle = sweepAngle,
        useCenter = false,
        size = Size(mCurve, mCurve),
        topLeft = Offset(
            width - mCurve,
            0f
        )
    )

    drawArc(
        color = borderColor,
        style = Stroke(strokeWidth.toPx(), cap = cap),
        startAngle = 360 - sweepAngle,
        sweepAngle = sweepAngle,
        useCenter = false,
        size = Size(mCurve, mCurve),
        topLeft = Offset(
            width - mCurve,
            0f
        )
    )

    drawLine(
        SolidColor(borderColor),
        Offset(width, height - mCapSize),
        Offset(width, height - curvePx),
        strokeWidth.toPx(),
        lineCap
    )

    drawLine(
        SolidColor(borderColor),
        Offset(width - mCapSize, height),
        Offset(width - curvePx, height),
        strokeWidth.toPx(),
        lineCap
    )

    drawLine(
        SolidColor(borderColor),
        Offset(mCapSize, height),
        Offset(curvePx, height),
        strokeWidth.toPx(),
        lineCap
    )

    drawLine(
        SolidColor(borderColor),
        Offset(0f, height - curvePx),
        Offset(0f, height - mCapSize),
        strokeWidth.toPx(),
        lineCap
    )

    drawLine(
        SolidColor(borderColor),
        Offset(0f, curvePx),
        Offset(0f, mCapSize),
        strokeWidth.toPx(),
        lineCap
    )

    drawLine(
        SolidColor(borderColor),
        Offset(curvePx, 0f),
        Offset(mCapSize, 0f),
        strokeWidth.toPx(),
        lineCap
    )

    drawLine(
        SolidColor(borderColor),
        Offset(width - curvePx, 0f),
        Offset(width - mCapSize, 0f),
        strokeWidth.toPx(),
        lineCap
    )

    drawLine(
        SolidColor(borderColor),
        Offset(width, curvePx),
        Offset(width, mCapSize),
        strokeWidth.toPx(),
        lineCap
    )
}

fun DrawScope.drawQrBorderCanvas(
    borderColor: Color = Color.White,
    curve: Dp,
    strokeWidth: Dp,
    cap: StrokeCap = StrokeCap.Square
) {
    val curvePx = curve.toPx()
    val width = size.width
    val height = size.height

    val sweepAngle = (90 / 2).toFloat()

    strokeWidth.toPx().toInt()

    val mCurve = curvePx * 1

    drawArc(
        color = borderColor,
        style = Stroke(strokeWidth.toPx(), cap = cap),
        startAngle = 0f,
        sweepAngle = sweepAngle,
        useCenter = false,
        size = Size(mCurve, mCurve),
        topLeft = Offset(
            width - mCurve,
            height - mCurve
        )
    )
    drawArc(
        color = borderColor,
        style = Stroke(strokeWidth.toPx(), cap = cap),
        startAngle = 90 - sweepAngle,
        sweepAngle = sweepAngle,
        useCenter = false,
        size = Size(mCurve, mCurve),
        topLeft = Offset(
            width - mCurve,
            height - mCurve
        )
    )

    drawArc(
        color = borderColor,
        style = Stroke(strokeWidth.toPx(), cap = cap),
        startAngle = 90f,
        sweepAngle = sweepAngle,
        useCenter = false,
        size = Size(mCurve, mCurve),
        topLeft = Offset(
            0f,
            height - mCurve
        )
    )
    drawArc(
        color = borderColor,
        style = Stroke(strokeWidth.toPx(), cap = cap),
        startAngle = 180 - sweepAngle,
        sweepAngle = sweepAngle,
        useCenter = false,
        size = Size(mCurve, mCurve),
        topLeft = Offset(
            0f,
            height - mCurve
        )
    )

    drawArc(
        color = borderColor,
        style = Stroke(strokeWidth.toPx(), cap = cap),
        startAngle = 180f,
        sweepAngle = sweepAngle,
        useCenter = false,
        size = Size(mCurve, mCurve),
        topLeft = Offset(
            0f,
            0f
        )
    )

    drawArc(
        color = borderColor,
        style = Stroke(strokeWidth.toPx(), cap = cap),
        startAngle = 270 - sweepAngle,
        sweepAngle = sweepAngle,
        useCenter = false,
        size = Size(mCurve, mCurve),
        topLeft = Offset(
            0f,
            0f
        )
    )

    drawArc(
        color = borderColor,
        style = Stroke(strokeWidth.toPx(), cap = cap),
        startAngle = 270f,
        sweepAngle = sweepAngle,
        useCenter = false,
        size = Size(mCurve, mCurve),
        topLeft = Offset(
            width - mCurve,
            0f
        )
    )

    drawArc(
        color = borderColor,
        style = Stroke(strokeWidth.toPx(), cap = cap),
        startAngle = 360 - sweepAngle,
        sweepAngle = sweepAngle,
        useCenter = false,
        size = Size(mCurve, mCurve),
        topLeft = Offset(
            width - mCurve,
            0f
        )
    )
}
