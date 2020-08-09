package main.edu.mum.domain;

import java.util.Date;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String reservationCode;

    @ElementCollection
    @CollectionTable(name = "reservation_flight_numbers", joinColumns = @JoinColumn(name = "reservation_id"))
    @Column(name = "flight_number")
    private Set<Integer> flightNumbers;

    private Long passengerId;

    private Long madeByUserId;

    private Long madeByAgentId;

    private boolean isConfirmed;

    private boolean isCancelled;

    private Date createdAt;

    private Date lastUpdateDate;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Integer> getFlightNumbers() {
        return flightNumbers;
    }

    public void setFlightNumbers(Set<Integer> flightNumbers) {
        this.flightNumbers = flightNumbers;
    }

    public Long getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(Long passengerId) {
        this.passengerId = passengerId;
    }

    public Long getMadeByUserId() {
        return madeByUserId;
    }

    public void setMadeByUserId(Long madeByUserId) {
        this.madeByUserId = madeByUserId;
    }

    public Long getMadeByAgentId() {
        return madeByAgentId;
    }

    public void setMadeByAgentId(Long madeByAgentId) {
        this.madeByAgentId = madeByAgentId;
    }

    public boolean isConfirmed() {
        return isConfirmed;
    }

    public void setConfirmed(boolean isConfirmed) {
        this.isConfirmed = isConfirmed;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    public void setCancelled(boolean isCancelled) {
        this.isCancelled = isCancelled;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getReservationCode() {
        return reservationCode;
    }

    public void setReservationCode(String reservationCode) {
        this.reservationCode = reservationCode;
    }

}