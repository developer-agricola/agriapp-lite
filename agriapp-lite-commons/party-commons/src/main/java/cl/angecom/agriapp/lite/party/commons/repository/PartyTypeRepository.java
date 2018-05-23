package cl.angecom.agriapp.lite.party.commons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import cl.angecom.agriapp.lite.party.domain.entities.PartyType;

@RepositoryRestResource(collectionResourceRel = "partyType", path = "partyType")
public interface PartyTypeRepository extends JpaRepository<PartyType, String> {

}
