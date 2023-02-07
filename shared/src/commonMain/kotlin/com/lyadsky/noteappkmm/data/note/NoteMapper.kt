package com.lyadsky.noteappkmm.data.note

import com.lyadsky.noteappkmm.domain.note.Note
import com.lyadsky.noteappkmm.domain.time.DateTimeUtil
import database.NoteEntity
import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

fun NoteEntity.toNote(): Note {
    return Note(
        id = this.id,
        title = this.title,
        content = this.content,
        colorHex = this.colorHex,
        created = Instant
            .fromEpochMilliseconds(this.created)
            .toLocalDateTime(TimeZone.currentSystemDefault())
    )
}