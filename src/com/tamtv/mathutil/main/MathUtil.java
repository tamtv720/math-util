/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tamtv.mathutil.main;

import com.tamtv.mathutil.MathUtility;

/**
 *
 * @author tamtv
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //tui muốn test 5! có đúng 120 hem?
        int  n = 5;
        long expected = 120;
        long actual = MathUtility.getFactorial(n);// thực tế hàm chạy là mấy v
        //mình so sánh để biết đúng k??
        System.out.println("5! expected: " + expected + "; actual: " + actual);
        
        //tui muốn test 0! có đúng là 1 kh??
        n = 0;
        expected = 1;
        actual = MathUtility.getFactorial(n);// thực tế hàm chạy là mấy v
        //mình so sánh để biết đúng k??
        System.out.println("0! expected: " + expected + "; actual: " + actual);
    }
    
}
//Viết code xong thì TEST 
//Test từng hàm , từng class trước khi ráp vào các class khác
//Test ngay khi xong hàm, xong class được gọi là test mức độ 1, mức Unit Test (Test mức đơn vị code)
//Làm sao để TEST, có nhiều cách
//1. Cách sout(gọi hàm() để in ra kết quả xử lí của hàm)
//2. JoptionPane để popup lên kết quả xử lí của hàm (J Desktop)
//3. Ghi ra LOG file, ra 1 trang web (JW)
// 3 cách này thì đề phải dùng mắt để xem kết quả, và tự kết luận đúng sai
// *đúng: tức là hàm chạy 1 hía trji  = ACTUAL VALUE
//      và ta thấy ACTUAL VALUE khớp, bằng với cái giá trị mà ta mong đợi, 
//      ta tính trước = tay, gọi là EXPECTED.
//vdu: 5! thì EXPECTED hàm trả về là 120
//      nhưng khốn nạn thay, hàm trả về đúng 120 - ACTUAL
//      hàm chạy đúng cho 5!

// *sai: tui test 6!, expected = 720, nhưng khốn  nạn thay, chạy ra actual = 120
//      hàm xử lí sai.

// 4. MÁY ƠI SO SÁNH DÙM VÀ KẾT LUẬN DÙM TAO LUÔN ĐI VÌ MÀY CÓ CÁC PHÉP TOÁN SO SANH MÀ
// CON NGƯỜI KHÔNG CẦN NHÌN KẾT QUẢ TRẢ VỀ ĐỂ LUẬN ĐUNGS SAI
// MÁY SẼ LO CHO
// NẾU TẤT CẢ TÌNH HUỐNG CHẠY HÀM ĐÚNG -> HÀM ĐÚNG -> MÀU XANH
// HẦU HẾT TẤT CẢ TÌNH HUỐNG CHẠY ĐÚNG, 1 CÁI XANH -> HÀM SAI -> MÀU ĐỎ

// ĐỎ: CHỈ CẦN 1 THẰNG SAI
// XANH: TẤT CẢ PHẢI ĐÚNG

// MUỐN LÀM ĐIỀU NÀY TA CẦN THƯ CIỆN PHỤ TRỢ GIÚP CHO JAVA XANH ĐỎ
// ĐIỀU NÀY CŨNG CÓ BÊN C#, PHP, JS, RUBY...
// JAVA: JUnit, testNG
// C#  : NUnit, xUnit, MSTest
// PHP : PHUnit
//...
