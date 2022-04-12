fun main(args: Array<String>) {

    fun agoToTextcek() {
        System.out.print("Введите время, сколько человек был в сети назад в секуднах: ")
        var min = 0;
        var hour = 0;
        var sek = readLine()!!.toInt()
        if (sek <= 60) System.out.println("пользователь был только что") else
            if (sek > 60 && sek < 3600) {
                min = sek / 60
                if (min % 10 == 1 && min != 11) {
                    System.out.println("пользователь был $min минуту назад")
                } else if(min%10==2) {System.out.println("пользователь был $min минуты назад")} else
                    System.out.println("пользователь был $min минут назад")
            } else if (sek > 3600 && sek < 86400) {
                hour = sek / 3600
                System.out.println("пользователь был $hour минут назад")
            } else if (sek > 86400 && sek < 172800)
                System.out.println("пользователь был сегодня")
            else if (sek > 172800 && sek < 259200)
                System.out.println("пользователь был вчера")
            else System.out.println("пользователь был давно")
    }
    agoToTextcek();
}