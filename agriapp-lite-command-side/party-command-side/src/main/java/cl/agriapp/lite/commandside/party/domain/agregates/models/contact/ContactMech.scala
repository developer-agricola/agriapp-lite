package cl.agriapp.lite.commandside.party.domain.agregates.models.contact

case class ContactMech(
                     contactMechId : Identifier, //TODO Implementar la estrategia
                     contactMechType: Type,
                     contactMechFrom : Identifier,
                     contactMechTo: Identifier,
                     partyContact: PartyContact,
                     telecomNumber: TelecomNumber,
                     postalAddress: PostalAddress,

                    )
