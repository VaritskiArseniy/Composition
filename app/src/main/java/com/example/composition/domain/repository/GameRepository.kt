package com.example.composition.domain.repository

import com.example.composition.domain.entity.GameSettings
import com.example.composition.domain.entity.Level
import com.example.composition.domain.entity.Quastion

interface GameRepository {
    fun generateQuastion(
        maxSumValue : Int,
        countOfOptions : Int
    ) : Quastion
    fun getGameSettings(level: Level) : GameSettings
}