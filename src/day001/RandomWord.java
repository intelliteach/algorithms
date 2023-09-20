package day001;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Scanner;

public class RandomWord {


    public static void main(String[] args) {

      String champion = "";
      int i = 1;
       while (!StdIn.isEmpty()){
           String each = StdIn.readString();
           boolean bernoulli = StdRandom.bernoulli(1.0 / i);
           if(bernoulli){
               champion = each;
           }
           i++;

       }

        StdOut.println(champion);

    }
}
