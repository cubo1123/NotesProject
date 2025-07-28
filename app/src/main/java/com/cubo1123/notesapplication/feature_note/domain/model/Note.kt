package com.cubo1123.notesapplication.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.cubo1123.notesapplication.ui.theme.COLORS.BabyBlue
import com.cubo1123.notesapplication.ui.theme.COLORS.LightGreen
import com.cubo1123.notesapplication.ui.theme.COLORS.RedOrange
import com.cubo1123.notesapplication.ui.theme.COLORS.RedPink
import com.cubo1123.notesapplication.ui.theme.COLORS.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
){
    companion object{
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}
class InvalidNoteException(message: String) : Exception(message)