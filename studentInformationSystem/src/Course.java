import java.util.Collection;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note =0;
    }

     public void addTeacher(Teacher t){

        if(this.prefix.equals(t.branch)){
            this.courseTeacher = t;
            System.out.println("Process Successed!");
        }else {
            System.out.println(t.name +"Teacher is not match this course!");
        }
    }

    public void printTeacher(){
        if (courseTeacher != null){
            System.out.println(this.name + " Course Teacher : "+ courseTeacher.name);
        }else{
            System.out.println(this.name + " : no teacher has been assigned to the course!");
        }
    }
}
