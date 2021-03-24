/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cnd.mathutil;

/**
 *
 * @author asus
 */
public class MathUtility {
    // class nay chua cac ham toan hoc fake laij class chuan JDK
    // java.util.Math ben trong chuaws cac ham toan hoc sqrt() abs() sin().
   //cai gi maf dung chung cho moi noi, thi ta se dat la static
    
    public static final double PI=3.1415;
    
    // ham dung chung tinh giai thua()
    //quy uoc n!= 1.2.3.4...n
    //0!= 1!=1
    //ko co giai thua so am
    //giai thua tang rat nhanh, 20! vua khop kieu long 
    //21! tràn long, bi sai nếu ráng lưu biến long 
    //long: 10^18 18 con số 0
    public static long getFactorial(int n){
        if(n<0 || n>20)
            throw new IllegalArgumentException("Invalid argument. N must be between 0..20");
        
        //CPU chạy đến đây, sure n tu 0..20
        if(n==0 || n==1)
            return 1;
        
        //CPU chạy đến đây sure n=2..20
        long result = 1; // cố tình để 0 
        for (int i = 2; i <= n; i++) 
            result *= i;
        
        return result;        
    }
    
}
