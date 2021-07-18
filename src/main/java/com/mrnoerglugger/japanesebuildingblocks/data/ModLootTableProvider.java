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

import static com.mrnoerglugger.japanesebuildingblocks.setup.ModBlocks.*;

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
        map.forEach((p_218436_2_, p_218436_3_) -> LootTableManager.validate(validationtracker, p_218436_2_, p_218436_3_));
    }

    private static final class BlockLootTables extends net.minecraft.data.loot.BlockLootTables {
        @SuppressWarnings("OverlyLongMethod")
        @Override
        protected void addTables() {
            dropSelf(BLANK_SLATE.get());
            dropSelf(HIRAGANA_A.get());
            dropSelf(HIRAGANA_I.get());
            dropSelf(HIRAGANA_U.get());
            dropSelf(HIRAGANA_E.get());
            dropSelf(HIRAGANA_O.get());
            dropSelf(HIRAGANA_KA.get());
            dropSelf(HIRAGANA_KI.get());
            dropSelf(HIRAGANA_KU.get());
            dropSelf(HIRAGANA_KE.get());
            dropSelf(HIRAGANA_KO.get());
            dropSelf(HIRAGANA_GA.get());
            dropSelf(HIRAGANA_GI.get());
            dropSelf(HIRAGANA_GU.get());
            dropSelf(HIRAGANA_GE.get());
            dropSelf(HIRAGANA_GO.get());
            dropSelf(HIRAGANA_SA.get());
            dropSelf(HIRAGANA_SHI.get());
            dropSelf(HIRAGANA_SU.get());
            dropSelf(HIRAGANA_SE.get());
            dropSelf(HIRAGANA_SO.get());
            dropSelf(HIRAGANA_ZA.get());
            dropSelf(HIRAGANA_JI.get());
            dropSelf(HIRAGANA_ZU.get());
            dropSelf(HIRAGANA_ZE.get());
            dropSelf(HIRAGANA_ZO.get());
            dropSelf(HIRAGANA_TA.get());
            dropSelf(HIRAGANA_TCHI.get());
            dropSelf(HIRAGANA_TSU.get());
            dropSelf(HIRAGANA_TSU_S.get());
            dropSelf(HIRAGANA_TE.get());
            dropSelf(HIRAGANA_TO.get());
            dropSelf(HIRAGANA_DA.get());
            dropSelf(HIRAGANA_DJI.get());
            dropSelf(HIRAGANA_DSU.get());
            dropSelf(HIRAGANA_DE.get());
            dropSelf(HIRAGANA_DO.get());
            dropSelf(HIRAGANA_NA.get());
            dropSelf(HIRAGANA_NI.get());
            dropSelf(HIRAGANA_NU.get());
            dropSelf(HIRAGANA_NE.get());
            dropSelf(HIRAGANA_NO.get());
            dropSelf(HIRAGANA_HA.get());
            dropSelf(HIRAGANA_HI.get());
            dropSelf(HIRAGANA_FU.get());
            dropSelf(HIRAGANA_HE.get());
            dropSelf(HIRAGANA_HO.get());
            dropSelf(HIRAGANA_BA.get());
            dropSelf(HIRAGANA_BI.get());
            dropSelf(HIRAGANA_BU.get());
            dropSelf(HIRAGANA_BE.get());
            dropSelf(HIRAGANA_BO.get());
            dropSelf(HIRAGANA_PA.get());
            dropSelf(HIRAGANA_PI.get());
            dropSelf(HIRAGANA_PU.get());
            dropSelf(HIRAGANA_PE.get());
            dropSelf(HIRAGANA_PO.get());
            dropSelf(HIRAGANA_MA.get());
            dropSelf(HIRAGANA_MI.get());
            dropSelf(HIRAGANA_MU.get());
            dropSelf(HIRAGANA_ME.get());
            dropSelf(HIRAGANA_MO.get());
            dropSelf(HIRAGANA_YA_S.get());
            dropSelf(HIRAGANA_YU.get());
            dropSelf(HIRAGANA_YU_S.get());
            dropSelf(HIRAGANA_YO.get());
            dropSelf(HIRAGANA_YO_S.get());
            dropSelf(HIRAGANA_RA.get());
            dropSelf(HIRAGANA_RI.get());
            dropSelf(HIRAGANA_RU.get());
            dropSelf(HIRAGANA_RE.get());
            dropSelf(HIRAGANA_RO.get());
            dropSelf(HIRAGANA_YA.get());
            dropSelf(HIRAGANA_WA.get());
            dropSelf(HIRAGANA_WO.get());
            dropSelf(HIRAGANA_N.get());
            dropSelf(KATAKANA_A.get());
            dropSelf(KATAKANA_I.get());
            dropSelf(KATAKANA_U.get());
            dropSelf(KATAKANA_E.get());
            dropSelf(KATAKANA_O.get());
            dropSelf(KATAKANA_A_S.get());
            dropSelf(KATAKANA_I_S.get());
            dropSelf(KATAKANA_U_S.get());
            dropSelf(KATAKANA_E_S.get());
            dropSelf(KATAKANA_O_S.get());
            dropSelf(KATAKANA_VU.get());
            dropSelf(KATAKANA_KA.get());
            dropSelf(KATAKANA_KI.get());
            dropSelf(KATAKANA_KU.get());
            dropSelf(KATAKANA_KE.get());
            dropSelf(KATAKANA_KO.get());
            dropSelf(KATAKANA_GA.get());
            dropSelf(KATAKANA_GI.get());
            dropSelf(KATAKANA_GU.get());
            dropSelf(KATAKANA_GE.get());
            dropSelf(KATAKANA_GO.get());
            dropSelf(KATAKANA_SA.get());
            dropSelf(KATAKANA_SHI.get());
            dropSelf(KATAKANA_SU.get());
            dropSelf(KATAKANA_SE.get());
            dropSelf(KATAKANA_SO.get());
            dropSelf(KATAKANA_ZA.get());
            dropSelf(KATAKANA_JI.get());
            dropSelf(KATAKANA_ZU.get());
            dropSelf(KATAKANA_ZE.get());
            dropSelf(KATAKANA_ZO.get());
            dropSelf(KATAKANA_TA.get());
            dropSelf(KATAKANA_TCHI.get());
            dropSelf(KATAKANA_TSU.get());
            dropSelf(KATAKANA_TSU_S.get());
            dropSelf(KATAKANA_TE.get());
            dropSelf(KATAKANA_TO.get());
            dropSelf(KATAKANA_DA.get());
            dropSelf(KATAKANA_DJI.get());
            dropSelf(KATAKANA_DSU.get());
            dropSelf(KATAKANA_DE.get());
            dropSelf(KATAKANA_DO.get());
            dropSelf(KATAKANA_NA.get());
            dropSelf(KATAKANA_NI.get());
            dropSelf(KATAKANA_NU.get());
            dropSelf(KATAKANA_NE.get());
            dropSelf(KATAKANA_NO.get());
            dropSelf(KATAKANA_HA.get());
            dropSelf(KATAKANA_HI.get());
            dropSelf(KATAKANA_FU.get());
            dropSelf(KATAKANA_HE.get());
            dropSelf(KATAKANA_HO.get());
            dropSelf(KATAKANA_BA.get());
            dropSelf(KATAKANA_BI.get());
            dropSelf(KATAKANA_BU.get());
            dropSelf(KATAKANA_BE.get());
            dropSelf(KATAKANA_BO.get());
            dropSelf(KATAKANA_PA.get());
            dropSelf(KATAKANA_PI.get());
            dropSelf(KATAKANA_PU.get());
            dropSelf(KATAKANA_PE.get());
            dropSelf(KATAKANA_PO.get());
            dropSelf(KATAKANA_MA.get());
            dropSelf(KATAKANA_MI.get());
            dropSelf(KATAKANA_MU.get());
            dropSelf(KATAKANA_ME.get());
            dropSelf(KATAKANA_MO.get());
            dropSelf(KATAKANA_YA.get());
            dropSelf(KATAKANA_YA_S.get());
            dropSelf(KATAKANA_YU.get());
            dropSelf(KATAKANA_YU_S.get());
            dropSelf(KATAKANA_YO.get());
            dropSelf(KATAKANA_YO_S.get());
            dropSelf(KATAKANA_RA.get());
            dropSelf(KATAKANA_RI.get());
            dropSelf(KATAKANA_RU.get());
            dropSelf(KATAKANA_RE.get());
            dropSelf(KATAKANA_RO.get());
            dropSelf(KATAKANA_WA.get());
            dropSelf(KATAKANA_WO.get());
            dropSelf(KATAKANA_N.get());
            dropSelf(KATAKANA_TSU_S.get());
        }
        @Override
        protected Iterable<Block> getKnownBlocks() {
            return Registration.BLOCKS.getEntries().stream().map(RegistryObject::get).collect(Collectors.toList());
        }
    }
}
