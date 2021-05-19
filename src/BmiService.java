public class BmiService {
    public double calculate(double mass_kg, double height_meter) {
        // Body Mass Index = mass_kg / height_meter^2
        double bmi = mass_kg / (height_meter * height_meter);
        return bmi;
    }
}
