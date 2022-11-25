public class Worker {

    private String workerFirstName;
    private String workerLastName;
    private double salary;
    private int averageOvertime;

    public Worker() {
    }

    public Worker(String workerFirstName, String workerLastName, double salary, int averageOvertime) {
        this.workerFirstName=workerFirstName;
        this.workerLastName=workerLastName;
        this.salary=salary;
        this.averageOvertime=averageOvertime;
    }

    public int getAverageOvertime() {
        return averageOvertime;
    }

    public void setAverageOvertime(int averageOvertime) {
        this.averageOvertime = averageOvertime;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getWorkerFirstName() {
        return workerFirstName;
    }

    public void setWorkerFirstName(String workerFirstName) {
        this.workerFirstName = workerFirstName;
    }

    public String getWorkerLastName() {
        return workerLastName;
    }

    public void setWorkerLastName(String workerLastName) {
        this.workerLastName = workerLastName;
    }
    public void show(){
        System.out.println(" Çalışanın adı nedir : "+this.workerFirstName);
        System.out.println(" Çalışanın soyaadı nedir : "+this.workerLastName);
        System.out.println(" Çalışanın maaşı nedir : "+this.salary);
        System.out.println(" Çalışanın mesaisi kaç saattir : "+this.averageOvertime);

    }
}
