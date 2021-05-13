package kr.ohurjon.timetable

import java.awt.*
import java.awt.List

fun main(args : Array<String>) {

    val data = TimeWeek()

    val canvas = TableCanvas(data.days)

    val frame = TableFrame(80*6 + 30 + 60,(data.max()+1) * 70)


    frame.add(canvas)

}