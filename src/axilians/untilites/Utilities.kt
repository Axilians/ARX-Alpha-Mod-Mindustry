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
        // Заготовки
            Fonts.registerIcon("arx-ignition", "arx-khimeris-ignition", 0xDD80, Core.atlas.find("arx-khimeris-ignition"))
            Fonts.registerIcon("icon-dd81", "arx-khimeris-dd81", 0xDD81, Core.atlas.find("arx-khimeris-dd81"))
            Fonts.registerIcon("icon-dd82", "arx-khimeris-dd82", 0xDD82, Core.atlas.find("arx-khimeris-dd82"))
            Fonts.registerIcon("icon-dd83", "arx-khimeris-dd83", 0xDD83, Core.atlas.find("arx-khimeris-dd83"))
            Fonts.registerIcon("icon-dd84", "arx-khimeris-dd84", 0xDD84, Core.atlas.find("arx-khimeris-dd84"))
            Fonts.registerIcon("icon-dd85", "arx-khimeris-dd85", 0xDD85, Core.atlas.find("arx-khimeris-dd85"))
            Fonts.registerIcon("icon-dd86", "arx-khimeris-dd86", 0xDD86, Core.atlas.find("arx-khimeris-dd86"))
            Fonts.registerIcon("icon-dd87", "arx-khimeris-dd87", 0xDD87, Core.atlas.find("arx-khimeris-dd87"))
            Fonts.registerIcon("icon-dd88", "arx-khimeris-dd88", 0xDD88, Core.atlas.find("arx-khimeris-dd88"))
            Fonts.registerIcon("icon-dd89", "arx-khimeris-dd89", 0xDD89, Core.atlas.find("arx-khimeris-dd89"))
            Fonts.registerIcon("icon-dd8a", "arx-khimeris-dd8a", 0xDD8A, Core.atlas.find("arx-khimeris-dd8a"))
            Fonts.registerIcon("icon-dd8b", "arx-khimeris-dd8b", 0xDD8B, Core.atlas.find("arx-khimeris-dd8b"))
            Fonts.registerIcon("icon-dd8c", "arx-khimeris-dd8c", 0xDD8C, Core.atlas.find("arx-khimeris-dd8c"))
            Fonts.registerIcon("icon-dd8d", "arx-khimeris-dd8d", 0xDD8D, Core.atlas.find("arx-khimeris-dd8d"))
            Fonts.registerIcon("icon-dd8e", "arx-khimeris-dd8e", 0xDD8E, Core.atlas.find("arx-khimeris-dd8e"))
            Fonts.registerIcon("icon-dd8f", "arx-khimeris-dd8f", 0xDD8F, Core.atlas.find("arx-khimeris-dd8f"))
            Fonts.registerIcon("arx-axilians", "arx-khimeris-axilians", 0xDD90, Core.atlas.find("arx-khimeris-axilians"))
            Fonts.registerIcon("icon-dd91", "arx-khimeris-dd91", 0xDD91, Core.atlas.find("arx-khimeris-dd91"))
            Fonts.registerIcon("icon-dd92", "arx-khimeris-dd92", 0xDD92, Core.atlas.find("arx-khimeris-dd92"))
            Fonts.registerIcon("icon-dd93", "arx-khimeris-dd93", 0xDD93, Core.atlas.find("arx-khimeris-dd93"))
            Fonts.registerIcon("icon-dd94", "arx-khimeris-dd94", 0xDD94, Core.atlas.find("arx-khimeris-dd94"))
            Fonts.registerIcon("icon-dd95", "arx-khimeris-dd95", 0xDD95, Core.atlas.find("arx-khimeris-dd95"))
            Fonts.registerIcon("icon-dd96", "arx-khimeris-dd96", 0xDD96, Core.atlas.find("arx-khimeris-dd96"))
            Fonts.registerIcon("icon-dd97", "arx-khimeris-dd97", 0xDD97, Core.atlas.find("arx-khimeris-dd97"))
            Fonts.registerIcon("icon-dd98", "arx-khimeris-dd98", 0xDD98, Core.atlas.find("arx-khimeris-dd98"))
            Fonts.registerIcon("icon-dd99", "arx-khimeris-dd99", 0xDD99, Core.atlas.find("arx-khimeris-dd99"))
            Fonts.registerIcon("icon-dd9a", "arx-khimeris-dd9a", 0xDD9A, Core.atlas.find("arx-khimeris-dd9a"))
            Fonts.registerIcon("icon-dd9b", "arx-khimeris-dd9b", 0xDD9B, Core.atlas.find("arx-khimeris-dd9b"))
            Fonts.registerIcon("icon-dd9c", "arx-khimeris-dd9c", 0xDD9C, Core.atlas.find("arx-khimeris-dd9c"))
            // Команды
            Fonts.registerIcon("team-anker", "arx-khimeris-team-anker", 0xDD9D, Core.atlas.find("arx-khimeris-team-anker"))
            Fonts.registerIcon("team-green", "arx-khimeris-team-green", 0xDD9E, Core.atlas.find("arx-khimeris-team-green"))
            Fonts.registerIcon("team-blue",  "arx-khimeris-team-blue",  0xDD9F, Core.atlas.find("arx-khimeris-team-blue"))
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
            AnkerTeam.emoji  = "${0xDD9D.toChar()}"
            Team.green.emoji = "${0xDD9E.toChar()}"
            Team.blue.emoji  = "${0xDD9F.toChar()}"
        }
    }
}
