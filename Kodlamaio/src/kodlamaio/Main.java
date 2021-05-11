package kodlamaio;


public class Main {

    public static void main(String[] args) {
        Course course1 = new Course("C# + ANGULAR", "Engin Demirog", 60, 0);
        
        Course course2 = new Course();
        course2.name = "JAVA + REACT";
        course2.educatorName = "Engin Demirog";
        course2.day = 16;
        course2.pay = 0;
        
        
        Course course3 = new Course();
        course3.name = "Programlamaya giris";
        course3.educatorName = "Engin Demirog";
        course3.day = 7;
        course3.pay = 0;
        
        Course[] courses = {course1,course2,course3};
        
        for (Course course : courses) {
            System.out.println(course.name);
        }
        
        System.out.println(courses.length);
        
        
        Category category1 = new Category();
        category1.name = "Tümü";
        
        Category category2 = new Category();
        category2.name = "Programlama";
        
       
        CourseManager courseManager1 = new CourseManager();
        
        courseManager1.addToMyCourses(course1);
        courseManager1.addToMyCourses(course2);
        courseManager1.addToMyCourses(course3);
        
        
       
        
        
        
        
        
        
        
    }
    
}
