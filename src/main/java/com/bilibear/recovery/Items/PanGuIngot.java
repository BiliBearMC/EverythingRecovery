package com.bilibear.recovery.Items;

import com.bilibear.recovery.util.Utils;
import net.minecraft.item.Item;

public class PanGuIngot extends Item {
    public PanGuIngot(){
        super(new Properties().group(Utils.itemGroup));
        this.setRegistryName("pangu_ingot");
    }
}
