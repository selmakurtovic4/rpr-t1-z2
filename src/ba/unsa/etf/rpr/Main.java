package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Unesite n");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for (int i = 1; i < n; i++) {
            sumaCifara(i);
           if (i % sumaCifara(i) == 0 )
                System.out.println(i);
        }
    }
    static int sumaCifara(int n){
        int suma=0;
        do{
           suma+=n%10;
           n=n/10;

        }
        while(n!=0);
        return suma;
    }
}
