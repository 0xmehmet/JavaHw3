public class Employee extends Worker {
    int employeeId;

    public Employee(String workerFirstName, String workerLastName, double salary, int averageOvertime) {
        super(workerFirstName, workerLastName, salary, averageOvertime);

    }

    public int getEmployeeId() {
        return (int) (getAverageOvertime()+getSalary() * 18);
    }
    public void goster(){
        this.show();
        System.out.println(" İşçi Özel Id'si : "+getEmployeeId());
    }


}
