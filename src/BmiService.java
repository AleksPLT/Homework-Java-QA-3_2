public class BmiService {
    public double calculate(double height, double weight) {
        return ( weight / Math.pow(height, 2));
    }

}
