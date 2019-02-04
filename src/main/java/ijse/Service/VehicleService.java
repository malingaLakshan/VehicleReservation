package ijse.Service;

import ijse.Dto.VehicleDto;
import ijse.Entity.Vehicle;


import java.util.List;

public interface VehicleService {
    String saveVehicle(VehicleDto vehicleDto);


    Vehicle searchVehicle(Integer id);

    void deletevehicle(Integer id);

    List<VehicleDto> getAllVehicle();

    String updateVehicle(VehicleDto vehicleDto);
}
