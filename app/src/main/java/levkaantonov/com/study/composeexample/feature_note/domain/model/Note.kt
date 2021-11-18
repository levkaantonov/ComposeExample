package levkaantonov.com.study.composeexample.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import levkaantonov.com.study.composeexample.ui.theme.*

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey
    val id: Int? = null
){
    companion object{
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}
