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
public class testLazyLoading {
    public static void main(String[] args) {
        LazyLoading lazy = LazyLoading.getInstance();
        lazy.incrementValue();
        
        LazyLoading lazy2 = LazyLoading.getInstance();
        lazy2.incrementValue();
    }
}
