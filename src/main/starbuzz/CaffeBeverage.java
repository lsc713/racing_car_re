package src.main.starbuzz;

public abstract class CaffeBeverage {
    abstract void brew();

    abstract void addCondiments();

    void prepareRecipe() {
        boilWater();
        brew();
        addCondiments();
        pourInCup();
    }

    protected void boilWater() {
        System.out.println("물을 끓임");
    }

    protected void pourInCup() {
        System.out.println("컵에 붓는다.");
    }
}
