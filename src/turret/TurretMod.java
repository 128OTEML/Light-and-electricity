package turret;

import arc.util.*;
import mindustry.mod.*;
import turret.content.*;

import java.nio.MappedByteBuffer;

public class TurretMod extends Mod {
    public void loadContent() {
        Log.info("Loading Turret content...");
        Turret.load();
    }
}