package kr.ohurjon.timetable

import java.awt.Font
import java.awt.Frame

class TableFrame(X : Int ,Y : Int) : Frame() {
    init {
        title = "TimeTable"
        addWindowListener(TableWindowAdapter())
        setSize(X,Y)
        font = Font("NanumBarunGothic",0,15)
        isVisible = true
    }
}
