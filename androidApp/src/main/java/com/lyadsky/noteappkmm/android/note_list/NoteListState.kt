package com.lyadsky.noteappkmm.android.note_list

import com.lyadsky.noteappkmm.domain.note.Note

class NoteListState {
    val notes: List<Note> = emptyList()
    val searchText: String = ""
    val isSearchActive: Boolean = false
}