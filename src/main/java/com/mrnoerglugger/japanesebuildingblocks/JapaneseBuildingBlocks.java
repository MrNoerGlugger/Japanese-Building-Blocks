package com.mrnoerglugger.japanesebuildingblocks;

import com.mrnoerglugger.japanesebuildingblocks.setup.ModBlocks;
import com.mrnoerglugger.japanesebuildingblocks.setup.ModItems;
import com.mrnoerglugger.japanesebuildingblocks.setup.Registration;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(JapaneseBuildingBlocks.MOD_ID)
public class JapaneseBuildingBlocks {
    public static final String MOD_ID = "japanesebuildingblocks";

    private static final Logger LOGGER = LogManager.getLogger();

    public JapaneseBuildingBlocks() {
        Registration.register();

        MinecraftForge.EVENT_BUS.register(this);
    }

    public static final ItemGroup BLUEPRINT_TAB = new ItemGroup("blueprinttab") {

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.HIRAGANA_BLUEPRINT.get());
        }
    };

    public static final ItemGroup BLOCK_TAB = new ItemGroup("blocktab") {

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.BLANK_SLATE.get());
        }
    };
}
