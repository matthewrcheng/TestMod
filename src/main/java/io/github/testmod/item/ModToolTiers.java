package io.github.testmod.item;

import io.github.testmod.TestMod;
import io.github.testmod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier GARNET = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1500, 10f, 5f, 25,
                    ModTags.Blocks.NEEDS_GARNET_TOOL, () -> Ingredient.of(ModItems.GARNET.get())),
            new ResourceLocation(TestMod.MODID, "garnet"), List.of(Tiers.NETHERITE), List.of()
    );
}
