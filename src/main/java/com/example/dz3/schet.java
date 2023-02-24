package com.example.dz3;

public class schet {

    /**
     * Возращает стоимость всех билетов из счет
     * @param human счет
     * @return сумма
     */
    public static double getAllSumm(human bill) {
        return human.count * (human.tik.ticketPrice - (human.tik.ticketPrice * human.skidka.persent / 100));
    }
}


}
