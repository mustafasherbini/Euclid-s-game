package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n,m,result,gcd;
        Scanner sc= new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        gcd=GCD(m,n);
        result=m/gcd;

        if(result%2==0)System.out.print("PLlayer 2 will win");
        else System.out.print("Player 1 will win");
    }

    public static int GCD(int m, int n) {

        if(n>m){
            int t;
            t=m;
            m=n;
            n=t;

        }
        if (n == 0)  return m;
        else {
            int r = m - n;
            return GCD(n, r);

        }

    }

}
