package alhetta.notenoughscaffold.util;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

import java.util.Set;

public class IdentityUtil {
    public static boolean isShovel(ItemStack stack) {
        if (!(stack.getItem() instanceof ItemTool)) {
            return false;
        }

        ItemTool item = (ItemTool) stack.getItem();
        Set<String> toolClasses = item.getToolClasses(stack);
        for (String toolClass : toolClasses) {
            if (toolClass.equals("shovel")) {
                return true;
            }
        }
        return false;
    }
}
