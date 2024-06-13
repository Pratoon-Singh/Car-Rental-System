import java.util.Objects;

public class Car {
    private String carId ;
    private String carModel;
    private String carBrand;
    private double basePrice;
    private boolean isAvailable;

    public Car(String carId, String carModel, String carBrand, double basePrice) {
        this.carId = carId;
        this.carModel = carModel;
        this.carBrand = carBrand;
        this.basePrice = basePrice;
        this.isAvailable = true;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String id) {
        this.carId = id;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void rent(){
        isAvailable=false;
    }
    public void returnCar(){
        isAvailable=true;
    }

    public double calculatePrice(int rentalDay){
        return basePrice*rentalDay;
    }

}
