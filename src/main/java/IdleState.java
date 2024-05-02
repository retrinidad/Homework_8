public class IdleState implements StateOfVendingMachine{
    VendingMachine machine;

    public IdleState(VendingMachine machine){
        this.machine = machine;
    }

    @Override
    public void insertMoney(double amount){
        System.out.println("You must select snack first");
    }

    @Override
    public void selectSnack(String name){
        machine.setSnack_choice(name);
        this.machine.setState(new WaitingForMoneyState(this.machine));
    }

    @Override
    public void dispenseSnack(){
        System.out.println("You must select snack first");
    }
}
