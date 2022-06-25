
import java.time.LocalDate;

public class Student {
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
   private int grade;
   private float gpa;
   private int advisor;
   
   public Student() {
   
   }
   
   public Student(int id, String firstname, String lastname, char gender, int grade, float gpa) {
      this.id = id;
      this.firstname = firstname;
      this.lastname = lastname;
      this.gender = gender;
      this.grade = grade;
      this.gpa = gpa;
   }
   
   public String toString() {
      return this.id + ", " + this.firstname + ", " + this.lastname + ", " + this.gender + ", " + this.grade + ", " + this.gpa;
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
   
   public int getGrade() {
      return this.grade;
   }
   
   public float getGpa() {
      return this.gpa;
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
   
   public void setGrade(int grade) {
      this.grade = grade;
   }
   
   public void setGpa(float gpa) {
      this.gpa = gpa;
   }
}