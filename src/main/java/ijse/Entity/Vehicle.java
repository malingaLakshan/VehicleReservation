package ijse.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "VEHICLE")
public class Vehicle implements Serializable {
    @Id
    @Column(name = "VEHICLE_ID",length = 10)
    private int vehicleId;
    @Column(name = "VEHICLE_STATUS",length = 1)
    private int status;
    @Column(name = "VEHICLE_TYPE",length = 10)
    private String vehicletype;
    @Column(name = "FUEL_TYPE",length = 10)
    private String fuelType;
    @Column(name = "TRANSMISSION",length = 10)
    private String automission;
    @Column(name = "DAILY_PRICE",length = 10)
    private double dailyPrice;
    @Column(name = "DESCRIPTION",length = 10)
    private String disc;

    @OneToOne(mappedBy = "vehicle",cascade = {CascadeType.ALL},fetch = FetchType.LAZY)
    private Recervation recervation;

    public Vehicle() {
    }

    public Vehicle(int vehicleId, int status, String vehicletype, String fuelType, String automission,
                   double dailyPrice, String disc) {
        this.vehicleId = vehicleId;
        this.status = status;
        this.vehicletype = vehicletype;
        this.fuelType = fuelType;
        this.automission = automission;
        this.dailyPrice = dailyPrice;
        this.disc = disc;
    }

    public Vehicle(int vehicleId, int status, String vehicletype, String fuelType, String automission, double dailyPrice, String disc, Recervation recervation) {
        this.vehicleId = vehicleId;
        this.status = status;
        this.vehicletype = vehicletype;
        this.fuelType = fuelType;
        this.automission = automission;
        this.dailyPrice = dailyPrice;
        this.disc = disc;
        this.recervation = recervation;
    }

    public Vehicle(int vehicleId) {
        this.vehicleId=vehicleId;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getVehicletype() {
        return vehicletype;
    }

    public void setVehicletype(String vehicletype) {
        this.vehicletype = vehicletype;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getAutomission() {
        return automission;
    }

    public void setAutomission(String automission) {
        this.automission = automission;
    }

    public double getDailyPrice() {
        return dailyPrice;
    }

    public void setDailyPrice(double dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

    public String getDisc() {
        return disc;
    }

    public void setDisc(String disc) {
        this.disc = disc;
    }

    public Recervation getRecervation() {
        return recervation;
    }

    public void setRecervation(Recervation recervation) {
        this.recervation = recervation;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                ", status=" + status +
                ", vehicletype='" + vehicletype + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", automission='" + automission + '\'' +
                ", dailyPrice=" + dailyPrice +
                ", disc='" + disc + '\'' +
                ", recervation=" + recervation +
                '}';
    }
}
