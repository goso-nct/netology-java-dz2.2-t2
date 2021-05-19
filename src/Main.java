public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double mass_kg = 81.3;
        double height_meter = 1.82;
        double bmi = service.calculate(mass_kg, height_meter);
        System.out.printf("Body Mass Index = %.1f", bmi);
    }
}
