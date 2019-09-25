package com.github.thibaultbee.srtwrapper

import org.junit.Test

import org.junit.Assert.*

class SrtAndroidTest {

    @Test
    fun startCleanTest() {
        val srt = Srt()

        assertEquals(0, srt.startUp())
        assertEquals(0, srt.cleanUp())
    }
}