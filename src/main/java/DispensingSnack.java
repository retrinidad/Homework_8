public class DispensingSnack implements StateOfVendingMachine{
    VendingMachine machine;

    public DispensingSnack(VendingMachine machine){
        this.machine = machine;
    }
    public void insertMoney(double amount){
        System.out.println("Wait for snack to finish dispensing");
    }
    public void selectSnack(String name){
        System.out.println("Wait for snack to finish dispensing");
    }
    public void dispenseSnack(){
        Snack snack = machine.getSnack_choice();
        if(snack != null){
            System.out.println("Dispensing: " + snack.getName());
            snack.reduce();
        }
        machine.setState(new IdleState(machine));
    }
}
