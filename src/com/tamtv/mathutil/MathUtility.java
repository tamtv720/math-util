/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tamtv.mathutil;

/**
 *
 * @author tamtv
 */
public class MathUtility {
    //Class này chứa 1 nhóm hàm toán học , fake từ class chuẩn
    //java.uti.Math của JDK
    //Vì là đồ xài chung nên sẽ là STATIC
    public static final double PI = 3.1415;
    
    //hàm tính n!
    //vì giai thừa tăng rất nhanh, 21! tràn kiểu long
    //kiểu long chịu đc 1-^18 con số  0. Lớn hơn nữa thì thua
    //Âm giai thừa kh tính đc
    //hàm chỉ nhận từ 0->20! -> long
    //0! = 1! = 1
    public static long getFactorial(int n){
        if(n < 0 || n > 20 )
            throw new IllegalArgumentException("Invalid argument. n must be between 0..20");        
        if(n == 0 || n ==1)
            return 1;       //khỏi mất công tính, return ngay
        
        //sống đến đây, sure n = 2..20
        long result = 0; //cố tình
        for (int i = 2; i <= n; i++) 
            result *= i;
        // n! = 1.2.3.4.5....n
        return result;
    }
}
