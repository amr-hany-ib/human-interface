package com.btech.presentation.common

fun String.getInitialsFromName(): String {
    return this
        .split(' ')
        .mapNotNull { it.firstOrNull()?.toString() }
        .reduce { acc, s -> acc + s }
}
