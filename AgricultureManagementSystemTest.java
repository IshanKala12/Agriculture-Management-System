package project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AgricultureManagementSystemTest {

    private SensorData sensorData;
    private ImageData imageData;
    private CropMonitoring cropMonitoring;
    private ResourceManagement resourceManagement;
    private YieldForecasting yieldForecasting;

    @BeforeEach
    void setUp() {
        
        sensorData = new SensorData(15, 37);
        imageData = new ImageData("path/to/image.jpg");
        cropMonitoring = new CropMonitoring(sensorData, imageData);
        resourceManagement = new ResourceManagement(120, 45, 25);
        yieldForecasting = new YieldForecasting(3.5, 85);
    }

    @Test
    void testCropMonitoring_analyzeCropHealth() {
        cropMonitoring.analyzeCropHealth();
        assertTrue(sensorData.hasAnomalies(), "Expected anomalies in sensor data.");
        assertFalse(imageData.hasPestInfestation(), "Expected no pest infestation.");
    }

    @Test
    void testResourceManagement_optimizeResources() {
        resourceManagement.optimizeResources();

        
        assertEquals(120, resourceManagement.getWaterUsage(), "Water usage should be 120.");
        assertEquals(45, resourceManagement.getFertilizerUsage(), "Fertilizer usage should be 45.");
        assertEquals(25, resourceManagement.getPesticideUsage(), "Pesticide usage should be 25.");
    }

    @Test
    void testYieldForecasting_forecastYield() {
        yieldForecasting.forecastYield();

        
        double expectedYield = 3.5 * (85.0 / 100);
        assertEquals(expectedYield, yieldForecasting.getForecastedYield(), 0.01, "The yield forecast should be accurate.");
    }
}
