package net.fresca.webermod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fresca.webermod.WeberMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


//Name Items in the lang directory, en_us.json file
//Create file for texture withing models>item folder
public class ModItems {

    //Ethereal Stone Item
    public static final Item ETHEREAL_STONE = registertItem("ethereal_stone", new Item(new Item.Settings()));



    private static Item registertItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(WeberMod.MOD_ID, name), item);
    }

    //registers the items
    public static void registerModItems() {
        WeberMod.LOGGER.info("Registering Mod Items for " + WeberMod.MOD_ID);

        //Adds Items to Item group
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ETHEREAL_STONE);
                }
                );
    }
}
