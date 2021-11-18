package levkaantonov.com.study.composeexample.feature_note.domain.use_case

import levkaantonov.com.study.composeexample.feature_note.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(id: Int) = repository.getNoteById(id)
}