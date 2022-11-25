import java.util.Scanner;

public class Customer extends Employee{
    private int id;
    public Customer(String name, double salary,int id) {
        super(name, salary);
        this.id=id;
    }
    public void salaryPrice(int amount) {
        System.out.println("çalışana " + amount + " kadar zam yapıldı");

        }

    @Override
    public void show() {
        super.show();
        System.out.println("customer id : " + this.id);

    }

    @Override
    public String toString() {
        return "customer objesii";
    }
}



