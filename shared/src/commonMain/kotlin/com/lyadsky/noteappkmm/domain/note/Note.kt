package com.lyadsky.noteappkmm.domain.note

import com.lyadsky.noteappkmm.presentation.Colors
import kotlinx.datetime.LocalDateTime

data class Note(
    val id: Long?,
    val title: String,
    val content: String,
    val colorHex: Long,
    val created: LocalDateTime
) {
    private val colors = listOf(
        Colors.RedOrangeHex,
        Colors.RedPinkHex,
        Colors.LightGreenHex,
        Colors.BabyBlueHex,
        Colors.VioletHex
    )

    fun generatedRandomColor() = colors.random()
}
