package main.edu.mum.domain;

import javax.persistence.*;

@Entity
@SecondaryTable(name = "history")
//@NamedQuery(
//        name="Airline.getAllAirlinesOutOfAnAirport",
//        query = "SELECT distinct a FROM Flight f JOIN f.airline a WHERE f.departureAirport.code=:airportCode"
//)
public class Airline {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 3, nullable = false)
    private String code;
    @Column(nullable = false)
    private String name;
    @Lob
    @Column(table = "history")
    private String history;

    public Airline(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }
}
