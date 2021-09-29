package homeworkModule6.planes;

import homeworkModule6.models.ClassificationLevel;
import homeworkModule6.models.ExperimentalTypes;

import java.util.Objects;

public class ExperimentalPlane extends Plane {

    ExperimentalTypes experimentalTypes;
    ClassificationLevel classificationLevel;

    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, ExperimentalTypes experimentalTypes, ClassificationLevel classificationLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.experimentalTypes = experimentalTypes;
        this.classificationLevel = classificationLevel;
    }

    public ExperimentalTypes getExperimentalTypes() {
        return experimentalTypes;
    }

    public void setExperimentalTypes(ExperimentalTypes experimentalTypes) {
        this.experimentalTypes = experimentalTypes;
    }

    public ClassificationLevel getClassificationLevel() {
        return classificationLevel;
    }

    public void setClassificationLevel(ClassificationLevel classificationLevel) {
        this.classificationLevel = classificationLevel;
    }

    @Override
    public String toString() {
        return "ExperimentalPlane{" +
                "experimentalTypes=" + experimentalTypes +
                "classificationLevel=" + classificationLevel +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ExperimentalPlane plane = (ExperimentalPlane) o;
        return experimentalTypes == plane.experimentalTypes &&
                classificationLevel == plane.classificationLevel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), experimentalTypes, classificationLevel);
    }
}
