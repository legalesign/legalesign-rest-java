// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.user

import com.fasterxml.jackson.annotation.JsonCreator
import com.legalesign.api.core.Enum
import com.legalesign.api.core.JsonField
import com.legalesign.api.errors.LegalesignInvalidDataException

/** List of available timezones */
class TimezoneEnum @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val AFRICA_ABIDJAN = of("Africa/Abidjan")

        @JvmField val AFRICA_ACCRA = of("Africa/Accra")

        @JvmField val AFRICA_ADDIS_ABABA = of("Africa/Addis_Ababa")

        @JvmField val AFRICA_ALGIERS = of("Africa/Algiers")

        @JvmField val AFRICA_ASMARA = of("Africa/Asmara")

        @JvmField val AFRICA_BAMAKO = of("Africa/Bamako")

        @JvmField val AFRICA_BANGUI = of("Africa/Bangui")

        @JvmField val AFRICA_BANJUL = of("Africa/Banjul")

        @JvmField val AFRICA_BISSAU = of("Africa/Bissau")

        @JvmField val AFRICA_BLANTYRE = of("Africa/Blantyre")

        @JvmField val AFRICA_BRAZZAVILLE = of("Africa/Brazzaville")

        @JvmField val AFRICA_BUJUMBURA = of("Africa/Bujumbura")

        @JvmField val AFRICA_CAIRO = of("Africa/Cairo")

        @JvmField val AFRICA_CASABLANCA = of("Africa/Casablanca")

        @JvmField val AFRICA_CEUTA = of("Africa/Ceuta")

        @JvmField val AFRICA_CONAKRY = of("Africa/Conakry")

        @JvmField val AFRICA_DAKAR = of("Africa/Dakar")

        @JvmField val AFRICA_DAR_ES_SALAAM = of("Africa/Dar_es_Salaam")

        @JvmField val AFRICA_DJIBOUTI = of("Africa/Djibouti")

        @JvmField val AFRICA_DOUALA = of("Africa/Douala")

        @JvmField val AFRICA_EL_AAIUN = of("Africa/El_Aaiun")

        @JvmField val AFRICA_FREETOWN = of("Africa/Freetown")

        @JvmField val AFRICA_GABORONE = of("Africa/Gaborone")

        @JvmField val AFRICA_HARARE = of("Africa/Harare")

        @JvmField val AFRICA_JOHANNESBURG = of("Africa/Johannesburg")

        @JvmField val AFRICA_JUBA = of("Africa/Juba")

        @JvmField val AFRICA_KAMPALA = of("Africa/Kampala")

        @JvmField val AFRICA_KHARTOUM = of("Africa/Khartoum")

        @JvmField val AFRICA_KIGALI = of("Africa/Kigali")

        @JvmField val AFRICA_KINSHASA = of("Africa/Kinshasa")

        @JvmField val AFRICA_LAGOS = of("Africa/Lagos")

        @JvmField val AFRICA_LIBREVILLE = of("Africa/Libreville")

        @JvmField val AFRICA_LOME = of("Africa/Lome")

        @JvmField val AFRICA_LUANDA = of("Africa/Luanda")

        @JvmField val AFRICA_LUBUMBASHI = of("Africa/Lubumbashi")

        @JvmField val AFRICA_LUSAKA = of("Africa/Lusaka")

        @JvmField val AFRICA_MALABO = of("Africa/Malabo")

        @JvmField val AFRICA_MAPUTO = of("Africa/Maputo")

        @JvmField val AFRICA_MASERU = of("Africa/Maseru")

        @JvmField val AFRICA_MBABANE = of("Africa/Mbabane")

        @JvmField val AFRICA_MOGADISHU = of("Africa/Mogadishu")

        @JvmField val AFRICA_MONROVIA = of("Africa/Monrovia")

        @JvmField val AFRICA_NAIROBI = of("Africa/Nairobi")

        @JvmField val AFRICA_NDJAMENA = of("Africa/Ndjamena")

        @JvmField val AFRICA_NIAMEY = of("Africa/Niamey")

        @JvmField val AFRICA_NOUAKCHOTT = of("Africa/Nouakchott")

        @JvmField val AFRICA_OUAGADOUGOU = of("Africa/Ouagadougou")

        @JvmField val AFRICA_PORTO_NOVO = of("Africa/Porto-Novo")

        @JvmField val AFRICA_SAO_TOME = of("Africa/Sao_Tome")

        @JvmField val AFRICA_TRIPOLI = of("Africa/Tripoli")

        @JvmField val AFRICA_TUNIS = of("Africa/Tunis")

        @JvmField val AFRICA_WINDHOEK = of("Africa/Windhoek")

        @JvmField val AMERICA_ADAK = of("America/Adak")

        @JvmField val AMERICA_ANCHORAGE = of("America/Anchorage")

        @JvmField val AMERICA_ANGUILLA = of("America/Anguilla")

        @JvmField val AMERICA_ANTIGUA = of("America/Antigua")

        @JvmField val AMERICA_ARAGUAINA = of("America/Araguaina")

        @JvmField val AMERICA_ARGENTINA_BUENOS_AIRES = of("America/Argentina/Buenos_Aires")

        @JvmField val AMERICA_ARGENTINA_CATAMARCA = of("America/Argentina/Catamarca")

        @JvmField val AMERICA_ARGENTINA_CORDOBA = of("America/Argentina/Cordoba")

        @JvmField val AMERICA_ARGENTINA_JUJUY = of("America/Argentina/Jujuy")

        @JvmField val AMERICA_ARGENTINA_LA_RIOJA = of("America/Argentina/La_Rioja")

        @JvmField val AMERICA_ARGENTINA_MENDOZA = of("America/Argentina/Mendoza")

        @JvmField val AMERICA_ARGENTINA_RIO_GALLEGOS = of("America/Argentina/Rio_Gallegos")

        @JvmField val AMERICA_ARGENTINA_SALTA = of("America/Argentina/Salta")

        @JvmField val AMERICA_ARGENTINA_SAN_JUAN = of("America/Argentina/San_Juan")

        @JvmField val AMERICA_ARGENTINA_SAN_LUIS = of("America/Argentina/San_Luis")

        @JvmField val AMERICA_ARGENTINA_TUCUMAN = of("America/Argentina/Tucuman")

        @JvmField val AMERICA_ARGENTINA_USHUAIA = of("America/Argentina/Ushuaia")

        @JvmField val AMERICA_ARUBA = of("America/Aruba")

        @JvmField val AMERICA_ASUNCION = of("America/Asuncion")

        @JvmField val AMERICA_ATIKOKAN = of("America/Atikokan")

        @JvmField val AMERICA_BAHIA = of("America/Bahia")

        @JvmField val AMERICA_BAHIA_BANDERAS = of("America/Bahia_Banderas")

        @JvmField val AMERICA_BARBADOS = of("America/Barbados")

        @JvmField val AMERICA_BELEM = of("America/Belem")

        @JvmField val AMERICA_BELIZE = of("America/Belize")

        @JvmField val AMERICA_BLANC_SABLON = of("America/Blanc-Sablon")

        @JvmField val AMERICA_BOA_VISTA = of("America/Boa_Vista")

        @JvmField val AMERICA_BOGOTA = of("America/Bogota")

        @JvmField val AMERICA_BOISE = of("America/Boise")

        @JvmField val AMERICA_CAMBRIDGE_BAY = of("America/Cambridge_Bay")

        @JvmField val AMERICA_CAMPO_GRANDE = of("America/Campo_Grande")

        @JvmField val AMERICA_CANCUN = of("America/Cancun")

        @JvmField val AMERICA_CARACAS = of("America/Caracas")

        @JvmField val AMERICA_CAYENNE = of("America/Cayenne")

        @JvmField val AMERICA_CAYMAN = of("America/Cayman")

        @JvmField val AMERICA_CHICAGO = of("America/Chicago")

        @JvmField val AMERICA_CHIHUAHUA = of("America/Chihuahua")

        @JvmField val AMERICA_COSTA_RICA = of("America/Costa_Rica")

        @JvmField val AMERICA_CRESTON = of("America/Creston")

        @JvmField val AMERICA_CUIABA = of("America/Cuiaba")

        @JvmField val AMERICA_CURACAO = of("America/Curacao")

        @JvmField val AMERICA_DANMARKSHAVN = of("America/Danmarkshavn")

        @JvmField val AMERICA_DAWSON = of("America/Dawson")

        @JvmField val AMERICA_DAWSON_CREEK = of("America/Dawson_Creek")

        @JvmField val AMERICA_DENVER = of("America/Denver")

        @JvmField val AMERICA_DETROIT = of("America/Detroit")

        @JvmField val AMERICA_DOMINICA = of("America/Dominica")

        @JvmField val AMERICA_EDMONTON = of("America/Edmonton")

        @JvmField val AMERICA_EIRUNEPE = of("America/Eirunepe")

        @JvmField val AMERICA_EL_SALVADOR = of("America/El_Salvador")

        @JvmField val AMERICA_FORTALEZA = of("America/Fortaleza")

        @JvmField val AMERICA_GLACE_BAY = of("America/Glace_Bay")

        @JvmField val AMERICA_GODTHAB = of("America/Godthab")

        @JvmField val AMERICA_GOOSE_BAY = of("America/Goose_Bay")

        @JvmField val AMERICA_GRAND_TURK = of("America/Grand_Turk")

        @JvmField val AMERICA_GRENADA = of("America/Grenada")

        @JvmField val AMERICA_GUADELOUPE = of("America/Guadeloupe")

        @JvmField val AMERICA_GUATEMALA = of("America/Guatemala")

        @JvmField val AMERICA_GUAYAQUIL = of("America/Guayaquil")

        @JvmField val AMERICA_GUYANA = of("America/Guyana")

        @JvmField val AMERICA_HALIFAX = of("America/Halifax")

        @JvmField val AMERICA_HAVANA = of("America/Havana")

        @JvmField val AMERICA_HERMOSILLO = of("America/Hermosillo")

        @JvmField val AMERICA_INDIANA_INDIANAPOLIS = of("America/Indiana/Indianapolis")

        @JvmField val AMERICA_INDIANA_KNOX = of("America/Indiana/Knox")

        @JvmField val AMERICA_INDIANA_MARENGO = of("America/Indiana/Marengo")

        @JvmField val AMERICA_INDIANA_PETERSBURG = of("America/Indiana/Petersburg")

        @JvmField val AMERICA_INDIANA_TELL_CITY = of("America/Indiana/Tell_City")

        @JvmField val AMERICA_INDIANA_VEVAY = of("America/Indiana/Vevay")

        @JvmField val AMERICA_INDIANA_VINCENNES = of("America/Indiana/Vincennes")

        @JvmField val AMERICA_INDIANA_WINAMAC = of("America/Indiana/Winamac")

        @JvmField val AMERICA_INUVIK = of("America/Inuvik")

        @JvmField val AMERICA_IQALUIT = of("America/Iqaluit")

        @JvmField val AMERICA_JAMAICA = of("America/Jamaica")

        @JvmField val AMERICA_JUNEAU = of("America/Juneau")

        @JvmField val AMERICA_KENTUCKY_LOUISVILLE = of("America/Kentucky/Louisville")

        @JvmField val AMERICA_KENTUCKY_MONTICELLO = of("America/Kentucky/Monticello")

        @JvmField val AMERICA_KRALENDIJK = of("America/Kralendijk")

        @JvmField val AMERICA_LA_PAZ = of("America/La_Paz")

        @JvmField val AMERICA_LIMA = of("America/Lima")

        @JvmField val AMERICA_LOS_ANGELES = of("America/Los_Angeles")

        @JvmField val AMERICA_LOWER_PRINCES = of("America/Lower_Princes")

        @JvmField val AMERICA_MACEIO = of("America/Maceio")

        @JvmField val AMERICA_MANAGUA = of("America/Managua")

        @JvmField val AMERICA_MANAUS = of("America/Manaus")

        @JvmField val AMERICA_MARIGOT = of("America/Marigot")

        @JvmField val AMERICA_MARTINIQUE = of("America/Martinique")

        @JvmField val AMERICA_MATAMOROS = of("America/Matamoros")

        @JvmField val AMERICA_MAZATLAN = of("America/Mazatlan")

        @JvmField val AMERICA_MENOMINEE = of("America/Menominee")

        @JvmField val AMERICA_MERIDA = of("America/Merida")

        @JvmField val AMERICA_METLAKATLA = of("America/Metlakatla")

        @JvmField val AMERICA_MEXICO_CITY = of("America/Mexico_City")

        @JvmField val AMERICA_MIQUELON = of("America/Miquelon")

        @JvmField val AMERICA_MONCTON = of("America/Moncton")

        @JvmField val AMERICA_MONTERREY = of("America/Monterrey")

        @JvmField val AMERICA_MONTEVIDEO = of("America/Montevideo")

        @JvmField val AMERICA_MONTREAL = of("America/Montreal")

        @JvmField val AMERICA_MONTSERRAT = of("America/Montserrat")

        @JvmField val AMERICA_NASSAU = of("America/Nassau")

        @JvmField val AMERICA_NEW_YORK = of("America/New_York")

        @JvmField val AMERICA_NIPIGON = of("America/Nipigon")

        @JvmField val AMERICA_NOME = of("America/Nome")

        @JvmField val AMERICA_NORONHA = of("America/Noronha")

        @JvmField val AMERICA_NORTH_DAKOTA_BEULAH = of("America/North_Dakota/Beulah")

        @JvmField val AMERICA_NORTH_DAKOTA_CENTER = of("America/North_Dakota/Center")

        @JvmField val AMERICA_NORTH_DAKOTA_NEW_SALEM = of("America/North_Dakota/New_Salem")

        @JvmField val AMERICA_OJINAGA = of("America/Ojinaga")

        @JvmField val AMERICA_PANAMA = of("America/Panama")

        @JvmField val AMERICA_PANGNIRTUNG = of("America/Pangnirtung")

        @JvmField val AMERICA_PARAMARIBO = of("America/Paramaribo")

        @JvmField val AMERICA_PHOENIX = of("America/Phoenix")

        @JvmField val AMERICA_PORT_AU_PRINCE = of("America/Port-au-Prince")

        @JvmField val AMERICA_PORT_OF_SPAIN = of("America/Port_of_Spain")

        @JvmField val AMERICA_PORTO_VELHO = of("America/Porto_Velho")

        @JvmField val AMERICA_PUERTO_RICO = of("America/Puerto_Rico")

        @JvmField val AMERICA_RAINY_RIVER = of("America/Rainy_River")

        @JvmField val AMERICA_RANKIN_INLET = of("America/Rankin_Inlet")

        @JvmField val AMERICA_RECIFE = of("America/Recife")

        @JvmField val AMERICA_REGINA = of("America/Regina")

        @JvmField val AMERICA_RESOLUTE = of("America/Resolute")

        @JvmField val AMERICA_RIO_BRANCO = of("America/Rio_Branco")

        @JvmField val AMERICA_SANTA_ISABEL = of("America/Santa_Isabel")

        @JvmField val AMERICA_SANTAREM = of("America/Santarem")

        @JvmField val AMERICA_SANTIAGO = of("America/Santiago")

        @JvmField val AMERICA_SANTO_DOMINGO = of("America/Santo_Domingo")

        @JvmField val AMERICA_SAO_PAULO = of("America/Sao_Paulo")

        @JvmField val AMERICA_SCORESBYSUND = of("America/Scoresbysund")

        @JvmField val AMERICA_SHIPROCK = of("America/Shiprock")

        @JvmField val AMERICA_SITKA = of("America/Sitka")

        @JvmField val AMERICA_ST_BARTHELEMY = of("America/St_Barthelemy")

        @JvmField val AMERICA_ST_JOHNS = of("America/St_Johns")

        @JvmField val AMERICA_ST_KITTS = of("America/St_Kitts")

        @JvmField val AMERICA_ST_LUCIA = of("America/St_Lucia")

        @JvmField val AMERICA_ST_THOMAS = of("America/St_Thomas")

        @JvmField val AMERICA_ST_VINCENT = of("America/St_Vincent")

        @JvmField val AMERICA_SWIFT_CURRENT = of("America/Swift_Current")

        @JvmField val AMERICA_TEGUCIGALPA = of("America/Tegucigalpa")

        @JvmField val AMERICA_THULE = of("America/Thule")

        @JvmField val AMERICA_THUNDER_BAY = of("America/Thunder_Bay")

        @JvmField val AMERICA_TIJUANA = of("America/Tijuana")

        @JvmField val AMERICA_TORONTO = of("America/Toronto")

        @JvmField val AMERICA_TORTOLA = of("America/Tortola")

        @JvmField val AMERICA_VANCOUVER = of("America/Vancouver")

        @JvmField val AMERICA_WHITEHORSE = of("America/Whitehorse")

        @JvmField val AMERICA_WINNIPEG = of("America/Winnipeg")

        @JvmField val AMERICA_YAKUTAT = of("America/Yakutat")

        @JvmField val AMERICA_YELLOWKNIFE = of("America/Yellowknife")

        @JvmField val ANTARCTICA_CASEY = of("Antarctica/Casey")

        @JvmField val ANTARCTICA_DAVIS = of("Antarctica/Davis")

        @JvmField val ANTARCTICA_DUMONT_D_URVILLE = of("Antarctica/DumontDUrville")

        @JvmField val ANTARCTICA_MACQUARIE = of("Antarctica/Macquarie")

        @JvmField val ANTARCTICA_MAWSON = of("Antarctica/Mawson")

        @JvmField val ANTARCTICA_MC_MURDO = of("Antarctica/McMurdo")

        @JvmField val ANTARCTICA_PALMER = of("Antarctica/Palmer")

        @JvmField val ANTARCTICA_ROTHERA = of("Antarctica/Rothera")

        @JvmField val ANTARCTICA_SOUTH_POLE = of("Antarctica/South_Pole")

        @JvmField val ANTARCTICA_SYOWA = of("Antarctica/Syowa")

        @JvmField val ANTARCTICA_VOSTOK = of("Antarctica/Vostok")

        @JvmField val ARCTIC_LONGYEARBYEN = of("Arctic/Longyearbyen")

        @JvmField val ASIA_ADEN = of("Asia/Aden")

        @JvmField val ASIA_ALMATY = of("Asia/Almaty")

        @JvmField val ASIA_AMMAN = of("Asia/Amman")

        @JvmField val ASIA_ANADYR = of("Asia/Anadyr")

        @JvmField val ASIA_AQTAU = of("Asia/Aqtau")

        @JvmField val ASIA_AQTOBE = of("Asia/Aqtobe")

        @JvmField val ASIA_ASHGABAT = of("Asia/Ashgabat")

        @JvmField val ASIA_BAGHDAD = of("Asia/Baghdad")

        @JvmField val ASIA_BAHRAIN = of("Asia/Bahrain")

        @JvmField val ASIA_BAKU = of("Asia/Baku")

        @JvmField val ASIA_BANGKOK = of("Asia/Bangkok")

        @JvmField val ASIA_BEIRUT = of("Asia/Beirut")

        @JvmField val ASIA_BISHKEK = of("Asia/Bishkek")

        @JvmField val ASIA_BRUNEI = of("Asia/Brunei")

        @JvmField val ASIA_CHOIBALSAN = of("Asia/Choibalsan")

        @JvmField val ASIA_CHONGQING = of("Asia/Chongqing")

        @JvmField val ASIA_COLOMBO = of("Asia/Colombo")

        @JvmField val ASIA_DAMASCUS = of("Asia/Damascus")

        @JvmField val ASIA_DHAKA = of("Asia/Dhaka")

        @JvmField val ASIA_DILI = of("Asia/Dili")

        @JvmField val ASIA_DUBAI = of("Asia/Dubai")

        @JvmField val ASIA_DUSHANBE = of("Asia/Dushanbe")

        @JvmField val ASIA_GAZA = of("Asia/Gaza")

        @JvmField val ASIA_HARBIN = of("Asia/Harbin")

        @JvmField val ASIA_HEBRON = of("Asia/Hebron")

        @JvmField val ASIA_HO_CHI_MINH = of("Asia/Ho_Chi_Minh")

        @JvmField val ASIA_HONG_KONG = of("Asia/Hong_Kong")

        @JvmField val ASIA_HOVD = of("Asia/Hovd")

        @JvmField val ASIA_IRKUTSK = of("Asia/Irkutsk")

        @JvmField val ASIA_JAKARTA = of("Asia/Jakarta")

        @JvmField val ASIA_JAYAPURA = of("Asia/Jayapura")

        @JvmField val ASIA_JERUSALEM = of("Asia/Jerusalem")

        @JvmField val ASIA_KABUL = of("Asia/Kabul")

        @JvmField val ASIA_KAMCHATKA = of("Asia/Kamchatka")

        @JvmField val ASIA_KARACHI = of("Asia/Karachi")

        @JvmField val ASIA_KASHGAR = of("Asia/Kashgar")

        @JvmField val ASIA_KATHMANDU = of("Asia/Kathmandu")

        @JvmField val ASIA_KOLKATA = of("Asia/Kolkata")

        @JvmField val ASIA_KRASNOYARSK = of("Asia/Krasnoyarsk")

        @JvmField val ASIA_KUALA_LUMPUR = of("Asia/Kuala_Lumpur")

        @JvmField val ASIA_KUCHING = of("Asia/Kuching")

        @JvmField val ASIA_KUWAIT = of("Asia/Kuwait")

        @JvmField val ASIA_MACAU = of("Asia/Macau")

        @JvmField val ASIA_MAGADAN = of("Asia/Magadan")

        @JvmField val ASIA_MAKASSAR = of("Asia/Makassar")

        @JvmField val ASIA_MANILA = of("Asia/Manila")

        @JvmField val ASIA_MUSCAT = of("Asia/Muscat")

        @JvmField val ASIA_NICOSIA = of("Asia/Nicosia")

        @JvmField val ASIA_NOVOKUZNETSK = of("Asia/Novokuznetsk")

        @JvmField val ASIA_NOVOSIBIRSK = of("Asia/Novosibirsk")

        @JvmField val ASIA_OMSK = of("Asia/Omsk")

        @JvmField val ASIA_ORAL = of("Asia/Oral")

        @JvmField val ASIA_PHNOM_PENH = of("Asia/Phnom_Penh")

        @JvmField val ASIA_PONTIANAK = of("Asia/Pontianak")

        @JvmField val ASIA_PYONGYANG = of("Asia/Pyongyang")

        @JvmField val ASIA_QATAR = of("Asia/Qatar")

        @JvmField val ASIA_QYZYLORDA = of("Asia/Qyzylorda")

        @JvmField val ASIA_RANGOON = of("Asia/Rangoon")

        @JvmField val ASIA_RIYADH = of("Asia/Riyadh")

        @JvmField val ASIA_SAKHALIN = of("Asia/Sakhalin")

        @JvmField val ASIA_SAMARKAND = of("Asia/Samarkand")

        @JvmField val ASIA_SEOUL = of("Asia/Seoul")

        @JvmField val ASIA_SHANGHAI = of("Asia/Shanghai")

        @JvmField val ASIA_SINGAPORE = of("Asia/Singapore")

        @JvmField val ASIA_TAIPEI = of("Asia/Taipei")

        @JvmField val ASIA_TASHKENT = of("Asia/Tashkent")

        @JvmField val ASIA_TBILISI = of("Asia/Tbilisi")

        @JvmField val ASIA_TEHRAN = of("Asia/Tehran")

        @JvmField val ASIA_THIMPHU = of("Asia/Thimphu")

        @JvmField val ASIA_TOKYO = of("Asia/Tokyo")

        @JvmField val ASIA_ULAANBAATAR = of("Asia/Ulaanbaatar")

        @JvmField val ASIA_URUMQI = of("Asia/Urumqi")

        @JvmField val ASIA_VIENTIANE = of("Asia/Vientiane")

        @JvmField val ASIA_VLADIVOSTOK = of("Asia/Vladivostok")

        @JvmField val ASIA_YAKUTSK = of("Asia/Yakutsk")

        @JvmField val ASIA_YEKATERINBURG = of("Asia/Yekaterinburg")

        @JvmField val ASIA_YEREVAN = of("Asia/Yerevan")

        @JvmField val ATLANTIC_AZORES = of("Atlantic/Azores")

        @JvmField val ATLANTIC_BERMUDA = of("Atlantic/Bermuda")

        @JvmField val ATLANTIC_CANARY = of("Atlantic/Canary")

        @JvmField val ATLANTIC_CAPE_VERDE = of("Atlantic/Cape_Verde")

        @JvmField val ATLANTIC_FAROE = of("Atlantic/Faroe")

        @JvmField val ATLANTIC_MADEIRA = of("Atlantic/Madeira")

        @JvmField val ATLANTIC_REYKJAVIK = of("Atlantic/Reykjavik")

        @JvmField val ATLANTIC_SOUTH_GEORGIA = of("Atlantic/South_Georgia")

        @JvmField val ATLANTIC_ST_HELENA = of("Atlantic/St_Helena")

        @JvmField val ATLANTIC_STANLEY = of("Atlantic/Stanley")

        @JvmField val AUSTRALIA_ADELAIDE = of("Australia/Adelaide")

        @JvmField val AUSTRALIA_BRISBANE = of("Australia/Brisbane")

        @JvmField val AUSTRALIA_BROKEN_HILL = of("Australia/Broken_Hill")

        @JvmField val AUSTRALIA_CURRIE = of("Australia/Currie")

        @JvmField val AUSTRALIA_DARWIN = of("Australia/Darwin")

        @JvmField val AUSTRALIA_EUCLA = of("Australia/Eucla")

        @JvmField val AUSTRALIA_HOBART = of("Australia/Hobart")

        @JvmField val AUSTRALIA_LINDEMAN = of("Australia/Lindeman")

        @JvmField val AUSTRALIA_LORD_HOWE = of("Australia/Lord_Howe")

        @JvmField val AUSTRALIA_MELBOURNE = of("Australia/Melbourne")

        @JvmField val AUSTRALIA_PERTH = of("Australia/Perth")

        @JvmField val AUSTRALIA_SYDNEY = of("Australia/Sydney")

        @JvmField val CANADA_ATLANTIC = of("Canada/Atlantic")

        @JvmField val CANADA_CENTRAL = of("Canada/Central")

        @JvmField val CANADA_EASTERN = of("Canada/Eastern")

        @JvmField val CANADA_MOUNTAIN = of("Canada/Mountain")

        @JvmField val CANADA_NEWFOUNDLAND = of("Canada/Newfoundland")

        @JvmField val CANADA_PACIFIC = of("Canada/Pacific")

        @JvmField val EUROPE_AMSTERDAM = of("Europe/Amsterdam")

        @JvmField val EUROPE_ANDORRA = of("Europe/Andorra")

        @JvmField val EUROPE_ATHENS = of("Europe/Athens")

        @JvmField val EUROPE_BELGRADE = of("Europe/Belgrade")

        @JvmField val EUROPE_BERLIN = of("Europe/Berlin")

        @JvmField val EUROPE_BRATISLAVA = of("Europe/Bratislava")

        @JvmField val EUROPE_BRUSSELS = of("Europe/Brussels")

        @JvmField val EUROPE_BUCHAREST = of("Europe/Bucharest")

        @JvmField val EUROPE_BUDAPEST = of("Europe/Budapest")

        @JvmField val EUROPE_CHISINAU = of("Europe/Chisinau")

        @JvmField val EUROPE_COPENHAGEN = of("Europe/Copenhagen")

        @JvmField val EUROPE_DUBLIN = of("Europe/Dublin")

        @JvmField val EUROPE_GIBRALTAR = of("Europe/Gibraltar")

        @JvmField val EUROPE_GUERNSEY = of("Europe/Guernsey")

        @JvmField val EUROPE_HELSINKI = of("Europe/Helsinki")

        @JvmField val EUROPE_ISLE_OF_MAN = of("Europe/Isle_of_Man")

        @JvmField val EUROPE_ISTANBUL = of("Europe/Istanbul")

        @JvmField val EUROPE_JERSEY = of("Europe/Jersey")

        @JvmField val EUROPE_KALININGRAD = of("Europe/Kaliningrad")

        @JvmField val EUROPE_KIEV = of("Europe/Kiev")

        @JvmField val EUROPE_LISBON = of("Europe/Lisbon")

        @JvmField val EUROPE_LJUBLJANA = of("Europe/Ljubljana")

        @JvmField val EUROPE_LONDON = of("Europe/London")

        @JvmField val EUROPE_LUXEMBOURG = of("Europe/Luxembourg")

        @JvmField val EUROPE_MADRID = of("Europe/Madrid")

        @JvmField val EUROPE_MALTA = of("Europe/Malta")

        @JvmField val EUROPE_MARIEHAMN = of("Europe/Mariehamn")

        @JvmField val EUROPE_MINSK = of("Europe/Minsk")

        @JvmField val EUROPE_MONACO = of("Europe/Monaco")

        @JvmField val EUROPE_MOSCOW = of("Europe/Moscow")

        @JvmField val EUROPE_OSLO = of("Europe/Oslo")

        @JvmField val EUROPE_PARIS = of("Europe/Paris")

        @JvmField val EUROPE_PODGORICA = of("Europe/Podgorica")

        @JvmField val EUROPE_PRAGUE = of("Europe/Prague")

        @JvmField val EUROPE_RIGA = of("Europe/Riga")

        @JvmField val EUROPE_ROME = of("Europe/Rome")

        @JvmField val EUROPE_SAMARA = of("Europe/Samara")

        @JvmField val EUROPE_SAN_MARINO = of("Europe/San_Marino")

        @JvmField val EUROPE_SARAJEVO = of("Europe/Sarajevo")

        @JvmField val EUROPE_SIMFEROPOL = of("Europe/Simferopol")

        @JvmField val EUROPE_SKOPJE = of("Europe/Skopje")

        @JvmField val EUROPE_SOFIA = of("Europe/Sofia")

        @JvmField val EUROPE_STOCKHOLM = of("Europe/Stockholm")

        @JvmField val EUROPE_TALLINN = of("Europe/Tallinn")

        @JvmField val EUROPE_TIRANE = of("Europe/Tirane")

        @JvmField val EUROPE_UZHGOROD = of("Europe/Uzhgorod")

        @JvmField val EUROPE_VADUZ = of("Europe/Vaduz")

        @JvmField val EUROPE_VATICAN = of("Europe/Vatican")

        @JvmField val EUROPE_VIENNA = of("Europe/Vienna")

        @JvmField val EUROPE_VILNIUS = of("Europe/Vilnius")

        @JvmField val EUROPE_VOLGOGRAD = of("Europe/Volgograd")

        @JvmField val EUROPE_WARSAW = of("Europe/Warsaw")

        @JvmField val EUROPE_ZAGREB = of("Europe/Zagreb")

        @JvmField val EUROPE_ZAPOROZHYE = of("Europe/Zaporozhye")

        @JvmField val EUROPE_ZURICH = of("Europe/Zurich")

        @JvmField val GMT = of("GMT")

        @JvmField val INDIAN_ANTANANARIVO = of("Indian/Antananarivo")

        @JvmField val INDIAN_CHAGOS = of("Indian/Chagos")

        @JvmField val INDIAN_CHRISTMAS = of("Indian/Christmas")

        @JvmField val INDIAN_COCOS = of("Indian/Cocos")

        @JvmField val INDIAN_COMORO = of("Indian/Comoro")

        @JvmField val INDIAN_KERGUELEN = of("Indian/Kerguelen")

        @JvmField val INDIAN_MAHE = of("Indian/Mahe")

        @JvmField val INDIAN_MALDIVES = of("Indian/Maldives")

        @JvmField val INDIAN_MAURITIUS = of("Indian/Mauritius")

        @JvmField val INDIAN_MAYOTTE = of("Indian/Mayotte")

        @JvmField val INDIAN_REUNION = of("Indian/Reunion")

        @JvmField val PACIFIC_APIA = of("Pacific/Apia")

        @JvmField val PACIFIC_AUCKLAND = of("Pacific/Auckland")

        @JvmField val PACIFIC_CHATHAM = of("Pacific/Chatham")

        @JvmField val PACIFIC_CHUUK = of("Pacific/Chuuk")

        @JvmField val PACIFIC_EASTER = of("Pacific/Easter")

        @JvmField val PACIFIC_EFATE = of("Pacific/Efate")

        @JvmField val PACIFIC_ENDERBURY = of("Pacific/Enderbury")

        @JvmField val PACIFIC_FAKAOFO = of("Pacific/Fakaofo")

        @JvmField val PACIFIC_FIJI = of("Pacific/Fiji")

        @JvmField val PACIFIC_FUNAFUTI = of("Pacific/Funafuti")

        @JvmField val PACIFIC_GALAPAGOS = of("Pacific/Galapagos")

        @JvmField val PACIFIC_GAMBIER = of("Pacific/Gambier")

        @JvmField val PACIFIC_GUADALCANAL = of("Pacific/Guadalcanal")

        @JvmField val PACIFIC_GUAM = of("Pacific/Guam")

        @JvmField val PACIFIC_HONOLULU = of("Pacific/Honolulu")

        @JvmField val PACIFIC_JOHNSTON = of("Pacific/Johnston")

        @JvmField val PACIFIC_KIRITIMATI = of("Pacific/Kiritimati")

        @JvmField val PACIFIC_KOSRAE = of("Pacific/Kosrae")

        @JvmField val PACIFIC_KWAJALEIN = of("Pacific/Kwajalein")

        @JvmField val PACIFIC_MAJURO = of("Pacific/Majuro")

        @JvmField val PACIFIC_MARQUESAS = of("Pacific/Marquesas")

        @JvmField val PACIFIC_MIDWAY = of("Pacific/Midway")

        @JvmField val PACIFIC_NAURU = of("Pacific/Nauru")

        @JvmField val PACIFIC_NIUE = of("Pacific/Niue")

        @JvmField val PACIFIC_NORFOLK = of("Pacific/Norfolk")

        @JvmField val PACIFIC_NOUMEA = of("Pacific/Noumea")

        @JvmField val PACIFIC_PAGO_PAGO = of("Pacific/Pago_Pago")

        @JvmField val PACIFIC_PALAU = of("Pacific/Palau")

        @JvmField val PACIFIC_PITCAIRN = of("Pacific/Pitcairn")

        @JvmField val PACIFIC_POHNPEI = of("Pacific/Pohnpei")

        @JvmField val PACIFIC_PORT_MORESBY = of("Pacific/Port_Moresby")

        @JvmField val PACIFIC_RAROTONGA = of("Pacific/Rarotonga")

        @JvmField val PACIFIC_SAIPAN = of("Pacific/Saipan")

        @JvmField val PACIFIC_TAHITI = of("Pacific/Tahiti")

        @JvmField val PACIFIC_TARAWA = of("Pacific/Tarawa")

        @JvmField val PACIFIC_TONGATAPU = of("Pacific/Tongatapu")

        @JvmField val PACIFIC_WAKE = of("Pacific/Wake")

        @JvmField val PACIFIC_WALLIS = of("Pacific/Wallis")

        @JvmField val US_ALASKA = of("US/Alaska")

        @JvmField val US_ARIZONA = of("US/Arizona")

        @JvmField val US_CENTRAL = of("US/Central")

        @JvmField val US_EASTERN = of("US/Eastern")

        @JvmField val US_HAWAII = of("US/Hawaii")

        @JvmField val US_MOUNTAIN = of("US/Mountain")

        @JvmField val US_PACIFIC = of("US/Pacific")

        @JvmField val UTC = of("UTC")

        @JvmStatic fun of(value: String) = TimezoneEnum(JsonField.of(value))
    }

    /** An enum containing [TimezoneEnum]'s known values. */
    enum class Known {
        AFRICA_ABIDJAN,
        AFRICA_ACCRA,
        AFRICA_ADDIS_ABABA,
        AFRICA_ALGIERS,
        AFRICA_ASMARA,
        AFRICA_BAMAKO,
        AFRICA_BANGUI,
        AFRICA_BANJUL,
        AFRICA_BISSAU,
        AFRICA_BLANTYRE,
        AFRICA_BRAZZAVILLE,
        AFRICA_BUJUMBURA,
        AFRICA_CAIRO,
        AFRICA_CASABLANCA,
        AFRICA_CEUTA,
        AFRICA_CONAKRY,
        AFRICA_DAKAR,
        AFRICA_DAR_ES_SALAAM,
        AFRICA_DJIBOUTI,
        AFRICA_DOUALA,
        AFRICA_EL_AAIUN,
        AFRICA_FREETOWN,
        AFRICA_GABORONE,
        AFRICA_HARARE,
        AFRICA_JOHANNESBURG,
        AFRICA_JUBA,
        AFRICA_KAMPALA,
        AFRICA_KHARTOUM,
        AFRICA_KIGALI,
        AFRICA_KINSHASA,
        AFRICA_LAGOS,
        AFRICA_LIBREVILLE,
        AFRICA_LOME,
        AFRICA_LUANDA,
        AFRICA_LUBUMBASHI,
        AFRICA_LUSAKA,
        AFRICA_MALABO,
        AFRICA_MAPUTO,
        AFRICA_MASERU,
        AFRICA_MBABANE,
        AFRICA_MOGADISHU,
        AFRICA_MONROVIA,
        AFRICA_NAIROBI,
        AFRICA_NDJAMENA,
        AFRICA_NIAMEY,
        AFRICA_NOUAKCHOTT,
        AFRICA_OUAGADOUGOU,
        AFRICA_PORTO_NOVO,
        AFRICA_SAO_TOME,
        AFRICA_TRIPOLI,
        AFRICA_TUNIS,
        AFRICA_WINDHOEK,
        AMERICA_ADAK,
        AMERICA_ANCHORAGE,
        AMERICA_ANGUILLA,
        AMERICA_ANTIGUA,
        AMERICA_ARAGUAINA,
        AMERICA_ARGENTINA_BUENOS_AIRES,
        AMERICA_ARGENTINA_CATAMARCA,
        AMERICA_ARGENTINA_CORDOBA,
        AMERICA_ARGENTINA_JUJUY,
        AMERICA_ARGENTINA_LA_RIOJA,
        AMERICA_ARGENTINA_MENDOZA,
        AMERICA_ARGENTINA_RIO_GALLEGOS,
        AMERICA_ARGENTINA_SALTA,
        AMERICA_ARGENTINA_SAN_JUAN,
        AMERICA_ARGENTINA_SAN_LUIS,
        AMERICA_ARGENTINA_TUCUMAN,
        AMERICA_ARGENTINA_USHUAIA,
        AMERICA_ARUBA,
        AMERICA_ASUNCION,
        AMERICA_ATIKOKAN,
        AMERICA_BAHIA,
        AMERICA_BAHIA_BANDERAS,
        AMERICA_BARBADOS,
        AMERICA_BELEM,
        AMERICA_BELIZE,
        AMERICA_BLANC_SABLON,
        AMERICA_BOA_VISTA,
        AMERICA_BOGOTA,
        AMERICA_BOISE,
        AMERICA_CAMBRIDGE_BAY,
        AMERICA_CAMPO_GRANDE,
        AMERICA_CANCUN,
        AMERICA_CARACAS,
        AMERICA_CAYENNE,
        AMERICA_CAYMAN,
        AMERICA_CHICAGO,
        AMERICA_CHIHUAHUA,
        AMERICA_COSTA_RICA,
        AMERICA_CRESTON,
        AMERICA_CUIABA,
        AMERICA_CURACAO,
        AMERICA_DANMARKSHAVN,
        AMERICA_DAWSON,
        AMERICA_DAWSON_CREEK,
        AMERICA_DENVER,
        AMERICA_DETROIT,
        AMERICA_DOMINICA,
        AMERICA_EDMONTON,
        AMERICA_EIRUNEPE,
        AMERICA_EL_SALVADOR,
        AMERICA_FORTALEZA,
        AMERICA_GLACE_BAY,
        AMERICA_GODTHAB,
        AMERICA_GOOSE_BAY,
        AMERICA_GRAND_TURK,
        AMERICA_GRENADA,
        AMERICA_GUADELOUPE,
        AMERICA_GUATEMALA,
        AMERICA_GUAYAQUIL,
        AMERICA_GUYANA,
        AMERICA_HALIFAX,
        AMERICA_HAVANA,
        AMERICA_HERMOSILLO,
        AMERICA_INDIANA_INDIANAPOLIS,
        AMERICA_INDIANA_KNOX,
        AMERICA_INDIANA_MARENGO,
        AMERICA_INDIANA_PETERSBURG,
        AMERICA_INDIANA_TELL_CITY,
        AMERICA_INDIANA_VEVAY,
        AMERICA_INDIANA_VINCENNES,
        AMERICA_INDIANA_WINAMAC,
        AMERICA_INUVIK,
        AMERICA_IQALUIT,
        AMERICA_JAMAICA,
        AMERICA_JUNEAU,
        AMERICA_KENTUCKY_LOUISVILLE,
        AMERICA_KENTUCKY_MONTICELLO,
        AMERICA_KRALENDIJK,
        AMERICA_LA_PAZ,
        AMERICA_LIMA,
        AMERICA_LOS_ANGELES,
        AMERICA_LOWER_PRINCES,
        AMERICA_MACEIO,
        AMERICA_MANAGUA,
        AMERICA_MANAUS,
        AMERICA_MARIGOT,
        AMERICA_MARTINIQUE,
        AMERICA_MATAMOROS,
        AMERICA_MAZATLAN,
        AMERICA_MENOMINEE,
        AMERICA_MERIDA,
        AMERICA_METLAKATLA,
        AMERICA_MEXICO_CITY,
        AMERICA_MIQUELON,
        AMERICA_MONCTON,
        AMERICA_MONTERREY,
        AMERICA_MONTEVIDEO,
        AMERICA_MONTREAL,
        AMERICA_MONTSERRAT,
        AMERICA_NASSAU,
        AMERICA_NEW_YORK,
        AMERICA_NIPIGON,
        AMERICA_NOME,
        AMERICA_NORONHA,
        AMERICA_NORTH_DAKOTA_BEULAH,
        AMERICA_NORTH_DAKOTA_CENTER,
        AMERICA_NORTH_DAKOTA_NEW_SALEM,
        AMERICA_OJINAGA,
        AMERICA_PANAMA,
        AMERICA_PANGNIRTUNG,
        AMERICA_PARAMARIBO,
        AMERICA_PHOENIX,
        AMERICA_PORT_AU_PRINCE,
        AMERICA_PORT_OF_SPAIN,
        AMERICA_PORTO_VELHO,
        AMERICA_PUERTO_RICO,
        AMERICA_RAINY_RIVER,
        AMERICA_RANKIN_INLET,
        AMERICA_RECIFE,
        AMERICA_REGINA,
        AMERICA_RESOLUTE,
        AMERICA_RIO_BRANCO,
        AMERICA_SANTA_ISABEL,
        AMERICA_SANTAREM,
        AMERICA_SANTIAGO,
        AMERICA_SANTO_DOMINGO,
        AMERICA_SAO_PAULO,
        AMERICA_SCORESBYSUND,
        AMERICA_SHIPROCK,
        AMERICA_SITKA,
        AMERICA_ST_BARTHELEMY,
        AMERICA_ST_JOHNS,
        AMERICA_ST_KITTS,
        AMERICA_ST_LUCIA,
        AMERICA_ST_THOMAS,
        AMERICA_ST_VINCENT,
        AMERICA_SWIFT_CURRENT,
        AMERICA_TEGUCIGALPA,
        AMERICA_THULE,
        AMERICA_THUNDER_BAY,
        AMERICA_TIJUANA,
        AMERICA_TORONTO,
        AMERICA_TORTOLA,
        AMERICA_VANCOUVER,
        AMERICA_WHITEHORSE,
        AMERICA_WINNIPEG,
        AMERICA_YAKUTAT,
        AMERICA_YELLOWKNIFE,
        ANTARCTICA_CASEY,
        ANTARCTICA_DAVIS,
        ANTARCTICA_DUMONT_D_URVILLE,
        ANTARCTICA_MACQUARIE,
        ANTARCTICA_MAWSON,
        ANTARCTICA_MC_MURDO,
        ANTARCTICA_PALMER,
        ANTARCTICA_ROTHERA,
        ANTARCTICA_SOUTH_POLE,
        ANTARCTICA_SYOWA,
        ANTARCTICA_VOSTOK,
        ARCTIC_LONGYEARBYEN,
        ASIA_ADEN,
        ASIA_ALMATY,
        ASIA_AMMAN,
        ASIA_ANADYR,
        ASIA_AQTAU,
        ASIA_AQTOBE,
        ASIA_ASHGABAT,
        ASIA_BAGHDAD,
        ASIA_BAHRAIN,
        ASIA_BAKU,
        ASIA_BANGKOK,
        ASIA_BEIRUT,
        ASIA_BISHKEK,
        ASIA_BRUNEI,
        ASIA_CHOIBALSAN,
        ASIA_CHONGQING,
        ASIA_COLOMBO,
        ASIA_DAMASCUS,
        ASIA_DHAKA,
        ASIA_DILI,
        ASIA_DUBAI,
        ASIA_DUSHANBE,
        ASIA_GAZA,
        ASIA_HARBIN,
        ASIA_HEBRON,
        ASIA_HO_CHI_MINH,
        ASIA_HONG_KONG,
        ASIA_HOVD,
        ASIA_IRKUTSK,
        ASIA_JAKARTA,
        ASIA_JAYAPURA,
        ASIA_JERUSALEM,
        ASIA_KABUL,
        ASIA_KAMCHATKA,
        ASIA_KARACHI,
        ASIA_KASHGAR,
        ASIA_KATHMANDU,
        ASIA_KOLKATA,
        ASIA_KRASNOYARSK,
        ASIA_KUALA_LUMPUR,
        ASIA_KUCHING,
        ASIA_KUWAIT,
        ASIA_MACAU,
        ASIA_MAGADAN,
        ASIA_MAKASSAR,
        ASIA_MANILA,
        ASIA_MUSCAT,
        ASIA_NICOSIA,
        ASIA_NOVOKUZNETSK,
        ASIA_NOVOSIBIRSK,
        ASIA_OMSK,
        ASIA_ORAL,
        ASIA_PHNOM_PENH,
        ASIA_PONTIANAK,
        ASIA_PYONGYANG,
        ASIA_QATAR,
        ASIA_QYZYLORDA,
        ASIA_RANGOON,
        ASIA_RIYADH,
        ASIA_SAKHALIN,
        ASIA_SAMARKAND,
        ASIA_SEOUL,
        ASIA_SHANGHAI,
        ASIA_SINGAPORE,
        ASIA_TAIPEI,
        ASIA_TASHKENT,
        ASIA_TBILISI,
        ASIA_TEHRAN,
        ASIA_THIMPHU,
        ASIA_TOKYO,
        ASIA_ULAANBAATAR,
        ASIA_URUMQI,
        ASIA_VIENTIANE,
        ASIA_VLADIVOSTOK,
        ASIA_YAKUTSK,
        ASIA_YEKATERINBURG,
        ASIA_YEREVAN,
        ATLANTIC_AZORES,
        ATLANTIC_BERMUDA,
        ATLANTIC_CANARY,
        ATLANTIC_CAPE_VERDE,
        ATLANTIC_FAROE,
        ATLANTIC_MADEIRA,
        ATLANTIC_REYKJAVIK,
        ATLANTIC_SOUTH_GEORGIA,
        ATLANTIC_ST_HELENA,
        ATLANTIC_STANLEY,
        AUSTRALIA_ADELAIDE,
        AUSTRALIA_BRISBANE,
        AUSTRALIA_BROKEN_HILL,
        AUSTRALIA_CURRIE,
        AUSTRALIA_DARWIN,
        AUSTRALIA_EUCLA,
        AUSTRALIA_HOBART,
        AUSTRALIA_LINDEMAN,
        AUSTRALIA_LORD_HOWE,
        AUSTRALIA_MELBOURNE,
        AUSTRALIA_PERTH,
        AUSTRALIA_SYDNEY,
        CANADA_ATLANTIC,
        CANADA_CENTRAL,
        CANADA_EASTERN,
        CANADA_MOUNTAIN,
        CANADA_NEWFOUNDLAND,
        CANADA_PACIFIC,
        EUROPE_AMSTERDAM,
        EUROPE_ANDORRA,
        EUROPE_ATHENS,
        EUROPE_BELGRADE,
        EUROPE_BERLIN,
        EUROPE_BRATISLAVA,
        EUROPE_BRUSSELS,
        EUROPE_BUCHAREST,
        EUROPE_BUDAPEST,
        EUROPE_CHISINAU,
        EUROPE_COPENHAGEN,
        EUROPE_DUBLIN,
        EUROPE_GIBRALTAR,
        EUROPE_GUERNSEY,
        EUROPE_HELSINKI,
        EUROPE_ISLE_OF_MAN,
        EUROPE_ISTANBUL,
        EUROPE_JERSEY,
        EUROPE_KALININGRAD,
        EUROPE_KIEV,
        EUROPE_LISBON,
        EUROPE_LJUBLJANA,
        EUROPE_LONDON,
        EUROPE_LUXEMBOURG,
        EUROPE_MADRID,
        EUROPE_MALTA,
        EUROPE_MARIEHAMN,
        EUROPE_MINSK,
        EUROPE_MONACO,
        EUROPE_MOSCOW,
        EUROPE_OSLO,
        EUROPE_PARIS,
        EUROPE_PODGORICA,
        EUROPE_PRAGUE,
        EUROPE_RIGA,
        EUROPE_ROME,
        EUROPE_SAMARA,
        EUROPE_SAN_MARINO,
        EUROPE_SARAJEVO,
        EUROPE_SIMFEROPOL,
        EUROPE_SKOPJE,
        EUROPE_SOFIA,
        EUROPE_STOCKHOLM,
        EUROPE_TALLINN,
        EUROPE_TIRANE,
        EUROPE_UZHGOROD,
        EUROPE_VADUZ,
        EUROPE_VATICAN,
        EUROPE_VIENNA,
        EUROPE_VILNIUS,
        EUROPE_VOLGOGRAD,
        EUROPE_WARSAW,
        EUROPE_ZAGREB,
        EUROPE_ZAPOROZHYE,
        EUROPE_ZURICH,
        GMT,
        INDIAN_ANTANANARIVO,
        INDIAN_CHAGOS,
        INDIAN_CHRISTMAS,
        INDIAN_COCOS,
        INDIAN_COMORO,
        INDIAN_KERGUELEN,
        INDIAN_MAHE,
        INDIAN_MALDIVES,
        INDIAN_MAURITIUS,
        INDIAN_MAYOTTE,
        INDIAN_REUNION,
        PACIFIC_APIA,
        PACIFIC_AUCKLAND,
        PACIFIC_CHATHAM,
        PACIFIC_CHUUK,
        PACIFIC_EASTER,
        PACIFIC_EFATE,
        PACIFIC_ENDERBURY,
        PACIFIC_FAKAOFO,
        PACIFIC_FIJI,
        PACIFIC_FUNAFUTI,
        PACIFIC_GALAPAGOS,
        PACIFIC_GAMBIER,
        PACIFIC_GUADALCANAL,
        PACIFIC_GUAM,
        PACIFIC_HONOLULU,
        PACIFIC_JOHNSTON,
        PACIFIC_KIRITIMATI,
        PACIFIC_KOSRAE,
        PACIFIC_KWAJALEIN,
        PACIFIC_MAJURO,
        PACIFIC_MARQUESAS,
        PACIFIC_MIDWAY,
        PACIFIC_NAURU,
        PACIFIC_NIUE,
        PACIFIC_NORFOLK,
        PACIFIC_NOUMEA,
        PACIFIC_PAGO_PAGO,
        PACIFIC_PALAU,
        PACIFIC_PITCAIRN,
        PACIFIC_POHNPEI,
        PACIFIC_PORT_MORESBY,
        PACIFIC_RAROTONGA,
        PACIFIC_SAIPAN,
        PACIFIC_TAHITI,
        PACIFIC_TARAWA,
        PACIFIC_TONGATAPU,
        PACIFIC_WAKE,
        PACIFIC_WALLIS,
        US_ALASKA,
        US_ARIZONA,
        US_CENTRAL,
        US_EASTERN,
        US_HAWAII,
        US_MOUNTAIN,
        US_PACIFIC,
        UTC,
    }

    /**
     * An enum containing [TimezoneEnum]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [TimezoneEnum] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        AFRICA_ABIDJAN,
        AFRICA_ACCRA,
        AFRICA_ADDIS_ABABA,
        AFRICA_ALGIERS,
        AFRICA_ASMARA,
        AFRICA_BAMAKO,
        AFRICA_BANGUI,
        AFRICA_BANJUL,
        AFRICA_BISSAU,
        AFRICA_BLANTYRE,
        AFRICA_BRAZZAVILLE,
        AFRICA_BUJUMBURA,
        AFRICA_CAIRO,
        AFRICA_CASABLANCA,
        AFRICA_CEUTA,
        AFRICA_CONAKRY,
        AFRICA_DAKAR,
        AFRICA_DAR_ES_SALAAM,
        AFRICA_DJIBOUTI,
        AFRICA_DOUALA,
        AFRICA_EL_AAIUN,
        AFRICA_FREETOWN,
        AFRICA_GABORONE,
        AFRICA_HARARE,
        AFRICA_JOHANNESBURG,
        AFRICA_JUBA,
        AFRICA_KAMPALA,
        AFRICA_KHARTOUM,
        AFRICA_KIGALI,
        AFRICA_KINSHASA,
        AFRICA_LAGOS,
        AFRICA_LIBREVILLE,
        AFRICA_LOME,
        AFRICA_LUANDA,
        AFRICA_LUBUMBASHI,
        AFRICA_LUSAKA,
        AFRICA_MALABO,
        AFRICA_MAPUTO,
        AFRICA_MASERU,
        AFRICA_MBABANE,
        AFRICA_MOGADISHU,
        AFRICA_MONROVIA,
        AFRICA_NAIROBI,
        AFRICA_NDJAMENA,
        AFRICA_NIAMEY,
        AFRICA_NOUAKCHOTT,
        AFRICA_OUAGADOUGOU,
        AFRICA_PORTO_NOVO,
        AFRICA_SAO_TOME,
        AFRICA_TRIPOLI,
        AFRICA_TUNIS,
        AFRICA_WINDHOEK,
        AMERICA_ADAK,
        AMERICA_ANCHORAGE,
        AMERICA_ANGUILLA,
        AMERICA_ANTIGUA,
        AMERICA_ARAGUAINA,
        AMERICA_ARGENTINA_BUENOS_AIRES,
        AMERICA_ARGENTINA_CATAMARCA,
        AMERICA_ARGENTINA_CORDOBA,
        AMERICA_ARGENTINA_JUJUY,
        AMERICA_ARGENTINA_LA_RIOJA,
        AMERICA_ARGENTINA_MENDOZA,
        AMERICA_ARGENTINA_RIO_GALLEGOS,
        AMERICA_ARGENTINA_SALTA,
        AMERICA_ARGENTINA_SAN_JUAN,
        AMERICA_ARGENTINA_SAN_LUIS,
        AMERICA_ARGENTINA_TUCUMAN,
        AMERICA_ARGENTINA_USHUAIA,
        AMERICA_ARUBA,
        AMERICA_ASUNCION,
        AMERICA_ATIKOKAN,
        AMERICA_BAHIA,
        AMERICA_BAHIA_BANDERAS,
        AMERICA_BARBADOS,
        AMERICA_BELEM,
        AMERICA_BELIZE,
        AMERICA_BLANC_SABLON,
        AMERICA_BOA_VISTA,
        AMERICA_BOGOTA,
        AMERICA_BOISE,
        AMERICA_CAMBRIDGE_BAY,
        AMERICA_CAMPO_GRANDE,
        AMERICA_CANCUN,
        AMERICA_CARACAS,
        AMERICA_CAYENNE,
        AMERICA_CAYMAN,
        AMERICA_CHICAGO,
        AMERICA_CHIHUAHUA,
        AMERICA_COSTA_RICA,
        AMERICA_CRESTON,
        AMERICA_CUIABA,
        AMERICA_CURACAO,
        AMERICA_DANMARKSHAVN,
        AMERICA_DAWSON,
        AMERICA_DAWSON_CREEK,
        AMERICA_DENVER,
        AMERICA_DETROIT,
        AMERICA_DOMINICA,
        AMERICA_EDMONTON,
        AMERICA_EIRUNEPE,
        AMERICA_EL_SALVADOR,
        AMERICA_FORTALEZA,
        AMERICA_GLACE_BAY,
        AMERICA_GODTHAB,
        AMERICA_GOOSE_BAY,
        AMERICA_GRAND_TURK,
        AMERICA_GRENADA,
        AMERICA_GUADELOUPE,
        AMERICA_GUATEMALA,
        AMERICA_GUAYAQUIL,
        AMERICA_GUYANA,
        AMERICA_HALIFAX,
        AMERICA_HAVANA,
        AMERICA_HERMOSILLO,
        AMERICA_INDIANA_INDIANAPOLIS,
        AMERICA_INDIANA_KNOX,
        AMERICA_INDIANA_MARENGO,
        AMERICA_INDIANA_PETERSBURG,
        AMERICA_INDIANA_TELL_CITY,
        AMERICA_INDIANA_VEVAY,
        AMERICA_INDIANA_VINCENNES,
        AMERICA_INDIANA_WINAMAC,
        AMERICA_INUVIK,
        AMERICA_IQALUIT,
        AMERICA_JAMAICA,
        AMERICA_JUNEAU,
        AMERICA_KENTUCKY_LOUISVILLE,
        AMERICA_KENTUCKY_MONTICELLO,
        AMERICA_KRALENDIJK,
        AMERICA_LA_PAZ,
        AMERICA_LIMA,
        AMERICA_LOS_ANGELES,
        AMERICA_LOWER_PRINCES,
        AMERICA_MACEIO,
        AMERICA_MANAGUA,
        AMERICA_MANAUS,
        AMERICA_MARIGOT,
        AMERICA_MARTINIQUE,
        AMERICA_MATAMOROS,
        AMERICA_MAZATLAN,
        AMERICA_MENOMINEE,
        AMERICA_MERIDA,
        AMERICA_METLAKATLA,
        AMERICA_MEXICO_CITY,
        AMERICA_MIQUELON,
        AMERICA_MONCTON,
        AMERICA_MONTERREY,
        AMERICA_MONTEVIDEO,
        AMERICA_MONTREAL,
        AMERICA_MONTSERRAT,
        AMERICA_NASSAU,
        AMERICA_NEW_YORK,
        AMERICA_NIPIGON,
        AMERICA_NOME,
        AMERICA_NORONHA,
        AMERICA_NORTH_DAKOTA_BEULAH,
        AMERICA_NORTH_DAKOTA_CENTER,
        AMERICA_NORTH_DAKOTA_NEW_SALEM,
        AMERICA_OJINAGA,
        AMERICA_PANAMA,
        AMERICA_PANGNIRTUNG,
        AMERICA_PARAMARIBO,
        AMERICA_PHOENIX,
        AMERICA_PORT_AU_PRINCE,
        AMERICA_PORT_OF_SPAIN,
        AMERICA_PORTO_VELHO,
        AMERICA_PUERTO_RICO,
        AMERICA_RAINY_RIVER,
        AMERICA_RANKIN_INLET,
        AMERICA_RECIFE,
        AMERICA_REGINA,
        AMERICA_RESOLUTE,
        AMERICA_RIO_BRANCO,
        AMERICA_SANTA_ISABEL,
        AMERICA_SANTAREM,
        AMERICA_SANTIAGO,
        AMERICA_SANTO_DOMINGO,
        AMERICA_SAO_PAULO,
        AMERICA_SCORESBYSUND,
        AMERICA_SHIPROCK,
        AMERICA_SITKA,
        AMERICA_ST_BARTHELEMY,
        AMERICA_ST_JOHNS,
        AMERICA_ST_KITTS,
        AMERICA_ST_LUCIA,
        AMERICA_ST_THOMAS,
        AMERICA_ST_VINCENT,
        AMERICA_SWIFT_CURRENT,
        AMERICA_TEGUCIGALPA,
        AMERICA_THULE,
        AMERICA_THUNDER_BAY,
        AMERICA_TIJUANA,
        AMERICA_TORONTO,
        AMERICA_TORTOLA,
        AMERICA_VANCOUVER,
        AMERICA_WHITEHORSE,
        AMERICA_WINNIPEG,
        AMERICA_YAKUTAT,
        AMERICA_YELLOWKNIFE,
        ANTARCTICA_CASEY,
        ANTARCTICA_DAVIS,
        ANTARCTICA_DUMONT_D_URVILLE,
        ANTARCTICA_MACQUARIE,
        ANTARCTICA_MAWSON,
        ANTARCTICA_MC_MURDO,
        ANTARCTICA_PALMER,
        ANTARCTICA_ROTHERA,
        ANTARCTICA_SOUTH_POLE,
        ANTARCTICA_SYOWA,
        ANTARCTICA_VOSTOK,
        ARCTIC_LONGYEARBYEN,
        ASIA_ADEN,
        ASIA_ALMATY,
        ASIA_AMMAN,
        ASIA_ANADYR,
        ASIA_AQTAU,
        ASIA_AQTOBE,
        ASIA_ASHGABAT,
        ASIA_BAGHDAD,
        ASIA_BAHRAIN,
        ASIA_BAKU,
        ASIA_BANGKOK,
        ASIA_BEIRUT,
        ASIA_BISHKEK,
        ASIA_BRUNEI,
        ASIA_CHOIBALSAN,
        ASIA_CHONGQING,
        ASIA_COLOMBO,
        ASIA_DAMASCUS,
        ASIA_DHAKA,
        ASIA_DILI,
        ASIA_DUBAI,
        ASIA_DUSHANBE,
        ASIA_GAZA,
        ASIA_HARBIN,
        ASIA_HEBRON,
        ASIA_HO_CHI_MINH,
        ASIA_HONG_KONG,
        ASIA_HOVD,
        ASIA_IRKUTSK,
        ASIA_JAKARTA,
        ASIA_JAYAPURA,
        ASIA_JERUSALEM,
        ASIA_KABUL,
        ASIA_KAMCHATKA,
        ASIA_KARACHI,
        ASIA_KASHGAR,
        ASIA_KATHMANDU,
        ASIA_KOLKATA,
        ASIA_KRASNOYARSK,
        ASIA_KUALA_LUMPUR,
        ASIA_KUCHING,
        ASIA_KUWAIT,
        ASIA_MACAU,
        ASIA_MAGADAN,
        ASIA_MAKASSAR,
        ASIA_MANILA,
        ASIA_MUSCAT,
        ASIA_NICOSIA,
        ASIA_NOVOKUZNETSK,
        ASIA_NOVOSIBIRSK,
        ASIA_OMSK,
        ASIA_ORAL,
        ASIA_PHNOM_PENH,
        ASIA_PONTIANAK,
        ASIA_PYONGYANG,
        ASIA_QATAR,
        ASIA_QYZYLORDA,
        ASIA_RANGOON,
        ASIA_RIYADH,
        ASIA_SAKHALIN,
        ASIA_SAMARKAND,
        ASIA_SEOUL,
        ASIA_SHANGHAI,
        ASIA_SINGAPORE,
        ASIA_TAIPEI,
        ASIA_TASHKENT,
        ASIA_TBILISI,
        ASIA_TEHRAN,
        ASIA_THIMPHU,
        ASIA_TOKYO,
        ASIA_ULAANBAATAR,
        ASIA_URUMQI,
        ASIA_VIENTIANE,
        ASIA_VLADIVOSTOK,
        ASIA_YAKUTSK,
        ASIA_YEKATERINBURG,
        ASIA_YEREVAN,
        ATLANTIC_AZORES,
        ATLANTIC_BERMUDA,
        ATLANTIC_CANARY,
        ATLANTIC_CAPE_VERDE,
        ATLANTIC_FAROE,
        ATLANTIC_MADEIRA,
        ATLANTIC_REYKJAVIK,
        ATLANTIC_SOUTH_GEORGIA,
        ATLANTIC_ST_HELENA,
        ATLANTIC_STANLEY,
        AUSTRALIA_ADELAIDE,
        AUSTRALIA_BRISBANE,
        AUSTRALIA_BROKEN_HILL,
        AUSTRALIA_CURRIE,
        AUSTRALIA_DARWIN,
        AUSTRALIA_EUCLA,
        AUSTRALIA_HOBART,
        AUSTRALIA_LINDEMAN,
        AUSTRALIA_LORD_HOWE,
        AUSTRALIA_MELBOURNE,
        AUSTRALIA_PERTH,
        AUSTRALIA_SYDNEY,
        CANADA_ATLANTIC,
        CANADA_CENTRAL,
        CANADA_EASTERN,
        CANADA_MOUNTAIN,
        CANADA_NEWFOUNDLAND,
        CANADA_PACIFIC,
        EUROPE_AMSTERDAM,
        EUROPE_ANDORRA,
        EUROPE_ATHENS,
        EUROPE_BELGRADE,
        EUROPE_BERLIN,
        EUROPE_BRATISLAVA,
        EUROPE_BRUSSELS,
        EUROPE_BUCHAREST,
        EUROPE_BUDAPEST,
        EUROPE_CHISINAU,
        EUROPE_COPENHAGEN,
        EUROPE_DUBLIN,
        EUROPE_GIBRALTAR,
        EUROPE_GUERNSEY,
        EUROPE_HELSINKI,
        EUROPE_ISLE_OF_MAN,
        EUROPE_ISTANBUL,
        EUROPE_JERSEY,
        EUROPE_KALININGRAD,
        EUROPE_KIEV,
        EUROPE_LISBON,
        EUROPE_LJUBLJANA,
        EUROPE_LONDON,
        EUROPE_LUXEMBOURG,
        EUROPE_MADRID,
        EUROPE_MALTA,
        EUROPE_MARIEHAMN,
        EUROPE_MINSK,
        EUROPE_MONACO,
        EUROPE_MOSCOW,
        EUROPE_OSLO,
        EUROPE_PARIS,
        EUROPE_PODGORICA,
        EUROPE_PRAGUE,
        EUROPE_RIGA,
        EUROPE_ROME,
        EUROPE_SAMARA,
        EUROPE_SAN_MARINO,
        EUROPE_SARAJEVO,
        EUROPE_SIMFEROPOL,
        EUROPE_SKOPJE,
        EUROPE_SOFIA,
        EUROPE_STOCKHOLM,
        EUROPE_TALLINN,
        EUROPE_TIRANE,
        EUROPE_UZHGOROD,
        EUROPE_VADUZ,
        EUROPE_VATICAN,
        EUROPE_VIENNA,
        EUROPE_VILNIUS,
        EUROPE_VOLGOGRAD,
        EUROPE_WARSAW,
        EUROPE_ZAGREB,
        EUROPE_ZAPOROZHYE,
        EUROPE_ZURICH,
        GMT,
        INDIAN_ANTANANARIVO,
        INDIAN_CHAGOS,
        INDIAN_CHRISTMAS,
        INDIAN_COCOS,
        INDIAN_COMORO,
        INDIAN_KERGUELEN,
        INDIAN_MAHE,
        INDIAN_MALDIVES,
        INDIAN_MAURITIUS,
        INDIAN_MAYOTTE,
        INDIAN_REUNION,
        PACIFIC_APIA,
        PACIFIC_AUCKLAND,
        PACIFIC_CHATHAM,
        PACIFIC_CHUUK,
        PACIFIC_EASTER,
        PACIFIC_EFATE,
        PACIFIC_ENDERBURY,
        PACIFIC_FAKAOFO,
        PACIFIC_FIJI,
        PACIFIC_FUNAFUTI,
        PACIFIC_GALAPAGOS,
        PACIFIC_GAMBIER,
        PACIFIC_GUADALCANAL,
        PACIFIC_GUAM,
        PACIFIC_HONOLULU,
        PACIFIC_JOHNSTON,
        PACIFIC_KIRITIMATI,
        PACIFIC_KOSRAE,
        PACIFIC_KWAJALEIN,
        PACIFIC_MAJURO,
        PACIFIC_MARQUESAS,
        PACIFIC_MIDWAY,
        PACIFIC_NAURU,
        PACIFIC_NIUE,
        PACIFIC_NORFOLK,
        PACIFIC_NOUMEA,
        PACIFIC_PAGO_PAGO,
        PACIFIC_PALAU,
        PACIFIC_PITCAIRN,
        PACIFIC_POHNPEI,
        PACIFIC_PORT_MORESBY,
        PACIFIC_RAROTONGA,
        PACIFIC_SAIPAN,
        PACIFIC_TAHITI,
        PACIFIC_TARAWA,
        PACIFIC_TONGATAPU,
        PACIFIC_WAKE,
        PACIFIC_WALLIS,
        US_ALASKA,
        US_ARIZONA,
        US_CENTRAL,
        US_EASTERN,
        US_HAWAII,
        US_MOUNTAIN,
        US_PACIFIC,
        UTC,
        /** An enum member indicating that [TimezoneEnum] was instantiated with an unknown value. */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
    fun value(): Value =
        when (this) {
            AFRICA_ABIDJAN -> Value.AFRICA_ABIDJAN
            AFRICA_ACCRA -> Value.AFRICA_ACCRA
            AFRICA_ADDIS_ABABA -> Value.AFRICA_ADDIS_ABABA
            AFRICA_ALGIERS -> Value.AFRICA_ALGIERS
            AFRICA_ASMARA -> Value.AFRICA_ASMARA
            AFRICA_BAMAKO -> Value.AFRICA_BAMAKO
            AFRICA_BANGUI -> Value.AFRICA_BANGUI
            AFRICA_BANJUL -> Value.AFRICA_BANJUL
            AFRICA_BISSAU -> Value.AFRICA_BISSAU
            AFRICA_BLANTYRE -> Value.AFRICA_BLANTYRE
            AFRICA_BRAZZAVILLE -> Value.AFRICA_BRAZZAVILLE
            AFRICA_BUJUMBURA -> Value.AFRICA_BUJUMBURA
            AFRICA_CAIRO -> Value.AFRICA_CAIRO
            AFRICA_CASABLANCA -> Value.AFRICA_CASABLANCA
            AFRICA_CEUTA -> Value.AFRICA_CEUTA
            AFRICA_CONAKRY -> Value.AFRICA_CONAKRY
            AFRICA_DAKAR -> Value.AFRICA_DAKAR
            AFRICA_DAR_ES_SALAAM -> Value.AFRICA_DAR_ES_SALAAM
            AFRICA_DJIBOUTI -> Value.AFRICA_DJIBOUTI
            AFRICA_DOUALA -> Value.AFRICA_DOUALA
            AFRICA_EL_AAIUN -> Value.AFRICA_EL_AAIUN
            AFRICA_FREETOWN -> Value.AFRICA_FREETOWN
            AFRICA_GABORONE -> Value.AFRICA_GABORONE
            AFRICA_HARARE -> Value.AFRICA_HARARE
            AFRICA_JOHANNESBURG -> Value.AFRICA_JOHANNESBURG
            AFRICA_JUBA -> Value.AFRICA_JUBA
            AFRICA_KAMPALA -> Value.AFRICA_KAMPALA
            AFRICA_KHARTOUM -> Value.AFRICA_KHARTOUM
            AFRICA_KIGALI -> Value.AFRICA_KIGALI
            AFRICA_KINSHASA -> Value.AFRICA_KINSHASA
            AFRICA_LAGOS -> Value.AFRICA_LAGOS
            AFRICA_LIBREVILLE -> Value.AFRICA_LIBREVILLE
            AFRICA_LOME -> Value.AFRICA_LOME
            AFRICA_LUANDA -> Value.AFRICA_LUANDA
            AFRICA_LUBUMBASHI -> Value.AFRICA_LUBUMBASHI
            AFRICA_LUSAKA -> Value.AFRICA_LUSAKA
            AFRICA_MALABO -> Value.AFRICA_MALABO
            AFRICA_MAPUTO -> Value.AFRICA_MAPUTO
            AFRICA_MASERU -> Value.AFRICA_MASERU
            AFRICA_MBABANE -> Value.AFRICA_MBABANE
            AFRICA_MOGADISHU -> Value.AFRICA_MOGADISHU
            AFRICA_MONROVIA -> Value.AFRICA_MONROVIA
            AFRICA_NAIROBI -> Value.AFRICA_NAIROBI
            AFRICA_NDJAMENA -> Value.AFRICA_NDJAMENA
            AFRICA_NIAMEY -> Value.AFRICA_NIAMEY
            AFRICA_NOUAKCHOTT -> Value.AFRICA_NOUAKCHOTT
            AFRICA_OUAGADOUGOU -> Value.AFRICA_OUAGADOUGOU
            AFRICA_PORTO_NOVO -> Value.AFRICA_PORTO_NOVO
            AFRICA_SAO_TOME -> Value.AFRICA_SAO_TOME
            AFRICA_TRIPOLI -> Value.AFRICA_TRIPOLI
            AFRICA_TUNIS -> Value.AFRICA_TUNIS
            AFRICA_WINDHOEK -> Value.AFRICA_WINDHOEK
            AMERICA_ADAK -> Value.AMERICA_ADAK
            AMERICA_ANCHORAGE -> Value.AMERICA_ANCHORAGE
            AMERICA_ANGUILLA -> Value.AMERICA_ANGUILLA
            AMERICA_ANTIGUA -> Value.AMERICA_ANTIGUA
            AMERICA_ARAGUAINA -> Value.AMERICA_ARAGUAINA
            AMERICA_ARGENTINA_BUENOS_AIRES -> Value.AMERICA_ARGENTINA_BUENOS_AIRES
            AMERICA_ARGENTINA_CATAMARCA -> Value.AMERICA_ARGENTINA_CATAMARCA
            AMERICA_ARGENTINA_CORDOBA -> Value.AMERICA_ARGENTINA_CORDOBA
            AMERICA_ARGENTINA_JUJUY -> Value.AMERICA_ARGENTINA_JUJUY
            AMERICA_ARGENTINA_LA_RIOJA -> Value.AMERICA_ARGENTINA_LA_RIOJA
            AMERICA_ARGENTINA_MENDOZA -> Value.AMERICA_ARGENTINA_MENDOZA
            AMERICA_ARGENTINA_RIO_GALLEGOS -> Value.AMERICA_ARGENTINA_RIO_GALLEGOS
            AMERICA_ARGENTINA_SALTA -> Value.AMERICA_ARGENTINA_SALTA
            AMERICA_ARGENTINA_SAN_JUAN -> Value.AMERICA_ARGENTINA_SAN_JUAN
            AMERICA_ARGENTINA_SAN_LUIS -> Value.AMERICA_ARGENTINA_SAN_LUIS
            AMERICA_ARGENTINA_TUCUMAN -> Value.AMERICA_ARGENTINA_TUCUMAN
            AMERICA_ARGENTINA_USHUAIA -> Value.AMERICA_ARGENTINA_USHUAIA
            AMERICA_ARUBA -> Value.AMERICA_ARUBA
            AMERICA_ASUNCION -> Value.AMERICA_ASUNCION
            AMERICA_ATIKOKAN -> Value.AMERICA_ATIKOKAN
            AMERICA_BAHIA -> Value.AMERICA_BAHIA
            AMERICA_BAHIA_BANDERAS -> Value.AMERICA_BAHIA_BANDERAS
            AMERICA_BARBADOS -> Value.AMERICA_BARBADOS
            AMERICA_BELEM -> Value.AMERICA_BELEM
            AMERICA_BELIZE -> Value.AMERICA_BELIZE
            AMERICA_BLANC_SABLON -> Value.AMERICA_BLANC_SABLON
            AMERICA_BOA_VISTA -> Value.AMERICA_BOA_VISTA
            AMERICA_BOGOTA -> Value.AMERICA_BOGOTA
            AMERICA_BOISE -> Value.AMERICA_BOISE
            AMERICA_CAMBRIDGE_BAY -> Value.AMERICA_CAMBRIDGE_BAY
            AMERICA_CAMPO_GRANDE -> Value.AMERICA_CAMPO_GRANDE
            AMERICA_CANCUN -> Value.AMERICA_CANCUN
            AMERICA_CARACAS -> Value.AMERICA_CARACAS
            AMERICA_CAYENNE -> Value.AMERICA_CAYENNE
            AMERICA_CAYMAN -> Value.AMERICA_CAYMAN
            AMERICA_CHICAGO -> Value.AMERICA_CHICAGO
            AMERICA_CHIHUAHUA -> Value.AMERICA_CHIHUAHUA
            AMERICA_COSTA_RICA -> Value.AMERICA_COSTA_RICA
            AMERICA_CRESTON -> Value.AMERICA_CRESTON
            AMERICA_CUIABA -> Value.AMERICA_CUIABA
            AMERICA_CURACAO -> Value.AMERICA_CURACAO
            AMERICA_DANMARKSHAVN -> Value.AMERICA_DANMARKSHAVN
            AMERICA_DAWSON -> Value.AMERICA_DAWSON
            AMERICA_DAWSON_CREEK -> Value.AMERICA_DAWSON_CREEK
            AMERICA_DENVER -> Value.AMERICA_DENVER
            AMERICA_DETROIT -> Value.AMERICA_DETROIT
            AMERICA_DOMINICA -> Value.AMERICA_DOMINICA
            AMERICA_EDMONTON -> Value.AMERICA_EDMONTON
            AMERICA_EIRUNEPE -> Value.AMERICA_EIRUNEPE
            AMERICA_EL_SALVADOR -> Value.AMERICA_EL_SALVADOR
            AMERICA_FORTALEZA -> Value.AMERICA_FORTALEZA
            AMERICA_GLACE_BAY -> Value.AMERICA_GLACE_BAY
            AMERICA_GODTHAB -> Value.AMERICA_GODTHAB
            AMERICA_GOOSE_BAY -> Value.AMERICA_GOOSE_BAY
            AMERICA_GRAND_TURK -> Value.AMERICA_GRAND_TURK
            AMERICA_GRENADA -> Value.AMERICA_GRENADA
            AMERICA_GUADELOUPE -> Value.AMERICA_GUADELOUPE
            AMERICA_GUATEMALA -> Value.AMERICA_GUATEMALA
            AMERICA_GUAYAQUIL -> Value.AMERICA_GUAYAQUIL
            AMERICA_GUYANA -> Value.AMERICA_GUYANA
            AMERICA_HALIFAX -> Value.AMERICA_HALIFAX
            AMERICA_HAVANA -> Value.AMERICA_HAVANA
            AMERICA_HERMOSILLO -> Value.AMERICA_HERMOSILLO
            AMERICA_INDIANA_INDIANAPOLIS -> Value.AMERICA_INDIANA_INDIANAPOLIS
            AMERICA_INDIANA_KNOX -> Value.AMERICA_INDIANA_KNOX
            AMERICA_INDIANA_MARENGO -> Value.AMERICA_INDIANA_MARENGO
            AMERICA_INDIANA_PETERSBURG -> Value.AMERICA_INDIANA_PETERSBURG
            AMERICA_INDIANA_TELL_CITY -> Value.AMERICA_INDIANA_TELL_CITY
            AMERICA_INDIANA_VEVAY -> Value.AMERICA_INDIANA_VEVAY
            AMERICA_INDIANA_VINCENNES -> Value.AMERICA_INDIANA_VINCENNES
            AMERICA_INDIANA_WINAMAC -> Value.AMERICA_INDIANA_WINAMAC
            AMERICA_INUVIK -> Value.AMERICA_INUVIK
            AMERICA_IQALUIT -> Value.AMERICA_IQALUIT
            AMERICA_JAMAICA -> Value.AMERICA_JAMAICA
            AMERICA_JUNEAU -> Value.AMERICA_JUNEAU
            AMERICA_KENTUCKY_LOUISVILLE -> Value.AMERICA_KENTUCKY_LOUISVILLE
            AMERICA_KENTUCKY_MONTICELLO -> Value.AMERICA_KENTUCKY_MONTICELLO
            AMERICA_KRALENDIJK -> Value.AMERICA_KRALENDIJK
            AMERICA_LA_PAZ -> Value.AMERICA_LA_PAZ
            AMERICA_LIMA -> Value.AMERICA_LIMA
            AMERICA_LOS_ANGELES -> Value.AMERICA_LOS_ANGELES
            AMERICA_LOWER_PRINCES -> Value.AMERICA_LOWER_PRINCES
            AMERICA_MACEIO -> Value.AMERICA_MACEIO
            AMERICA_MANAGUA -> Value.AMERICA_MANAGUA
            AMERICA_MANAUS -> Value.AMERICA_MANAUS
            AMERICA_MARIGOT -> Value.AMERICA_MARIGOT
            AMERICA_MARTINIQUE -> Value.AMERICA_MARTINIQUE
            AMERICA_MATAMOROS -> Value.AMERICA_MATAMOROS
            AMERICA_MAZATLAN -> Value.AMERICA_MAZATLAN
            AMERICA_MENOMINEE -> Value.AMERICA_MENOMINEE
            AMERICA_MERIDA -> Value.AMERICA_MERIDA
            AMERICA_METLAKATLA -> Value.AMERICA_METLAKATLA
            AMERICA_MEXICO_CITY -> Value.AMERICA_MEXICO_CITY
            AMERICA_MIQUELON -> Value.AMERICA_MIQUELON
            AMERICA_MONCTON -> Value.AMERICA_MONCTON
            AMERICA_MONTERREY -> Value.AMERICA_MONTERREY
            AMERICA_MONTEVIDEO -> Value.AMERICA_MONTEVIDEO
            AMERICA_MONTREAL -> Value.AMERICA_MONTREAL
            AMERICA_MONTSERRAT -> Value.AMERICA_MONTSERRAT
            AMERICA_NASSAU -> Value.AMERICA_NASSAU
            AMERICA_NEW_YORK -> Value.AMERICA_NEW_YORK
            AMERICA_NIPIGON -> Value.AMERICA_NIPIGON
            AMERICA_NOME -> Value.AMERICA_NOME
            AMERICA_NORONHA -> Value.AMERICA_NORONHA
            AMERICA_NORTH_DAKOTA_BEULAH -> Value.AMERICA_NORTH_DAKOTA_BEULAH
            AMERICA_NORTH_DAKOTA_CENTER -> Value.AMERICA_NORTH_DAKOTA_CENTER
            AMERICA_NORTH_DAKOTA_NEW_SALEM -> Value.AMERICA_NORTH_DAKOTA_NEW_SALEM
            AMERICA_OJINAGA -> Value.AMERICA_OJINAGA
            AMERICA_PANAMA -> Value.AMERICA_PANAMA
            AMERICA_PANGNIRTUNG -> Value.AMERICA_PANGNIRTUNG
            AMERICA_PARAMARIBO -> Value.AMERICA_PARAMARIBO
            AMERICA_PHOENIX -> Value.AMERICA_PHOENIX
            AMERICA_PORT_AU_PRINCE -> Value.AMERICA_PORT_AU_PRINCE
            AMERICA_PORT_OF_SPAIN -> Value.AMERICA_PORT_OF_SPAIN
            AMERICA_PORTO_VELHO -> Value.AMERICA_PORTO_VELHO
            AMERICA_PUERTO_RICO -> Value.AMERICA_PUERTO_RICO
            AMERICA_RAINY_RIVER -> Value.AMERICA_RAINY_RIVER
            AMERICA_RANKIN_INLET -> Value.AMERICA_RANKIN_INLET
            AMERICA_RECIFE -> Value.AMERICA_RECIFE
            AMERICA_REGINA -> Value.AMERICA_REGINA
            AMERICA_RESOLUTE -> Value.AMERICA_RESOLUTE
            AMERICA_RIO_BRANCO -> Value.AMERICA_RIO_BRANCO
            AMERICA_SANTA_ISABEL -> Value.AMERICA_SANTA_ISABEL
            AMERICA_SANTAREM -> Value.AMERICA_SANTAREM
            AMERICA_SANTIAGO -> Value.AMERICA_SANTIAGO
            AMERICA_SANTO_DOMINGO -> Value.AMERICA_SANTO_DOMINGO
            AMERICA_SAO_PAULO -> Value.AMERICA_SAO_PAULO
            AMERICA_SCORESBYSUND -> Value.AMERICA_SCORESBYSUND
            AMERICA_SHIPROCK -> Value.AMERICA_SHIPROCK
            AMERICA_SITKA -> Value.AMERICA_SITKA
            AMERICA_ST_BARTHELEMY -> Value.AMERICA_ST_BARTHELEMY
            AMERICA_ST_JOHNS -> Value.AMERICA_ST_JOHNS
            AMERICA_ST_KITTS -> Value.AMERICA_ST_KITTS
            AMERICA_ST_LUCIA -> Value.AMERICA_ST_LUCIA
            AMERICA_ST_THOMAS -> Value.AMERICA_ST_THOMAS
            AMERICA_ST_VINCENT -> Value.AMERICA_ST_VINCENT
            AMERICA_SWIFT_CURRENT -> Value.AMERICA_SWIFT_CURRENT
            AMERICA_TEGUCIGALPA -> Value.AMERICA_TEGUCIGALPA
            AMERICA_THULE -> Value.AMERICA_THULE
            AMERICA_THUNDER_BAY -> Value.AMERICA_THUNDER_BAY
            AMERICA_TIJUANA -> Value.AMERICA_TIJUANA
            AMERICA_TORONTO -> Value.AMERICA_TORONTO
            AMERICA_TORTOLA -> Value.AMERICA_TORTOLA
            AMERICA_VANCOUVER -> Value.AMERICA_VANCOUVER
            AMERICA_WHITEHORSE -> Value.AMERICA_WHITEHORSE
            AMERICA_WINNIPEG -> Value.AMERICA_WINNIPEG
            AMERICA_YAKUTAT -> Value.AMERICA_YAKUTAT
            AMERICA_YELLOWKNIFE -> Value.AMERICA_YELLOWKNIFE
            ANTARCTICA_CASEY -> Value.ANTARCTICA_CASEY
            ANTARCTICA_DAVIS -> Value.ANTARCTICA_DAVIS
            ANTARCTICA_DUMONT_D_URVILLE -> Value.ANTARCTICA_DUMONT_D_URVILLE
            ANTARCTICA_MACQUARIE -> Value.ANTARCTICA_MACQUARIE
            ANTARCTICA_MAWSON -> Value.ANTARCTICA_MAWSON
            ANTARCTICA_MC_MURDO -> Value.ANTARCTICA_MC_MURDO
            ANTARCTICA_PALMER -> Value.ANTARCTICA_PALMER
            ANTARCTICA_ROTHERA -> Value.ANTARCTICA_ROTHERA
            ANTARCTICA_SOUTH_POLE -> Value.ANTARCTICA_SOUTH_POLE
            ANTARCTICA_SYOWA -> Value.ANTARCTICA_SYOWA
            ANTARCTICA_VOSTOK -> Value.ANTARCTICA_VOSTOK
            ARCTIC_LONGYEARBYEN -> Value.ARCTIC_LONGYEARBYEN
            ASIA_ADEN -> Value.ASIA_ADEN
            ASIA_ALMATY -> Value.ASIA_ALMATY
            ASIA_AMMAN -> Value.ASIA_AMMAN
            ASIA_ANADYR -> Value.ASIA_ANADYR
            ASIA_AQTAU -> Value.ASIA_AQTAU
            ASIA_AQTOBE -> Value.ASIA_AQTOBE
            ASIA_ASHGABAT -> Value.ASIA_ASHGABAT
            ASIA_BAGHDAD -> Value.ASIA_BAGHDAD
            ASIA_BAHRAIN -> Value.ASIA_BAHRAIN
            ASIA_BAKU -> Value.ASIA_BAKU
            ASIA_BANGKOK -> Value.ASIA_BANGKOK
            ASIA_BEIRUT -> Value.ASIA_BEIRUT
            ASIA_BISHKEK -> Value.ASIA_BISHKEK
            ASIA_BRUNEI -> Value.ASIA_BRUNEI
            ASIA_CHOIBALSAN -> Value.ASIA_CHOIBALSAN
            ASIA_CHONGQING -> Value.ASIA_CHONGQING
            ASIA_COLOMBO -> Value.ASIA_COLOMBO
            ASIA_DAMASCUS -> Value.ASIA_DAMASCUS
            ASIA_DHAKA -> Value.ASIA_DHAKA
            ASIA_DILI -> Value.ASIA_DILI
            ASIA_DUBAI -> Value.ASIA_DUBAI
            ASIA_DUSHANBE -> Value.ASIA_DUSHANBE
            ASIA_GAZA -> Value.ASIA_GAZA
            ASIA_HARBIN -> Value.ASIA_HARBIN
            ASIA_HEBRON -> Value.ASIA_HEBRON
            ASIA_HO_CHI_MINH -> Value.ASIA_HO_CHI_MINH
            ASIA_HONG_KONG -> Value.ASIA_HONG_KONG
            ASIA_HOVD -> Value.ASIA_HOVD
            ASIA_IRKUTSK -> Value.ASIA_IRKUTSK
            ASIA_JAKARTA -> Value.ASIA_JAKARTA
            ASIA_JAYAPURA -> Value.ASIA_JAYAPURA
            ASIA_JERUSALEM -> Value.ASIA_JERUSALEM
            ASIA_KABUL -> Value.ASIA_KABUL
            ASIA_KAMCHATKA -> Value.ASIA_KAMCHATKA
            ASIA_KARACHI -> Value.ASIA_KARACHI
            ASIA_KASHGAR -> Value.ASIA_KASHGAR
            ASIA_KATHMANDU -> Value.ASIA_KATHMANDU
            ASIA_KOLKATA -> Value.ASIA_KOLKATA
            ASIA_KRASNOYARSK -> Value.ASIA_KRASNOYARSK
            ASIA_KUALA_LUMPUR -> Value.ASIA_KUALA_LUMPUR
            ASIA_KUCHING -> Value.ASIA_KUCHING
            ASIA_KUWAIT -> Value.ASIA_KUWAIT
            ASIA_MACAU -> Value.ASIA_MACAU
            ASIA_MAGADAN -> Value.ASIA_MAGADAN
            ASIA_MAKASSAR -> Value.ASIA_MAKASSAR
            ASIA_MANILA -> Value.ASIA_MANILA
            ASIA_MUSCAT -> Value.ASIA_MUSCAT
            ASIA_NICOSIA -> Value.ASIA_NICOSIA
            ASIA_NOVOKUZNETSK -> Value.ASIA_NOVOKUZNETSK
            ASIA_NOVOSIBIRSK -> Value.ASIA_NOVOSIBIRSK
            ASIA_OMSK -> Value.ASIA_OMSK
            ASIA_ORAL -> Value.ASIA_ORAL
            ASIA_PHNOM_PENH -> Value.ASIA_PHNOM_PENH
            ASIA_PONTIANAK -> Value.ASIA_PONTIANAK
            ASIA_PYONGYANG -> Value.ASIA_PYONGYANG
            ASIA_QATAR -> Value.ASIA_QATAR
            ASIA_QYZYLORDA -> Value.ASIA_QYZYLORDA
            ASIA_RANGOON -> Value.ASIA_RANGOON
            ASIA_RIYADH -> Value.ASIA_RIYADH
            ASIA_SAKHALIN -> Value.ASIA_SAKHALIN
            ASIA_SAMARKAND -> Value.ASIA_SAMARKAND
            ASIA_SEOUL -> Value.ASIA_SEOUL
            ASIA_SHANGHAI -> Value.ASIA_SHANGHAI
            ASIA_SINGAPORE -> Value.ASIA_SINGAPORE
            ASIA_TAIPEI -> Value.ASIA_TAIPEI
            ASIA_TASHKENT -> Value.ASIA_TASHKENT
            ASIA_TBILISI -> Value.ASIA_TBILISI
            ASIA_TEHRAN -> Value.ASIA_TEHRAN
            ASIA_THIMPHU -> Value.ASIA_THIMPHU
            ASIA_TOKYO -> Value.ASIA_TOKYO
            ASIA_ULAANBAATAR -> Value.ASIA_ULAANBAATAR
            ASIA_URUMQI -> Value.ASIA_URUMQI
            ASIA_VIENTIANE -> Value.ASIA_VIENTIANE
            ASIA_VLADIVOSTOK -> Value.ASIA_VLADIVOSTOK
            ASIA_YAKUTSK -> Value.ASIA_YAKUTSK
            ASIA_YEKATERINBURG -> Value.ASIA_YEKATERINBURG
            ASIA_YEREVAN -> Value.ASIA_YEREVAN
            ATLANTIC_AZORES -> Value.ATLANTIC_AZORES
            ATLANTIC_BERMUDA -> Value.ATLANTIC_BERMUDA
            ATLANTIC_CANARY -> Value.ATLANTIC_CANARY
            ATLANTIC_CAPE_VERDE -> Value.ATLANTIC_CAPE_VERDE
            ATLANTIC_FAROE -> Value.ATLANTIC_FAROE
            ATLANTIC_MADEIRA -> Value.ATLANTIC_MADEIRA
            ATLANTIC_REYKJAVIK -> Value.ATLANTIC_REYKJAVIK
            ATLANTIC_SOUTH_GEORGIA -> Value.ATLANTIC_SOUTH_GEORGIA
            ATLANTIC_ST_HELENA -> Value.ATLANTIC_ST_HELENA
            ATLANTIC_STANLEY -> Value.ATLANTIC_STANLEY
            AUSTRALIA_ADELAIDE -> Value.AUSTRALIA_ADELAIDE
            AUSTRALIA_BRISBANE -> Value.AUSTRALIA_BRISBANE
            AUSTRALIA_BROKEN_HILL -> Value.AUSTRALIA_BROKEN_HILL
            AUSTRALIA_CURRIE -> Value.AUSTRALIA_CURRIE
            AUSTRALIA_DARWIN -> Value.AUSTRALIA_DARWIN
            AUSTRALIA_EUCLA -> Value.AUSTRALIA_EUCLA
            AUSTRALIA_HOBART -> Value.AUSTRALIA_HOBART
            AUSTRALIA_LINDEMAN -> Value.AUSTRALIA_LINDEMAN
            AUSTRALIA_LORD_HOWE -> Value.AUSTRALIA_LORD_HOWE
            AUSTRALIA_MELBOURNE -> Value.AUSTRALIA_MELBOURNE
            AUSTRALIA_PERTH -> Value.AUSTRALIA_PERTH
            AUSTRALIA_SYDNEY -> Value.AUSTRALIA_SYDNEY
            CANADA_ATLANTIC -> Value.CANADA_ATLANTIC
            CANADA_CENTRAL -> Value.CANADA_CENTRAL
            CANADA_EASTERN -> Value.CANADA_EASTERN
            CANADA_MOUNTAIN -> Value.CANADA_MOUNTAIN
            CANADA_NEWFOUNDLAND -> Value.CANADA_NEWFOUNDLAND
            CANADA_PACIFIC -> Value.CANADA_PACIFIC
            EUROPE_AMSTERDAM -> Value.EUROPE_AMSTERDAM
            EUROPE_ANDORRA -> Value.EUROPE_ANDORRA
            EUROPE_ATHENS -> Value.EUROPE_ATHENS
            EUROPE_BELGRADE -> Value.EUROPE_BELGRADE
            EUROPE_BERLIN -> Value.EUROPE_BERLIN
            EUROPE_BRATISLAVA -> Value.EUROPE_BRATISLAVA
            EUROPE_BRUSSELS -> Value.EUROPE_BRUSSELS
            EUROPE_BUCHAREST -> Value.EUROPE_BUCHAREST
            EUROPE_BUDAPEST -> Value.EUROPE_BUDAPEST
            EUROPE_CHISINAU -> Value.EUROPE_CHISINAU
            EUROPE_COPENHAGEN -> Value.EUROPE_COPENHAGEN
            EUROPE_DUBLIN -> Value.EUROPE_DUBLIN
            EUROPE_GIBRALTAR -> Value.EUROPE_GIBRALTAR
            EUROPE_GUERNSEY -> Value.EUROPE_GUERNSEY
            EUROPE_HELSINKI -> Value.EUROPE_HELSINKI
            EUROPE_ISLE_OF_MAN -> Value.EUROPE_ISLE_OF_MAN
            EUROPE_ISTANBUL -> Value.EUROPE_ISTANBUL
            EUROPE_JERSEY -> Value.EUROPE_JERSEY
            EUROPE_KALININGRAD -> Value.EUROPE_KALININGRAD
            EUROPE_KIEV -> Value.EUROPE_KIEV
            EUROPE_LISBON -> Value.EUROPE_LISBON
            EUROPE_LJUBLJANA -> Value.EUROPE_LJUBLJANA
            EUROPE_LONDON -> Value.EUROPE_LONDON
            EUROPE_LUXEMBOURG -> Value.EUROPE_LUXEMBOURG
            EUROPE_MADRID -> Value.EUROPE_MADRID
            EUROPE_MALTA -> Value.EUROPE_MALTA
            EUROPE_MARIEHAMN -> Value.EUROPE_MARIEHAMN
            EUROPE_MINSK -> Value.EUROPE_MINSK
            EUROPE_MONACO -> Value.EUROPE_MONACO
            EUROPE_MOSCOW -> Value.EUROPE_MOSCOW
            EUROPE_OSLO -> Value.EUROPE_OSLO
            EUROPE_PARIS -> Value.EUROPE_PARIS
            EUROPE_PODGORICA -> Value.EUROPE_PODGORICA
            EUROPE_PRAGUE -> Value.EUROPE_PRAGUE
            EUROPE_RIGA -> Value.EUROPE_RIGA
            EUROPE_ROME -> Value.EUROPE_ROME
            EUROPE_SAMARA -> Value.EUROPE_SAMARA
            EUROPE_SAN_MARINO -> Value.EUROPE_SAN_MARINO
            EUROPE_SARAJEVO -> Value.EUROPE_SARAJEVO
            EUROPE_SIMFEROPOL -> Value.EUROPE_SIMFEROPOL
            EUROPE_SKOPJE -> Value.EUROPE_SKOPJE
            EUROPE_SOFIA -> Value.EUROPE_SOFIA
            EUROPE_STOCKHOLM -> Value.EUROPE_STOCKHOLM
            EUROPE_TALLINN -> Value.EUROPE_TALLINN
            EUROPE_TIRANE -> Value.EUROPE_TIRANE
            EUROPE_UZHGOROD -> Value.EUROPE_UZHGOROD
            EUROPE_VADUZ -> Value.EUROPE_VADUZ
            EUROPE_VATICAN -> Value.EUROPE_VATICAN
            EUROPE_VIENNA -> Value.EUROPE_VIENNA
            EUROPE_VILNIUS -> Value.EUROPE_VILNIUS
            EUROPE_VOLGOGRAD -> Value.EUROPE_VOLGOGRAD
            EUROPE_WARSAW -> Value.EUROPE_WARSAW
            EUROPE_ZAGREB -> Value.EUROPE_ZAGREB
            EUROPE_ZAPOROZHYE -> Value.EUROPE_ZAPOROZHYE
            EUROPE_ZURICH -> Value.EUROPE_ZURICH
            GMT -> Value.GMT
            INDIAN_ANTANANARIVO -> Value.INDIAN_ANTANANARIVO
            INDIAN_CHAGOS -> Value.INDIAN_CHAGOS
            INDIAN_CHRISTMAS -> Value.INDIAN_CHRISTMAS
            INDIAN_COCOS -> Value.INDIAN_COCOS
            INDIAN_COMORO -> Value.INDIAN_COMORO
            INDIAN_KERGUELEN -> Value.INDIAN_KERGUELEN
            INDIAN_MAHE -> Value.INDIAN_MAHE
            INDIAN_MALDIVES -> Value.INDIAN_MALDIVES
            INDIAN_MAURITIUS -> Value.INDIAN_MAURITIUS
            INDIAN_MAYOTTE -> Value.INDIAN_MAYOTTE
            INDIAN_REUNION -> Value.INDIAN_REUNION
            PACIFIC_APIA -> Value.PACIFIC_APIA
            PACIFIC_AUCKLAND -> Value.PACIFIC_AUCKLAND
            PACIFIC_CHATHAM -> Value.PACIFIC_CHATHAM
            PACIFIC_CHUUK -> Value.PACIFIC_CHUUK
            PACIFIC_EASTER -> Value.PACIFIC_EASTER
            PACIFIC_EFATE -> Value.PACIFIC_EFATE
            PACIFIC_ENDERBURY -> Value.PACIFIC_ENDERBURY
            PACIFIC_FAKAOFO -> Value.PACIFIC_FAKAOFO
            PACIFIC_FIJI -> Value.PACIFIC_FIJI
            PACIFIC_FUNAFUTI -> Value.PACIFIC_FUNAFUTI
            PACIFIC_GALAPAGOS -> Value.PACIFIC_GALAPAGOS
            PACIFIC_GAMBIER -> Value.PACIFIC_GAMBIER
            PACIFIC_GUADALCANAL -> Value.PACIFIC_GUADALCANAL
            PACIFIC_GUAM -> Value.PACIFIC_GUAM
            PACIFIC_HONOLULU -> Value.PACIFIC_HONOLULU
            PACIFIC_JOHNSTON -> Value.PACIFIC_JOHNSTON
            PACIFIC_KIRITIMATI -> Value.PACIFIC_KIRITIMATI
            PACIFIC_KOSRAE -> Value.PACIFIC_KOSRAE
            PACIFIC_KWAJALEIN -> Value.PACIFIC_KWAJALEIN
            PACIFIC_MAJURO -> Value.PACIFIC_MAJURO
            PACIFIC_MARQUESAS -> Value.PACIFIC_MARQUESAS
            PACIFIC_MIDWAY -> Value.PACIFIC_MIDWAY
            PACIFIC_NAURU -> Value.PACIFIC_NAURU
            PACIFIC_NIUE -> Value.PACIFIC_NIUE
            PACIFIC_NORFOLK -> Value.PACIFIC_NORFOLK
            PACIFIC_NOUMEA -> Value.PACIFIC_NOUMEA
            PACIFIC_PAGO_PAGO -> Value.PACIFIC_PAGO_PAGO
            PACIFIC_PALAU -> Value.PACIFIC_PALAU
            PACIFIC_PITCAIRN -> Value.PACIFIC_PITCAIRN
            PACIFIC_POHNPEI -> Value.PACIFIC_POHNPEI
            PACIFIC_PORT_MORESBY -> Value.PACIFIC_PORT_MORESBY
            PACIFIC_RAROTONGA -> Value.PACIFIC_RAROTONGA
            PACIFIC_SAIPAN -> Value.PACIFIC_SAIPAN
            PACIFIC_TAHITI -> Value.PACIFIC_TAHITI
            PACIFIC_TARAWA -> Value.PACIFIC_TARAWA
            PACIFIC_TONGATAPU -> Value.PACIFIC_TONGATAPU
            PACIFIC_WAKE -> Value.PACIFIC_WAKE
            PACIFIC_WALLIS -> Value.PACIFIC_WALLIS
            US_ALASKA -> Value.US_ALASKA
            US_ARIZONA -> Value.US_ARIZONA
            US_CENTRAL -> Value.US_CENTRAL
            US_EASTERN -> Value.US_EASTERN
            US_HAWAII -> Value.US_HAWAII
            US_MOUNTAIN -> Value.US_MOUNTAIN
            US_PACIFIC -> Value.US_PACIFIC
            UTC -> Value.UTC
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws LegalesignInvalidDataException if this class instance's value is a not a known
     *   member.
     */
    fun known(): Known =
        when (this) {
            AFRICA_ABIDJAN -> Known.AFRICA_ABIDJAN
            AFRICA_ACCRA -> Known.AFRICA_ACCRA
            AFRICA_ADDIS_ABABA -> Known.AFRICA_ADDIS_ABABA
            AFRICA_ALGIERS -> Known.AFRICA_ALGIERS
            AFRICA_ASMARA -> Known.AFRICA_ASMARA
            AFRICA_BAMAKO -> Known.AFRICA_BAMAKO
            AFRICA_BANGUI -> Known.AFRICA_BANGUI
            AFRICA_BANJUL -> Known.AFRICA_BANJUL
            AFRICA_BISSAU -> Known.AFRICA_BISSAU
            AFRICA_BLANTYRE -> Known.AFRICA_BLANTYRE
            AFRICA_BRAZZAVILLE -> Known.AFRICA_BRAZZAVILLE
            AFRICA_BUJUMBURA -> Known.AFRICA_BUJUMBURA
            AFRICA_CAIRO -> Known.AFRICA_CAIRO
            AFRICA_CASABLANCA -> Known.AFRICA_CASABLANCA
            AFRICA_CEUTA -> Known.AFRICA_CEUTA
            AFRICA_CONAKRY -> Known.AFRICA_CONAKRY
            AFRICA_DAKAR -> Known.AFRICA_DAKAR
            AFRICA_DAR_ES_SALAAM -> Known.AFRICA_DAR_ES_SALAAM
            AFRICA_DJIBOUTI -> Known.AFRICA_DJIBOUTI
            AFRICA_DOUALA -> Known.AFRICA_DOUALA
            AFRICA_EL_AAIUN -> Known.AFRICA_EL_AAIUN
            AFRICA_FREETOWN -> Known.AFRICA_FREETOWN
            AFRICA_GABORONE -> Known.AFRICA_GABORONE
            AFRICA_HARARE -> Known.AFRICA_HARARE
            AFRICA_JOHANNESBURG -> Known.AFRICA_JOHANNESBURG
            AFRICA_JUBA -> Known.AFRICA_JUBA
            AFRICA_KAMPALA -> Known.AFRICA_KAMPALA
            AFRICA_KHARTOUM -> Known.AFRICA_KHARTOUM
            AFRICA_KIGALI -> Known.AFRICA_KIGALI
            AFRICA_KINSHASA -> Known.AFRICA_KINSHASA
            AFRICA_LAGOS -> Known.AFRICA_LAGOS
            AFRICA_LIBREVILLE -> Known.AFRICA_LIBREVILLE
            AFRICA_LOME -> Known.AFRICA_LOME
            AFRICA_LUANDA -> Known.AFRICA_LUANDA
            AFRICA_LUBUMBASHI -> Known.AFRICA_LUBUMBASHI
            AFRICA_LUSAKA -> Known.AFRICA_LUSAKA
            AFRICA_MALABO -> Known.AFRICA_MALABO
            AFRICA_MAPUTO -> Known.AFRICA_MAPUTO
            AFRICA_MASERU -> Known.AFRICA_MASERU
            AFRICA_MBABANE -> Known.AFRICA_MBABANE
            AFRICA_MOGADISHU -> Known.AFRICA_MOGADISHU
            AFRICA_MONROVIA -> Known.AFRICA_MONROVIA
            AFRICA_NAIROBI -> Known.AFRICA_NAIROBI
            AFRICA_NDJAMENA -> Known.AFRICA_NDJAMENA
            AFRICA_NIAMEY -> Known.AFRICA_NIAMEY
            AFRICA_NOUAKCHOTT -> Known.AFRICA_NOUAKCHOTT
            AFRICA_OUAGADOUGOU -> Known.AFRICA_OUAGADOUGOU
            AFRICA_PORTO_NOVO -> Known.AFRICA_PORTO_NOVO
            AFRICA_SAO_TOME -> Known.AFRICA_SAO_TOME
            AFRICA_TRIPOLI -> Known.AFRICA_TRIPOLI
            AFRICA_TUNIS -> Known.AFRICA_TUNIS
            AFRICA_WINDHOEK -> Known.AFRICA_WINDHOEK
            AMERICA_ADAK -> Known.AMERICA_ADAK
            AMERICA_ANCHORAGE -> Known.AMERICA_ANCHORAGE
            AMERICA_ANGUILLA -> Known.AMERICA_ANGUILLA
            AMERICA_ANTIGUA -> Known.AMERICA_ANTIGUA
            AMERICA_ARAGUAINA -> Known.AMERICA_ARAGUAINA
            AMERICA_ARGENTINA_BUENOS_AIRES -> Known.AMERICA_ARGENTINA_BUENOS_AIRES
            AMERICA_ARGENTINA_CATAMARCA -> Known.AMERICA_ARGENTINA_CATAMARCA
            AMERICA_ARGENTINA_CORDOBA -> Known.AMERICA_ARGENTINA_CORDOBA
            AMERICA_ARGENTINA_JUJUY -> Known.AMERICA_ARGENTINA_JUJUY
            AMERICA_ARGENTINA_LA_RIOJA -> Known.AMERICA_ARGENTINA_LA_RIOJA
            AMERICA_ARGENTINA_MENDOZA -> Known.AMERICA_ARGENTINA_MENDOZA
            AMERICA_ARGENTINA_RIO_GALLEGOS -> Known.AMERICA_ARGENTINA_RIO_GALLEGOS
            AMERICA_ARGENTINA_SALTA -> Known.AMERICA_ARGENTINA_SALTA
            AMERICA_ARGENTINA_SAN_JUAN -> Known.AMERICA_ARGENTINA_SAN_JUAN
            AMERICA_ARGENTINA_SAN_LUIS -> Known.AMERICA_ARGENTINA_SAN_LUIS
            AMERICA_ARGENTINA_TUCUMAN -> Known.AMERICA_ARGENTINA_TUCUMAN
            AMERICA_ARGENTINA_USHUAIA -> Known.AMERICA_ARGENTINA_USHUAIA
            AMERICA_ARUBA -> Known.AMERICA_ARUBA
            AMERICA_ASUNCION -> Known.AMERICA_ASUNCION
            AMERICA_ATIKOKAN -> Known.AMERICA_ATIKOKAN
            AMERICA_BAHIA -> Known.AMERICA_BAHIA
            AMERICA_BAHIA_BANDERAS -> Known.AMERICA_BAHIA_BANDERAS
            AMERICA_BARBADOS -> Known.AMERICA_BARBADOS
            AMERICA_BELEM -> Known.AMERICA_BELEM
            AMERICA_BELIZE -> Known.AMERICA_BELIZE
            AMERICA_BLANC_SABLON -> Known.AMERICA_BLANC_SABLON
            AMERICA_BOA_VISTA -> Known.AMERICA_BOA_VISTA
            AMERICA_BOGOTA -> Known.AMERICA_BOGOTA
            AMERICA_BOISE -> Known.AMERICA_BOISE
            AMERICA_CAMBRIDGE_BAY -> Known.AMERICA_CAMBRIDGE_BAY
            AMERICA_CAMPO_GRANDE -> Known.AMERICA_CAMPO_GRANDE
            AMERICA_CANCUN -> Known.AMERICA_CANCUN
            AMERICA_CARACAS -> Known.AMERICA_CARACAS
            AMERICA_CAYENNE -> Known.AMERICA_CAYENNE
            AMERICA_CAYMAN -> Known.AMERICA_CAYMAN
            AMERICA_CHICAGO -> Known.AMERICA_CHICAGO
            AMERICA_CHIHUAHUA -> Known.AMERICA_CHIHUAHUA
            AMERICA_COSTA_RICA -> Known.AMERICA_COSTA_RICA
            AMERICA_CRESTON -> Known.AMERICA_CRESTON
            AMERICA_CUIABA -> Known.AMERICA_CUIABA
            AMERICA_CURACAO -> Known.AMERICA_CURACAO
            AMERICA_DANMARKSHAVN -> Known.AMERICA_DANMARKSHAVN
            AMERICA_DAWSON -> Known.AMERICA_DAWSON
            AMERICA_DAWSON_CREEK -> Known.AMERICA_DAWSON_CREEK
            AMERICA_DENVER -> Known.AMERICA_DENVER
            AMERICA_DETROIT -> Known.AMERICA_DETROIT
            AMERICA_DOMINICA -> Known.AMERICA_DOMINICA
            AMERICA_EDMONTON -> Known.AMERICA_EDMONTON
            AMERICA_EIRUNEPE -> Known.AMERICA_EIRUNEPE
            AMERICA_EL_SALVADOR -> Known.AMERICA_EL_SALVADOR
            AMERICA_FORTALEZA -> Known.AMERICA_FORTALEZA
            AMERICA_GLACE_BAY -> Known.AMERICA_GLACE_BAY
            AMERICA_GODTHAB -> Known.AMERICA_GODTHAB
            AMERICA_GOOSE_BAY -> Known.AMERICA_GOOSE_BAY
            AMERICA_GRAND_TURK -> Known.AMERICA_GRAND_TURK
            AMERICA_GRENADA -> Known.AMERICA_GRENADA
            AMERICA_GUADELOUPE -> Known.AMERICA_GUADELOUPE
            AMERICA_GUATEMALA -> Known.AMERICA_GUATEMALA
            AMERICA_GUAYAQUIL -> Known.AMERICA_GUAYAQUIL
            AMERICA_GUYANA -> Known.AMERICA_GUYANA
            AMERICA_HALIFAX -> Known.AMERICA_HALIFAX
            AMERICA_HAVANA -> Known.AMERICA_HAVANA
            AMERICA_HERMOSILLO -> Known.AMERICA_HERMOSILLO
            AMERICA_INDIANA_INDIANAPOLIS -> Known.AMERICA_INDIANA_INDIANAPOLIS
            AMERICA_INDIANA_KNOX -> Known.AMERICA_INDIANA_KNOX
            AMERICA_INDIANA_MARENGO -> Known.AMERICA_INDIANA_MARENGO
            AMERICA_INDIANA_PETERSBURG -> Known.AMERICA_INDIANA_PETERSBURG
            AMERICA_INDIANA_TELL_CITY -> Known.AMERICA_INDIANA_TELL_CITY
            AMERICA_INDIANA_VEVAY -> Known.AMERICA_INDIANA_VEVAY
            AMERICA_INDIANA_VINCENNES -> Known.AMERICA_INDIANA_VINCENNES
            AMERICA_INDIANA_WINAMAC -> Known.AMERICA_INDIANA_WINAMAC
            AMERICA_INUVIK -> Known.AMERICA_INUVIK
            AMERICA_IQALUIT -> Known.AMERICA_IQALUIT
            AMERICA_JAMAICA -> Known.AMERICA_JAMAICA
            AMERICA_JUNEAU -> Known.AMERICA_JUNEAU
            AMERICA_KENTUCKY_LOUISVILLE -> Known.AMERICA_KENTUCKY_LOUISVILLE
            AMERICA_KENTUCKY_MONTICELLO -> Known.AMERICA_KENTUCKY_MONTICELLO
            AMERICA_KRALENDIJK -> Known.AMERICA_KRALENDIJK
            AMERICA_LA_PAZ -> Known.AMERICA_LA_PAZ
            AMERICA_LIMA -> Known.AMERICA_LIMA
            AMERICA_LOS_ANGELES -> Known.AMERICA_LOS_ANGELES
            AMERICA_LOWER_PRINCES -> Known.AMERICA_LOWER_PRINCES
            AMERICA_MACEIO -> Known.AMERICA_MACEIO
            AMERICA_MANAGUA -> Known.AMERICA_MANAGUA
            AMERICA_MANAUS -> Known.AMERICA_MANAUS
            AMERICA_MARIGOT -> Known.AMERICA_MARIGOT
            AMERICA_MARTINIQUE -> Known.AMERICA_MARTINIQUE
            AMERICA_MATAMOROS -> Known.AMERICA_MATAMOROS
            AMERICA_MAZATLAN -> Known.AMERICA_MAZATLAN
            AMERICA_MENOMINEE -> Known.AMERICA_MENOMINEE
            AMERICA_MERIDA -> Known.AMERICA_MERIDA
            AMERICA_METLAKATLA -> Known.AMERICA_METLAKATLA
            AMERICA_MEXICO_CITY -> Known.AMERICA_MEXICO_CITY
            AMERICA_MIQUELON -> Known.AMERICA_MIQUELON
            AMERICA_MONCTON -> Known.AMERICA_MONCTON
            AMERICA_MONTERREY -> Known.AMERICA_MONTERREY
            AMERICA_MONTEVIDEO -> Known.AMERICA_MONTEVIDEO
            AMERICA_MONTREAL -> Known.AMERICA_MONTREAL
            AMERICA_MONTSERRAT -> Known.AMERICA_MONTSERRAT
            AMERICA_NASSAU -> Known.AMERICA_NASSAU
            AMERICA_NEW_YORK -> Known.AMERICA_NEW_YORK
            AMERICA_NIPIGON -> Known.AMERICA_NIPIGON
            AMERICA_NOME -> Known.AMERICA_NOME
            AMERICA_NORONHA -> Known.AMERICA_NORONHA
            AMERICA_NORTH_DAKOTA_BEULAH -> Known.AMERICA_NORTH_DAKOTA_BEULAH
            AMERICA_NORTH_DAKOTA_CENTER -> Known.AMERICA_NORTH_DAKOTA_CENTER
            AMERICA_NORTH_DAKOTA_NEW_SALEM -> Known.AMERICA_NORTH_DAKOTA_NEW_SALEM
            AMERICA_OJINAGA -> Known.AMERICA_OJINAGA
            AMERICA_PANAMA -> Known.AMERICA_PANAMA
            AMERICA_PANGNIRTUNG -> Known.AMERICA_PANGNIRTUNG
            AMERICA_PARAMARIBO -> Known.AMERICA_PARAMARIBO
            AMERICA_PHOENIX -> Known.AMERICA_PHOENIX
            AMERICA_PORT_AU_PRINCE -> Known.AMERICA_PORT_AU_PRINCE
            AMERICA_PORT_OF_SPAIN -> Known.AMERICA_PORT_OF_SPAIN
            AMERICA_PORTO_VELHO -> Known.AMERICA_PORTO_VELHO
            AMERICA_PUERTO_RICO -> Known.AMERICA_PUERTO_RICO
            AMERICA_RAINY_RIVER -> Known.AMERICA_RAINY_RIVER
            AMERICA_RANKIN_INLET -> Known.AMERICA_RANKIN_INLET
            AMERICA_RECIFE -> Known.AMERICA_RECIFE
            AMERICA_REGINA -> Known.AMERICA_REGINA
            AMERICA_RESOLUTE -> Known.AMERICA_RESOLUTE
            AMERICA_RIO_BRANCO -> Known.AMERICA_RIO_BRANCO
            AMERICA_SANTA_ISABEL -> Known.AMERICA_SANTA_ISABEL
            AMERICA_SANTAREM -> Known.AMERICA_SANTAREM
            AMERICA_SANTIAGO -> Known.AMERICA_SANTIAGO
            AMERICA_SANTO_DOMINGO -> Known.AMERICA_SANTO_DOMINGO
            AMERICA_SAO_PAULO -> Known.AMERICA_SAO_PAULO
            AMERICA_SCORESBYSUND -> Known.AMERICA_SCORESBYSUND
            AMERICA_SHIPROCK -> Known.AMERICA_SHIPROCK
            AMERICA_SITKA -> Known.AMERICA_SITKA
            AMERICA_ST_BARTHELEMY -> Known.AMERICA_ST_BARTHELEMY
            AMERICA_ST_JOHNS -> Known.AMERICA_ST_JOHNS
            AMERICA_ST_KITTS -> Known.AMERICA_ST_KITTS
            AMERICA_ST_LUCIA -> Known.AMERICA_ST_LUCIA
            AMERICA_ST_THOMAS -> Known.AMERICA_ST_THOMAS
            AMERICA_ST_VINCENT -> Known.AMERICA_ST_VINCENT
            AMERICA_SWIFT_CURRENT -> Known.AMERICA_SWIFT_CURRENT
            AMERICA_TEGUCIGALPA -> Known.AMERICA_TEGUCIGALPA
            AMERICA_THULE -> Known.AMERICA_THULE
            AMERICA_THUNDER_BAY -> Known.AMERICA_THUNDER_BAY
            AMERICA_TIJUANA -> Known.AMERICA_TIJUANA
            AMERICA_TORONTO -> Known.AMERICA_TORONTO
            AMERICA_TORTOLA -> Known.AMERICA_TORTOLA
            AMERICA_VANCOUVER -> Known.AMERICA_VANCOUVER
            AMERICA_WHITEHORSE -> Known.AMERICA_WHITEHORSE
            AMERICA_WINNIPEG -> Known.AMERICA_WINNIPEG
            AMERICA_YAKUTAT -> Known.AMERICA_YAKUTAT
            AMERICA_YELLOWKNIFE -> Known.AMERICA_YELLOWKNIFE
            ANTARCTICA_CASEY -> Known.ANTARCTICA_CASEY
            ANTARCTICA_DAVIS -> Known.ANTARCTICA_DAVIS
            ANTARCTICA_DUMONT_D_URVILLE -> Known.ANTARCTICA_DUMONT_D_URVILLE
            ANTARCTICA_MACQUARIE -> Known.ANTARCTICA_MACQUARIE
            ANTARCTICA_MAWSON -> Known.ANTARCTICA_MAWSON
            ANTARCTICA_MC_MURDO -> Known.ANTARCTICA_MC_MURDO
            ANTARCTICA_PALMER -> Known.ANTARCTICA_PALMER
            ANTARCTICA_ROTHERA -> Known.ANTARCTICA_ROTHERA
            ANTARCTICA_SOUTH_POLE -> Known.ANTARCTICA_SOUTH_POLE
            ANTARCTICA_SYOWA -> Known.ANTARCTICA_SYOWA
            ANTARCTICA_VOSTOK -> Known.ANTARCTICA_VOSTOK
            ARCTIC_LONGYEARBYEN -> Known.ARCTIC_LONGYEARBYEN
            ASIA_ADEN -> Known.ASIA_ADEN
            ASIA_ALMATY -> Known.ASIA_ALMATY
            ASIA_AMMAN -> Known.ASIA_AMMAN
            ASIA_ANADYR -> Known.ASIA_ANADYR
            ASIA_AQTAU -> Known.ASIA_AQTAU
            ASIA_AQTOBE -> Known.ASIA_AQTOBE
            ASIA_ASHGABAT -> Known.ASIA_ASHGABAT
            ASIA_BAGHDAD -> Known.ASIA_BAGHDAD
            ASIA_BAHRAIN -> Known.ASIA_BAHRAIN
            ASIA_BAKU -> Known.ASIA_BAKU
            ASIA_BANGKOK -> Known.ASIA_BANGKOK
            ASIA_BEIRUT -> Known.ASIA_BEIRUT
            ASIA_BISHKEK -> Known.ASIA_BISHKEK
            ASIA_BRUNEI -> Known.ASIA_BRUNEI
            ASIA_CHOIBALSAN -> Known.ASIA_CHOIBALSAN
            ASIA_CHONGQING -> Known.ASIA_CHONGQING
            ASIA_COLOMBO -> Known.ASIA_COLOMBO
            ASIA_DAMASCUS -> Known.ASIA_DAMASCUS
            ASIA_DHAKA -> Known.ASIA_DHAKA
            ASIA_DILI -> Known.ASIA_DILI
            ASIA_DUBAI -> Known.ASIA_DUBAI
            ASIA_DUSHANBE -> Known.ASIA_DUSHANBE
            ASIA_GAZA -> Known.ASIA_GAZA
            ASIA_HARBIN -> Known.ASIA_HARBIN
            ASIA_HEBRON -> Known.ASIA_HEBRON
            ASIA_HO_CHI_MINH -> Known.ASIA_HO_CHI_MINH
            ASIA_HONG_KONG -> Known.ASIA_HONG_KONG
            ASIA_HOVD -> Known.ASIA_HOVD
            ASIA_IRKUTSK -> Known.ASIA_IRKUTSK
            ASIA_JAKARTA -> Known.ASIA_JAKARTA
            ASIA_JAYAPURA -> Known.ASIA_JAYAPURA
            ASIA_JERUSALEM -> Known.ASIA_JERUSALEM
            ASIA_KABUL -> Known.ASIA_KABUL
            ASIA_KAMCHATKA -> Known.ASIA_KAMCHATKA
            ASIA_KARACHI -> Known.ASIA_KARACHI
            ASIA_KASHGAR -> Known.ASIA_KASHGAR
            ASIA_KATHMANDU -> Known.ASIA_KATHMANDU
            ASIA_KOLKATA -> Known.ASIA_KOLKATA
            ASIA_KRASNOYARSK -> Known.ASIA_KRASNOYARSK
            ASIA_KUALA_LUMPUR -> Known.ASIA_KUALA_LUMPUR
            ASIA_KUCHING -> Known.ASIA_KUCHING
            ASIA_KUWAIT -> Known.ASIA_KUWAIT
            ASIA_MACAU -> Known.ASIA_MACAU
            ASIA_MAGADAN -> Known.ASIA_MAGADAN
            ASIA_MAKASSAR -> Known.ASIA_MAKASSAR
            ASIA_MANILA -> Known.ASIA_MANILA
            ASIA_MUSCAT -> Known.ASIA_MUSCAT
            ASIA_NICOSIA -> Known.ASIA_NICOSIA
            ASIA_NOVOKUZNETSK -> Known.ASIA_NOVOKUZNETSK
            ASIA_NOVOSIBIRSK -> Known.ASIA_NOVOSIBIRSK
            ASIA_OMSK -> Known.ASIA_OMSK
            ASIA_ORAL -> Known.ASIA_ORAL
            ASIA_PHNOM_PENH -> Known.ASIA_PHNOM_PENH
            ASIA_PONTIANAK -> Known.ASIA_PONTIANAK
            ASIA_PYONGYANG -> Known.ASIA_PYONGYANG
            ASIA_QATAR -> Known.ASIA_QATAR
            ASIA_QYZYLORDA -> Known.ASIA_QYZYLORDA
            ASIA_RANGOON -> Known.ASIA_RANGOON
            ASIA_RIYADH -> Known.ASIA_RIYADH
            ASIA_SAKHALIN -> Known.ASIA_SAKHALIN
            ASIA_SAMARKAND -> Known.ASIA_SAMARKAND
            ASIA_SEOUL -> Known.ASIA_SEOUL
            ASIA_SHANGHAI -> Known.ASIA_SHANGHAI
            ASIA_SINGAPORE -> Known.ASIA_SINGAPORE
            ASIA_TAIPEI -> Known.ASIA_TAIPEI
            ASIA_TASHKENT -> Known.ASIA_TASHKENT
            ASIA_TBILISI -> Known.ASIA_TBILISI
            ASIA_TEHRAN -> Known.ASIA_TEHRAN
            ASIA_THIMPHU -> Known.ASIA_THIMPHU
            ASIA_TOKYO -> Known.ASIA_TOKYO
            ASIA_ULAANBAATAR -> Known.ASIA_ULAANBAATAR
            ASIA_URUMQI -> Known.ASIA_URUMQI
            ASIA_VIENTIANE -> Known.ASIA_VIENTIANE
            ASIA_VLADIVOSTOK -> Known.ASIA_VLADIVOSTOK
            ASIA_YAKUTSK -> Known.ASIA_YAKUTSK
            ASIA_YEKATERINBURG -> Known.ASIA_YEKATERINBURG
            ASIA_YEREVAN -> Known.ASIA_YEREVAN
            ATLANTIC_AZORES -> Known.ATLANTIC_AZORES
            ATLANTIC_BERMUDA -> Known.ATLANTIC_BERMUDA
            ATLANTIC_CANARY -> Known.ATLANTIC_CANARY
            ATLANTIC_CAPE_VERDE -> Known.ATLANTIC_CAPE_VERDE
            ATLANTIC_FAROE -> Known.ATLANTIC_FAROE
            ATLANTIC_MADEIRA -> Known.ATLANTIC_MADEIRA
            ATLANTIC_REYKJAVIK -> Known.ATLANTIC_REYKJAVIK
            ATLANTIC_SOUTH_GEORGIA -> Known.ATLANTIC_SOUTH_GEORGIA
            ATLANTIC_ST_HELENA -> Known.ATLANTIC_ST_HELENA
            ATLANTIC_STANLEY -> Known.ATLANTIC_STANLEY
            AUSTRALIA_ADELAIDE -> Known.AUSTRALIA_ADELAIDE
            AUSTRALIA_BRISBANE -> Known.AUSTRALIA_BRISBANE
            AUSTRALIA_BROKEN_HILL -> Known.AUSTRALIA_BROKEN_HILL
            AUSTRALIA_CURRIE -> Known.AUSTRALIA_CURRIE
            AUSTRALIA_DARWIN -> Known.AUSTRALIA_DARWIN
            AUSTRALIA_EUCLA -> Known.AUSTRALIA_EUCLA
            AUSTRALIA_HOBART -> Known.AUSTRALIA_HOBART
            AUSTRALIA_LINDEMAN -> Known.AUSTRALIA_LINDEMAN
            AUSTRALIA_LORD_HOWE -> Known.AUSTRALIA_LORD_HOWE
            AUSTRALIA_MELBOURNE -> Known.AUSTRALIA_MELBOURNE
            AUSTRALIA_PERTH -> Known.AUSTRALIA_PERTH
            AUSTRALIA_SYDNEY -> Known.AUSTRALIA_SYDNEY
            CANADA_ATLANTIC -> Known.CANADA_ATLANTIC
            CANADA_CENTRAL -> Known.CANADA_CENTRAL
            CANADA_EASTERN -> Known.CANADA_EASTERN
            CANADA_MOUNTAIN -> Known.CANADA_MOUNTAIN
            CANADA_NEWFOUNDLAND -> Known.CANADA_NEWFOUNDLAND
            CANADA_PACIFIC -> Known.CANADA_PACIFIC
            EUROPE_AMSTERDAM -> Known.EUROPE_AMSTERDAM
            EUROPE_ANDORRA -> Known.EUROPE_ANDORRA
            EUROPE_ATHENS -> Known.EUROPE_ATHENS
            EUROPE_BELGRADE -> Known.EUROPE_BELGRADE
            EUROPE_BERLIN -> Known.EUROPE_BERLIN
            EUROPE_BRATISLAVA -> Known.EUROPE_BRATISLAVA
            EUROPE_BRUSSELS -> Known.EUROPE_BRUSSELS
            EUROPE_BUCHAREST -> Known.EUROPE_BUCHAREST
            EUROPE_BUDAPEST -> Known.EUROPE_BUDAPEST
            EUROPE_CHISINAU -> Known.EUROPE_CHISINAU
            EUROPE_COPENHAGEN -> Known.EUROPE_COPENHAGEN
            EUROPE_DUBLIN -> Known.EUROPE_DUBLIN
            EUROPE_GIBRALTAR -> Known.EUROPE_GIBRALTAR
            EUROPE_GUERNSEY -> Known.EUROPE_GUERNSEY
            EUROPE_HELSINKI -> Known.EUROPE_HELSINKI
            EUROPE_ISLE_OF_MAN -> Known.EUROPE_ISLE_OF_MAN
            EUROPE_ISTANBUL -> Known.EUROPE_ISTANBUL
            EUROPE_JERSEY -> Known.EUROPE_JERSEY
            EUROPE_KALININGRAD -> Known.EUROPE_KALININGRAD
            EUROPE_KIEV -> Known.EUROPE_KIEV
            EUROPE_LISBON -> Known.EUROPE_LISBON
            EUROPE_LJUBLJANA -> Known.EUROPE_LJUBLJANA
            EUROPE_LONDON -> Known.EUROPE_LONDON
            EUROPE_LUXEMBOURG -> Known.EUROPE_LUXEMBOURG
            EUROPE_MADRID -> Known.EUROPE_MADRID
            EUROPE_MALTA -> Known.EUROPE_MALTA
            EUROPE_MARIEHAMN -> Known.EUROPE_MARIEHAMN
            EUROPE_MINSK -> Known.EUROPE_MINSK
            EUROPE_MONACO -> Known.EUROPE_MONACO
            EUROPE_MOSCOW -> Known.EUROPE_MOSCOW
            EUROPE_OSLO -> Known.EUROPE_OSLO
            EUROPE_PARIS -> Known.EUROPE_PARIS
            EUROPE_PODGORICA -> Known.EUROPE_PODGORICA
            EUROPE_PRAGUE -> Known.EUROPE_PRAGUE
            EUROPE_RIGA -> Known.EUROPE_RIGA
            EUROPE_ROME -> Known.EUROPE_ROME
            EUROPE_SAMARA -> Known.EUROPE_SAMARA
            EUROPE_SAN_MARINO -> Known.EUROPE_SAN_MARINO
            EUROPE_SARAJEVO -> Known.EUROPE_SARAJEVO
            EUROPE_SIMFEROPOL -> Known.EUROPE_SIMFEROPOL
            EUROPE_SKOPJE -> Known.EUROPE_SKOPJE
            EUROPE_SOFIA -> Known.EUROPE_SOFIA
            EUROPE_STOCKHOLM -> Known.EUROPE_STOCKHOLM
            EUROPE_TALLINN -> Known.EUROPE_TALLINN
            EUROPE_TIRANE -> Known.EUROPE_TIRANE
            EUROPE_UZHGOROD -> Known.EUROPE_UZHGOROD
            EUROPE_VADUZ -> Known.EUROPE_VADUZ
            EUROPE_VATICAN -> Known.EUROPE_VATICAN
            EUROPE_VIENNA -> Known.EUROPE_VIENNA
            EUROPE_VILNIUS -> Known.EUROPE_VILNIUS
            EUROPE_VOLGOGRAD -> Known.EUROPE_VOLGOGRAD
            EUROPE_WARSAW -> Known.EUROPE_WARSAW
            EUROPE_ZAGREB -> Known.EUROPE_ZAGREB
            EUROPE_ZAPOROZHYE -> Known.EUROPE_ZAPOROZHYE
            EUROPE_ZURICH -> Known.EUROPE_ZURICH
            GMT -> Known.GMT
            INDIAN_ANTANANARIVO -> Known.INDIAN_ANTANANARIVO
            INDIAN_CHAGOS -> Known.INDIAN_CHAGOS
            INDIAN_CHRISTMAS -> Known.INDIAN_CHRISTMAS
            INDIAN_COCOS -> Known.INDIAN_COCOS
            INDIAN_COMORO -> Known.INDIAN_COMORO
            INDIAN_KERGUELEN -> Known.INDIAN_KERGUELEN
            INDIAN_MAHE -> Known.INDIAN_MAHE
            INDIAN_MALDIVES -> Known.INDIAN_MALDIVES
            INDIAN_MAURITIUS -> Known.INDIAN_MAURITIUS
            INDIAN_MAYOTTE -> Known.INDIAN_MAYOTTE
            INDIAN_REUNION -> Known.INDIAN_REUNION
            PACIFIC_APIA -> Known.PACIFIC_APIA
            PACIFIC_AUCKLAND -> Known.PACIFIC_AUCKLAND
            PACIFIC_CHATHAM -> Known.PACIFIC_CHATHAM
            PACIFIC_CHUUK -> Known.PACIFIC_CHUUK
            PACIFIC_EASTER -> Known.PACIFIC_EASTER
            PACIFIC_EFATE -> Known.PACIFIC_EFATE
            PACIFIC_ENDERBURY -> Known.PACIFIC_ENDERBURY
            PACIFIC_FAKAOFO -> Known.PACIFIC_FAKAOFO
            PACIFIC_FIJI -> Known.PACIFIC_FIJI
            PACIFIC_FUNAFUTI -> Known.PACIFIC_FUNAFUTI
            PACIFIC_GALAPAGOS -> Known.PACIFIC_GALAPAGOS
            PACIFIC_GAMBIER -> Known.PACIFIC_GAMBIER
            PACIFIC_GUADALCANAL -> Known.PACIFIC_GUADALCANAL
            PACIFIC_GUAM -> Known.PACIFIC_GUAM
            PACIFIC_HONOLULU -> Known.PACIFIC_HONOLULU
            PACIFIC_JOHNSTON -> Known.PACIFIC_JOHNSTON
            PACIFIC_KIRITIMATI -> Known.PACIFIC_KIRITIMATI
            PACIFIC_KOSRAE -> Known.PACIFIC_KOSRAE
            PACIFIC_KWAJALEIN -> Known.PACIFIC_KWAJALEIN
            PACIFIC_MAJURO -> Known.PACIFIC_MAJURO
            PACIFIC_MARQUESAS -> Known.PACIFIC_MARQUESAS
            PACIFIC_MIDWAY -> Known.PACIFIC_MIDWAY
            PACIFIC_NAURU -> Known.PACIFIC_NAURU
            PACIFIC_NIUE -> Known.PACIFIC_NIUE
            PACIFIC_NORFOLK -> Known.PACIFIC_NORFOLK
            PACIFIC_NOUMEA -> Known.PACIFIC_NOUMEA
            PACIFIC_PAGO_PAGO -> Known.PACIFIC_PAGO_PAGO
            PACIFIC_PALAU -> Known.PACIFIC_PALAU
            PACIFIC_PITCAIRN -> Known.PACIFIC_PITCAIRN
            PACIFIC_POHNPEI -> Known.PACIFIC_POHNPEI
            PACIFIC_PORT_MORESBY -> Known.PACIFIC_PORT_MORESBY
            PACIFIC_RAROTONGA -> Known.PACIFIC_RAROTONGA
            PACIFIC_SAIPAN -> Known.PACIFIC_SAIPAN
            PACIFIC_TAHITI -> Known.PACIFIC_TAHITI
            PACIFIC_TARAWA -> Known.PACIFIC_TARAWA
            PACIFIC_TONGATAPU -> Known.PACIFIC_TONGATAPU
            PACIFIC_WAKE -> Known.PACIFIC_WAKE
            PACIFIC_WALLIS -> Known.PACIFIC_WALLIS
            US_ALASKA -> Known.US_ALASKA
            US_ARIZONA -> Known.US_ARIZONA
            US_CENTRAL -> Known.US_CENTRAL
            US_EASTERN -> Known.US_EASTERN
            US_HAWAII -> Known.US_HAWAII
            US_MOUNTAIN -> Known.US_MOUNTAIN
            US_PACIFIC -> Known.US_PACIFIC
            UTC -> Known.UTC
            else -> throw LegalesignInvalidDataException("Unknown TimezoneEnum: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws LegalesignInvalidDataException if this class instance's value does not have the
     *   expected primitive type.
     */
    fun asString(): String =
        _value().asString().orElseThrow { LegalesignInvalidDataException("Value is not a String") }

    private var validated: Boolean = false

    fun validate(): TimezoneEnum = apply {
        if (validated) {
            return@apply
        }

        known()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LegalesignInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TimezoneEnum && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
