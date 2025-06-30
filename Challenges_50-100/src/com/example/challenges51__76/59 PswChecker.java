package com.example.challenges51__76;

import java.util.Scanner;

class PswChecker {


    static int setPass(){
        System.out.println("Pls Set your Password Containing of [0-9]");
        Scanner input = new Scanner(System.in);
        int pass=input.nextInt();
        System.out.println("Password set Successfully");

        return pass;

    }

    static void passCheck(){
        int pass=setPass();
        System.out.println("Your device has been locked!!!");
        System.out.println("Enter your Password to unlock");
        Scanner input=new Scanner(System.in);
        int enterPSW=input.nextInt();

        int no=0;
        int num=3;


        do{
            no++;
            if(pass==enterPSW){
                System.out.println("Your Device is Unlocked");
                break;
            }else {
                System.out.println("You have entered "+no+" time incorrect password\nyou have left "+(num-no)+"  time to try\npls enter correct password.");
                enterPSW=input.nextInt();
            }


        }while (no<3);

    }


    static void chekPS(){
        int password=setPass();
        Scanner input= new Scanner(System.in);
        int psw;

        do {
            System.out.println("Enter your paswword");
            psw= input.nextInt();


        }while (!isPasswdCor(psw,password));
    }

    static boolean isPasswdCor(int enterPasswd, int password){

        if(enterPasswd==password){
            return true;
        }
        return false;
    }




    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to password checker");
//
//
//        passCheck();


        chekPS();




    }
}
