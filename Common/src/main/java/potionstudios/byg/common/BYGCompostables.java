package potionstudios.byg.common;

import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.ComposterBlock;
import potionstudios.byg.BYG;
import potionstudios.byg.common.block.BYGWoodTypes;
import potionstudios.byg.common.item.BYGItems;

import javax.annotation.Nullable;

public class BYGCompostables {
    public static void compostableBlocks(float chance, @Nullable ItemLike item) {
        if (item != null)
            ComposterBlock.COMPOSTABLES.put(item.asItem(), chance);
    }

    public static void compostablesBYG() {
        BYG.LOGGER.debug("BYG: Adding compostable Blocks...");

        for (BYGWoodTypes type : BYGWoodTypes.values()) {
            compostableBlocks(0.3f, type.leaves());
            compostableBlocks(0.3f, type.growerItem());
        }

        //Leaves
        compostableBlocks(0.3f, BYGItems.BLOOMING_WITCH_HAZEL_LEAVES.get());
        compostableBlocks(0.3f, BYGItems.BLUE_SPRUCE_LEAVES.get());
        compostableBlocks(0.3f, BYGItems.BROWN_BIRCH_LEAVES.get());
        compostableBlocks(0.3f, BYGItems.BROWN_OAK_LEAVES.get());
        compostableBlocks(0.3f, BYGItems.FLOWERING_ORCHARD_LEAVES.get());
        compostableBlocks(0.3f, BYGItems.FLOWERING_PALO_VERDE_LEAVES.get());
        compostableBlocks(0.3f, BYGItems.HOLLY_BERRY_LEAVES.get());
        compostableBlocks(0.3f, BYGItems.INDIGO_JACARANDA_LEAVES.get());
        compostableBlocks(0.3f, BYGItems.FLOWERING_INDIGO_JACARANDA_LEAVES.get());
        compostableBlocks(0.3f, BYGItems.FLOWERING_JACARANDA_LEAVES.get());
        compostableBlocks(0.3f, BYGItems.ORANGE_BIRCH_LEAVES.get());
        compostableBlocks(0.3f, BYGItems.ORANGE_OAK_LEAVES.get());
        compostableBlocks(0.3f, BYGItems.ORANGE_SPRUCE_LEAVES.get());
        compostableBlocks(0.3f, BYGItems.ORCHARD_LEAVES.get());
        compostableBlocks(0.3f, BYGItems.PALO_VERDE_LEAVES.get());
        compostableBlocks(0.3f, BYGItems.PINK_CHERRY_LEAVES.get());
        compostableBlocks(0.3f, BYGItems.RED_MAPLE_LEAVES.get());
        compostableBlocks(0.6f, BYGItems.RIPE_ORCHARD_LEAVES.get());
        compostableBlocks(0.3f, BYGItems.SILVER_MAPLE_LEAVES.get());
        compostableBlocks(0.6f, BYGItems.SKYRIS_LEAVES_GREEN_APPLE.get());
        compostableBlocks(0.3f, BYGItems.WHITE_CHERRY_LEAVES.get());
        compostableBlocks(0.3f, BYGItems.YELLOW_BIRCH_LEAVES.get());
        compostableBlocks(0.3f, BYGItems.YELLOW_SPRUCE_LEAVES.get());
        compostableBlocks(0.3f, BYGItems.RED_SPRUCE_LEAVES.get());
        compostableBlocks(0.3f, BYGItems.BROWN_ZELKOVA_LEAVES.get());
        compostableBlocks(0.3f, BYGItems.WITHERING_OAK_LEAVES.get());
        compostableBlocks(0.3f, BYGItems.FIRECRACKER_LEAVES.get());

        //Saplings
        compostableBlocks(0.3f, BYGItems.BLUE_SPRUCE_SAPLING.get());
        compostableBlocks(0.3f, BYGItems.BROWN_BIRCH_SAPLING.get());
        compostableBlocks(0.3f, BYGItems.BROWN_OAK_SAPLING.get());
        compostableBlocks(0.3f, BYGItems.JACARANDA_BUSH.get());
        compostableBlocks(0.3f, BYGItems.FLOWERING_JACARANDA_BUSH.get());
        compostableBlocks(0.3f, BYGItems.INDIGO_JACARANDA_SAPLING.get());
        compostableBlocks(0.3f, BYGItems.INDIGO_JACARANDA_BUSH.get());
        compostableBlocks(0.3f, BYGItems.FLOWERING_INDIGO_JACARANDA_BUSH.get());
        compostableBlocks(0.3f, BYGItems.ORANGE_BIRCH_SAPLING.get());
        compostableBlocks(0.3f, BYGItems.ORANGE_OAK_SAPLING.get());
        compostableBlocks(0.3f, BYGItems.ORANGE_SPRUCE_SAPLING.get());
        compostableBlocks(0.3f, BYGItems.ORCHARD_SAPLING.get());
        compostableBlocks(0.3f, BYGItems.PALO_VERDE_SAPLING.get());
        compostableBlocks(0.3f, BYGItems.PINK_CHERRY_SAPLING.get());
        compostableBlocks(0.3f, BYGItems.RED_MAPLE_SAPLING.get());
        compostableBlocks(0.3f, BYGItems.RED_OAK_SAPLING.get());
        compostableBlocks(0.3f, BYGItems.SILVER_MAPLE_SAPLING.get());
        compostableBlocks(0.3f, BYGItems.WHITE_CHERRY_SAPLING.get());
        compostableBlocks(0.3f, BYGItems.YELLOW_BIRCH_SAPLING.get());
        compostableBlocks(0.3f, BYGItems.YELLOW_SPRUCE_SAPLING.get());
        compostableBlocks(0.3f, BYGItems.RED_SPRUCE_SAPLING.get());
        compostableBlocks(0.3f, BYGItems.BROWN_ZELKOVA_SAPLING.get());
        compostableBlocks(0.3f, BYGItems.WITHERING_OAK_SAPLING.get());

        //Flowers
        compostableBlocks(0.65f, BYGItems.ALLIUM_FLOWER_BUSH.get());
        compostableBlocks(0.85f, BYGItems.TALL_ALLIUM.get());
        compostableBlocks(0.65f, BYGItems.ALPINE_BELLFLOWER.get());
        compostableBlocks(0.65f, BYGItems.AMARANTH.get());
        compostableBlocks(0.65f, BYGItems.ANGELICA.get());
        compostableBlocks(0.85f, BYGItems.HYDRANGEA_BUSH.get());
        compostableBlocks(0.85f, BYGItems.HYDRANGEA_HEDGE.get());
        compostableBlocks(0.65f, BYGItems.BEGONIA.get());
        compostableBlocks(0.65f, BYGItems.BISTORT.get());
        compostableBlocks(0.65f, BYGItems.BLACK_ROSE.get());
        compostableBlocks(0.65f, BYGItems.BLUE_SAGE.get());
        compostableBlocks(0.65f, BYGItems.CALIFORNIA_POPPY.get());
        compostableBlocks(0.65f, BYGItems.CROCUS.get());
        compostableBlocks(0.65f, BYGItems.CYAN_AMARANTH.get());
        compostableBlocks(0.65f, BYGItems.CYAN_ROSE.get());
        compostableBlocks(0.65f, BYGItems.CYAN_TULIP.get());
        compostableBlocks(0.65f, BYGItems.DAFFODIL.get());
        compostableBlocks(0.65f, BYGItems.DELPHINIUM.get());
        compostableBlocks(0.65f, BYGItems.FAIRY_SLIPPER.get());
        compostableBlocks(0.65f, BYGItems.FIRECRACKER_FLOWER_BUSH.get());
        compostableBlocks(0.85f, BYGItems.FOXGLOVE.get());
        compostableBlocks(0.65f, BYGItems.GOLDEN_SPINED_CACTUS.get());
        compostableBlocks(0.65f, BYGItems.GREEN_TULIP.get());
        compostableBlocks(0.65f, BYGItems.GUZMANIA.get());
        compostableBlocks(0.65f, BYGItems.INCAN_LILY.get());
        compostableBlocks(0.65f, BYGItems.IRIS.get());
        compostableBlocks(0.85f, BYGItems.JAPANESE_ORCHID.get());
        compostableBlocks(0.65f, BYGItems.KOVAN_FLOWER.get());
        compostableBlocks(0.65f, BYGItems.LAZARUS_BELLFLOWER.get());
        compostableBlocks(0.65f, BYGItems.LOLLIPOP_FLOWER.get());
        compostableBlocks(0.65f, BYGItems.MAGENTA_AMARANTH.get());
        compostableBlocks(0.65f, BYGItems.MAGENTA_TULIP.get());
        compostableBlocks(0.65f, BYGItems.ORANGE_AMARANTH.get());
        compostableBlocks(0.65f, BYGItems.ORANGE_DAISY.get());
        compostableBlocks(0.65f, BYGItems.ORSIRIA_ROSE.get());
        compostableBlocks(0.65f, BYGItems.PEACH_LEATHER_FLOWER.get());
        compostableBlocks(0.65f, BYGItems.PINK_ALLIUM.get());
        compostableBlocks(0.85f, BYGItems.TALL_PINK_ALLIUM.get());
        compostableBlocks(0.65f, BYGItems.PINK_ALLIUM_FLOWER_BUSH.get());
        compostableBlocks(0.65f, BYGItems.PINK_ANEMONE.get());
        compostableBlocks(0.65f, BYGItems.PINK_DAFFODIL.get());
        compostableBlocks(0.65f, BYGItems.PRAIRIE_GRASS.get());
        compostableBlocks(0.65f, BYGItems.SHRUB.get());
        compostableBlocks(0.65f, BYGItems.PROTEA_FLOWER.get());
        compostableBlocks(0.65f, BYGItems.PURPLE_AMARANTH.get());
        compostableBlocks(0.65f, BYGItems.PURPLE_SAGE.get());
        compostableBlocks(0.65f, BYGItems.PURPLE_TULIP.get());
        compostableBlocks(0.65f, BYGItems.RICHEA.get());
        compostableBlocks(0.65f, BYGItems.ROSE.get());
        compostableBlocks(0.65f, BYGItems.SILVER_VASE_FLOWER.get());
        compostableBlocks(0.65f, BYGItems.SNOWDROPS.get());
        compostableBlocks(0.65f, BYGItems.TORCH_GINGER.get());
        compostableBlocks(0.65f, BYGItems.VIOLET_LEATHER_FLOWER.get());
        compostableBlocks(0.65f, BYGItems.WHITE_ANEMONE.get());
        compostableBlocks(0.65f, BYGItems.WHITE_SAGE.get());
        compostableBlocks(0.65f, BYGItems.WINTER_CYCLAMEN.get());
        compostableBlocks(0.65f, BYGItems.WINTER_ROSE.get());
        compostableBlocks(0.65f, BYGItems.WINTER_SCILLA.get());
        compostableBlocks(0.65f, BYGItems.YELLOW_DAFFODIL.get());
        compostableBlocks(0.65f, BYGItems.YELLOW_TULIP.get());
        compostableBlocks(0.65f, BYGItems.THEREAL_BELLFLOWER.get());
        compostableBlocks(0.65f, BYGItems.VERMILION_SCULK_GROWTH.get());
        compostableBlocks(0.65f, BYGItems.SHULKREN_MOSS_BLANKET.get());
        compostableBlocks(0.65f, BYGItems.SHULKREN_VINE.get());
        compostableBlocks(0.65f, BYGItems.LAMENT_VINE.get());
        compostableBlocks(0.65f, BYGItems.SKYRIS_VINE.get());
        compostableBlocks(0.65f, BYGItems.WAILING_VINES.get());
        compostableBlocks(0.65f, BYGItems.EMBUR_GEL_VINES.get());

        //Mushroom Blocks
        compostableBlocks(0.85f, BYGItems.GREEN_MUSHROOM_BLOCK.get());
        compostableBlocks(0.85f, BYGItems.MILKCAP_MUSHROOM_BLOCK.get());
        compostableBlocks(0.85f, BYGItems.BLEWIT_MUSHROOM_BLOCK.get());
        compostableBlocks(0.85f, BYGItems.WHITE_MUSHROOM_STEM.get());
        compostableBlocks(0.85f, BYGItems.BROWN_MUSHROOM_STEM.get());
        compostableBlocks(0.85f, BYGItems.SOUL_SHROOM_STEM.get());
        compostableBlocks(0.85f, BYGItems.SOUL_SHROOM_BLOCK.get());
        compostableBlocks(0.85f, BYGItems.DEATH_CAP_MUSHROOM_BLOCK.get());
        compostableBlocks(0.85f, BYGItems.SHULKREN_WART_BLOCK.get());
        compostableBlocks(0.85f, BYGItems.PURPLE_SHROOMLIGHT.get());
        compostableBlocks(0.85f, BYGItems.PURPLE_BULBIS_SHELL.get());
        compostableBlocks(0.85f, BYGItems.BULBIS_SHELL.get());

        //Foods
        compostableBlocks(0.65f, BYGItems.CRIMSON_BERRIES.get());
        compostableBlocks(0.65f, BYGItems.CRIMSON_BERRY_PIE.get());
        compostableBlocks(0.65f, BYGItems.GREEN_APPLE.get());
        compostableBlocks(0.65f, BYGItems.GREEN_APPLE_PIE.get());
        compostableBlocks(0.65f, BYGItems.GREEN_MUSHROOM.get());
        compostableBlocks(0.65f, BYGItems.WHITE_PUFFBALL_CAP.get());
        compostableBlocks(0.65f, BYGItems.WEEPING_MILKCAP.get());
        compostableBlocks(0.65f, BYGItems.WOOD_BLEWIT.get());
        compostableBlocks(0.65f, BYGItems.NIGHTSHADE_BERRIES.get());
        compostableBlocks(0.65f, BYGItems.NIGHTSHADE_BERRY_PIE.get());
        compostableBlocks(0.65f, BYGItems.BLUE_BERRY.get());
        compostableBlocks(0.65f, BYGItems.BLUEBERRY_PIE.get());
        compostableBlocks(0.65f, BYGItems.SHULKREN_FUNGUS.get());
        compostableBlocks(0.65f, BYGItems.DEATH_CAP.get());
        compostableBlocks(0.65f, BYGItems.SOUL_SHROOM.get());
        compostableBlocks(0.65f, BYGItems.BAOBAB_FRUIT.get());
        compostableBlocks(0.65f, BYGItems.PURPLE_BULBIS_ODDITY.get());

        //Plants
        compostableBlocks(0.65f, BYGItems.FLOWER_PATCH.get());
        compostableBlocks(0.65f, BYGItems.CLOVER_PATCH.get());
        compostableBlocks(0.65f, BYGItems.LEAF_PILE.get());
        compostableBlocks(0.65f, BYGItems.SYTHIAN_STALK_BLOCK.get());
        compostableBlocks(0.65f, BYGItems.CATTAIL_SPROUT.get());
        compostableBlocks(0.65f, BYGItems.HORSEWEED.get());
        compostableBlocks(0.65f, BYGItems.MINI_CACTUS.get());
        compostableBlocks(0.65f, BYGItems.PRICKLY_PEAR_CACTUS.get());
        compostableBlocks(0.65f, BYGItems.WINTER_SUCCULENT.get());
        compostableBlocks(0.75f, BYGItems.POISON_IVY.get());
        compostableBlocks(0.65f, BYGItems.TINY_LILYPADS.get());
        compostableBlocks(0.65f, BYGItems.ENDER_LILY.get());
        compostableBlocks(0.65f, BYGItems.EMBUR_LILY.get());

        BYG.LOGGER.info("BYG: Compostible Blocks Added!");
    }
}
