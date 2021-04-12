package com.zarki.pumbrpg;

import akka.io.Tcp;
import com.zarki.pumbrpg.util.RegistryUtil;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.creativetab.CreativeTabs;

@Mod.EventBusSubscriber(modid = PumbRpg.MODID)
public class RegistrationHandler {

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){
        final Item[] items = {
                RegistryUtil.setItemName(new Item(),"first_item").setCreativeTab(CreativeTabs.MISC)

        };
        event.getRegistry().registerAll(items);
    }

}
