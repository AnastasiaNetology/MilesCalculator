public class BonusMilesService {
    public int calculate(int price) {
        int coef = 20;
        int miles = price / coef;
        return miles;
    }
}