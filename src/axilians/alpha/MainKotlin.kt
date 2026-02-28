package axilians.alpha

import arc.*
import arc.util.*
import mindustry.game.EventType.*
import mindustry.mod.*
import mindustry.ui.dialogs.*

import axilians.alpha.*

// Создаёт класс ExampleKotlinMod, который наследуется от Mod. Это основной класс мода. Mindustry автоматически создаёт его экземпляр при загрузке мода.
class MainKotlin : Mod(){

    init{           // Блок init — выполняется при создании объекта. То есть код внутри запускается сразу при загрузке мода.
        Log.info("Loaded MainKotlin constructor.")// Пишет сообщение в лог игры: «Loaded MainKotlin constructor.»

        // Регистрирует обработчик события ClientLoadEvent — оно происходит, когда клиент (игра) полностью загрузился и готов к показу UI.
        Events.on(ClientLoadEvent::class.java){
            //show dialog upon startup
            Time.runTask(10f){              // Запускает отложенную задачу. 10f — задержка в игровых кадрах (примерно 0.16 секунды).
                BaseDialog(Core.bundle.get("mod.arx-axilians-alpha.init_dialog")).apply{   // Создаёт новый диалог (BaseDialog) с внутренним именем "frog" - Имя в самом верху
                                            // .apply позволяет сразу настраивать диалог внутри блока.
                    // cont.apply{             // cont — основной контейнер (таблица) диалога. apply — настройка его содержимого.
                    //     add("behold").center().row() // Добавляет в диалог текстовое поле с текстом "behold", затем row() — переходит на новую строку.
                    //                         // .center() делает центрирование внутри строки таблицы.
                    //     image(Core.atlas.find("arx-axilians-alpha-frog")).pad(20f).colspan(3).center().row() // Core.atlas.find("example-kotlin-mod-frog") ищет спрайт в атласе игры по названию.
                    //                                                                      // Модовые спрайты автоматически получают префикс с именем мода.
                    //                                                                      // image(...) — добавляет изображение. pad(20f) — добавляет отступы. row() — новая строка.
                    //     button("1"){ hide() }.size(120f, 50f)
                    //     button("2"){ hide() }.size(120f, 50f)
                    //     button("3"){ hide() }.size(120f, 50f).row()   // Создаёт кнопку с надписью "I see".
                    //                                                 // При нажатии выполняется { hide() } — диалог скрывается.
                    //                                                 // .size(100f, 50f) задаёт размеры кнопки.
                    // }
                    cont.apply{
                        add("behold")
                        image(Core.atlas.find("arx-axilians-alpha-frog")).pad(0f).colspan(3).row()
                        button(Core.bundle.get("mod.arx-axilians-alpha.displayName")){ hide() }.size(120f, 50f)
                        button("2.0"){ hide() }.size(120f, 50f)

                        table {
                            button("3"){ hide() }.size(60f, 50f).pad(0f)
                            button("4"){ hide() }.size(60f, 50f).pad(0f)
                        }
                    }
                    show()
                }
            }
        }
    }

    override fun loadContent() {
        // загружаем кастомные планеты
        ArxPlanets.load()

        Log.info("Loading some example content.")
    }
}
