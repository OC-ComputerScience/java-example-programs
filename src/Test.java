
public class Test {

  public static void main(String[] args) {
    System.out.println("Test Student and Person");
    Student s1 = new Student("Jim Smith", "123 AnyStreet, AnyCity, OK 73111", "jim.smith@eagles.oc.edu");
    System.out.println(s1.toString());
    s1.addCourse("CMSC-1113", 'C');
    s1.addCourse("CMSC-1123", 'B');
    for (int i=0;i < s1. getNumberCourses();i++)
    {
      System.out.println(s1.getCourses()[i]+"-"+s1.getGrades()[i]);
    }
    System.out.println("Average is " + s1.calcGPA());
    
    /* Test Teacher class */
    Teacher t1 = new Teacher("David North", "3113 Fisher Rd, Edmond, OK, 73013", "david.north@oc.edu", "Professor");
    System.out.println(t1);
    String[] courses = {"CMSC-1113", "CMSCS-2113", "CMSC-2213"};
    for (String course: courses) {
       if (t1.addCourse(course)) {
          System.out.println(course + " added.");
       } else {
          System.out.println(course + " cannot be added.");
       }
    
    }

  }

}
