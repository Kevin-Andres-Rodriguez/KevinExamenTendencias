package kevin.kevin.sponsor;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import kevin.kevin.skate.Competitor_skatersEntityKevin;
import lombok.Data;


@Entity
@Data
@Table(name = "sponsor_kevin")
public class SponsorEntityKevin {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_sponsor;
    private String nombre;
    private Long numero;
    private Boolean activo;
    private Date fecha_sponsor;

    


    @ManyToOne
    @JoinColumn(name = "id_competitor")
    private Competitor_skatersEntityKevin competitor_skatersEntityKevin;
}




