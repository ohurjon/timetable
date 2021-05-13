package kr.ohurjon.timetable

class TimeWeek() {

    val mon = listOf("월","물리","일본","화학","수학","물리","진로")
    val tue = listOf("화","수학","문학","화학","영어","일본","생명","생명")
    val wed = listOf("수","영어","수학","스생","물리","문학","화학","미술")
    val thu = listOf("목","논리","논리","공학","공학","영어","문학","미술")
    val fri = listOf("금","생물","진로","문학","수학","영어","동아리","동아리")

    val sizes = listOf(mon.size,tue.size,wed.size,thu.size,fri.size)
   // val times = stringlist(max(sizes)) //TODO
    var days = listOf(mon,tue,wed,thu,fri)

    var x = 30
    var y = 60

    val tox = 100
    val toy = 70

    fun max() : Int {
        var max: Int = sizes[0]

        for (i in sizes) {
            if (max < i) {
                max = i
            }
        }
        return max
    }

//    fun stringlist(value : Int) : List<String> {
//
//        val stringList : List<String> = mutableListOf()
//
//        for (i in 0..value){
//
//        }
//    }            //TODO Int to String
}