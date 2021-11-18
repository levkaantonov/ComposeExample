package levkaantonov.com.study.composeexample.feature_note.presentation.notes

import levkaantonov.com.study.composeexample.feature_note.domain.model.Note
import levkaantonov.com.study.composeexample.feature_note.domain.util.NoteOrder
import levkaantonov.com.study.composeexample.feature_note.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
