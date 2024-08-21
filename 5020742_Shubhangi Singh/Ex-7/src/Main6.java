public class Main6  {
    public static void main(String[] args) {
        FinancialForecaster forecaster = new FinancialForecaster();
        double[] pastValues = {100, 120, 150, 180, 200};
        double growthRate = 0.1;
        int forecastYears = 5;

        double[] futureValues = forecaster.predictFutureValues(pastValues, growthRate, forecastYears);
        System.out.println("Future Values:");
        for (int i = 0; i < futureValues.length; i++) {
            System.out.println("Year " + (i + 1) + ": " + futureValues[i]);
        }
    }
}
