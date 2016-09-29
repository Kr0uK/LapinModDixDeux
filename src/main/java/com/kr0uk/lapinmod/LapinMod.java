package com.kr0uk.lapinmod;

import com.kr0uk.lapinmod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = LapinMod.MODID, name = LapinMod.MODNAME, version = LapinMod.VERSION, acceptedMinecraftVersions = "[1.10.2]")
public class LapinMod
{
    @SidedProxy(serverSide = "CommonProxy", clientSide = "ClientProxy")
    public static CommonProxy proxy;
    public static final String MODID = "LapinMod";
    public static final String VERSION = "1.0";
    public static final String MODNAME = "LapinMod";

    @Mod.Instance(MODID)
    public static LapinMod instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
