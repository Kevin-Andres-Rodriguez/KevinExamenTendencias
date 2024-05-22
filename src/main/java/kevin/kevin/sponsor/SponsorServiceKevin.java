package kevin.kevin.sponsor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SponsorServiceKevin {

        @Autowired
    private SponsorRepositoryKevin sponsorRepositoryKevin;

    public List<SponsorEntityKevin> getAllSponsor() {
        return sponsorRepositoryKevin.findAll();
    }

    public SponsorEntityKevin createSponsor (SponsorEntityKevin sponsorEntityKevin) {
        return sponsorRepositoryKevin.save(sponsorEntityKevin);
    }

    public SponsorEntityKevin getSponsorById(Long id) {
        return sponsorRepositoryKevin.findById(id).orElseThrow(() -> new RuntimeException("Sponsor not found"));
    }
    

    public SponsorEntityKevin updateSponsor(Long id, SponsorEntityKevin sponsorDetails) {
        SponsorEntityKevin sponsor = sponsorRepositoryKevin.findById(id).orElseThrow(() -> new RuntimeException("Sponsor not found"));

        if (sponsorDetails.getNombre() != null) {
            sponsor.setNombre(sponsorDetails.getNombre());
        }

        return sponsorRepositoryKevin.save(sponsor);
    }

    public void deleteSponsor(Long id) {
        SponsorEntityKevin sponsor = sponsorRepositoryKevin.findById(id).orElseThrow(() -> new RuntimeException("Sponsor not found")); 
        sponsorRepositoryKevin.delete(sponsor);
    }

    public void eliminarPatrocinadorKevin(String nombre) {
        SponsorEntityKevin sponsor = sponsorRepositoryKevin.findByNombre(nombre)
                .orElseThrow(() -> new RuntimeException("Patrocinador no encontrada "));
                sponsorRepositoryKevin.delete(sponsor);

    }







}





