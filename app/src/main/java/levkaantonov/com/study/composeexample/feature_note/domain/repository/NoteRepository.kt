package levkaantonov.com.study.composeexample.feature_note.domain.repository

import levkaantonov.com.study.composeexample.feature_note.data.data_source.FlowListOfNote
import levkaantonov.com.study.composeexample.feature_note.domain.model.Note

interface NoteRepository {

    fun getNotes(): FlowListOfNote

    suspend fun getNoteById(id: Int): Note?

    suspend fun insertNote(note: Note)

    suspend fun deleteNote(note: Note)
}