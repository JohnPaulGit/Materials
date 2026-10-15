/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity13;
import java.util.Scanner;
public class Activity13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student obj = new Student();
        int age = 0;
        System.out.print("Enter Age: ");
        age = sc.nextInt();
        obj.setAge(age);
        obj.checker();
    }
       
    
}
