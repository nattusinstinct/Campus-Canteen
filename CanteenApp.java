import java.util.ArrayList;

public  class CanteenApp{
    public static void main(String[] args) {
     
        ArrayList<MenuItem> menu = new ArrayList<MenuItem>();

        menu.add(new MenuItem("Masala Dosa", 40));
        menu.add(new MenuItem("Idli", 20));
        menu.add(new MenuItem("Filter Coffee", 15));
        menu.add(new MenuItem("Ghee Dosa",60));
        menu.add(new MenuItem("Tea",15));
        menu.add(new MenuItem("Sandwich",35));

       
        OrderView view = new OrderView();
        OrderController controller = new OrderController( menu ,view);

        System.out.println("Welcome to Campus Canteen!");

        boolean running = true;
        while (running) {
            controller.showMenu();
            int choice = controller.readChoice();
            if (controller.isFinished(choice)) {
                controller.printReceipt();
                running = false;
            } else {
                controller.takeOrder(choice -1);
            }
        }
        System.out.println("VAzhga VAlamudun , kanedkjbwjb:.");
    }
}
