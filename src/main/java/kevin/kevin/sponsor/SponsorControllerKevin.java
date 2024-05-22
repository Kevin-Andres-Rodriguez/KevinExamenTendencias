package kevin.kevin.sponsor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/sponsor")
@Tag(name = "ControllerKevin")
public class SponsorControllerKevin {

        @Autowired
    private SponsorServiceKevin sponsorService;

    @GetMapping
    @Operation(summary = "Verificacion de todos los Datos")
    private List<SponsorEntityKevin> getAllSponsor() {
        return sponsorService.getAllSponsor();
    }

    @PostMapping
    @Operation(summary = "Guarda los datos de Sponsor")
    public SponsorEntityKevin createSponsor(@RequestBody SponsorEntityKevin sponsorEntityKevin) {
        return sponsorService.createSponsor(sponsorEntityKevin);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Verifica el dato mediante el ID")
    public SponsorEntityKevin getSponsorById(@PathVariable("id") Long id) {
        return sponsorService.getSponsorById(id);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Edita los datos mediante el id")
    public SponsorEntityKevin updateSponsor(@PathVariable("id") Long id, @RequestBody SponsorEntityKevin sponsorEntityKevin) {
        return sponsorService.updateSponsor(id, sponsorEntityKevin);
    }
    
    @DeleteMapping("/{id}")
    @Operation(summary = "Elimina los datos mediante el id")
    public ResponseEntity<Void> deleteSponsor(@PathVariable("id") Long id) {
        sponsorService.deleteSponsor(id);
        return ResponseEntity.noContent().build();
    }


    @DeleteMapping("/marca/{nombre}")
    @Operation(summary = "Elimina los datos mediante el nombre")
    public ResponseEntity<Void> eliminarPatrocinador(@PathVariable String nombre) {
        sponsorService.eliminarPatrocinadorKevin(nombre);
        return ResponseEntity.noContent().build();

}





}







