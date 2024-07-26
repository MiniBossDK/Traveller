package dk.palovt.traveller.model

import java.net.URL
import java.util.TimeZone

enum class LocationType {
    STOP_OR_PLATFORM,
    STATION,
    ENTRANCE_OR_EXIT,
    GENERIC_NODE,
    BOARDING_AREA,
}

/**
 *
 * @see @see <a href="https://gtfs.org/schedule/reference/#stopstxt">GTFS - stops.txt</a>
 */
data class Stop(val stopId: Int,
                val stopCode: String,
                val ttsStopName: String,
                val stopDesc: String,
                val stopLatitude: Float,
                val stopLongitude: Float,
                val zoneId: Int,
                val stopUrl: URL,
                val locationType: LocationType,
                val parentStation: Int,
                val stopTimeZone: TimeZone,
                val wheelchairBoarding: Int,
                val levelId: Int,
                val platformCode: String) {
}
