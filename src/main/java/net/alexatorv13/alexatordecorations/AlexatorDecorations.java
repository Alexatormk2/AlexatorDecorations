package net.alexatorv13.alexatordecorations;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AlexatorDecorations implements ModInitializer {

		public  static final String MOD_ID = "alexaotordecorations";
		public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

		@Override
		public void onInitialize() {

			LOGGER.info("Hello Fabric world!");
		}
}