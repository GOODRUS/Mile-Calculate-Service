public class BonusMilesService {
    public int calculate(int cost) {
        int bonus = 20; // Цена бонусной мили
        int price = cost / bonus;
        return price;
    }
}
