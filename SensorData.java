package project;

class SensorData {
    private double soilMoisture;
    private double temperature;

    public SensorData(double soilMoisture, double temperature) {
        this.soilMoisture = soilMoisture;
        this.temperature = temperature;
    }

    public void processData() {
        
        System.out.println("Processing sensor data...");
    }

    public boolean hasAnomalies() {
        
        return soilMoisture < 20 || temperature > 35;
    }
}