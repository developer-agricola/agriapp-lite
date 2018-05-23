package cl.angecom.agriapp.lite.commons.repository.party;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import cl.angecom.agriapp.lite.party.domain.entities.PartyType;

@RepositoryRestResource(collectionResourceRel = "partyType", path = "partyType")
public interface PartyTypeRestRepository extends JpaRepository<PartyType, String> {

}
