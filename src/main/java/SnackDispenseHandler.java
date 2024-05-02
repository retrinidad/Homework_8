public interface SnackDispenseHandler {

    public void setNext(SnackDispenseHandler next);

    public void handleRequest(VendingMachine machine,String snack_name);

}
