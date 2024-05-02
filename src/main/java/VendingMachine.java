import java.util.HashMap;
import java.util.Hashtable;

public class VendingMachine {
    private StateOfVendingMachine currentState;
    private HashMap<String,Snack> snack_selection;
    private String snack_choice;

    public VendingMachine() {
        this.currentState = new IdleState(this);
        this.snack_selection = new HashMap<>();
    }

    public HashMap<String, Snack> getSnack_selection() {
        return snack_selection;
    }

    public void addToSnack_selection(String snack_name, Snack snack) {
        this.snack_selection.put(snack_name,snack);
    }

    public void setState(StateOfVendingMachine state) {
        this.currentState = state;
    }

    public StateOfVendingMachine getState() {
        return this.currentState;
    }

    public void setSnack_choice(String snack_choice) {
        this.snack_choice = snack_choice;
    }

    public Snack getSnack_choice() {
        return snack_selection.get(snack_choice);
    }

    public void insertMoney(double amount){
        this.currentState.insertMoney(amount);
    }

    public void selectSnack(String name){
        SnackDispenseHandler CokeHandler = new CokeHandler();
        SnackDispenseHandler PepsiHandler = new PepsiHandler();
        SnackDispenseHandler CheetosHandler = new CheetosHandler();
        SnackDispenseHandler DoritosHandler = new DoritosHandler();
        SnackDispenseHandler KitKatHandler = new KitKatHandler();
        SnackDispenseHandler SnickersHandler = new SnickersHandler();

        CokeHandler.setNext(PepsiHandler);
        PepsiHandler.setNext(CheetosHandler);
        CheetosHandler.setNext(DoritosHandler);
        DoritosHandler.setNext(KitKatHandler);
        KitKatHandler.setNext(SnickersHandler);

        CokeHandler.handleRequest(this,name);

    }

    public void dispenseSnack(){
        this.currentState.dispenseSnack();
    }
}
