package com.github.kzfor.test.caluclator.validator

interface Validator<T> {
    fun validate(obj: T): Unit
}