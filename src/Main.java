public class Main {
    public static void main(String[] args) {
        HotBeverage coffee = new HotBeverage("Coffee", 250, 80);
        HotBeverage tea = new HotBeverage("Tea", 200, 75);
        HotBeverage hotChocolate = new HotBeverage("Hot Chocolate", 300, 85);


        HotBeverageMachine machine = new HotBeverageMachine();
        machine.addBeverage(coffee);
        machine.addBeverage(tea);
        machine.addBeverage(hotChocolate);

        HotBeverage requestedBeverage = machine.getProduct("Tea", 200, 75);

        if (requestedBeverage != null) {
            System.out.println("You got your drink: " + requestedBeverage);
        } else {
            System.out.println("Sorry, this drink is not available.");
        }
    }
}