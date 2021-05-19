package com.company;

import java.util.Scanner;

class student{
    String name;
    int roll;
    double marks;

    public void setData(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name roll no marks");
        name=sc.nextLine();
        roll=sc.nextInt();
        marks=sc.nextDouble();
//        sc.close();                                   //do not close it, program won't work
                                                       //if you want to remove resource leak use loops instead
    }
    public void setData(String name,int roll,double marks){
       this.name=name;
       this.roll=roll;
       this.marks=marks;
    }
    public void display(){
        System.out.print(name+"\t");
        System.out.print(roll+"\t");
        System.out.print(marks+"\t");
        System.out.println();
    }

}
public class Q9 {
    public static void main(String[] args) {
        student s1=new student();
        student s2=new student();
        student s3=new student();

        s1.setData("asd",123,232.432);
        s2.setData();
        s3.setData();

        s1.display();
        s2.display();
        s3.display();
    }
}
