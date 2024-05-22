package kevin.kevin.skate;


import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import kevin.kevin.sponsor.SponsorEntityKevin;
import lombok.Data;


@Entity
@Data
@Table(name = "skate_kevin")
public class Competitor_skatersEntityKevin {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_competitor;

    @OneToMany(mappedBy = "competitor_skatersEntityKevin")
    private Set<SponsorEntityKevin> sponsorEntityKevin;
    
}
