public class BmiService {
    public int calculate(int weight, int growth) {
        int bmi = (int) (weight * 10000 / Math.pow(growth, 2));

        return bmi;
    }
}
