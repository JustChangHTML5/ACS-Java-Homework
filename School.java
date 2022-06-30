
import model.Student;
import model.Teacher;
import model.Course;
import model.Registration;
import model.Department;

public class School {
   
   private String name;
   private String address;
   private String city;
   private String state;
   private int numOfFaculty;
   
   public School() {
   
   }
   
   public School(String name, String address, String city, String state, int numOfFaculty) {
      this.name = name;
      this.address = address;
      this.city = city;
      this.state = state;
      this.numOfFaculty = numOfFaculty;
   }

   public static void main(String[] args) {
   
      System.out.println("Welcome to my school");
      
      int size = args.length;
      System.out.println("args: " + size);
      
      if (args.length >= 7) {
         String type = args[0];
         String idStr = args[1];
         String firstname = args[2];
         String lastname = args[3];
         String genderStr = args[4];
      
         int id = Integer.parseInt(idStr);
         char gender =  genderStr.charAt(0);
      
         Object obj = null;
         if ("Student".equals(type)) {
            int grade = Integer.parseInt(args[5]);
            float gpa = Float.parseFloat(args[6]);
            //obj = new Student(id, firstname, lastname, gender, address, phone, grade, gpa);
         } else if ("Teacher".equals(type)) {
            String position = args[5];
            float salary = Float.parseFloat(args[6]);
            //obj = new Teacher(id, firstname, lastname, gender, position, salary);
         }
         if (obj != null) {
            System.out.println(obj.toString());
         }
      }
      
      Student kristie = new Student(1, "Kristie", "Lan", 'F', "1122", "1122", 8, 4.0f);
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