package axilians.khimeris

import arc.Core
import arc.Events
import arc.scene.style.TextureRegionDrawable
import arc.scene.ui.layout.Table
import arc.ApplicationListener
import arc.graphics.Color
import mindustry.game.EventType.ClientLoadEvent
import mindustry.game.Team
import mindustry.Vars.ui
import mindustry.Vars
import mindustry.ui.Fonts
import mindustry.gen.Icon
import axilians.khimeris.ArxOthers
import axilians.khimeris.ArxOther

object ArxUtilities {

    lateinit var AnkerTeam: Team

    fun load() {

        AnkerTeam = Team.get(112).apply {
            name = "arx-khimerum-anker"
            color.set(Color.valueOf("dbdbdb"))
        }
    }

    fun registerIcons() {
        Events.on(ClientLoadEvent::class.java) {
            Fonts.registerIcon("icon-e800", "arx-khimeris-f800", 0xE800, Core.atlas.find("arx-khimeris-f800"))
            Fonts.registerIcon("icon-e801", "arx-khimeris-f801", 0xE801, Core.atlas.find("arx-khimeris-f801"))
            Fonts.registerIcon("icon-e802", "arx-khimeris-f802", 0xE802, Core.atlas.find("arx-khimeris-f802"))
            Fonts.registerIcon("icon-e803", "arx-khimeris-f803", 0xE803, Core.atlas.find("arx-khimeris-f803"))
            Fonts.registerIcon("icon-e804", "arx-khimeris-f804", 0xE804, Core.atlas.find("arx-khimeris-f804"))
            Fonts.registerIcon("icon-e805", "arx-khimeris-f805", 0xE805, Core.atlas.find("arx-khimeris-f805"))
            Fonts.registerIcon("icon-e806", "arx-khimeris-f806", 0xE806, Core.atlas.find("arx-khimeris-f806"))
            Fonts.registerIcon("icon-e807", "arx-khimeris-f807", 0xE807, Core.atlas.find("arx-khimeris-f807"))
            Fonts.registerIcon("icon-e808", "arx-khimeris-f808", 0xE808, Core.atlas.find("arx-khimeris-f808"))
            Fonts.registerIcon("icon-e809", "arx-khimeris-f809", 0xE809, Core.atlas.find("arx-khimeris-f809"))
            Fonts.registerIcon("icon-e80a", "arx-khimeris-f80a", 0xE80A, Core.atlas.find("arx-khimeris-f80a"))
            Fonts.registerIcon("icon-e80b", "arx-khimeris-f80b", 0xE80B, Core.atlas.find("arx-khimeris-f80b"))
            Fonts.registerIcon("icon-e80c", "arx-khimeris-f80c", 0xE80C, Core.atlas.find("arx-khimeris-f80c"))
            Fonts.registerIcon("icon-e80d", "arx-khimeris-f80d", 0xE80D, Core.atlas.find("arx-khimeris-f80d"))
            Fonts.registerIcon("icon-e80e", "arx-khimeris-f80e", 0xE80E, Core.atlas.find("arx-khimeris-f80e"))
            Fonts.registerIcon("icon-e80f", "arx-khimeris-f80f", 0xE80F, Core.atlas.find("arx-khimeris-f80f"))

            Fonts.registerIcon("icon-e810", "arx-khimeris-f810", 0xE810, Core.atlas.find("arx-khimeris-axilians"))
            Fonts.registerIcon("icon-e811", "arx-khimeris-f811", 0xE811, Core.atlas.find("arx-khimeris-f811"))
            Fonts.registerIcon("icon-e812", "arx-khimeris-f812", 0xE812, Core.atlas.find("arx-khimeris-f812"))
            Fonts.registerIcon("icon-e813", "arx-khimeris-f813", 0xE813, Core.atlas.find("arx-khimeris-f813"))
            Fonts.registerIcon("icon-e814", "arx-khimeris-f814", 0xE814, Core.atlas.find("arx-khimeris-f814"))
            Fonts.registerIcon("icon-e815", "arx-khimeris-f815", 0xE815, Core.atlas.find("arx-khimeris-f815"))
            Fonts.registerIcon("icon-e816", "arx-khimeris-f816", 0xE816, Core.atlas.find("arx-khimeris-f816"))
            Fonts.registerIcon("icon-e817", "arx-khimeris-f817", 0xE817, Core.atlas.find("arx-khimeris-f817"))
            Fonts.registerIcon("icon-e818", "arx-khimeris-f818", 0xE818, Core.atlas.find("arx-khimeris-f818"))
            Fonts.registerIcon("icon-e819", "arx-khimeris-f819", 0xE819, Core.atlas.find("arx-khimeris-f819"))
            Fonts.registerIcon("icon-e81a", "arx-khimeris-f81a", 0xE81A, Core.atlas.find("arx-khimeris-f81a"))
            Fonts.registerIcon("icon-e81b", "arx-khimeris-f81b", 0xE81B, Core.atlas.find("arx-khimeris-f81b"))
            Fonts.registerIcon("icon-e81c", "arx-khimeris-f81c", 0xE81C, Core.atlas.find("arx-khimeris-f81c"))
            Fonts.registerIcon("icon-e81d", "arx-khimeris-f81d", 0xE81D, Core.atlas.find("arx-khimeris-f81d"))
            Fonts.registerIcon("icon-e81e", "team-green", 0xE81E, Core.atlas.find("arx-khimeris-team-green"))
            Fonts.registerIcon("icon-e81f", "team-blue", 0xE81F, Core.atlas.find("arx-khimeris-team-blue"))
            Fonts.registerIcon("icon-e820", "team-anker", 0xE820, Core.atlas.find("arx-khimeris-team-anker"))
            //Fonts.registerIcon("arx-ignition",   "arx-khimeris-ignition",   0xC810, Core.atlas.find("arx-khimeris-ignition"))

        }
    }

