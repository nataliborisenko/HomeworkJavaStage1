package homeworkModule6;

import homeworkModule6.models.MilitaryType;
import homeworkModule6.planes.*;


import java.util.*;

public class Airport {
    private List<? extends Plane> planes;

    public Airport(List<? extends Plane> planes) {
        this.planes = planes;
    }

    public List<? extends Plane> getPlanes() {
        return planes;
    }

    public void setPlanes(List<? extends Plane> planes) {
        this.planes = planes;
    }

    public List<PassengerPlane> getPassengerPlanes() {
        List<PassengerPlane> passengerPlanes = new ArrayList<>();
        for (int i = 0; i < planes.size(); i++) {
            if (planes.get(i) instanceof PassengerPlane) {
                passengerPlanes.add((PassengerPlane) planes.get(i));
            }
        }
        return passengerPlanes;
    }

    public List<MilitaryPlane> getMilitaryPlanes() {
        List<MilitaryPlane> militaryPlanes = new ArrayList<>();
        for (int i = 0; i < planes.size(); i++) {
            if (planes.get(i) instanceof MilitaryPlane) {
                militaryPlanes.add((MilitaryPlane) planes.get(i));
            }
        }
        return militaryPlanes;
    }

    public List<ExperimentalPlane> getExperimentalPlanes() {
        List<ExperimentalPlane> experimentalPlanes = new ArrayList<>();

        for (int i = 0; i < planes.size(); i++) {
            if (planes.get(i) instanceof ExperimentalPlane) {
                experimentalPlanes.add((ExperimentalPlane) planes.get(i));
            }
        }
        return experimentalPlanes;
    }

    public List<MilitaryPlane> getTransportMilitaryPlanes() {
        List<MilitaryPlane> transportMilitaryPlanes = new ArrayList<>();
        List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
        for (int i = 0; i < militaryPlanes.size(); i++) {
            if (militaryPlanes.get(i).getMilitaryType() == MilitaryType.TRANSPORT) {
                transportMilitaryPlanes.add(militaryPlanes.get(i));
            }
        }
        return transportMilitaryPlanes;
    }

    public List<MilitaryPlane> getBomberMilitaryPlanes() {
        List<MilitaryPlane> bomberMilitaryPlanes = new ArrayList<>();
        List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
        for (int i = 0; i < militaryPlanes.size(); i++) {
            if (militaryPlanes.get(i).getMilitaryType() == MilitaryType.BOMBER) {
                bomberMilitaryPlanes.add(militaryPlanes.get(i));
                System.out.println(militaryPlanes.get(i));
            }
        }
        return bomberMilitaryPlanes;

    }

    public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {
        List<PassengerPlane> passengerPlanes = getPassengerPlanes();
        PassengerPlane planeWithMaxCapacity = passengerPlanes.get(0);
        for (int i = 0; i < passengerPlanes.size(); i++) {
            if (passengerPlanes.get(i).getPassengersCapacity() > planeWithMaxCapacity.getPassengersCapacity()) {
                planeWithMaxCapacity = passengerPlanes.get(i);
            }
        }
        return planeWithMaxCapacity;
    }

    public Airport sortPlanesByMaxFlightDistance() {
        Collections.sort(planes, (Comparator<Plane>) (plane1, plane2) -> plane1.getMaxFlightDistance() - plane2.getMaxFlightDistance());
        return this;

    }

    public Airport sortPlanesByMaxSpeed() {
        Collections.sort(planes, (plane1, plane2) -> plane1.getMaxSpeed() - plane2.getMaxSpeed());
        return this;
    }

    public Airport sortPlanesByMaxLoadCapacity() {
        Collections.sort(planes, (plane1, plane2) -> plane1.getMaxLoadCapacity() - plane2.getMaxLoadCapacity());
        return this;
    }

    public void iterate() {
        Iterator<? extends Plane> iterator = planes.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Override
    public String toString() {
        return "Airport{" +
                "planes=" + planes +
                '}';
    }
}

