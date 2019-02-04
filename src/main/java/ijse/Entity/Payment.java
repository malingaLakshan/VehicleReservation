package ijse.Entity;

import javax.persistence.*;

@Entity
@Table(name = "PAYMENT")
public class Payment {

        @Id
        @Column(name = "PAYMENT_ID",length = 5)
        private int pId;
       @Column(name = "PAYMENT_COST",length = 20)
        private double cost;
       @Column(name = "DATE",length = 10)
        private String date;
        @ManyToOne(cascade = {CascadeType.ALL},fetch = FetchType.LAZY)
        private Customer customer;
        @OneToOne(mappedBy = "payment",cascade = {CascadeType.ALL},fetch = FetchType.LAZY)
        private Recervation recervation;

    public Payment(int pId, double cost, String date, Customer customer, Recervation recervation) {
        this.pId = pId;
        this.cost = cost;
        this.date = date;
        this.customer = customer;
        this.recervation = recervation;
    }

    public Payment(int paymentId) {
        this.pId=paymentId;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Recervation getRecervation() {
        return recervation;
    }

    public void setRecervation(Recervation recervation) {
        this.recervation = recervation;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "pId=" + pId +
                ", cost=" + cost +
                ", date='" + date + '\'' +
                ", customer=" + customer +
                ", recervation=" + recervation +
                '}';
    }
}

