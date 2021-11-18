package levkaantonov.com.study.composeexample.feature_note.data.data_source

import androidx.room.*
import kotlinx.coroutines.flow.Flow
import levkaantonov.com.study.composeexample.feature_note.domain.model.Note

typealias FlowListOfNote = Flow<List<Note>>

@Dao
interface NoteDao {

    @Query("select * from note")
    fun getNotes(): FlowListOfNote

    @Query("select * from note where id = :id")
    suspend fun getNoteById(id: Int): Note?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)
}