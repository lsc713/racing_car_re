package src.main.starbuzz;

public class Main {
    public static void main(String[] args) {
        CaffeBeverage beverage = new Coffee();

        if (beverage instanceof Coffee) {
            Coffee coffee = (Coffee) beverage;
        }
    }
}
