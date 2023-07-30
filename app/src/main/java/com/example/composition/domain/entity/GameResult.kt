package com.example.composition.domain.entity

enum class GameResult(
val winer : Boolean,
val countOfRightsAnswers : Int,
val countOfQuastion: Int,
val gameSettings: GameSettings
)
