package PPJ_17_Artur;

public class Ex1 {
    public static void main(String[] args) {
        convertTemperature(50, 'C');


    }

    public static void convertTemperature(int temp, char unit) {
        double convTemp = 0;

        if (unit == 'C') {
            convTemp = (temp - 30) / 2;
            System.out.println("Temperature is: " + convTemp + " C");
        } else {
            convTemp = (temp * 1.8) + 32;
            System.out.println("Temperature is: " + convTemp + " F");
        }

    }
}
