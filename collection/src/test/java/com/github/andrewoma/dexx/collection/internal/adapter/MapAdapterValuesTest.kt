/*
 * Copyright (c) 2014 Andrew O'Malley
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.github.andrewoma.dexx.collection.internal.adapter

import com.github.andrewoma.dexx.collection.Sets
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import kotlin.test.assertFalse
import com.github.andrewoma.dexx.collection.HashMap
import com.github.andrewoma.dexx.collection.Pair as DPair
import org.junit.Test as test
import com.google.common.collect.ImmutableMap

/**
 *
 */
public open class MapAdapterValuesTest {
    open fun map(vararg values: Pair<Int, Int>) : MutableCollection<Int> {
        val builder = HashMap.factory<Int, Int>().newBuilder()
        for (pair in values) {
            builder.add(DPair(pair.first, pair.second))
        }
        return builder.result().asMap().values()
    }

    // TODO
//    test fun equals() {
//        assertEquals(map(1 to 1, 2 to 2), mapOf(1 to 1, 2 to 2).entrySet())
//        assertEquals(mapOf(1 to 1, 2 to 2).entrySet(), map(1 to 1, 2 to 2))
//    }
//
//    test fun testHashCode() {
//        assertEquals(map(1 to 1, 2 to 2), map(1 to 1, 2 to 2))
//    }
//
//    test fun size() {
//        assertEquals(0, map().size())
//        assertEquals(2, map(1 to 1, 2 to 2).size())
//    }
//
//    test fun empty() {
//        assertTrue(map().isEmpty())
//        assertFalse(map(1 to 1, 2 to 2).isEmpty())
//    }
//
//    test fun contains() {
//        val set = map(1 to 1, 2 to 2, 3 to 3)
//        assertTrue(set.contains(e(1 to 1)))
//        assertFalse(set.contains(e(4 to 4)))
//    }
//
//    test fun toArray() {
//        val ints = map(1 to 1, 2 to 2).copyToArray()
//        assertEquals(ints.map { it.getKey() } sortBy { it }, listOf(1, 2))
//    }
//
//    test fun iterator() {
//        val ints = mapOf(1 to 1, 2 to 2).iterator()
//        assertEquals(ints.map { it.getKey() } sortBy { it }, listOf(1, 2))
//    }
//
//    test fun containsAll() {
//        assertTrue(map(1 to 1, 2 to 2, 3 to 3).containsAll(listOf(e(1 to 1), e(2 to 2), e(3 to 3))))
//        assertTrue(map(1 to 1, 2 to 2, 3 to 3).containsAll(listOf(e(1 to 1), e(2 to 2))))
//        assertTrue(map(1 to 1, 2 to 2, 3 to 3).containsAll(listOf(e(1 to 1))))
//        assertTrue(map(1 to 1, 2 to 2, 3 to 3).containsAll(listOf()))
//        assertFalse(map(1 to 1, 2 to 2, 3 to 3).containsAll(listOf(e(4 to 4))))
//        assertFalse(map(1 to 1, 2 to 2, 3 to 3).containsAll(listOf(e(1 to 1), e(2 to 2), e(3 to 3), e(4 to 4))))
//    }
//
//    fun e(pair: Pair<Int, Int>): MutableMap.MutableEntry<Int, Int> {
//        return ImmutableMap.of(pair.first, pair.second)!!.entrySet().iterator().next()
//    }
//
//    test(expected = javaClass<UnsupportedOperationException>()) fun add() {
//        map().add(e(1 to 1))
//    }
//
//    test(expected = javaClass<UnsupportedOperationException>()) fun remove() {
//        map().remove(e(1 to 1))
//    }
//
//    test(expected = javaClass<UnsupportedOperationException>()) fun addAll() {
//        map().addAll(listOf(e(1 to 1)))
//    }
//
//    test(expected = javaClass<UnsupportedOperationException>()) fun retainAll() {
//        map().retainAll(listOf(e(1 to 1)))
//    }
//
//    test(expected = javaClass<UnsupportedOperationException>()) fun removeAll() {
//        map().removeAll(listOf(e(1 to 1)))
//    }
//
//    test(expected = javaClass<UnsupportedOperationException>()) fun clear() {
//        map().clear()
//    }
}