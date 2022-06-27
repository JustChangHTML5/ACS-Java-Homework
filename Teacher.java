package model;

import java.time.LocalDate;

public class Teacher {
   private int id;
   private String firstname;
   private String lastname;
   private LocalDate birth;
   private char gender;
   private String address;
   private String city;
   private String state;
   private String zip;
   private String phone;
   private String email;
   private String position;
   private float salary;
   private int supervisor;
   
   public Teacher() {
   
   }
   
   public Teacher(int id, String firstname, String lastname, char gender, String position, float salary) {
      this.id = id;
      this.firstname = firstname;
      this.lastname = lastname;
      this.gender = gender;
      this.position = position;
      this.salary = salary;
   }
   
   @Override
   public String toString() {
      return this.getClass().getSimpleName() + this.id + ", " + this.firstname + ", " + this.lastname + ", " + this.gender + ", " + this.position + ", " + this.salary;
   }
   
   public int getId() {
      return this.id;
   }
   
   public String getFirstname() {
      return this.firstname;
   }
   
   public String getLastname() {
      return this.lastname;
   }
   
   public char getGender() {
      return this.gender;
   }
   
   public String getPosition() {
      return this.position;
   }
   
   public float getSalary() {
      return this.salary;
   }
   
   public void setId(int id) {
      this.id = id;
   }
   
   public void setFirstname(String firstname) {
      this.firstname = firstname;
   }
   
   public void setLastname(String lastname) {
      this.lastname = lastname;
   }
   
   public void setGender(char gender) {
      this.gender = gender;
   }
   
   public void setPosition(String position) {
      this.position = position;
   }
   
   public void setSalary(float salary) {
      this.salary = salary;
   }
}