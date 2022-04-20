package com.company;

public class Tv {
    private boolean ld;
    private int volume;
    private int canal;

//Liga e desliga

    public void ligar(){
        ld = true;
        System.out.println(ld);
    }

    public void desligar(){
        ld = false;
        System.out.println(ld);
    }

//Altera o volume

    public void volumeA(){
        volume ++;
        System.out.println("O volume é:"+volume);
    }

    public void volumeD(){
        volume --;
        System.out.println("O volume é:"+volume);
    }

//Altera o canal

    public void canalA(){
        canal ++;
        System.out.println("O canal é:"+canal);
    }

    public void canalD(){
        canal --;
        System.out.println("O canal é:"+canal);
    }
}
