package axilians.alpha

import mindustry.maps.generators.PlanetGenerator
import arc.math.geom.Vec3
import arc.graphics.Color
import arc.util.noise.Simplex
import mindustry.content.Blocks

class ArxPlanetGenerator : PlanetGenerator() {

    override fun getHeight(position: Vec3): Float {
        return Simplex.noise3d(
            2,        // seed – начальное число для генератора случайных чисел. Меняя его, меняется карта планеты.
            2.0,      // octaves – число “октав” шума, т.е. сколько слоёв шума суммируется. Обычно целое число, но тут почему-то float.
            0.5,      // persistence – коэффициент уменьшения амплитуды для каждой октавы (обычно 0..1). Чем меньше, тем менее выраженные мелкие детали.
            1.2,      // lacunarity – коэффициент увеличения частоты для каждой следующей октавы (>1). Чем больше, тем мельче детали.
            position.x.toDouble(),
            position.y.toDouble(),
            position.z.toDouble()
        ).toFloat()
    }

    override fun getColor(position: Vec3, out: Color) {
        val h = getHeight(position)

        if (h < 0.4f) {
            out.set(Color.valueOf("2e1f1a"))
        } else {
            out.set(Color.valueOf("8a6b48"))
        }
    }
}
