package ARRAYS.ARRAYLIST.Linear_search;

import java.security.PublicKey;

//leetcode.com/problems/richest-customer-wealth/

/*
Input: accounts = [[1,2,3], [3,2,1]]
Output: 6
Explanation:
1st customer has wealth 1+2+3=6
2nd customer has wealth 3+2+1=6
Both customers are considered the richest with a wealth
of 6 each, so return 6.
 */
public class maxwealthfin {
     public int maxwealthfin(int [][] accounts){
    // person is row
    // account is column

    int ans =Integer.MIN_VALUE;
    for(int person = 0;person < accounts.length;person++){

        // when you start a new col , take a new sum of that row
    int sum = 0;
    for(int account = 0;account <accounts[person].length;account++){
        sum += accounts[person][account];
    }
    // now we have sum of accounts of person
    // cheack with overall ans
    if(sum> ans){
        ans= sum;
    }
    }
    return ans;
     }
 
}
