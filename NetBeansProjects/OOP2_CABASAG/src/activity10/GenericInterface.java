/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package activity10;

/**
 *
 * @author L12X17W13
 * @param <T>
 * @param <S>
 */
public interface GenericInterface <T,S> {
    void setData1(T data1);
    T getData1();
    
    void setData2(S data2);
    S getData2();
    
    double computeSum();
    double computeDifference();
    double computeProduct();
    double computeQuotient();
    double computeRemainder();
}
