package rnetwork;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.ctype.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
import rnetwork.content.*;

public class RouterNetworkMod extends Mod{
	private final ContentList[] content = {
		new RouterNetworkBlocks()
	};

	public RouterNetworkMod(){
	      Log.info("Something happened.");
	}

	@Override
	public void loadContent(){
		Log.info("Loading some example content.");

		for (ContentList list : content){
			list.load();
		}
	}

}
