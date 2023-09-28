public class BonusMilesService {
    public int calculate(int price) {
        int mile = 20; // Количество рублей для одной бонусной мили
        int bonus = price / mile; // Рассчёт количества бонусных миль
     return bonus;
    }
}