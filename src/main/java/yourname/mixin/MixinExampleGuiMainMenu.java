package yourname.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiScreen;





@Mixin(GuiMainMenu.class)
public class MixinExampleGuiMainMenu extends GuiScreen {
	
	@Inject(method = "drawScreen", at = @At("TAIL"))
	public void drawText(CallbackInfo ci) {
		mc.fontRenderer.drawStringWithShadow("Mixin is working!", 1, 1, 0xffffff);
	}
}
