package cl.agriapp.lite.commandside.party.domain.agregates.models.producer

case class Producer(
                     producerId : Identifier, //TODO Implementar la estrategia
                     role: Role, // Productor
                     socialIdentifier: SocialIdentifier, // rut o run
                     city : Geo, // ciudad
                     commune: Geo, // comuna
                     province: Geo, // provincia
                     region: Geo, // region
                     country: Geo, // country
                     siteOfProduction : Code, // sdp
                     globalGapNumber: Code // gpp
                    )
