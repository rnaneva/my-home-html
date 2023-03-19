package bg.softuni.myhome.model.entities;

import bg.softuni.myhome.model.enums.ConstructionEnum;
import bg.softuni.myhome.model.enums.HeatingEnum;
import bg.softuni.myhome.model.enums.OfferTypeEnum;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "search_criteria")
public class SearchEntity extends BaseEntity {


    @Enumerated(EnumType.STRING)
    private OfferTypeEnum type;

    @ManyToOne
    private CategoryEntity category;

    @Enumerated(EnumType.STRING)
    private ConstructionEnum construction;

    @Enumerated(EnumType.STRING)
    private HeatingEnum heating;

    @Column(nullable = false)
    private BigDecimal maxPrice;

    @Column(nullable = false)
    private BigDecimal minArea;

    @ManyToOne
    private LocationEntity city;

    @ManyToOne
    private AgencyEntity agency;

    public OfferTypeEnum getType() {
        return type;
    }

    public SearchEntity setType(OfferTypeEnum type) {
        this.type = type;
        return this;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public SearchEntity setCategory(CategoryEntity category) {
        this.category = category;
        return this;
    }

    public ConstructionEnum getConstruction() {
        return construction;
    }

    public SearchEntity setConstruction(ConstructionEnum construction) {
        this.construction = construction;
        return this;
    }

    public HeatingEnum getHeating() {
        return heating;
    }

    public SearchEntity setHeating(HeatingEnum heating) {
        this.heating = heating;
        return this;
    }

    public BigDecimal getMaxPrice() {
        return maxPrice;
    }

    public SearchEntity setMaxPrice(BigDecimal maxPrice) {
        this.maxPrice = maxPrice;
        return this;
    }

    public BigDecimal getMinArea() {
        return minArea;
    }

    public SearchEntity setMinArea(BigDecimal minArea) {
        this.minArea = minArea;
        return this;
    }

    public LocationEntity getCity() {
        return city;
    }

    public SearchEntity setCity(LocationEntity city) {
        this.city = city;
        return this;
    }

    public AgencyEntity getAgency() {
        return agency;
    }

    public SearchEntity setAgency(AgencyEntity agency) {
        this.agency = agency;
        return this;
    }
}
