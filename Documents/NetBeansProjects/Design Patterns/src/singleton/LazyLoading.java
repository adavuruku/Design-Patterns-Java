/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author SHERIFF
 */
public class LazyLoading {

    /**
     * @param args the command line arguments
     */
    private int value = 0;
    private static LazyLoading instance = null;
    private void LazyLoading(){}
    
    public static LazyLoading getInstance(){
        if(instance==null){
            instance = new LazyLoading();
        }
        return instance;
    }
   
    public void incrementValue(){
        value+=10;
        System.out.println("value is = " + value);
    }
    
}
