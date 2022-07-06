package HomeworkForLesson2

    fun main (args: Array<String>){
        drinkToday(true, false)
        drinkToday(true, true)
        drinkToday(false, true)
        drinkToday(false, false)
    }

    fun drinkToday(aLotOfMoney: Boolean, isTodayFriday: Boolean) {
    if(aLotOfMoney && isTodayFriday){
        println("Отлично, идем в бар!")
    } else if (isTodayFriday){
        println("Займу денег у друга и пойду в бар.")
    } else {
        println("Пожалуй останусь дома.")
    }
    }
