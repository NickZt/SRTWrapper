package com.github.thibaultbee.srtwrapper

import android.Manifest
import android.system.Os.bind
import android.util.Log
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.GrantPermissionRule
import com.github.thibaultbee.srtwrapper.enums.SockOpt
import com.github.thibaultbee.srtwrapper.enums.Transtype
import com.github.thibaultbee.srtwrapper.models.Error
import com.github.thibaultbee.srtwrapper.models.Socket
import org.junit.Assert
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import java.net.ServerSocket
import java.net.SocketAddress

@RunWith(AndroidJUnit4::class)
class SrtSendFileTest {
    @Rule @JvmField
    /*
     * Grant android.permission.INTERNET so that SRT can use socket
     */
    var socketPermissionRule = GrantPermissionRule.grant(Manifest.permission.INTERNET)

    private val ip = "10.0.2.2" // emulator host loopback interface
    private val port = 1234

    @Test
    fun srtSendFileTest() {
        val srt = Srt()

        Assert.assertEquals(0, srt.startUp())

        val socket = Socket()
        Assert.assertTrue(socket.isValid())

        Assert.assertEquals(0, socket.setSockOpt(SockOpt.TRANSTYPE, Transtype.FILE))
        Assert.assertEquals(0, socket.bind(ip, port))

        Assert.assertEquals(0, socket.listen(10))
        val pair = socket.accept()
        Assert.assertTrue(pair.first.isValid())

        //TODO: Assert.assertEquals(0, socket.sendFile())

        Thread.sleep(1000) // If session is close too early, msg will not be receive by server
        Assert.assertEquals(0, socket.close())
        Assert.assertEquals(0, srt.cleanUp())
    }
}