    fun modinfo() {
        Events.on(ClientLoadEvent::class.java) {
            val mod = Vars.mods.getMod("arx-khimeris")
            mod.meta.displayName = Core.bundle.get("mod.arx-khimeris.displayName")
            mod.meta.subtitle    = Core.bundle.get("mod.arx-khimeris.subtitle")
            mod.meta.description = Core.bundle.get("mod.arx-khimeris.description") + "\n "
            mod.meta.author      = Core.bundle.get("mod.arx-khimeris.author")
        }
    }

    fun settings() {
        ui.settings.addCategory( Core.bundle.get("setting.arx-khimeris-settings.name"), TextureRegionDrawable(Core.atlas.find("arx-khimeris-settings")))
        { table ->
            table.checkPref("arx-khimeris-team-enabled", false)
            table.sliderPref("arx-khimeris-team-slot", 5, 0, 5, 1) { slot -> Core.bundle.format("setting.arx-khimeris-team-slot.format", slot + 1)}
            table.checkPref("arx-khimeris-translate-database", true)
        }
    }

    fun translate() {
        fun apply(translate: Boolean) {
            if (translate) {
                Core.bundle.properties.apply {
                    put("database-category.status",  Core.bundle.get("arx-category.status"))
                    put("database-category.unit",    Core.bundle.get("arx-category.unit"))
                    put("database-category.block",   Core.bundle.get("arx-category.block"))
                    put("database-category.item",    Core.bundle.get("arx-category.item"))
                    put("database-category.liquid",  Core.bundle.get("arx-category.liquid"))
                    put("database-category.weather", Core.bundle.get("arx-category.weather"))
                    put("database-category.planet",  Core.bundle.get("arx-category.planet"))
                    put("database-category.sector",  Core.bundle.get("arx-category.sector"))
                }
            } else {
                Core.bundle.properties.apply {
                    remove("database-category.status")
                    remove("database-category.unit")
                    remove("database-category.block")
                    remove("database-category.item")
                    remove("database-category.liquid")
                    remove("database-category.weather")
                    remove("database-category.planet")
                    remove("database-category.sector")
                }
            }
        }

        Events.on(ClientLoadEvent::class.java) {
            apply(Core.settings.getBool("arx-khimeris-translate-database", true))
        }

        Core.app.addListener(object : ApplicationListener {
            override fun init() {}
            override fun update() {}
            override fun resize(width: Int, height: Int) {}
            override fun pause() {}
            override fun resume() {
                apply(Core.settings.getBool("arx-khimeris-translate-database", true))
            }
            override fun dispose() {}
        })
    }

    fun teamSlot() {
        fun apply() {
            val enabled = Core.settings.getBool("arx-khimeris-team-enabled", false)
            val slot = Core.settings.getInt("arx-khimeris-team-slot", 5)

            val snapshot = Array(6) { i ->
                if (Team.baseTeams[i].id == 112) Team.all[i]
                else Team.baseTeams[i]
            }

            for (i in snapshot.indices) {
                Team.baseTeams[i] = snapshot[i]
            }

            if (enabled) {
                Team.baseTeams[slot] = AnkerTeam
            }
        }

        ui.settings.hidden { apply() }

        Events.on(ClientLoadEvent::class.java) {
            apply()
        }
    }

    fun teamIcons() {
        Events.on(ClientLoadEvent::class.java) {
            Team.green.emoji            = "${0xE81E.toChar()}"
            Team.blue.emoji             = "${0xE81F.toChar()}"
            AnkerTeam.emoji   = "${0xE820.toChar()}"
        }
    }
}
