/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity12;

/**
 *
 * @author admin
 */
public class Act12ChildClass extends Act12ParentClass {
    @Override //Annotation
       public void display(){
        System.out.println("I am a Child Class");
    }
       
       public void showAge(){
           System.out.println("Age is 21");
       }
    
}
