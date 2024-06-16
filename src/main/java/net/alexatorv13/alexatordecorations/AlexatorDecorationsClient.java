package net.alexatorv13.alexatordecorations;

import net.alexatorv13.alexatordecorations.entity.Modentities;
import net.alexatorv13.alexatordecorations.entity.client.ChairEntityRender;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.EntityRenderer;

public class AlexatorDecorationsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(Modentities.CHAIR_ENTITY, ChairEntityRender::new);
    }
}
