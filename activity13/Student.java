/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity13;

/**
 *
 * @author admin
 */
public class Student extends Person{
  
     private int age;
    @Override
    public  void setAge(int age){ 
    this.age = age;
    }
     @Override
    public int getAge(){ 
    return age;
    }
     @Override
    public void checker(){ 
    String category = (age <18 && age >=1) ? "MINOR" : "ADULT";
        System.out.println(category);
    }
}
