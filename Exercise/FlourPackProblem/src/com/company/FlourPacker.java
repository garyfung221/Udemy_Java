package com.company;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if ((bigCount < 0 || smallCount < 0 || goal < 0)) {
            return false;
        }


        int cal = 0;
        int BigCountSum = 0;
        int SmallCountSum = 0;

        for (int i = 0; i < bigCount; i++) {
            BigCountSum += 5; //actually flour , because big 1 = 5

        }
        if (bigCount != 0) {
            cal = BigCountSum / bigCount;
        }

        for (int i = 0; i < smallCount; i++) {
            SmallCountSum++;  //actually flour , because 1 = 1;

        }


        if (((BigCountSum < goal) && (BigCountSum + SmallCountSum >= goal)) || (BigCountSum == goal) || (cal == goal)) {
            return true;
        } else if (BigCountSum > goal) {
            for (int i = 0; i < BigCountSum; i += 5) {
                if (i < goal) {
                    if (i + SmallCountSum >= goal) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
