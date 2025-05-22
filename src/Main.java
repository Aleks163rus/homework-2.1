public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int weight = 98;  // вес кг.
        double height = 1.87;   //  рост м.


        int bmi = service.calculate(weight, height);
        System.out.println();
        System.out.println(bmi);


        bmi = service.calculate(65, 1.6);
        System.out.println();
        System.out.println(bmi);


        bmi = service.calculate(35, 1.2);
        System.out.println();
        System.out.println(bmi);
    }
}
