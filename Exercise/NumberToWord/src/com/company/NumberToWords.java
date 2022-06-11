package com.company;

public class NumberToWords {
    public static void numberToWords(int number) {
        int count = 0;
        int CalledMethod = reverse(number);
        int DigitMethod = getDigitCount(number);
        int digit = 0;
        String str = "";


        while (CalledMethod > 0) {
            digit = CalledMethod % 10; //last digit
            switch (digit) {
                case 0:
                    str += "Zero ";
                    break;
                case 1:
                    str += "One ";
                    break;
                case 2:
                    str += "Two ";
                    break;
                case 3:
                    str += "Three ";
                    break;
                case 4:
                    str += "Four ";
                    break;
                case 5:
                    str += "Five ";
                    break;
                case 6:
                    str += "Six ";
                    break;
                case 7:
                    str += "Seven ";
                    break;
                case 8:
                    str += "Eight ";
                    break;
                case 9:
                    str += "Nine ";
                    break;
                default:
                    System.out.println("Invalid Value");
                    break;
            }
            CalledMethod = CalledMethod / 10;
            count++;
        }

        if (CalledMethod < 0) {
            System.out.println("Invalid Value");
        }
        else if (count != DigitMethod) {
            for(int i = count ; i < DigitMethod ; i ++){
                str += "Zero ";
            }

        }

        System.out.println(str);

    }

    public static int reverse(int number){
        int save = 0;
        int digit = 0;


        if(number>1&&number<9){
            return number;
        }

        while(number!=0){

            digit = number % 10 ;
            save = save * 10 ;
            save +=digit;
            number = number/10;
        }
        return save;
    }
    public static int getDigitCount(int number){
        int save = 0;
        int digit = 0;
        int count = 0;
        if(number==0){
            return 1;
        }
        if(number<1){
            return -1;
        }
        while(number>0){
            digit = number%10; //123%10 = 3  //12 % 10 = 2 //1%10 = 1
            save+=digit;
            count++;
            number=number/10; //123/10 = 12; // 12/10 = 1; 1/10 = 0
        }
        return count;
    }
}
