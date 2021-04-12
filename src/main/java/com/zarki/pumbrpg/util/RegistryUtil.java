package com.zarki.pumbrpg.util;

import com.zarki.pumbrpg.PumbRpg;
import net.minecraft.item.Item;

public class RegistryUtil {

    public static Item setItemName(Item item,String name){
        item.setRegistryName(PumbRpg.MODID,name).setUnlocalizedName(PumbRpg.MODID+"."+name);
        return item;
    }
}
