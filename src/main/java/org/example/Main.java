package org.example;


public class Main {
    public static void main(String[] args) {

        Problem prb = new Problem(10,1,1,10,1,10);
        System.out.print(prb);
        Solution sol = prb.solve(15);
        System.out.print(sol);

    }
}