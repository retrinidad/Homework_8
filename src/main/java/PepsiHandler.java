public class PepsiHandler implements SnackDispenseHandler{
    private SnackDispenseHandler next;

    public void setNext(SnackDispenseHandler next){
        this.next = next;
    }

    @Override
    public void handleRequest(VendingMachine machine,String snack_name){
        Snack snack = machine.getSnack_selection().get(snack_name);
        if(snack_name == "Pepsi" && snack.getQuantity() > 0){
            machine.setSnack_choice(snack_name);
            machine.setState(new WaitingForMoneyState(machine));
        }
        else if(next != null){
            System.out.println("Passed from Pepsi");
            next.handleRequest(machine,snack_name);
        }
        else{
            System.out.println("Snack selection is no longer in stock");
            machine.setState(new IdleState(machine));
        }
    }
}
