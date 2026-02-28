Events.on(ClientLoadEvent, e => {

    let mod = Vars.mods.getMod("arx-axilians-alpha");

    // Перезаписываем через Core.bundle

    mod.meta.displayName =
    Core.bundle.get("mod.arx-axilians-alpha.displayName");

    mod.meta.subtitle =
    Core.bundle.get("mod.arx-axilians-alpha.subtitle");

    mod.meta.description =
    Core.bundle.get("mod.arx-axilians-alpha.description") + "\n ";

    mod.meta.author =
    Core.bundle.get("mod.arx-axilians-alpha.author") + "\u2665";

});
