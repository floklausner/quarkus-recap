package at.htl.recap;

import at.htl.recap.entitiy.Vehicle;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class VehicleRepositoryTest {

    @Inject
    VehicleRepository vehicleRepository;


    @Test
    void t010_insertSimpleVehicle() {

        Vehicle vehicle = new Vehicle("Opel", "Kapitän", 1972);
        vehicleRepository.persist(vehicle);

    }
}
