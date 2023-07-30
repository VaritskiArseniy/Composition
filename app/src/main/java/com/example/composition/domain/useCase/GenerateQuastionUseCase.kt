package com.example.composition.domain.useCase

import com.example.composition.domain.entity.Quastion
import com.example.composition.domain.repository.GameRepository

class GenerateQuastionUseCase (
    private val repository: GameRepository
    ) {
        operator fun invoke(maxSumValue : Int) : Quastion {
            return repository.generateQuastion(maxSumValue, COUNT_OF_OPTIONS)
        }
    private companion object {
        private const val COUNT_OF_OPTIONS = 6
    }
}