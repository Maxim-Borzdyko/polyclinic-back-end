package by.bntu.fitr.borzdyko.polyclinic.polyclinic.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.sql.Time;
import java.util.List;

@Entity
@Table(name = "appointment_time")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentTime {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "time")
    private Time time;

    @JsonIgnore
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "time")
    private List<Record> records;
}
