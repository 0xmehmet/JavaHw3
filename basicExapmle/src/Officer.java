public class Officer extends  Worker{
    int officerId;

    public Officer(String workerFirstName, String workerLastName, double salary, int averageOvertime) {
        super(workerFirstName, workerLastName, salary, averageOvertime);

    }

    public int getOfficerId() {
        return getAverageOvertime() * 5;
    }


    public void listele(){
       this.show();
        System.out.println(" Memur Özel Id'si : "+getOfficerId());
    }
}
