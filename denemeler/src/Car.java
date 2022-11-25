public class Car {
    private String color;
    private String model;
    private double engine ;
    private int doors;

    public Car(String color,String model){
        this(color,model,0,0);

    }

    public Car() {
//        this.doors=0;
//        this.engine=0;
//        this.model="none bilgi";
//        this.color="none";
        this("bilgi yok","bilgi yok",0,0);
    }

    public Car(String color, String model, double engine, int doors){
        this.color=color;
        this.model=model;
        this.engine=engine;
        this.doors=doors;

    }


    public void setColor(String color){
        this.color=color;
    }
    public String getColor() {
        return this.color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        if (doors==2 || doors ==4){
            this.doors=doors;

        }else
            System.out.println("kapı sayısı sadece 2 veya 4 olabilir");

    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void start(){
        System.out.println("araba çalıştı");
    }
    public void stop(){
        System.out.println("araba durdu");
    }
    public void showInfos(){

        System.out.println("arabanın rengi  : "+this.color);
        System.out.println("arabanın modeli  : "+this.model);
        System.out.println("arabanın motor hacmi  : "+this.engine);
        System.out.println("arabanın kapı sayısı  : "+this.doors);
    }




}
