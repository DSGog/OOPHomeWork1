import java.util.ArrayList;
import java.util.List;

public class HotBeverageMachine implements VendingMachine {
    private final List<HotBeverage> beverages;

    public HotBeverageMachine() {
        this.beverages = new ArrayList<>();
    }

    public void addBeverage(HotBeverage beverage) {
        beverages.add(beverage);
    }

    @Override
    public Beverage getProduct(String name, int volume) {
        for (HotBeverage beverage : beverages) {
            if (beverage.getName().equals(name) && beverage.getVolume() == volume) {
                return beverage;
            }
        }
        return null;
    }

    public HotBeverage getProduct(String name, int volume, int temperature) {
        for (HotBeverage beverage : beverages) {
            if (beverage.getName().equals(name) && beverage.getVolume() == volume && beverage.getTemperature() == temperature) {
                return beverage;
            }
        }
        return null;
    }
}