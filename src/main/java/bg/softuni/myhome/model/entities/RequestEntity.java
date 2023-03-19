package bg.softuni.myhome.model.entities;

import bg.softuni.myhome.model.enums.RequestStatusEnum;
import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
@Table(name = "requests")
public class RequestEntity extends BaseEntity{

    @Column(nullable = false)
    @DateTimeFormat(pattern = "dd-MM-yy")
    private LocalDate date;

    @Column(nullable = false)
    private Long visibleId;

    @Column(nullable = false)
    private String offerName;

    @Column(nullable = false)
    private String clientName;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private Integer phone;

    @Column(columnDefinition = "LONGTEXT")
    private String message;

    @Column(columnDefinition = "LONGTEXT")
    private String notes;

    @Enumerated(EnumType.STRING)
    private RequestStatusEnum status;

    @ManyToOne
    private OfferEntity offer;

    public LocalDate getDate() {
        return date;
    }

    public RequestEntity setDate(LocalDate date) {
        this.date = date;
        return this;
    }

    public Long getVisibleId() {
        return visibleId;
    }

    public RequestEntity setVisibleId(Long visibleId) {
        this.visibleId = visibleId;
        return this;
    }

    public String getOfferName() {
        return offerName;
    }

    public RequestEntity setOfferName(String offerName) {
        this.offerName = offerName;
        return this;
    }

    public String getClientName() {
        return clientName;
    }

    public RequestEntity setClientName(String clientName) {
        this.clientName = clientName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public RequestEntity setEmail(String email) {
        this.email = email;
        return this;
    }

    public Integer getPhone() {
        return phone;
    }

    public RequestEntity setPhone(Integer phone) {
        this.phone = phone;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public RequestEntity setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getNotes() {
        return notes;
    }

    public RequestEntity setNotes(String notes) {
        this.notes = notes;
        return this;
    }

    public RequestStatusEnum getStatus() {
        return status;
    }

    public RequestEntity setStatus(RequestStatusEnum status) {
        this.status = status;
        return this;
    }

    public OfferEntity getOffer() {
        return offer;
    }

    public RequestEntity setOffer(OfferEntity offer) {
        this.offer = offer;
        return this;
    }
}
