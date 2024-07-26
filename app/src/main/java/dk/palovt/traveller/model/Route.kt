package dk.palovt.traveller.model

import java.net.URL

/**
 *
 */
enum class RouteType {
    TRAM,
    SUBWAY,
    RAIL,
    BUS,
    FERRY,
    CABLE_TRAM,
    AERIAL_LIFT,
    FUNICULAR,
    TROLLEYBUS,
    MONORAIL
}

/**
 * https://gtfs.org/schedule/reference/#routestxt
 */
data class Route(val routeId: Int,
                 val agencyId: Int,
                 val routeShortName: String,
                 val routeLongName: String,
                 val routeDesc: String?,
                 val routeType: RouteType,
                 val routeURL: URL?,
                 val routeColor: Color?,
                 val routeTextColor: Color?,
                 val routeSortOrder: UInt?)
