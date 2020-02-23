package com.bilibear.recovery.util;

import com.bilibear.recovery.Items.Moditems;
import com.bilibear.recovery.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

//静态注册方块和物品
@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class RegistryHandler {
    @SubscribeEvent
    public static void onBlocksRegistry(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(ModBlocks.panguBlock);
        event.getRegistry().register(ModBlocks.nvwaBlock);
        event.getRegistry().register(ModBlocks.hundunBlock);
        event.getRegistry().register(ModBlocks.shennongdingBlock);
    }
    @SubscribeEvent
    public static void onItemsRegistry(RegistryEvent.Register<Item> event){
        event.getRegistry().register(Moditems.panguIngot);
        event.getRegistry().register(new BlockItem(ModBlocks.panguBlock,new Item.Properties().group(Utils.itemGroup))
                .setRegistryName(ModBlocks.panguBlock.getRegistryName())
        );
        event.getRegistry().register(Moditems.nvwaIngot);
        event.getRegistry().register(new BlockItem(ModBlocks.nvwaBlock,new Item.Properties().group(Utils.itemGroup))
                .setRegistryName(ModBlocks.nvwaBlock.getRegistryName())
        );
        event.getRegistry().register(Moditems.hundunIngot);
        event.getRegistry().register(new BlockItem(ModBlocks.hundunBlock,new Item.Properties().group(Utils.itemGroup))
                .setRegistryName(ModBlocks.hundunBlock.getRegistryName())
        );
        event.getRegistry().register(new BlockItem(ModBlocks.shennongdingBlock,new Item.Properties().group(Utils.itemGroup))
                .setRegistryName(ModBlocks.shennongdingBlock.getRegistryName())
        );
    }
}
