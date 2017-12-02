/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_netbeans;

/**
 *
 * @author 祐一
 */
public class Test_netbeans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("こんにちは");
        System.out.println(sum(1,3));
        System.out.println(sum1(1,3,5));
    }
    
    static int sum(int i,int j){
        return i+j;
    }
    static int sum1(int i,int j,int k){
        return i+j+k;
    }
    
    
}
