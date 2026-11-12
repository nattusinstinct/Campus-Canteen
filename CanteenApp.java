import java.util.ArrayList;


    public static void main(String[] args) {

        ArrayList<MenuItem> menu = new ArrayList<>();
        menu.add(new MenuItem("Masala Dosa", 40));
        menu.add(new MenuItem("Idli", 20));
        menu.add(new MenuItem("Filter Coffee", 15));


        OrderView view = new OrderView();


        OrderController controller = new OrderController(menu,view);

        System.out.println("Welcome to Campus Canteen!");
        boolean running = true;
        while (running) {
            controller.showMenu();
            int choice = controller.readChoice();
            // if(choice<4){
            //     choice = choice-1;
            // }
            if (!controller.isFinished(choice)) {
                controller.printReceipt();
                running = false;
            } else {
                controller.takeOrder(choice-1);
            }
        }
        System.out.println("Thank you! Visit again.");
    }

