/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coinchange;
import java.util.*;
import java.io.*;

/**
 *
 * @author ashafiq.bscs13seecs
 */
public class CoinChange {

    /**
     * @param args the command line arguments
     */
    
    int[] coins = {1,5,10,25};
    
    public int GreedyCoinChange(int amount)
    {
        int coinNo = 0;
        for(int i = coins.length -1; i>=0;i--)
        {
            int temp = amount/coins[i];
            coinNo = coinNo + temp; 
            amount = amount - temp * coins[i];
        }
        return coinNo;
    }
    
    public int DynamicCoinChange(int amount, int c)
    {
        int coinNo = 0;
        if (amount == 0)
            {return 0;}
        if(c>amount)
            {
                return 1000;
            }
        int [] coinNumbers = new int [coins.length];
        for(int i = coins.length -1; i>=0;i--)
            {
                coinNumbers[i] = 1+ DynamicCoinChange(amount - coins[i],coins[i]);
            }
         //finding minimum
        coinNo = coinNumbers[0];  
        for(int i=1;i<coinNumbers.length;i++){  
            if(coinNumbers[i] < coinNo)
            {  
                coinNo = coinNumbers[i];  
            }  
        }  
        return coinNo;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        CoinChange cc = new CoinChange();
        System.out.println(cc.GreedyCoinChange(23));
        System.out.println(cc.DynamicCoinChange(23,0));
    }
    
}
