package model;

public class Department {
   private int id;
   private String name;
   private int dean;
   
   public Department() {
   
   }
   
   public Department(int id, String name, int dean) {
      this.id = id;
      this.name = name;
      this.dean = dean;
   }
   
   @Override
   public String toString() {
      return this.getClass().getSimpleName() + this.id + ", " + this.name + ", " + this.dean;
   }
   
   public int getId() {
      return this.id;
   }
   
   public String getName() {
      return this.name;
   }
      
   public int getDean() {
      return this.dean;
   }
   
   public void setId(int id) {
      this.id = id;
   }
   
   public void setName(String name) {
      this.name = name;
   }
      
   public void setDean(int dean) {
      this.dean = dean;
   }

}