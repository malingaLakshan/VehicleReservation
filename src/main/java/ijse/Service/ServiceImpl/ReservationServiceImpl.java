package ijse.Service.ServiceImpl;

import ijse.Dto.PaymentDto;
import ijse.Dto.ReservationDto;
import ijse.Dto.VehicleDto;
import ijse.Entity.Customer;
import ijse.Entity.Payment;
import ijse.Entity.Recervation;
import ijse.Entity.Vehicle;
import ijse.Repositories.PaymentRepo;
import ijse.Repositories.ReservationRepo;
import ijse.Service.ReservationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service

public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationRepo reservationRepo;

    @Autowired
    private PaymentRepo paymentRepo;

    private Payment payment;
    private Recervation reservation;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public boolean saveReserve(ReservationDto reservationDto, PaymentDto paymentDto) {



        payment=new Payment(paymentDto.getpId(),paymentDto.getCost(),paymentDto.getDate(),new Customer(paymentDto.getCustomerId()),
                new Recervation(paymentDto.getReservationId()));
        paymentRepo.save(payment);

        reservation=new Recervation(reservationDto.getResId(),reservationDto.getrFrom(),reservationDto.getrTo(),
                reservationDto.getrDate(),new Payment(reservationDto.getPaymentId()),new Vehicle(reservationDto.getVehicleId()));
reservationRepo.save(reservation);

        return true;
    }

    @Override
    public List<VehicleDto> getNeedVehicle(String automission, String fuel_type, String vehicletype) {

        List<VehicleDto>getNeedVehi=new ArrayList<>();
        List<Vehicle>vehicles=reservationRepo.getNeedVehicle(automission,fuel_type,vehicletype);

        for(Vehicle c:vehicles){
            getNeedVehi.add(new VehicleDto(c.getVehicleId(), c.getStatus(), c.getVehicletype(),
                    c.getFuelType(), c.getAutomission(),c.getDailyPrice(),c.getDisc()));

        }

        return getNeedVehi;




    }
    }



