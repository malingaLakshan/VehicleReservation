package ijse.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "CUSTOMER")
public class Customer implements Serializable {
    @Id
    @Column(name = "CUSTOMER_ID",length = 10)
    private Integer id;
    @Column(name = "CUSTOMER_NIC",length = 10)
    private String nic;
    @Column(name = "CUSTOMER_NAME",length =40 )
    private String name;
    @Column(name = "CUSTOMER_MOBILE",length =10)
    private int tp;
    @Column(name = "CUSTOMER_ADDRESS",length =20 )
    private String address;

    @OneToMany(mappedBy = "customer" ,cascade = {CascadeType.ALL},fetch = FetchType.LAZY)
    private List<Payment> payments= new ArrayList<>();

    public Customer(int customerId) {
        this.id=customerId;
    }

    public Customer() {
    }

    public Customer(Integer id, String nic, String name, int tp, String address) {
        this.id = id;
        this.nic = nic;
        this.name = name;
        this.tp = tp;
        this.address = address;
    }

    public Customer(Integer id, String nic, String name, int tp, String address, List<Payment> payments) {
        this.id = id;
        this.nic = nic;
        this.name = name;
        this.tp = tp;
        this.address = address;
        this.payments = payments;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTp() {
        return tp;
    }

    public void setTp(int tp) {
        this.tp = tp;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", nic='" + nic + '\'' +
                ", name='" + name + '\'' +
                ", tp=" + tp +
                ", address='" + address + '\'' +
                ", payments=" + payments +
                '}';
    }
}
