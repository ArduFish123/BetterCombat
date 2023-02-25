package net.bettercombat.client.animation;

import dev.kosmx.playerAnim.api.layered.KeyframeAnimationPlayer;
import dev.kosmx.playerAnim.core.data.KeyframeAnimation;

public class CustomAnimationPlayer extends KeyframeAnimationPlayer {
    public CustomAnimationPlayer(KeyframeAnimation emote, int t, boolean mutable) {
        super(emote, t, mutable);
    }

    public CustomAnimationPlayer(KeyframeAnimation emote, int t) {
        super(emote, t, false);
    }

    public boolean isWindingDown(float tickDelta) {
        int windDownStart = getData().endTick + ((getData().stopTick - getData().endTick) / 4);
        return ((getTick() + tickDelta) > (windDownStart + 0.5F)); // + 0.5 for smoother transition
    }

    @Override
    public boolean isActiveInFirstPerson(float tickDelta) {
        return super.isActiveInFirstPerson(tickDelta) && !isWindingDown(tickDelta);
    }
}
