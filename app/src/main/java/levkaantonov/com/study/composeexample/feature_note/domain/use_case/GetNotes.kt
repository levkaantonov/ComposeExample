package levkaantonov.com.study.composeexample.feature_note.domain.use_case

import kotlinx.coroutines.flow.map
import levkaantonov.com.study.composeexample.feature_note.data.data_source.FlowListOfNote
import levkaantonov.com.study.composeexample.feature_note.domain.repository.NoteRepository
import levkaantonov.com.study.composeexample.feature_note.domain.util.NoteOrder
import levkaantonov.com.study.composeexample.feature_note.domain.util.OrderType

class GetNotes(
    private val repository: NoteRepository
) {

    operator fun invoke(
        noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending)
    ): FlowListOfNote = repository.getNotes().map { notes ->
        when (noteOrder.orderType) {
            is OrderType.Ascending -> {
                when (noteOrder) {
                    is NoteOrder.Title -> notes.sortedBy { it.title.lowercase() }
                    is NoteOrder.Date -> notes.sortedBy { it.timestamp }
                    is NoteOrder.Color -> notes.sortedBy { it.color }
                }
            }
            is OrderType.Descending -> {
                when (noteOrder) {
                    is NoteOrder.Title -> notes.sortedByDescending { it.title.lowercase() }
                    is NoteOrder.Date -> notes.sortedByDescending { it.timestamp }
                    is NoteOrder.Color -> notes.sortedByDescending { it.color }
                }
            }
        }
    }
}