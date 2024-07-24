package dk.palovt.traveller.dao

data class Location(
    val latitude: Float,
    val longitude: Float,
) {
    override fun toString(): String {
        return "Latitude: $latitude | Longitude: $longitude"
    }
}