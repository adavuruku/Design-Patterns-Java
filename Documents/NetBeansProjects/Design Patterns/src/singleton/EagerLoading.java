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
public class EagerLoading {
    private int value = 0;
    private static EagerLoading instance = new EagerLoading();
    private void EagerLoading(){}
    public static EagerLoading getInstance(){
        return instance;
    }
   
    public void incrementValue(){
        value+=10;
        System.out.println("value is = " + value);
    }
}
