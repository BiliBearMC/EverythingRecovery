package com.bilibear.recovery.Items;

import com.bilibear.recovery.util.Utils;
import net.minecraft.item.Item;

public class HundunIngot extends Item {
    public HundunIngot(){
        super(new Properties().group(Utils.itemGroup));
        this.setRegistryName("hundun_ingot");
    }
}
