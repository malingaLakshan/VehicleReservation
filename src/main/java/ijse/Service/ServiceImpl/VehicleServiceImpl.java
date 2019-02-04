package ijse.Service.ServiceImpl;
import ijse.Dto.VehicleDto;
import ijse.Entity.Vehicle;
import ijse.Repositories.VehicleRepo;
import ijse.Service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepo vehicleRepo;

    @Override
    public Vehicle searchVehicle(Integer id) {
        Optional<Vehicle> vehicle = this.vehicleRepo.findById(id);
        if (vehicle.isPresent()) {
            return vehicle.get();

        }


        return null;

    }

    @Override
    public void deletevehicle(Integer id) {
        vehicleRepo.deleteById(id);

    }

    @Override
    public List<VehicleDto> getAllVehicle() {
        List<VehicleDto> list = new ArrayList<>();
        List<Vehicle> getAll = vehicleRepo.findAll();


        for (Vehicle vehicleDto : getAll) {
            list.add(new VehicleDto(vehicleDto.getVehicleId(), vehicleDto.getStatus(),
                    vehicleDto.getVehicletype(), vehicleDto.getFuelType(), vehicleDto.getAutomission(),
                    vehicleDto.getDailyPrice(), vehicleDto.getDisc()));

        }

        return list;
    }




    @Override
    public String updateVehicle(VehicleDto vehicleDto) {
        return null;
    }


    @Override
    @Transactional
    public String saveVehicle(VehicleDto vehicleDto) {
        Vehicle vehicle = new Vehicle(vehicleDto.getVehicleId(),vehicleDto.getStatus(),
                vehicleDto.getVehicletype(), vehicleDto.getFuelType(), vehicleDto.getAutomission(),
                vehicleDto.getDailyPrice(),vehicleDto.getDisc());

        vehicleRepo.save(vehicle);
        return "DaTA sAVED";


    }
}
