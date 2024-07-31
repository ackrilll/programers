package chap_05;

import java.beans.beancontext.BeanContextChild;

/*
문제 설명
배열을 활용하여 쇼핑몰에서 구매 가능한 신발 사이즈 옵션을 출력하는 프로그램을 작성하시오.

조건
신발 사이즈는 250~295까지 5단위로 증가
신발 사이즈 수는 총 10가지


*/
public class qize5 {
    public static void main(String[] args) {
        int[] sizeArray = new int[10];
        for (int i = 0; i < sizeArray.length; i++) {
            sizeArray[i] = 250 + 5*i;
        }
        for (int i = 0; i < sizeArray.length; i++) {
            System.out.println("사이즈 "+sizeArray[i]+" (재고 있음)");
        }
    }
}
