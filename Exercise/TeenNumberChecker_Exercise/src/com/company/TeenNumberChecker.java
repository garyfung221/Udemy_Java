package com.company;

public class TeenNumberChecker {
    public static boolean hasTeen(int first, int second, int third) {
        if (first >= 13 && first <= 19) {
            return true;
        }
        if (second >= 13 && second <= 19) {
            return true;
        }
        if (third >= 13 && third <= 19) {
            return true;
        }
        return false;
    }

    public static boolean isTeen(int A) {
        if (A >= 13 && A <= 19) {
            return true;
        }
        return false;
    }
}
