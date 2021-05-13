package kr.ohurjon.timetable

fun main() {

    val data = TimeWeek()

    val canvas = TableCanvas(data.days)

    val frame = TableFrame((data.tox * data.days.size+1)+data.x,(data.max()+2) * data.toy)

    frame.add(canvas)

    print(data.max())

}