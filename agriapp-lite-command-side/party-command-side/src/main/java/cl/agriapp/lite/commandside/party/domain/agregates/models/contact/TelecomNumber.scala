package cl.agriapp.lite.commandside.party.domain.agregates.models.contact


case class TelecomNumber(
                     countryCode: Code,
                     areaCode: Code,
                     contactNumber: ContactNumber,
                     askForName: String
                    )
