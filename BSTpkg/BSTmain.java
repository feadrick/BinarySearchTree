/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BSTpkg;

/**
 *
 * @author User
 */
public class BSTmain {
    
    public static void main(String []args){
    BST obj=new BST();
    obj.insert(2);
    obj.insert(90);
    obj.insert(9);
    obj.insert(27);
    obj.insert(8);
    obj.insert(26);
    obj.postorder();
    }
    
}
