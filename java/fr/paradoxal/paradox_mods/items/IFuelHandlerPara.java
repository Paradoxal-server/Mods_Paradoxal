package fr.paradoxal.paradox_mods.items;

import fr.paradoxal.paradox_mods.init.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class IFuelHandlerPara implements IFuelHandler {
    @Override
    public int getBurnTime(ItemStack fuel) {

        if(fuel.getItem()==ModItems.small_coal)
        {
            return 200 * 1;
        }
        return 0;
    }
}
