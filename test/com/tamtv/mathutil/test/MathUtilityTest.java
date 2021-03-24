/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tamtv.mathutil.test;

import static com.tamtv.mathutil.MathUtility.*; // tui muốn các hàm, biến trong class gõ trực tiếp luôn 
import java.sql.SQLException;
                                        //kh cần class chấm. chỉ static mới làm điều này
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tamtv
 */
public class MathUtilityTest {
    
    @Test
    public void testFactorialGivenRightArgumentReturnsGoodResult(){
        int n = 5;              //tui muon test 5! co dung la 
        long expected = 120;    //120 hay k
        long actual = getFactorial(n);
        
        assertEquals(expected, actual);
        
        //Mình test các trường hợp khác đúng đầu vào, đúng đầu ra
        //khỏi cần biến trung gian, chơi luôn trong lệnh
        assertEquals(720, getFactorial(6));
        assertEquals(24, getFactorial(4));
        assertEquals(6, getFactorial(3));
        assertEquals(1, getFactorial(1));
        assertEquals(1, getFactorial(0));
        
    }
    
    // điều gì xảy nếu ta đưa vào tham số "cà chớn" (số âm hoặc > 20)
    // theo thiết kế của hàm, đưa cào cà chớn sẽ ném ra ngoại lệ và 
    // ta cần test xem  ngoại lệ có đc ném ra kh nếu ta cà chớn
    //tức là thấy xuất hiện ngoại lệ nếu có cà chớn đưa vào -> Hàm đúng
    //thấy  ngoại lệ khi có cà chớn thì mình mừng vì hàm đã chạy đúng
    
    @Test(expected = IllegalArgumentException.class) // có đúng khi chạy hàm này thì ném ra ngoại lệ
                                                    //tên là IllegalArgu... nêu đúng nó ném ra ngoại lệ cùng tên, code đúng rồi, Xanh thoy
    public void testFactorialWrongArgumentThrowsException(){
        //mình test tình huống hàm phải ném ra ngoại lệ nếu tham số cà chớn
        //ngoại lệ kh phải là value để so sánh, không dùng assertEquals()
        //ta phải dùng chiêu khác. Junit4 khác Junit5 ở chỗ khác bắt ngoại lệ
        //kì 5 đi dự thính môn SWT : DI, Lambda Expression liên quan 
        //Junit5                Dependency Ịnection / SOLID
        getFactorial(-5);
        getFactorial(21);
        getFactorial(40);
    }
    
    
}
