package levkaantonov.com.study.composeexample.feature_note.domain.use_case

import levkaantonov.com.study.composeexample.feature_note.domain.model.Note
import levkaantonov.com.study.composeexample.feature_note.domain.repository.NoteRepository

class DeleteNote constructor(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note) = repository.deleteNote(note)
}