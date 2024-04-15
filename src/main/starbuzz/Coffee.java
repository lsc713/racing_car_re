package src.main.starbuzz;

public class Coffee extends CaffeBeverage{


    private void addSugarAndMilk() {
        System.out.println("설탕과 우유를 추가한다.");
    }


    private void brewCoffeeGrinds() {
        System.out.println("필터를 이용해 커피를 내림");
    }

    @Override
    void brew() {
        System.out.println("커피를내리다");
    }

    @Override
    void addCondiments() {
        System.out.println("설탕과 우유를 추가하다");
    }
}
