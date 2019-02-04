package ijse.Repositories;


import ijse.Entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepo extends JpaRepository<Vehicle,Integer> {
}
