package ijse.Service;

import ijse.Dto.PaymentDto;
import ijse.Dto.ReservationDto;
import ijse.Dto.VehicleDto;


import java.util.List;

public interface ReservationService {


    List<VehicleDto> getNeedVehicle(String automission, String fuel_type, String vehicletype);

    boolean saveReserve(ReservationDto reservationDto, PaymentDto paymentDto);
}
