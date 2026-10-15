/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity13;

/**
 *
 * @author admin
 */
public class Person {
    private int age;
    
    public void setAge(int age){ // int age Formal Parameter - Setter
    this.age = age;
    }
    public int getAge(){ // Getter 
    return age;
    }
    
    public void checker(){  // Checker - Conditions
    String category = (age <18 && age >=1) ? "MINOR" : "ADULT";
        System.out.print(category);
    }
}
