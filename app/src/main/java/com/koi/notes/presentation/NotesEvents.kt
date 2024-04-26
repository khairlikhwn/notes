package com.koi.notes.presentation

import com.koi.notes.data.Note

sealed interface NotesEvents {
    object SortNotes: NotesEvents

    data class DeleteNote(
        val note: Note
    ): NotesEvents

    data class SaveNote(
        val title: String,
        val description: String
    ): NotesEvents
}