package homeworkModule6.planes;

import homeworkModule6.models.MilitaryType;
import java.util.Objects;

public class MilitaryPlane extends Plane {

    private MilitaryType militaryType;

    public MilitaryPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, MilitaryType militaryType) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.militaryType = militaryType;
    }

    public MilitaryType getMilitaryType() {
        return militaryType;
    }

    public void setMilitaryType(MilitaryType militaryType) {
        this.militaryType = militaryType;
    }

    @Override
    public String toString() {
        return "MilitaryPlane{" +
                "MilitaryPlane=" + militaryType +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MilitaryPlane plane = (MilitaryPlane) o;
        return militaryType == plane.militaryType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), militaryType);
    }
}
