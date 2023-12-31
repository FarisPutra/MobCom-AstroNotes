package com.example.astronotes.features.note.domain.use_case

data class NoteUseCases(
    val getNotesUseCase: GetNotesUseCase,
    val getNoteUseCase: GetNoteUseCase,
    val addNoteUseCase: AddNoteUseCase,
    val deleteNoteUseCase: DeleteNoteUseCase
)
