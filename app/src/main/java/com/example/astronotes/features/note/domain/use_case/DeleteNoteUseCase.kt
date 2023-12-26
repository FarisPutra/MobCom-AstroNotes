package com.example.astronotes.features.note.domain.use_case

import com.example.astronotes.features.note.domain.model.Note
import com.example.astronotes.features.note.domain.repository.NoteRepository

class DeleteNoteUseCase(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}