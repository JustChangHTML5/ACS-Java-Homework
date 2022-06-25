public class School {

   public static void main(String[] args) {
      System.out.println("Welcome to my school");
      
      Student kristie = new Student(1, "Kristie", "Lan", 'F', 8, 4.0f);
      System.out.println("student: " + " " + kristie.getId() + " " + kristie.getFirstname() + " " + kristie.getLastname() + " " + kristie.getGender() + " " + kristie.getGrade() + " " + kristie.getGpa());
      
      Teacher charlie = new Teacher(101, "Charlie", "Gao", 'M', "Professer", 10.0f);
      
      Student eric = new Student();
      eric.setId(2);
      eric.setFirstname("Eric");
      eric.setLastname("Ming");
      eric.setGender('M');
      eric.setGrade(7);
      eric.setGpa(4.0f);
      //System.out.println("student: " + " " + eric.getId() + " " + eric.getFirstname() + " " + eric.getLastname() + " " + eric.getGender() + " " + eric.getGrade() + " " + eric.getGpa());
        
      System.out.println("Student info: " + eric.toString());   
   }


}