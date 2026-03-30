package pl.grok.grokhack.gui;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public class ClickGUI extends Screen {

    public ClickGUI() {
        super(Text.literal("GrokHack Menu"));
    }

    @Override
    public void render(net.minecraft.client.gui.DrawContext context, int mouseX, int mouseY, float delta) {
        super.render(context, mouseX, mouseY, delta);
        
        // Tło
        context.fill(50, 50, 300, 300, 0xAA000000);
        
        // Tytuł
        context.drawText(MinecraftClient.getInstance().textRenderer,
                "§6GrokHack §f- Hacked Client 1.21.4", 
                70, 70, 0xFFFFFFFF, true);
        
        context.drawText(MinecraftClient.getInstance().textRenderer,
                "W budowie... Dodajemy moduły krok po kroku", 
                70, 100, 0xFFAAAAAA, true);
    }
}
