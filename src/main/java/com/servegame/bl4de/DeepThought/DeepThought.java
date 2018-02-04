package com.servegame.bl4de.DeepThought;

import com.servegame.bl4de.DeepThought.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import org.apache.logging.log4j.Logger;

/**
 * File: DeepThought.java
 *
 * @author Brandon Bires-Navel (brandonnavel@outlook.com)
 */
@Mod(modid = DeepThought.MODID, name = DeepThought.NAME, version = DeepThought.VERSION)
public class DeepThought {

    public static final String MODID = "deepthought";
    public static final String NAME = "Deep Thought";
    public static final String VERSION = "0.0.0";

    public static Logger logger;

    @SidedProxy(clientSide = CommonProxy.CLIENT, serverSide = CommonProxy.SERVER)
    public static CommonProxy proxy;

    @Mod.Instance(value = DeepThought.MODID)
    public static DeepThought instance;



}
