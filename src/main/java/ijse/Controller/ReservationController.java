package ijse.Controller;

import ijse.Dto.CustomerDto;
import ijse.Dto.PaymentDto;
import ijse.Dto.ReservationDto;
import ijse.Dto.VehicleDto;
import ijse.Service.CustomerService;
import ijse.Service.PaymentService;
import ijse.Service.ReservationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/reservation")

public class ReservationController {

    @Autowired
    private ReservationService reservationService;
    @Autowired
    private PaymentService paymentService;
    @Autowired
    private CustomerService customerService;


    @GetMapping("/getNeed/{automission}/{fuel_type}/{vehicletype}")
    public List<VehicleDto> getNeedVehicles(@PathVariable String automission, @PathVariable String fuel_type, @PathVariable String vehicletype){
        return reservationService.getNeedVehicle(automission,fuel_type,vehicletype);
    }
    @PostMapping("/addCustomer")
    public String addCustomer(@RequestBody CustomerDto customerDto) {
        return customerService.saveCustomer(customerDto);
    }

    @PostMapping("/add")
    public boolean addReservation(@RequestBody ReservationDto reservationDto, PaymentDto paymentDto) {

        return reservationService.saveReserve(reservationDto,paymentDto);
    }


}
