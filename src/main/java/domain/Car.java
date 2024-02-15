package domain;

public class Car {
    private final String carName;
    private Integer position;
    private final PowerGenerator powerGenerator;

    private Car(String carName, int position) {
        validate(carName);
        this.carName = carName;
        this.position = position;
        this.powerGenerator = new PowerGenerator();
    }

    public static Car of(String name, int position) {
        return new Car(name, position);
    }

    public Integer getPosition() {
        return this.position;
    }

    public String getCarName() {
        return this.carName;
    }

    public void tryMove() {
        if (powerGenerator.generate().isSufficientPower()) {
            move();
        }
    }

    private void move() {
        position++;
    }

    private void validate(String carName) {
        validateCarNameLength(carName);
    }

    private void validateCarNameLength(String carName) {
        if (carName.length() > 5) {
            throw new IllegalArgumentException();
        }
    }
}
