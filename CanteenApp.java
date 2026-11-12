import java.util.ArrayList;

<<<<<<< HEAD
public class CanteenApp{
=======
public  class CanteenApp{
>>>>>>> 917c24b80be6116a79fa0d36199563df61519f01
    public static void main(String[] args) {
     
        ArrayList<MenuItem> menu = new ArrayList<MenuItem>();

        menu.add(new MenuItem("Masala Dosa", 40));
        menu.add(new MenuItem("Idli", 20));
        menu.add(new MenuItem("Filter Coffee", 15));

       
        OrderView view = new OrderView();
<<<<<<< HEAD

       
        OrderController controller = new OrderController(menu,view);
=======
        OrderController controller = new OrderController( menu ,view);
>>>>>>> 917c24b80be6116a79fa0d36199563df61519f01

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
