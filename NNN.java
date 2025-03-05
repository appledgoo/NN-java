package test69;

import java.util.Scanner;

class Tong{
    int S=0;
    int N;
    
    public void nhapTT(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap N: ");
        N = sc.nextInt();
        while(N<10){
            System.out.println("Nhap lai N: ");
            N = sc.nextInt();
        } 
    }
    public void xuatTT(){
    for(int i = 1; i<= N; i++){
        S += Integer.parseInt( Integer.toString(i) + Integer.toString(i));;
        }
    System.out.println(S);
    }
}
   

public class Main {
    public static void main(String[] args) {
        Tong sum = new Tong();
        sum.nhapTT();
        sum.xuatTT();
        
    }
}
