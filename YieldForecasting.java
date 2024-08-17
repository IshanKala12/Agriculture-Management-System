package project;

class YieldForecasting {
    private double historicalYield;
    private double currentConditions;
    private double forecastedYield;

    public YieldForecasting(double historicalYield, double currentConditions) {
        this.historicalYield = historicalYield;
        this.currentConditions = currentConditions;
    }

    public void forecastYield() {
        // Simple yield forecast calculation
        forecastedYield = historicalYield * (currentConditions / 100);
        System.out.println("Forecasted Yield: " + forecastedYield + " tons/ha");
    }

    // Getter method for testing
    public double getForecastedYield() {
        return forecastedYield;
    }
}

