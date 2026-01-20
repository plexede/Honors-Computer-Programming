public class Car {
    String color;
    int speed;
    int mileage;

    Car(String color, int speed, int mileage) {
        this.color = color;
        this.speed = speed;
        this.mileage = mileage;
    }

    String getColor() {
        return color;
    }

    int getSpeed() {
        return speed;
    }

    int getMileage() {
        return mileage;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }
}