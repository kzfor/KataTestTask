package com.github.kzfor.test.caluclator.parser

/**
 * A generalized class for parsing tokens from a data source
 * @param V Data source
 * @param TokenSet Output set of parsed tokens
 */
interface Parser<V, TokenSet> {
    fun parse(obj: V): TokenSet
}