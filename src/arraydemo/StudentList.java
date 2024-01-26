/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraydemo;

/**
 *This comment was added on 26th jan
 * @author knigh
 */
public class StudentList {
    
    public static void main(String args[]) {
        Student[] studentList = new Student[3];
        
        Student s1 = new Student(1, "Chintan");
        
        studentList[0]=s1;
        studentList[1]= new Student(2, "Zoey");
        studentList[2]= new Student(3, "Mello");
        
        for(int i =0;i<studentList.length;i++) {
            System.out.println(studentList[i].getsName());
        }
    }
}
