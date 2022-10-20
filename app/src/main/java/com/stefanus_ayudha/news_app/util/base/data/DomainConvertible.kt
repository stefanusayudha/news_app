package com.stefanus_ayudha.news_app.util.base.data

interface DomainConvertible<DOMAIN_MODEL> {
    fun toDomain(): DOMAIN_MODEL
}