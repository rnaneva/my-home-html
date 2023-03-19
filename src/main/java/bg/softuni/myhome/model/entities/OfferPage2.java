package bg.softuni.myhome.model.entities;

import bg.softuni.myhome.model.enums.AvailableEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "offers_second_page")
public class OfferPage2 extends BaseEntity{

    @Column(nullable = false)
    private String address;

    @ManyToOne
    private LocationEntity city;

    @Column(nullable = false)
    private Integer constructionYear;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private AvailableEnum parking;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private AvailableEnum elevator;

    @Column(nullable = false)
    private Integer floor;

    @Column(nullable = false)
    private Integer allFloors;

    @Column(nullable = false)
    private Integer bedrooms;

    @Column(nullable = false)
    private Integer bathrooms;

    @Column(nullable = false)
    private Integer balconies;

    public String getAddress() {
        return address;
    }

    public OfferPage2 setAddress(String address) {
        this.address = address;
        return this;
    }

    public LocationEntity getCity() {
        return city;
    }

    public OfferPage2 setCity(LocationEntity city) {
        this.city = city;
        return this;
    }

    public Integer getConstructionYear() {
        return constructionYear;
    }

    public OfferPage2 setConstructionYear(Integer constructionYear) {
        this.constructionYear = constructionYear;
        return this;
    }

    public AvailableEnum getParking() {
        return parking;
    }

    public OfferPage2 setParking(AvailableEnum parking) {
        this.parking = parking;
        return this;
    }

    public AvailableEnum getElevator() {
        return elevator;
    }

    public OfferPage2 setElevator(AvailableEnum elevator) {
        this.elevator = elevator;
        return this;
    }

    public Integer getFloor() {
        return floor;
    }

    public OfferPage2 setFloor(Integer floor) {
        this.floor = floor;
        return this;
    }

    public Integer getAllFloors() {
        return allFloors;
    }

    public OfferPage2 setAllFloors(Integer allFloors) {
        this.allFloors = allFloors;
        return this;
    }

    public Integer getBedrooms() {
        return bedrooms;
    }

    public OfferPage2 setBedrooms(Integer bedrooms) {
        this.bedrooms = bedrooms;
        return this;
    }

    public Integer getBathrooms() {
        return bathrooms;
    }

    public OfferPage2 setBathrooms(Integer bathrooms) {
        this.bathrooms = bathrooms;
        return this;
    }

    public Integer getBalconies() {
        return balconies;
    }

    public OfferPage2 setBalconies(Integer balconies) {
        this.balconies = balconies;
        return this;
    }
}
