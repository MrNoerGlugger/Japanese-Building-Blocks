package com.mrnoerglugger.japanesebuildingblocks.data;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.mrnoerglugger.japanesebuildingblocks.setup.ModBlocks;
import com.mrnoerglugger.japanesebuildingblocks.setup.Registration;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.LootTableProvider;
import net.minecraft.loot.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ModLootTableProvider extends LootTableProvider {
    public ModLootTableProvider(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    @Override
    public String getName() {
        return "JBB - Loot Tables";
    }

    @Override
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootParameterSet>> getTables() {
        return ImmutableList.of(
                Pair.of(BlockLootTables::new, LootParameterSets.BLOCK)
        );
    }

    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationTracker validationtracker) {
        map.forEach((p_218436_2_, p_218436_3_) -> LootTableManager.validateLootTable(validationtracker, p_218436_2_, p_218436_3_));
    }

    private static final class BlockLootTables extends net.minecraft.data.loot.BlockLootTables {
        @SuppressWarnings("OverlyLongMethod")
        @Override
        protected void addTables() {
            registerDropSelfLootTable(ModBlocks.BLANK_SLATE.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_A.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_I.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_U.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_E.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_O.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_KA.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_KI.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_KU.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_KE.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_KO.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_GA.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_GI.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_GU.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_GE.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_GO.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_SA.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_SHI.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_SU.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_SE.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_SO.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_ZA.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_JI.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_ZU.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_ZE.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_ZO.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_TA.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_TCHI.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_TSU.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_TSU_S.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_TE.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_TO.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_DA.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_DJI.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_DSU.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_DE.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_DO.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_NA.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_NI.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_NU.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_NE.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_NO.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_HA.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_HI.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_FU.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_HE.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_HO.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_BA.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_BI.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_BU.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_BE.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_BO.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_PA.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_PI.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_PU.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_PE.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_PO.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_MA.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_MI.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_MU.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_ME.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_MO.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_YA_S.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_YU.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_YU_S.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_YO.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_YO_S.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_RA.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_RI.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_RU.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_RE.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_RO.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_YA.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_WA.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_WO.get());
            registerDropSelfLootTable(ModBlocks.HIRAGANA_N.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_A.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_I.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_U.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_E.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_O.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_A_S.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_I_S.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_U_S.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_E_S.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_O_S.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_VU.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_KA.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_KI.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_KU.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_KE.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_KO.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_GA.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_GI.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_GU.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_GE.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_GO.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_SA.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_SHI.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_SU.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_SE.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_SO.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_ZA.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_JI.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_ZU.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_ZE.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_ZO.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_TA.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_TCHI.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_TSU.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_TSU_S.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_TE.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_TO.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_DA.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_DJI.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_DSU.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_DE.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_DO.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_NA.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_NI.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_NU.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_NE.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_NO.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_HA.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_HI.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_FU.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_HE.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_HO.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_BA.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_BI.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_BU.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_BE.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_BO.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_PA.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_PI.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_PU.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_PE.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_PO.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_MA.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_MI.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_MU.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_ME.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_MO.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_YA.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_YA_S.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_YU.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_YU_S.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_YO.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_YO_S.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_RA.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_RI.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_RU.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_RE.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_RO.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_WA.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_WO.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_N.get());
            registerDropSelfLootTable(ModBlocks.KATAKANA_TSU_S.get());
        }
        @Override
        protected Iterable<Block> getKnownBlocks() {
            return Registration.BLOCKS.getEntries().stream().map(RegistryObject::get).collect(Collectors.toList());
        }
    }
}
