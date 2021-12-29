package com.github.kzfor.test.caluclator.parser

/**
 * Token set that was parsed from any data source
 * @param T Type of parsed tokens
 */
interface TokenSet<T> {
    fun getParsedTokens(): List<T>
}