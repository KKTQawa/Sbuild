package org.ecnumc.sbuild.common.items.building.line;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

import javax.annotation.Nullable;
import java.util.List;
import static org.ecnumc.sbuild.ECNUForge.MODID;
public class LineSkyBlueItem extends BlockItem {
    public LineSkyBlueItem(Block block, Properties properties) {
        super(block,properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag isAdvanced) {
        //super.appendHoverText(stack, level, components, isAdvanced);
        components.add(Component.translatable("item." + MODID + ".line_sky_blue.description").withStyle(Style.EMPTY.withColor(TextColor.fromRgb(0x55FFFF))));
    }
}
