public class Main {

    public static void main(String[] args) {

        Course math = new Course("Mathematics","MATH101","MATH");
        Course physics = new Course("Physics","PHY101","PHY");
        Course chemistery = new Course("Chemistery","CHEM101","CHEM");

        Teacher t1 = new Teacher("Jane M ","5555","MATH");
        Teacher t2 = new Teacher("Mikey X ","4156","PHY");
        Teacher t3 = new Teacher("Khan A ","5425","PHY");

        math.addTeacher(t1);
        math.printTeacher();
        System.out.println("-----------");

        physics.addTeacher(t2);
        physics.printTeacher();
        System.out.println("-----------");

        chemistery.addTeacher(t3);//prefix and branch name is not matching
        chemistery.printTeacher();

        Student s1 = new Student("Ann A","123",4,math,physics,chemistery);
        s1.addBulkExamNote(50,100,75);
        s1.printNote();
        System.out.println();
        System.out.println(s1.isPass());

        Student s2 = new Student("Elly L","456",3,math,physics,chemistery);
        s2.addBulkExamNote(60,50,30);
        s2.printNote();
        System.out.println(s2.isPass());

        Student s3 = new Student("Bill W","789",4,math,physics,chemistery);
        s3.addBulkExamNote(100,85,45);
        s3.printNote();
        System.out.println(s3.isPass());
    }
}
