package com.example.composition.domain.entity

import android.os.Parcelable
import java.io.Serializable

data class GameResult(
val winer : Boolean,
val countOfRightsAnswers : Int,
val countOfQuastion: Int,
val gameSettings: GameSettings
):Serializable
