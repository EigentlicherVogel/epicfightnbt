package github.pitbox46.epicfightnbt.network;

import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy {
    public ClientProxy() {
        super();
        MinecraftForge.EVENT_BUS.register(this);
    }
}
