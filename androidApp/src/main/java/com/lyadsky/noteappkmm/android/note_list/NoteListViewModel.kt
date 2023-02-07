package com.lyadsky.noteappkmm.android.note_list

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.lyadsky.noteappkmm.domain.note.Note
import com.lyadsky.noteappkmm.domain.note.NoteDataSource
import com.lyadsky.noteappkmm.domain.note.SearchNotes
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NoteListViewModel @Inject constructor(
    private val noteDataSource: NoteDataSource,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val searchNotes = SearchNotes()

    val notes = savedStateHandle.getStateFlow("notes", emptyList<Note>())
}