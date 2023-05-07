public class Main {

    public static void main(String[] args) {

        BmiService service = new BmiService();
        int weight;  // kg
        double height;  // m
        int bmi = service.calculate(48, 1.72);
        System.out.println(bmi);
    }
}
