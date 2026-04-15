package infinityliblightingpatch.mixin;

import com.infinityraider.infinitylib.render.tessellation.TessellatorBakedQuad;
import com.infinityraider.infinitylib.render.tessellation.TessellatorAbstractBase;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(TessellatorBakedQuad.class)
public abstract class InfinityLibLightingPatchMixin extends TessellatorAbstractBase {
	@Shadow
	public abstract void startDrawing(int mode);

	@Shadow
	public static int DRAW_MODE_QUADS;

	@Override
	public void onStartDrawingQuadsCall() {
		setApplyDiffuseLighting(true);
		startDrawing(DRAW_MODE_QUADS);
	}
}
