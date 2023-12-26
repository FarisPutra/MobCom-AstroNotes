package com.example.astronotes.features.note.presentation.notes

import com.example.astronotes.features.note.domain.model.Note
import com.example.astronotes.features.note.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}