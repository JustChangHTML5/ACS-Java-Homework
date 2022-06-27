package model;

public class Course {
   private int id;
   private String name;
   private int credit;
   private float fee;
   private int instructor;
   
   public Course() {
   
   }
   
   public Course(int id, String name, int credit, float fee, int instructor) {
      this.id = id;
      this.name = name;
      this.credit = credit;
      this.fee = fee;
      this.instructor = instructor;
   }
   
   @Override
   public String toString() {
      return this.getClass().getSimpleName() + this.id + ", " + this.name + ", " + this.credit + ", " + this.fee + ", " + this.instructor;
   }
   
   public int getId() {
      return this.id;
   }
   
   public String getName() {
      return this.name;
   }
   
   public int getCredit() {
      return this.credit;
   }
   
   public float getFee() {
      return this.fee;
   }
   
   public int getInstructor() {
      return this.instructor;
   }
   
   public void setId(int id) {
      this.id = id;
   }
   
   public void setName(String name) {
      this.name = name;
   }
   
   public void setCredit(int credit) {
      this.credit = credit;
   }
   
   public void setFee(float fee) {
      this.fee = fee;
   }
   
   public void setInstructor(int instructor) {
      this.instructor = instructor;
   }

}