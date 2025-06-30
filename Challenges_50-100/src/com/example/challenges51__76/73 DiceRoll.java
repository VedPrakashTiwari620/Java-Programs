package com.example.challenges51__76;

class DiceRoll {

    int roll(){
        double random=Math.random()*6;
        return (int)Math.ceil(random);

    }

    public static void main(String[] args) {
        DiceRoll dice = new DiceRoll();
        for (int i = 0; i < 20; i++) {
            dice.roll();
            System.out.println(dice.roll());
        }
    }
}
