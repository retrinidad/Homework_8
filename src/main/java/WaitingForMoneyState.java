public class WaitingForMoneyState implements StateOfVendingMachine{
    private VendingMachine machine;

    public WaitingForMoneyState(VendingMachine machine){
        this.machine = machine;
    }

    @Override
    public void insertMoney(double amount){
        Snack snack = this.machine.getSnack_choice();
        if(snack != null){
            if(amount >= snack.getPrice() && snack.getQuantity() > 0){
               machine.setState(new DispensingSnack(machine));
            }
            else if(amount >= snack.getPrice() && snack.getQuantity() == 0){
                System.out.println("Snack selection is no longer in stock");
                machine.setState(new IdleState(machine));
            }
            else{
                System.out.println("Not enough money inserted");
            }
        }
        else{
            System.out.println("Not a valid choice");
        }
    }

    @Override
    public void selectSnack(String name){
        System.out.println("Finish inserting money");
    }

    @Override
    public void dispenseSnack(){
        System.out.println("Finish inserting money");
    }
}
