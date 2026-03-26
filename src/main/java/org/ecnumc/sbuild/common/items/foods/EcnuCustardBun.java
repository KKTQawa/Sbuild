package org.ecnumc.sbuild.common.items.foods;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.List;
import static org.ecnumc.sbuild.ECNUForge.MODID;
public class EcnuCustardBun extends Item {
    public EcnuCustardBun(Properties properties) {
        super(properties);
    }

    public static final FoodProperties ECNUCUSTARDBUN_properties = new FoodProperties.Builder()
            .nutrition(6)
            .saturationMod(0.3F)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 1000), 0.5F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3000), 0.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 3000), 0.1F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3000), 0.2F)
            .build();

    @Override
    public void appendHoverText(@NotNull ItemStack stack, @Nullable Level level, @NotNull List<Component> components, @NotNull TooltipFlag isAdvanced) {
        super.appendHoverText(stack, level, components, isAdvanced);
        components.add(Component.translatable("item." + MODID + ".ecnu_custard_bun.description").withStyle(ChatFormatting.GREEN));
    }
}
