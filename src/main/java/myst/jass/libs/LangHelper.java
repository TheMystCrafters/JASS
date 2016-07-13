package myst.jass.libs;


import net.minecraft.client.Minecraft;
import net.minecraft.util.text.translation.I18n;

public enum LangHelper {
    TAB("tab"),
    NONE("");

    private String name;

    LangHelper(String name)
    {
        this.name = name;
    }

    public String translateMessage(String message) {
        if (this.name == "")
            return  "XY" + I18n.translateToLocal(message);

      //  return "XY " + I18n.translateToLocal(String.format("%s.%s.%s", this.name, Reference.MOD_ID, message + ""));
        if(Minecraft.getMinecraft().thePlayer.getUniqueID().equals("ae9c317acf2e43c59b3237a6ae83879f"))
        {
            return "UnReal" + I18n.translateToLocal(this.name + "." + message + "");
        }else
        {
            return "" + I18n.translateToLocal(this.name + "." + message + "");
        }
    }
}