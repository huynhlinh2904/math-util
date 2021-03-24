/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cnd.mathutil.main;

import com.cnd.mathutil.MathUtility;

/**
 *
 * @author asus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // tui mún test xem 5! có bằng 120 ko
        long expected = 120; // tui hi vọng 120 là giá trị trả về
        int n = 5;     // nếu tui tính 5!
        long actual = MathUtility.getFactorial(n);
                                               //actual: cái value hàm thực sự trả về
        // ta đi so sánh = mắt để luận xem hàm ta viết chạy đúng hay ko
        System.out.println("5!: Expected: " + expected + "; Actual:" + actual);
        
        
        //tình huống test số 2, 0! xem sao?
        // TÌNH HƯỚNG TEST, TÌNH HUỐNG XÀI, GỌI LÀ TEST CASE
        
        n = 0;    // tui mun tinh 0!
        expected = 1;   // hy vọng nhận về 1
        actual = MathUtility.getFactorial(n); // còn thực tế là 
        //dùng mắt kết luận again
        System.out.println("0!: Expected: " + expected + "; Actual:" + actual);
        
        
        // TODO code application logic here
//        System.out.println("Hello GitHub");
//        System.out.println("This is 1st upload connects to remote GitHub server");
    }
    
}

// trong quy trình lập trình chuyên nghiệp/ ở các công ty, đặc biệt làm cho JP
// mọi hàm/ class bạn viết điều phải dc test kĩ càng trước khi
// ghép nó vào trong cụm tính năng, ghép vs UI, Back-end
//làm sao để test các hàm, các class
// Dân dev có nhìu cách
//1. Cách 1: sout(kết quả xử lí của hàm)
//2. Cách 2: JoptionPane(pop-up lên kiết quả xử lí hàm) bên trong java Desktop
//3. Cách 3: Ghi vào LOG file trong môn java web, hay in kiết quả xử lí ra 1 trang web tạm nào đó
//Với 3 CÁCH NÀY, ta gọi hàm, nhìn kiết quả trả về của hàm - ACTUAL VALUE
// và ta ngầm so sánh vs các kết quả mà ta tự tính toán trước dó
// khi chưa gọi hàm - ta gọi giá trị KÌ VỌNG - EXPECTED VALUE
// nếu EXPECTED VALUE == ACTUAL VALUE (thực tế và kì vọng khớp nhau)
// Á ĐÙ, Hàm chạy đúng
/// nếu ko bằng, Đù , Hàm xử lí sai

//3 cách trên đòi hỏi dev dùng mắt để kết luận đúng sai
// nhìu test case cần phải test, ta rất dễ bỏ sót, nhìn sai kết quả
//KĨ THUẬT TEST NHƯ Ở TRÊN GỌI LÀ MANUAL TEST
// TEST KHI CODE VỪA MỚI XONG TỪNG HÀM GỌI LÀ UNIT TEST

// CÒN CÁCH XỊN XÒ THỨ 4
// TA KH CẦN NHÌN BẰNG MẮT TỪNG TRƯỜNG HỢP SỬ DỤNG HÀM
//TA NHỜ MÁY SO SÁNH GIÙM ACTUAL VỚI EXPECTED LUÔN
// VÀ NUUWS TẤT CẢ CÁC TÌNH HUỐNG ĐỀU KHỚP, BẰNG NHAU VÀ NÉM RA 1 MÀU XANH
// NẾU HẦU HẾT ĐỀU KHỚP CHỈ CÓ ÍT NHẤT 1 CÁI KO KHỚP HÀM KO ỔN ĐỊNH
// NÉM RA MÀU ĐỎ-> cảnh báo dân dev code có trục trặc
// vậy ta 


// MÚN LÀM DC ĐIỀU NÀY, TA CẦN THÊM THU VIỆN PHỤ TRỌ ĐỂ TUNG RA MÀU
// THU VIỆN NÀY ĐỀU CÓ TƯƠNG ỨNG Ở CÁC NGÔN NGỮ LẬP TRÌNH
//JAVA: JUnit, testNG..
//C# :JUnit, xUnit, MSTest
//PHP: PHPUnit
//....

