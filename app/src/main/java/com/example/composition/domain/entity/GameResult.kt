package com.example.composition.domain.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class GameResult(
val winner : Boolean,
val countOfRightsAnswers : Int,
val countOfQuastion: Int,
val gameSettings: GameSettings
):Parcelable
