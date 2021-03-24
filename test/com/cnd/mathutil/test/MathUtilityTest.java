/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cnd.mathutil.test;

import com.cnd.mathutil.MathUtility;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author asus
 */
public class MathUtilityTest {
    
   //ta sẽ viết những đoạn code ở đây để test cái hàm getFactorial()
    // bên Mathutikity coi chạy đúng k
    // viết code để test code chính
    // đúng sai ở đây chunhs tôi dùng màu sắc xanh đỏ
    @Test // biến hàm thường thành hàm main
    public void testFactorialGivenRightArgumentReturnsGoodResult(){
       
        int n = 5; // tui mún tính 5!
         long expected = 120; // tui hi vọng trả về 120
         long actual = MathUtility.getFactorial(n);
         assertEquals(expected, actual);
         // nếu khớp thì xanh sai lệnh thì đỏ
         
         
         // màu đỏ xuất hiện khi có ít nhất 1 thằng đỏ 
         //                         một test case sai, tất cả bỏ đi
         //ẩn ý: hàm đã đúng thì phải dúng 
         
         
         
         
        assertEquals(720, MathUtility.getFactorial(6));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));  
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(1, MathUtility.getFactorial(0));
             
         
        
    }// khi màu đỏ có 2TH: hàm bạn tính sai ko như kì vọng
    //                     hàm tính đúng bạn kì vọng sai
    //ta sẽ đi test hàm có nén ra ngoại lệ như thiết kế hay không;
    //hàm dc thiết kế rằng: ddauw tham số  n 0..20--> tính đúng n!
    
    //hàm dc thiết kế rằng: đưa tham số cà chớn, <0> 20 ném ra ngoại lện báo sai tham số, ngaoif giá trị miền tính
    // chốt: đưa tham số cà chớn pahir ném ra ngoại lệ
    //nếu thấy đúng là ném về ngoại lệ khi đưa tham số cà chớn
    // thì kL hàm đúng xanh
    
    // thấy ngoại lệ khi đưa n cà chớn, mừng vì hàm chạy đúng]
    // đúng như thiết kế
    // ngoại lệ xuất hiện khi 5! thì là hàm đúng
    // ngoại lệ thì ko phải là giá trị để so sánh kiểu assertEquals();
    //vậy ta phải dùng kiểu khác !!!
  //  @Test(expected = SQLException.class)// không nên bắt mức cao nhất
    //                                                  mặc dù ko sai
    @Test(expected = IllegalArgumentException.class) 
    public void getFactorialGivenWrongArgumentThrowsException(){
       MathUtility.getFactorial(6);
       MathUtility.getFactorial(-6);
       
    }// cá luôn 2 tk này ném ra ngoại lệ IllegalArgumentException
}
