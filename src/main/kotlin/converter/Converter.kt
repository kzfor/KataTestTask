package com.github.kzfor.test.caluclator.converters

/**
 * Interface for all converters
 * @param T Output type
 * @param V Input type
 */
interface Converter<T, V> {
    /**
     * Converts an object from one type to the corresponding value of another type
     * @param obj Object to be converted
     * @return Converted object
     */
    fun convert(obj: V): T
}