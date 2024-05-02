public class VendingMachineDriver {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();

        Snack Coke = new Snack("Coke", 8, 2.50);
        Snack Pepsi = new Snack("Pepsi", 5, 2.50);
        Snack Cheetos = new Snack("Cheetos", 8, 3.00);
        Snack Doritos = new Snack("Doritos", 2, 3.00);
        Snack KitKat = new Snack("KitKat", 4, 2.00);
        Snack Snickers = new Snack("Snickers", 2, 2.50);

        machine.addToSnack_selection("Coke",Coke);
        machine.addToSnack_selection("Pepsi",Pepsi);
        machine.addToSnack_selection("Cheetos",Cheetos);
        machine.addToSnack_selection("Doritos",Doritos);
        machine.addToSnack_selection("KitKat",KitKat);
        machine.addToSnack_selection("Snickers",Snickers);

        machine.selectSnack("KitKat");
        machine.insertMoney(2.00);
        machine.dispenseSnack();

        machine.selectSnack("Snickers");
        machine.insertMoney(2.50);
        machine.dispenseSnack();

        machine.selectSnack("Snickers");
        machine.insertMoney(2.50);
        machine.dispenseSnack();

        machine.selectSnack("Snickers");
        machine.insertMoney(2.50);
        machine.dispenseSnack();

        machine.selectSnack("Coke");
        machine.insertMoney(2.00);
        machine.dispenseSnack();

    }
}
