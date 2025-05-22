public class BmiService {
    public int calculate (int weight, double height) {

        double result;
        result = weight / (height * height);

        return (int)result;
    }
}










