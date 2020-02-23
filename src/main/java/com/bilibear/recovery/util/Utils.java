package com.bilibear.recovery.util;

import com.bilibear.recovery.Items.Moditems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class Utils {
    public static ItemGroup itemGroup = new ItemGroup("recovery") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Moditems.panguIngot);
        }
    };
}
