package sub2;

import java.util.Scanner;
//Abarttım galiba biraz umarım olmuştur.
//Değerler doğru olmayabilir internette gördüğüm ilk verileri aldım.
interface TemperatureConverter {
    double temperatureConvert(double value, SwitchCase.TemperatureUnit from, SwitchCase.TemperatureUnit to);
}

public class SwitchCase implements TemperatureConverter {
    enum TemperatureUnit {
        CELSIUS,
        FAHRENHEIT,
        KELVIN
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SwitchCase converter = new SwitchCase();

        System.out.println("Sıcaklık değerini giriniz:");
        double value = scanner.nextDouble();

        System.out.println("Çevirmek istediğiniz birimi seçiniz (1: Celsius, 2: Fahrenheit, 3: Kelvin):");
        int fromUnitChoice = scanner.nextInt();
        TemperatureUnit fromUnit = getTemperatureUnit(fromUnitChoice);

        System.out.println("Hangi birime çevirmek istediğinizi seçiniz (1: Celsius, 2: Fahrenheit, 3: Kelvin):");
        int toUnitChoice = scanner.nextInt();
        TemperatureUnit toUnit = getTemperatureUnit(toUnitChoice);

        double convertedValue = converter.temperatureConvert(value, fromUnit, toUnit);
        System.out.printf("Değer Sonucu:  %.2f %s%n", convertedValue, toUnit.name());
    }

    private static TemperatureUnit getTemperatureUnit(int choice) {
        return switch (choice) {
            case 1 -> TemperatureUnit.CELSIUS;
            case 2 -> TemperatureUnit.FAHRENHEIT;
            case 3 -> TemperatureUnit.KELVIN;
            default -> throw new IllegalArgumentException("Geçersiz seçim. 1, 2 veya 3 seçiniz.");
        };
    }

    @Override
    public double temperatureConvert(double value, TemperatureUnit from, TemperatureUnit to) {
        if (from == null || to == null) {
            throw new IllegalArgumentException("Geçersiz giriş yaptınız.");
        }

        double celsius = switch (from) {
            case FAHRENHEIT -> (value - 32) * 5 / 9;
            case KELVIN -> value - 273.15;
            case CELSIUS -> value;
        };

        return switch (to) {
            case FAHRENHEIT -> celsius * 9 / 5 + 32;
            case KELVIN -> celsius + 273.15;
            case CELSIUS -> celsius;
        };
    }
}
