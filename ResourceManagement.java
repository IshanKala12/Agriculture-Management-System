package project;

class ResourceManagement {
    private double waterUsage;
    private double fertilizerUsage;
    private double pesticideUsage;

    public ResourceManagement(double waterUsage, double fertilizerUsage, double pesticideUsage) {
        this.waterUsage = waterUsage;
        this.fertilizerUsage = fertilizerUsage;
        this.pesticideUsage = pesticideUsage;
    }

    public void optimizeResources() {
        
        System.out.println("Optimizing resources...");
    }

    
    public double getWaterUsage() {
        return waterUsage;
    }

    public double getFertilizerUsage() {
        return fertilizerUsage;
    }

    public double getPesticideUsage() {
        return pesticideUsage;
    }
}

