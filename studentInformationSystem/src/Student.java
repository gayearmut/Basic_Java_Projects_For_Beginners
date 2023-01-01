public class Student {
    String name;
    String stdNo;
    int classes;
    Course math;
    Course physics;
    Course chemistry;
    double average;
    boolean isPass;

    Student(String name, String stdNo, int classes, Course math,Course physics,Course chemistry){
        this.name = name;
        this.stdNo = stdNo;
        this.classes = classes;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        calAverage();
        this.isPass = false;
    }

    public void addBulkExamNote(int math, int pyhsics, int chemistery){
        if (math>=0 && math<=100){
            this.math.note = math;
        }

        if (pyhsics>=0 && pyhsics<=100){
            this.physics.note = pyhsics;
        }

        if (chemistery>=0 && chemistery<=100){
            this.chemistry.note = chemistery;
        }
    }

    public void calAverage() {
        this.average = (this.physics.note + this.chemistry.note + this.math.note)/3.0;
    }

    public boolean isPass() {
        calAverage();
        return this.average>55;
    }
    public void printNote(){
        System.out.println("==============");
        System.out.println("Student :" +this.name);
        System.out.println("Math note :"+ this.math.note);
        System.out.println("Pyhsics note "+this.physics.note);
        System.out.println("Chemistery note "+this.chemistry.note);
    }
}
