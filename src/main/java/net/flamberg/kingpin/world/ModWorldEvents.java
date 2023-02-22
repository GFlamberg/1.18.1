package net.flamberg.kingpin.world;

import net.flamberg.kingpin.Kingpin;
import net.flamberg.kingpin.world.gen.ModOreGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Kingpin.MOD_ID)
public class ModWorldEvents {
        @SubscribeEvent
        public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
            ModOreGeneration.generateOres(event);
        }
    }
