public class CustomerManager {
    private BaseLogger Logger;

//ben baseloggera bakarak çalışıyorum demek anlamına geliyor
    public CustomerManager(BaseLogger logger) {
        Logger = logger;
    }

    public void add(){
        System.out.println("müşteri eklendi : ");
        this.Logger.log("müşterki akle bbebaba");
    }
}
