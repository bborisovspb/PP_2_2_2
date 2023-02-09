package web.model;

public class Car {
    private String brandName;
    private String modelName;
    private int UIN;

    public Car() {
    }

    public Car(String brandName, String modelName, int UIN) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.UIN = UIN;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getUIN() {
        return UIN;
    }

    public void setUIN(int UIN) {
        this.UIN = UIN;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandName='" + brandName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", uniqueCode=" + UIN +
                '}';
    }
}
