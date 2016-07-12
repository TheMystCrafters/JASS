package myst.jass.items;

import myst.jass.libs.RegisteryHelper;

/**
 * Created by manmaed on 12/07/2016.
 */
public class JASSItems {

    public static JASSItemBase Example;

    public static void RegisterItem()
    {
        /*Example = new ExampleItem();*/

        //Registers Item, another string can be add to the end for and ore dic name
        RegisteryHelper.RegisterItem(Example, ExampleItem.getName());
    }

    public static void RenderItem()
    {
        //Renders The Item
        /*RegisteryHelper.RenderItem(Example, ExampleItem.getName());*/
    }
}
