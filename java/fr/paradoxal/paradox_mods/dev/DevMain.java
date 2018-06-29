package fr.paradoxal.paradox_mods.dev;

import fr.paradoxal.paradox_mods.util.Reference;

import java.util.logging.Logger;

public class DevMain {
    private static Logger logger = Logger.getLogger("Paradoxal");

    public DevMain()
    {

    }

    public static void loggerinfo(String file,String msg)
    {
        if(Reference.getDEVMODS()==true)
            logger.info("Paradoxal Mods - "+file+" - "+msg);
    }
    public static void loggerWarning(String file,String msg)
    {
        if(Reference.getDEVMODS()==true)
            logger.warning("Paradoxal Mods - "+file+" - "+msg);
    }
    public static void loggersevere(String file,String msg)
    {
        if(Reference.getDEVMODS()==true)
            logger.severe("Paradoxal Mods - "+file+" - "+msg);
    }

}
