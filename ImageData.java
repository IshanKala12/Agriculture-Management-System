package project;

class ImageData {
    private String imagePath;

    public ImageData(String imagePath) {
        this.imagePath = imagePath;
    }

    public void processImage() {
        
        System.out.println("Processing image data...");
    }

    public boolean hasPestInfestation() {
        
        return false; 
    }
}