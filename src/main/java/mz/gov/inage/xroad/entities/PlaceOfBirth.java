package mz.gov.inage.xroad.entities;

import jakarta.persistence.Entity;

@Entity
public class PlaceOfBirth extends AbstractEntity{
    private String province;
    private String district;
    private String village;
    private String description;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "PlaceOfBirth{" +
                ", province='" + province + '\'' +
                ", district='" + district + '\'' +
                ", village='" + village + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
