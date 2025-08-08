package turret.content;

import arc.struct.*;
import mindustry.content.*;
import mindustry.entities.bullet.*;
import mindustry.gen.Sounds;
import mindustry.type.*;
import mindustry.world.blocks.defense.turrets.*;

public class Turret {
    public static ItemTurret myTurret;

    public static void load() {
        myTurret = new ItemTurret("my-turret") {{
            requirements(Category.turret, ItemStack.with(Items.copper, 50, Items.lead, 30));
            ammo(
                    Items.copper, new BasicBulletType(2.5f, 9) {{
                        lifetime = 60f;
                        width = height = 7f;
                    }}
            );
            reload = 30f;
            range = 110f;
            size = 1;
            health = 250;
            shootSound = Sounds.shoot;
        }};
    }
}