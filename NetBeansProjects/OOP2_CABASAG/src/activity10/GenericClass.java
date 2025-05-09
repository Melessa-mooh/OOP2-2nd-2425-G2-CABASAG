/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity10;

/**
 *
 * @author L12X17W13
 */
public class GenericClass<T extends Number, S extends Number> implements GenericInterface<T,S> {
    private T data1;
    private S data2;
    
    @Override
    public void setData1(T data1){
        this.data1 = data1;
    }
            
    @Override        
    public T getData1(){
        return data1;
    }
    
    @Override        
    public void setData2(S data2){
        this.data2 = data2;
    }
            
    @Override
    public S getData2(){
        return data2;
    }
            
    @Override
    public double computeSum(){
        return data1.doubleValue() + data2.doubleValue();
    }
    
    @Override
    public double computeDifference(){
        return data1.doubleValue() - data2.doubleValue();
    }
    
    @Override
    public double computeProduct(){
        return data1.doubleValue() * data2.doubleValue();
    }
    
    @Override
    public double computeQuotient(){
        return data1.doubleValue() / data2.doubleValue();
    }
    @Override
    public double computeRemainder(){
        return data1.doubleValue() % data2.doubleValue();
    }
}
