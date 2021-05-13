package kr.ohurjon.timetable

import java.awt.*

class TableCanvas(private val days : List<List<String>>): Canvas() {
    override fun paint(g: Graphics?) {
        super.paint(g)

        val data = TimeWeek()
        val g2 = g as Graphics2D

        g2.font = Font("NanumBarunGothic",0,30)

        g2.color = Color.BLACK

        days.forEach { day ->
            day.forEach { time ->
                run {
                    g2.drawString(time, data.x, data.y)
                    data.y += data.toy
                }
            }
            data.x += data.tox
            data.y -= data.toy*day.size
        }
    }
}