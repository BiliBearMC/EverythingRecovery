package com.bilibear.recovery.Items;

import com.bilibear.recovery.util.Utils;
import net.minecraft.item.Item;

public class NvWaIngot extends Item {
    public NvWaIngot(){
        super(new Properties().group(Utils.itemGroup));
        this.setRegistryName("nvwa_ingot");
    }
}
