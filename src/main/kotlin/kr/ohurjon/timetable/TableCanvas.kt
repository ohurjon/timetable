package kr.ohurjon.timetable

import java.awt.*

import java.awt.Font

import java.awt.Rectangle

import java.awt.Graphics




class TableCanvas(private val days : Array<Array<String>>): Canvas() {
    override fun paint(g: Graphics?) {
        super.paint(g)

        val data = TimeWeek()
        val g2 = g as Graphics2D

        val font = Font("NanumBarunGothic",1,30)
        g2.font = font

        g2.color = Color.BLACK

        days.forEach { day ->
            day.forEach { time ->
                run {
                    drawCenteredString(g2,time,Rectangle(data.x,data.y,0,0),font)
                    data.y += data.toy
                }
            }
            data.x += data.tox
            data.y -= data.toy*day.size
        }
    }
    fun drawCenteredString(g: Graphics, text: String, rect: Rectangle, font: Font) {
        val metrics = g.getFontMetrics(font)

        val x = rect.x + (rect.width - metrics.stringWidth(text)) / 2

        val y = rect.y + (rect.height - metrics.height) / 2 + metrics.ascent
        g.font = font

        g.drawString(text, x, y)
    }
}