package cl.agriapp.lite.commandside.party.domain.agregates.models.producer

case class Geo(
              geoId : Identifier,
              geoType : Type,
              geoCode : Code,
              abbreviation : String,
              latitude: Double,
              longitude: Double
              )
