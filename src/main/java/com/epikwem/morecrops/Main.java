package com.epikwem.morecrops;

import com.epikwem.morecrops.init.ModBlocks;
import com.epikwem.morecrops.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistryEntry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Main.MODID)
public class Main
{
    public static final String MODID = "morecrops";
    private static final Logger LOGGER = LogManager.getLogger();

    public Main() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setupEvent);
        // Register the enqueueIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setupEvent(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM MORECROPS's PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
        LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().gameSettings);
    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        // some example code to dispatch IMC to another mod
        InterModComms.sendTo("examplemod", "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
    }

    private void processIMC(final InterModProcessEvent event)
    {
        // some example code to receive and process InterModComms from other mods
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m->m.getMessageSupplier().get()).
                collect(Collectors.toList()));
    }
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {

        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            LOGGER.info("HELLO from Register Block");
            blockRegistryEvent.getRegistry().registerAll(
                setup("barley_bale", ModBlocks.BARLEY_BALE),
                setup("barley_crop", ModBlocks.BARLEY_CROP),
                setup("hop_bale", ModBlocks.HOP_BALE),
                setup("hop_crop", ModBlocks.HOP_CROP),
                setup("oat_bale", ModBlocks.OAT_BALE),
                setup("oat_crop", ModBlocks.OAT_CROP),
                setup("rye_bale", ModBlocks.RYE_BALE),
                setup("rye_crop", ModBlocks.RYE_CROP)

            );
            LOGGER.info("Block registering FINISHED");
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> itemRegistryEvent) {
            LOGGER.info("HELLO from Register Item");
            itemRegistryEvent.getRegistry().registerAll(
                setup("barley", ModItems.BARLEY),
                setup("barley_bale", ModItems.BARLEY_BALE),
                setup("barley_bread", ModItems.BARLEY_BREAD),
                setup("barley_bread_dough", ModItems.BARLEY_BREAD_DOUGH),
                setup("barley_seeds", ModItems.BARLEY_SEEDS),
                setup("hard_boiled_egg", ModItems.HARD_BOILED_EGG),
                setup("hearty_bread", ModItems.HEARTY_BREAD),
                setup("hearty_bread_dough", ModItems.HEARTY_BREAD_DOUGH),
                setup("hop", ModItems.HOP),
                setup("hop_bale", ModItems.HOP_BALE),
                setup("hop_bread", ModItems.HOP_BREAD),
                setup("hop_bread_dough", ModItems.HOP_BREAD_DOUGH),
                setup("hop_seeds", ModItems.HOP_SEEDS),
                setup("oat", ModItems.OAT),
                setup("oat_bale", ModItems.OAT_BALE),
                setup("oat_bread", ModItems.OAT_BREAD),
                setup("oat_bread_dough", ModItems.OAT_BREAD_DOUGH),
                setup("oat_seeds", ModItems.OAT_SEEDS),
                setup("rye", ModItems.RYE),
                setup("rye_bale", ModItems.RYE_BALE),
                setup("rye_bread", ModItems.RYE_BREAD),
                setup("rye_bread_dough", ModItems.RYE_BREAD_DOUGH),
                setup("rye_seeds", ModItems.RYE_SEEDS),
                setup("wholemeal_bread", ModItems.WHOLEMEAL_BREAD),
                setup("wholemeal_bread_dough", ModItems.WHOLEMEAL_BREAD_DOUGH),
                setup("wheat_bread_dough", ModItems.WHEAT_BREAD_DOUGH)
            );
            LOGGER.info("Item registering FINISHED");
        }

    }

    // to register an entry (block, item...)
    public static <T extends IForgeRegistryEntry<T>> T setup(final String name, final T entry) {
        LOGGER.info("  setup("+ name+ ")\n");
        return entry.setRegistryName(new ResourceLocation(Main.MODID, name));
    }

}
