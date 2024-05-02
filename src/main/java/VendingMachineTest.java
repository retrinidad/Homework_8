import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class VendingMachineTest {

    @Test
    public void IdletoWaitingForMoneyStateTest(){
        VendingMachine machine = new VendingMachine();
        StateOfVendingMachine state = new IdleState(machine);
        machine.setState(state);

        state.selectSnack("Cheetos");
        assertTrue(machine.getState() instanceof WaitingForMoneyState);
    }

    @Test
    public void NotEnoughMoneyTest(){
        VendingMachine machine = new VendingMachine();
        machine.addToSnack_selection("Coke",new Snack("Coke", 8, 2.50));
        StateOfVendingMachine state = new WaitingForMoneyState(machine);
        machine.setState(state);

        state.insertMoney(0.5);
        assertEquals(8,machine.getSnack_selection().get("Coke").getQuantity());
    }

    @Test
    public void DispenseTest(){
        VendingMachine machine = new VendingMachine();
        machine.addToSnack_selection("Coke",new Snack("Coke", 8, 2.50));
        StateOfVendingMachine state = new DispensingSnack(machine);
        machine.setState(state);

        state.dispenseSnack();
        assertTrue(machine.getState() instanceof IdleState);
    }

}
