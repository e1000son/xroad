package mz.gov.inage.xroad.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

import java.sql.Timestamp;
import java.util.Date;
@Entity
public class BirthCertificate extends AbstractEntity{
    private Date registerDate;
    private String state;
    private Float citizenKG;
    private String placeOfRegistration;
    private String address;
    private Timestamp registeredDate;
    @OneToOne
    private Citizen citizen;
    @OneToOne
    private PlaceOfBirth placeOfBirth;

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Float getCitizenKG() {
        return citizenKG;
    }

    public void setCitizenKG(Float citizenKG) {
        this.citizenKG = citizenKG;
    }

    public String getPlaceOfRegistration() {
        return placeOfRegistration;
    }

    public void setPlaceOfRegistration(String placeOfRegistration) {
        this.placeOfRegistration = placeOfRegistration;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Timestamp getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(Timestamp registeredDate) {
        this.registeredDate = registeredDate;
    }

    @Override
    public String toString() {
        return "BirthCertificate{" +
                ", registerDate=" + registerDate +
                ", state='" + state + '\'' +
                ", citizenKG=" + citizenKG +
                ", placeOfRegistration='" + placeOfRegistration + '\'' +
                ", address='" + address + '\'' +
                ", registeredDate=" + registeredDate +
                '}';
    }
}
