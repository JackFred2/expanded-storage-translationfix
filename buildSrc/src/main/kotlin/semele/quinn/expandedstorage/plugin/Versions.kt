package semele.quinn.expandedstorage.plugin

import org.gradle.api.JavaVersion

object Versions {
    const val EXPANDEDSTORAGE = "10.3.0-beta.2"

    // Generic
    val java = JavaVersion.VERSION_17
    const val MINECRAFT = "1.20.4"
    const val PARCHMENT = "1.20.4:2024.02.25"
    const val JETBRAINS_ANNOTATIONS_VERSION = "24.1.0"
    val SUPPORTED_GAME_VERSIONS: List<String> = listOf(MINECRAFT)

    // Fabric
    const val FABRIC_LOADER = "0.15.3"
    const val FABRIC_API = "0.96.11+1.20.4"

    // NeoForge
    const val NEOFORGE = "20.4.222"

    // Quilt
    const val QUILT_LOADER = "0.23.1"
    const val QUILT_FABRIC_API = "9.0.0-alpha.6+0.96.11-1.20.4"

    // Dependencies
    const val EMI = "1.1.3+1.20.1" // https://modrinth.com/mod/emi/versions

    const val REI = "14.0.688" // https://modrinth.com/mod/rei/

    const val JEI = "15.3.0.4" // https://modrinth.com/mod/jei/
    const val JEI_MINECRAFT = "1.20.1"

    const val IPN = "1.10.9" // https://modrinth.com/mod/inventory-profiles-next/
    const val IPN_MINECRAFT_FABRIC = "1.20"
    const val IPN_MINECRAFT_FORGE = "1.20.1"

    const val LIB_IPN = "4.0.1" // https://modrinth.com/mod/libipn/
    const val LIB_IPN_MINECRAFT = "1.20"

    const val KFF = "4.10.0" // https://modrinth.com/mod/kotlin-for-forge/

    const val TOWELETTE = "5.0.1" // https://modrinth.com/mod/towelette/
    const val STATEMENT = "4.2.9" // https://modrinth.com/mod/statement/

    const val INVENTORY_TABS = "1.1.8+1.20" // https://modrinth.com/mod/inventory-tabs/

    const val MOD_MENU = "7.2.2" // https://modrinth.com/mod/modmenu/

    const val HTM = "1.1.9" // https://modrinth.com/mod/htm/

    const val AMECS = "1.3.10+mc.1.20.1" // https://maven.siphalor.de/de/siphalor/amecs-1.20/
    const val AMECS_API = "1.3.9+mc1.20-pre1" // https://maven.siphalor.de/de/siphalor/amecsapi-1.20/
    const val AMECS_MINECRAFT = "1.20"

    const val CARRIER = "1.12.0" // https://modrinth.com/mod/carrier/
    const val CARDINAL_COMPONENTS = "5.2.2" // https://modrinth.com/mod/cardinal-components-api/
    const val ARRP = "0.8.1" // https://modrinth.com/mod/arrp/

    const val CARRY_ON_FABRIC = "Mkla4B3q" // https://modrinth.com/mod/carry-on/
    const val CARRY_ON_FORGE = "edGQD16r" // https://modrinth.com/mod/carry-on/
}
