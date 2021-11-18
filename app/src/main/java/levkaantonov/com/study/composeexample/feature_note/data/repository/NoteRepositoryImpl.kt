package levkaantonov.com.study.composeexample.feature_note.data.repository

import levkaantonov.com.study.composeexample.feature_note.data.data_source.FlowListOfNote
import levkaantonov.com.study.composeexample.feature_note.data.data_source.NoteDao
import levkaantonov.com.study.composeexample.feature_note.domain.model.Note
import levkaantonov.com.study.composeexample.feature_note.domain.repository.NoteRepository

class NoteRepositoryImpl constructor(
    private val dao: NoteDao
) : NoteRepository {
    override fun getNotes(): FlowListOfNote = dao.getNotes()

    override suspend fun getNoteById(id: Int): Note? = dao.getNoteById(id)

    override suspend fun insertNote(note: Note) = dao.insertNote(note)

    override suspend fun deleteNote(note: Note) = dao.deleteNote(note)
}