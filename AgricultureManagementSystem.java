package project;

public class AgricultureManagementSystem {
    public static void main(String[] args) {
        
        SensorData sensorData = new SensorData(15, 37);
        ImageData imageData = new ImageData("path/to/image.jpg");

        
        CropMonitoring cropMonitoring = new CropMonitoring(sensorData, imageData);
        cropMonitoring.analyzeCropHealth();

        
        ResourceManagement resourceManagement = new ResourceManagement(120, 45, 25);
        resourceManagement.optimizeResources();

        
        YieldForecasting yieldForecasting = new YieldForecasting(3.5, 85);
        yieldForecasting.forecastYield();
    }
}