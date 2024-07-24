package dk.palovt.traveller

import dk.palovt.traveller.dao.Location

/**
 *
 */
enum class LocationType {
    STOP_OR_PLATFORM,
    STATION,
    ENTRANCE_OR_EXIT,
    GENERIC_NODE,
    BOARDING_AREA,
}

/**
 *
 */
data class Station(val id: Int,
                   val name: String,
                   val description: String,
                   val location: Location,
                   val locationType: LocationType, ) {

}