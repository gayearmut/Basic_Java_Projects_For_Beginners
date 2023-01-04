import java.sql.SQLOutput;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String  name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        double tax =0.0;
        if(this.salary>=1000){
            return tax = (salary * 0.03);
        }else{
            return tax ;
        }
    }

    public double bonus(){
        double bonus =0.0;
        if(this.workHours>40){
            bonus=(this.workHours-40)*30;
            return bonus;
        }
        return  bonus;
    }

    public double raiseSalary(){
        double raise = 0.0;
        int year = 2023-this.hireYear;
        if(year<10){
            raise=(this.salary*0.5);
            return raise;
        }else if (year>10 && year<20){
            raise=(this.salary*0.10);
            return raise;
        }else if(year>=20){
            raise=(this.salary*0.15);
            return raise;
        }
        return raise;
    }

    public void printEmployee(){
        System.out.println("Name :"+ name);
        System.out.println("Salary : "+ salary);
        System.out.println("Work hours : "+ workHours);
        System.out.println("Hire Year :"+ hireYear);
        System.out.println("----------------");
        System.out.println("Tax : "+tax());
        System.out.println("Bonus : "+ bonus());
        System.out.println("Salary Raise : "+ raiseSalary());
        System.out.println("-----------------");
        System.out.println("Total Salary: "+(salary+bonus()+raiseSalary()-tax()));
        System.out.println("=====================================");

    }

}
