package ijse.Entity;

import javax.persistence.*;

@Entity
@Table(name = "RESERVATION")
public class Recervation {
    @Id
    @Column(name = "RESERVATION_ID",length = 10)
    private int resId;
    @Column(name = "RESERVE_FROM",length = 10)
    private String rFrom;
    @Column(name = "RESERVE_TO",length = 10)
    private String rTo;
    @Column(name = "RESERVATION_DATE",length = 10)
    private String rDate;
    @OneToOne(cascade = {CascadeType.ALL},fetch = FetchType.LAZY)
    private Payment payment;
    @OneToOne(cascade = {CascadeType.ALL},fetch = FetchType.LAZY)
    private Vehicle vehicle;

    public Recervation(int resId) {
        this.resId = resId;
    }

    public Recervation(int resId, String rFrom, String rTo, String rDate, Payment payment, Vehicle vehicle) {
        this.resId = resId;
        this.rFrom = rFrom;
        this.rTo = rTo;
        this.rDate = rDate;
        this.payment = payment;
        this.vehicle = vehicle;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public String getrFrom() {
        return rFrom;
    }

    public void setrFrom(String rFrom) {
        this.rFrom = rFrom;
    }

    public String getrTo() {
        return rTo;
    }

    public void setrTo(String rTo) {
        this.rTo = rTo;
    }

    public String getrDate() {
        return rDate;
    }

    public void setrDate(String rDate) {
        this.rDate = rDate;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Recervation{" +
                "resId=" + resId +
                ", rFrom='" + rFrom + '\'' +
                ", rTo='" + rTo + '\'' +
                ", rDate='" + rDate + '\'' +
                ", payment=" + payment +
                ", vehicle=" + vehicle +
                '}';
    }
}
