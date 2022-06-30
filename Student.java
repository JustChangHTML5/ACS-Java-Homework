package model;

import java.time.LocalDate;

public class Student extends Person {
   private String email;
   private int grade;
   private float gpa;
   private int advisor;
   
   public Student() {
      super();
   }
   
   public Student(int id, String firstname, String lastname, char gender, String address, String phone, int grade, float gpa) {
      super(id, firstname, lastname, gender, address, phone);
      this.grade = grade;
      this.gpa = gpa;
   }
   
   @Override
   public String toString() {
      return this.getClass().getSimpleName() + super.toString() +  this.grade + ", " + this.gpa;
   }
   
   public int getGrade() {
      return this.grade;
   }
   
   public float getGpa() {
      return this.gpa;
   }
   
   public void setGrade(int grade) {
      this.grade = grade;
   }
   
   public void setGpa(float gpa) {
      this.gpa = gpa;
   }
}