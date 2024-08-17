package project;

class CropMonitoring {
    private SensorData sensorData;
    private ImageData imageData;

    public CropMonitoring(SensorData sensorData, ImageData imageData) {
        this.sensorData = sensorData;
        this.imageData = imageData;
    }

    public void analyzeCropHealth() {
        
        sensorData.processData();

        
        imageData.processImage();

        
        if(sensorData.hasAnomalies() || imageData.hasPestInfestation()) {
            System.out.println("Alert: Crop health issue detected!");
        }
    }
}
