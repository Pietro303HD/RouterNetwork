package rnetwork.world.blocks.power;

import arc.struct.*;
import mindustry.*;
import mindustry.gen.*;
import mindustry.world.meta.*;
import mindustry.world.blocks.power.*;

public class RouterNetwork extends Battery{

        public RouterNetwork(String name){
                super(name);
                buildVisibility = BuildVisibility.shown;
        }

        public class NetworkBuild extends BatteryBuild{
                @Override
                public void draw(){
                        // 👀
                }

                @Override
                public void placed(){
                        add();
                }

                @Override
                public void update(){
                        // uh
                }

                public void addBuilds(Seq<Building> out){
                        Vars.world.tiles.eachTile(other -> {
                                if (other.build instanceof NetworkBuild){
                                        if (other != tile) out.add(other.build);
                                };
                        });
                }

                public Seq<Building> getPowerConnections(Seq<Building> out){
                        super.getPowerConnections(out);
                        addBuilds(out);
                        return out;
                };
        }
}
