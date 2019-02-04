package ijse.Repositories;

import ijse.Entity.Payment;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository<Payment,Integer> {
}
