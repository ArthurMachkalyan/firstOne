package JavaDevelopment.Objects;

import java.util.Arrays;

public class Transport {

    public double speed, weight;
    public byte[] coordinate;

    public void setValues(int speed, int weight, byte[] coordinate) {
        this.speed = speed;
        this.weight = weight;
        this.coordinate = coordinate;
    }

    public String getValues() {
        return "Object speed:\t" + speed + "Object weight:\t" + weight + "Object coordinate:\t" + Arrays.toString(coordinate);
    }
}
