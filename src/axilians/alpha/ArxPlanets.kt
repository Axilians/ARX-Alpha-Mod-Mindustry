package axilians.alpha

import mindustry.type.Planet
import mindustry.content.Planets
import mindustry.graphics.g3d.HexMesh
import arc.graphics.Color
import mindustry.world.meta.*
import mindustry.world.blocks.environment.*
import mindustry.maps.planet.* // если нужен PlanetGenerator
import arc.func.Prov


import arc.func.*;
import arc.graphics.*;
import arc.math.*;
import arc.math.geom.*;
import arc.struct.*;
import arc.util.*;
import mindustry.game.*;
import mindustry.graphics.*;
import mindustry.graphics.g3d.*;
import mindustry.graphics.g3d.PlanetGrid.*;
import mindustry.maps.planet.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.meta.*;

import axilians.alpha.ArxPlanetGenerator

object ArxPlanets {

    lateinit var AlphaPlanet: Planet

    fun load() {
        AlphaPlanet = Planet("alterra", Planets.sun, 1f, 3).apply {
            iconColor = Color.valueOf("2e1f1a");
            loadPlanetData = true
            generator = DQE()

            // Основной меш планеты
            meshLoader = Prov<GenericMesh> { HexMesh(this@apply, 6) }

            // Облака и небо (MultiMesh из HexSkyMesh)
            cloudMeshLoader = Prov<GenericMesh> {
                MultiMesh(
                    HexSkyMesh(
                        this@apply, 5, 0.15f, 0.13f, 5,
                        Color.valueOf("ffffff").a(0.5f), 2, 0.45f, 0.9f, 0.38f
                    ),
                    HexSkyMesh(
                        this@apply, 2, 0.6f, 0.16f, 5,
                        Color.white.cpy().a(0.75f), 2, 0.45f, 1f, 0.41f
                    )
                )
            }

            // Атмосфера
            hasAtmosphere = true
            atmosphereColor = Color.valueOf("2e1f1a").a(0.5f)

            atmosphereRadIn = 0.02f;
            atmosphereRadOut = 0.25f;

            // Цвет облаков на поверхности
            landCloudColor = Color.valueOf("ffffff").a(0.5f)

            // Стартовый сектор
            startSector = 10
            alwaysUnlocked = true

            // Разные флаги как у Serpulo
            allowSelfSectorLaunch = true
            allowLaunchSchematics = true
            allowWaves = true
            allowLaunchLoadout = true
        }
    }
}
