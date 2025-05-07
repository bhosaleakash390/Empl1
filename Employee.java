public class Eployee{
    Sring name;
    int id;
    double salary;

    public Employee(Sting name, int id, double salary){

        this.name= name;
        this.id =id;
        this.salary = salary;

    }
    public void displayInfo(){
        system.out.println("Employee ID: "+ id);
        system.out.println("Employee name:" + name);
        system.out.println("Employee system:" + salary);

    }

    public static void main(string[] args){
        Employee emp1 = new Employee(name:"xyz", id:101, salary:50000.0);
        emp1.displayInfo();
    }
    }

