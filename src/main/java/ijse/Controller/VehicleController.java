package ijse.Controller;

import ijse.Dto.VehicleDto;
import ijse.Entity.Vehicle;
import ijse.Service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/vehicle")

public class VehicleController {

    @Autowired
    private VehicleService vehicleService;
    @PostMapping
    public String saveVehicle(@RequestBody VehicleDto vehicleDto){

        return vehicleService.saveVehicle(vehicleDto) ;
    }



    @PutMapping("/update")
    public String updateVehicle(@RequestBody VehicleDto vehicleDto){
        return vehicleService.updateVehicle(vehicleDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteVehicle(@PathVariable Integer id){
        vehicleService.deletevehicle(id);

    }
    @GetMapping(value = "/findById/{id}")
    public Vehicle searchVehicle(@PathVariable Integer id){
        return vehicleService.searchVehicle(id);

    }
    @GetMapping("/all")
    public List<VehicleDto> getAllVehicle(){

        return vehicleService.getAllVehicle();
    }

}
