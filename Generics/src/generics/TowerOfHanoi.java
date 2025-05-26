package generics;

import java.io.*;
import java.math.*;
import java.util.*;
public class TowerOfHanoi {
 static void towerOfHanoi(int n, char A, char C, char B)
	 {
	     if (n == 0) {
	         return;
	     }
	     towerOfHanoi(n - 1, A, B, C);
	     System.out.println("Move disk " + n + " from rod " + A + " to rod " + C);
	     towerOfHanoi(n - 1, B, C, A);
	 }

 // Driver code
 public static void main(String args[])
 {
     int N = 2;

     // A, B and C are names of rods
     towerOfHanoi(N, 'A', 'C', 'B');
 }
}

