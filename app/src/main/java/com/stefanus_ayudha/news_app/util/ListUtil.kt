package com.stefanus_ayudha.news_app.util

fun <T> List<T?>?.refineList(): List<T> {
    return this?.filterNotNull() ?: listOf()
}