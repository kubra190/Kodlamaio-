package kodlamaio;


public class Course {
    public Course(){
        
    }
    
    public Course(String name,String educatorName, int day, int pay ){
        this();
        this.name = name ;
        this.educatorName = educatorName ;
        this.day = day;
        this.pay = pay;
    }
    String name;
    String educatorName;
    int day;
    int pay;

    
    
}
