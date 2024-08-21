public class FinancialForecaster {
    public double[] predictFutureValues(double[] pastValues, double growthRate, int forecastYears) {
        double[] futureValues = new double[forecastYears];
        double lastPastValue = pastValues[pastValues.length - 1];
        for (int i = 0; i < forecastYears; i++) {
            futureValues[i] = calculateFutureValue(lastPastValue, growthRate, i + 1);
        }
        return futureValues;
    }
    private double calculateFutureValue(double presentValue, double growthRate, int years) {
        // Base case: if there are no more years, return the present value
        if (years == 0) {
            return presentValue;
        } else {
            double nextYearValue = presentValue * (1 + growthRate);
            return calculateFutureValue(nextYearValue, growthRate, years - 1);
        }
    }
}