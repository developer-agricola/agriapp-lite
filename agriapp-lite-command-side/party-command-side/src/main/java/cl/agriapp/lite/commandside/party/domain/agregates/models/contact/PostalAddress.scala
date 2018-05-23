package cl.agriapp.lite.commandside.party.domain.agregates.models.contact

case class PostalAddress(
                     countryCode: Code,
                     areaCode: Code,
                     contactNumber: String,
                     askForName: String
                    )
