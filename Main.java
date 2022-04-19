package com.company;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Tv tv = new Tv();
        int cont = 100;
        while(cont != 0){

            cont = Integer.parseInt(JOptionPane.showInputDialog("Digite sua opção\n1 - ligar\n2 - Desligar\n3 - Aumentar volume\n4 - Diminuir volume\n5 - Aumentar canal\n6 - Diminuir canal\n0 - Sair"));
            if(cont == 1){
                tv.ligar();
                System.out.println(tv.ld);
            }else if(cont == 2){
                tv.desligar();
                System.out.println(tv.ld);
            }else if(cont == 3){
                tv.volumeA();
                System.out.println("O volume é:");
                System.out.println(tv.volume);
            }else if(cont == 4){
                tv.volumeD();
                System.out.println("O volume é:");
                System.out.println(tv.volume);
            }else if(cont == 5){
                tv.canalA();
                System.out.println("O canal é:");
                System.out.println(tv.canal);
            }else if(cont == 6){
                tv.canalD();
                System.out.println("O canal é:");
                System.out.println(tv.canal);
            }
        }
    }
}
