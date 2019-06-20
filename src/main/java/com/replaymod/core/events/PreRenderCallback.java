//#if MC>=11300
package com.replaymod.core.events;

import de.johni0702.minecraft.gui.utils.Event;

public interface PreRenderCallback {
    Event<PreRenderCallback> EVENT = Event.create((listeners) ->
            () -> {
                for (PreRenderCallback listener : listeners) {
                    listener.preRender();
                }
            }
    );

    void preRender();
}
//#endif