public class School {

   public static void main(String[] args) {
      System.out.println("Welcome to my school");
      
      Student kristie = new Student(1, "Kristie", "Lan", 'F', 8, 4.0f);
      System.out.println("student: " + " " + kristie.getId() + " " + kristie.getFirstname() + " " + kristie.getLastname() + " " + kristie.getGender() + " " + kristie.getGrade() + " " + kristie.getGpa());
      
      Teacher charlie1 = new Teacher(101, "Charlie", "Gao", 'M', "Professer", 10.0f);
      System.out.println(charlie1.getId() + " " + charlie1.getFirstname() + " " + charlie1.getLastname() + " " + charlie1.getGender() + " " + charlie1.getPosition() + " " + charlie1.getSalary());
      
      Teacher charlie = new Teacher();
      charlie.setId(101);
      charlie.setFirstname("Charlie");
      charlie.setLastname("Gao");
      charlie.setGender('M');
      charlie.setPosition("Professer");
      charlie.setSalary(10.0f);
      System.out.println(charlie.getId() + " " + charlie.getFirstname() + " " + charlie.getLastname() + " " + charlie.getGender() + " " + charlie.getPosition() + " " + charlie.getSalary());
      
      Student eric = new Student();
      eric.setId(2);
      eric.setFirstname("Eric");
      eric.setLastname("Ming");
      eric.setGender('M');
      eric.setGrade(7);
      eric.setGpa(4.0f);
      System.out.println("student: " + " " + eric.getId() + " " + eric.getFirstname() + " " + eric.getLastname() + " " + eric.getGender() + " " + eric.getGrade() + " " + eric.getGpa());
        
      System.out.println("Student info: " + eric.toString());   
      
      Course math = new Course(1, "Math", 3, 200.0f, 1);
      Course english = new Course(2, "English", 2, 150.0f, 2);
      Course physics = new Course(3, "Physics", 3, 300.0f, 3);
      System.out.println(math.toString());
      System.out.println(english.toString());
      System.out.println(physics.toString());
  }


}