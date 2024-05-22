

package kevin.kevin.sponsor;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SponsorRepositoryKevin extends JpaRepository<SponsorEntityKevin, Long> {

    Optional<SponsorEntityKevin> findByNombre(String nombre);
    void deleteByNombre(String nombre);
}
