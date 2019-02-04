package ijse.Repositories;

import ijse.Entity.Recervation;
import ijse.Entity.Vehicle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReservationRepo extends JpaRepository<Recervation,Long>{






    @Query(value = "SELECT v FROM Vehicle v WHERE LOWER(v.automission) = LOWER(:automission) and LOWER(v.fuelType)=lower(:fuelType) " +
            "and LOWER(v.vehicletype)=lower(:vehicletype) ")

    public List<Vehicle> getNeedVehicle(@Param("automission") String automission, @Param("fuelType") String fuelType,
                                        @Param("vehicletype") String vehicletype);
}
