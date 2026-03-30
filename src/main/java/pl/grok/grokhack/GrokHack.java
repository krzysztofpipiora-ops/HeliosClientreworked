package pl.grok.grokhack;

import net.fabricmc.api.ClientModInitializer;

public class GrokHack implements ClientModInitializer {

    public static GrokHack INSTANCE;

    @Override
    public void onInitializeClient() {
        INSTANCE = this;
        System.out.println("§a[GrokHack] Zainicjalizowany! Hacked client dla 1.21.4 gotowy.");
        System.out.println("§eNaciśnij RIGHT SHIFT aby otworzyć menu (jak dodamy GUI).");
    }
}
