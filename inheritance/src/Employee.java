public class Employee {
    private String name;
    private double salary;

   public Employee(String name,double salary){
       this.name=name;
       this.salary=salary;
   }
   public void show(){
       System.out.println("çalışan ismi : " + this.name);
       System.out.println("çalışan maaşı : " + this.salary);

   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
