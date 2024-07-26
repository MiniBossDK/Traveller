package dk.palovt.traveller.model

import java.net.URL
import java.util.Locale
import java.util.TimeZone

/**
 *
 * @see <a href="https://gtfs.org/schedule/reference/#agencytxt">GTFS - agency.txt</a>
 */
data class Agency(val agencyId: Int,
                  val agencyName: String,
                  val agencyUrl: URL,
                  val agencyTimezone: TimeZone,
                  val agencyLanguage: Locale,
                  val agencyPhone: String,
                  val agencyFareUrl: URL,
                  val agencyEmail: String)
