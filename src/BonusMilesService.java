public class BonusMilesService {
    public int calculate(int cost) {
        int coefficientMiles = 20;
        int result = cost / coefficientMiles;
        return result;
    }
}