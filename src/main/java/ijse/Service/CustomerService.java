package ijse.Service;

import ijse.Dto.CustomerDto;
import ijse.Entity.Customer;

import java.util.List;

public interface CustomerService  {
    String saveCustomer(CustomerDto customerDto);

    String updateCustomer(CustomerDto customerDto);

    void deleteCustomer(Integer id);

    Customer searchCustomer(Integer id);

    List<CustomerDto> getAllCustomers();
}
