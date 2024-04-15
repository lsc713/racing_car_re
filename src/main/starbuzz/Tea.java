package src.main.starbuzz;

public class Tea extends CaffeBeverage{


    private void addLemon() {
        System.out.println("레몬을 추가한다.");
    }


    private void steepTeaBag() {
        System.out.println("티백을 담근다");
    }

    @Override
    void brew() {
        System.out.println("티백을 담그다");
    }

    @Override
    void addCondiments() {
        System.out.println("레몬을 추가하다");
    }
}
