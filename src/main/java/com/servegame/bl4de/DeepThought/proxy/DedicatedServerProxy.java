package com.servegame.bl4de.DeepThought.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * File: DedicatedServerProxy.java
 *
 * @author Brandon Bires-Navel (brandonnavel@outlook.com)
 */
public class DedicatedServerProxy extends CommonProxy {
    @Override
    public void init(FMLPreInitializationEvent event) {
        // TODO
    }

    @Override
    public void init(FMLInitializationEvent event) {
        // TODO
    }

    @Override
    public void init(FMLPostInitializationEvent event) {
        // TODO
    }

    @Override
    public boolean isDedicatedServer() {
        return true;
    }

    @Override
    protected void onTick() {
        ++this.serverTickCount;
    }
}
