package com.example.dz3;

public class Skidka {

    public static final byte DEFAULT_TICKET = ;

    DEFAULT_TICKET(0), // скидка на взрослого
    CHILD_TICKET(50), //на ребенка
    OLDER_TICKET(30);   //на пенсионеров

    int persent;

    Skidka (int persent) {
        this.persent = persent;
    }
    }

}

}
