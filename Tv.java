package com.company;

public class Tv {
    boolean ld;
    int volume;
    int canal;

//Liga e desliga

    public void ligar(){
        ld = true;
    }

    public void desligar(){
        ld = false;
    }

//Altera o volume

    public void volumeA(){
        volume ++;
    }

    public void volumeD(){
        volume --;
    }

//Altera o canal

    public void canalA(){
        canal ++;
    }

    public void canalD(){
        canal --;
    }
}
