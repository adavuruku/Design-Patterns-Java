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
public class testEagerLoading {
    public static void main(String[] args) {
        EagerLoading eager = EagerLoading.getInstance();
        eager.incrementValue();
        
        EagerLoading eager2 = EagerLoading.getInstance();
        eager2.incrementValue();
    }
}
