package com.servegame.bl4de.DeepThought.proxy;

import com.sun.istack.internal.NotNull;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

/**
 * File: CommonProxy.java
 *
 * @author Brandon Bires-Navel (brandonnavel@outlook.com)
 */
public abstract class CommonProxy {

    public static final String CLIENT = "com.servegame.bl4de.DeepThought.proxy.ClientProxy";
    public static final String SERVER = "com.servegame.bl4de.DeepThought.proxy.DedicatedServerProxy";

    protected long serverTickCount = 0;
    protected long clientTickCount = 0;
    protected final TickTimer tickTimer = new TickTimer();

    /**
     * TODO
     * @param event
     */
    public abstract void init(FMLPreInitializationEvent event);

    /**
     * TODO
     * @param event
     */
    public abstract void init(FMLInitializationEvent event);

    /**
     * TODO
     * @param event
     */
    public abstract void init(FMLPostInitializationEvent event);

    /**
     * Is this a dedicated server?
     * @return True if this is {@link DedicatedServerProxy}, false otherwise
     */
    public abstract boolean isDedicatedServer();

    /**
     * Increment the counter for either the client or the server
     */
    protected abstract void onTick();

    /**
     * TODO
     */
    public final class TickTimer {
        @SubscribeEvent
        public void onTick(@NotNull TickEvent.ServerTickEvent event){
            if (event.phase == TickEvent.Phase.END){
                CommonProxy.this.onTick();
            }
        }

        @SubscribeEvent
        public void onTick(@NotNull TickEvent.ClientTickEvent event){
            if (event.phase == TickEvent.Phase.END){
                CommonProxy.this.onTick();
            }
        }
    }

}
