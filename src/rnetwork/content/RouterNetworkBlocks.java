package rnetwork.content;

import mindustry.world.*;
import mindustry.ctype.*;
import rnetwork.world.blocks.power.*;

public class RouterNetworkBlocks implements ContentList{
	public static Block
		network;

	@Override
	public void load(){
		network = new RouterNetwork("network-conduit"){{
            consumes.powerBuffered(100000f);
		}};
	}
}
