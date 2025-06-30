package com.example.challenge101__110.challenge101.challenge102;

import java.lang.ref.PhantomReference;

public enum TraficColor {
    RED(9000),
    YELLOW(1000),
    GREEN(3000);

    private final int onTimeInMillis;

    TraficColor(int onTimeInMillis){
        this.onTimeInMillis=onTimeInMillis;
    }

    public int getOnTimeInMillis(){
        return onTimeInMillis;
    }
}
