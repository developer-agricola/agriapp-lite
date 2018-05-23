package cl.agriapp.lite.commandside.party.domain.agregates.models.contact

import java.util.Date

case class PartyContact(
                     partyId : Identifier,  //TODO Implementar la estrategia
                     fromDate: Date,
                     thruDate: Date,
                     comments: String
                    )
