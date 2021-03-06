package myst.jass.libs;

import myst.jass.blocks.ExampleBlock;
import net.minecraftforge.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

/**
 * Created by UnRealDinnerbone on 7/5/2016.
 */
public class LogHelper
{
    private static void log(Level logLevel, Object object)
    {
            FMLLog.log(Reference.MOD_ID, logLevel, "["+ Reference.MOD_ID.toUpperCase() + "]:[" + logLevel + "]:" + String.valueOf(object));
    }

    public static void all(Object object)
    {
        log(Level.ALL, object);
    }

    public static void debug(Object object)
    {
        log(Level.DEBUG, object);
    }

    public static void error(Object object)
    {
        log(Level.ERROR, object);
    }

    public static void fatal(Object object)
    {
        log(Level.FATAL, object);
    }

    public static void info(Object object)
    {
        log(Level.INFO, object);
    }

    public static void off(Object object)
    {
        log(Level.OFF, object);
    }

    public static void trace(Object object)
    {
        log(Level.TRACE, object);
    }

    public static void warn(Object object)
    {
        log(Level.WARN, object);
    }
}
