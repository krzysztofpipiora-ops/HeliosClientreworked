package pl.grok.grokhack;

import java.util.ArrayList;
import java.util.List;

public class ModuleManager {
    public final List<Module> modules = new ArrayList<>();

    public ModuleManager() {
        // Tutaj będziemy dodawać moduły (Fullbright, Fly, ESP itd.)
        System.out.println("[GrokHack] ModuleManager załadowany.");
    }
}
