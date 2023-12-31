package com.example.astronotes.features.note.presentation.notes

import com.example.astronotes.features.note.domain.model.Note
import com.example.astronotes.features.note.domain.util.NoteOrder
import com.example.astronotes.features.note.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
