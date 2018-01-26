// My solution to the HackerRank problem "Electronics Shop."
// https://www.hackerrank.com/challenges/electronics-shop/problem

import java.util.Scanner;

public class ElectronicsShopApp {
    static int getMoneySpent(int[] keyboards, int[] drives, int s){
        // Complete this function
    	int moneySpent = -1;
    	for(int i = 0; i < keyboards.length; i++) {
    		for(int j = 0; j < drives.length; j++) {
    			int newTotal = keyboards[i] + drives[j];
    			System.out.println("new Total = "+newTotal);
    			System.out.println("Money spent (pre-if) ="+moneySpent);
    			if(newTotal > moneySpent && newTotal <= s) {
    				moneySpent = newTotal;
    				System.out.println("Money spent (if) = "+moneySpent);
    			}
    		}
    		
    	}   	
    	return moneySpent;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount of money (dollars) Monica has, s (integer 1 - 1000000): ");
        int s = in.nextInt();
        System.out.print("Enter the number of keyboard brands, n (integer 1 - 1000): ");
        int n = in.nextInt();
        System.out.print("Enter the number of USB drive brands, m (integer 1 - 1000): ");
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
        	System.out.print("Enter the cost of keyboard brand #"+(keyboards_i + 1)+": ");
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] drives = new int[m];
        for(int drives_i=0; drives_i < m; drives_i++){
        	System.out.print("Enter the cost of USB drive brand #"+(drives_i + 1)+": ");
            drives[drives_i] = in.nextInt();
        }
        //  The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
        int moneySpent = getMoneySpent(keyboards, drives, s);
        System.out.println(moneySpent);
        in.close();
    }
}
