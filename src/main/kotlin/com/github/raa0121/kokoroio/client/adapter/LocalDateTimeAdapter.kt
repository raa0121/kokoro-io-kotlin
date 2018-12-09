package com.github.raa0121.kokoroio.client.adapter

import com.squareup.moshi.*
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId

class LocalDateTimeAdapter {
    @FromJson fun fromJson(dateStr: String): LocalDateTime = LocalDateTime.ofInstant(Instant.parse(dateStr), ZoneId.systemDefault())
    @ToJson fun toJson(localDateTime: LocalDateTime): String = localDateTime.toString()
}