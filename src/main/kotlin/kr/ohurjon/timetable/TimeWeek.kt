package kr.ohurjon.timetable

class TimeWeek() {

    val mon = arrayOf("월","물리","일본","화학","수학","물리","진로")
    val tue = arrayOf("화","수학","문학","화학")
    val wed = arrayOf("수","영어","수학","스생","물리")
    val thu = arrayOf("목","논리","논리","공학","공학","영어")
    val fri = arrayOf("금","생물","진로","문학","수학","영어","동아리")

    val sizes = arrayOf(mon.size,tue.size,wed.size,thu.size,fri.size)
    val times = stringArray(max())
    var days = arrayOf(times,mon,tue,wed,thu,fri)

    var x = 50
    var y = 40

    val tox = 100
    val toy = 70

    fun max() : Int {
        var max: Int = sizes[0]

        for (i in sizes) {
            if (max < i) {
                max = i
            }
        }
        return max-1
    }

    fun stringArray(value : Int) : Array<String> {

        val array : Array<String> = Array(value+1,{""})

        for (i in 1..value){
            array[i] = i.toString()
        }

        return array
    }
}