package com.aspr.asprussyreal;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(AsprussyReal.MODID)
public class AsprussyReal
{

    public static final String MODID = "asprussy";
    private static final Logger LOGGER = LogManager.getLogger();

    public AsprussyReal() {


        MinecraftForge.EVENT_BUS.register(this);

    }

}
