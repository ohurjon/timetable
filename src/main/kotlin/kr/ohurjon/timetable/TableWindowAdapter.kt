package kr.ohurjon.timetable

import java.awt.event.WindowAdapter
import java.awt.event.WindowEvent
import kotlin.system.exitProcess

class TableWindowAdapter : WindowAdapter() {
    override fun windowClosing(e: WindowEvent?) {
        super.windowClosing(e)
        exitProcess(0);
    }
}