package com.company;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        //if summer = false(it's not summer) and temp = 25-35 then cat is playing .
        if (summer == false) {
            if (temperature >= 25 && temperature <= 35) {
                return true;
            }
        //if summer = true(it's summer) and temp = 25 - 45 then cat is playing.
        }  else if (summer == true) {
            if (temperature >= 25 && temperature <= 45) {
                return true;
            }

        }
        //if summer = true and out of the range of 25 - 45 , it's not playing.

        return false;
    }
}
