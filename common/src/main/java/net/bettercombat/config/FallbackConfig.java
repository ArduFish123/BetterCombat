package net.bettercombat.config;

public class FallbackConfig {
    public int schema_version;
    public String blacklist_item_id_regex;
    public CompatibilitySpecifier[] fallback_compatibility;
    public CompatibilitySpecifier[] ranged_weapons;

    public static class CompatibilitySpecifier {
        public String item_id_regex;
        public String weapon_attributes;

        public CompatibilitySpecifier() { }

        public CompatibilitySpecifier(String item_id_regex, String weapon_attributes) {
            this.item_id_regex = item_id_regex;
            this.weapon_attributes = weapon_attributes;
        }
    }

    public static FallbackConfig createDefault() {
        var object = new FallbackConfig();
        object.schema_version = 1;
        object.blacklist_item_id_regex = "pickaxe";
        object.fallback_compatibility = new CompatibilitySpecifier[] {
                new CompatibilitySpecifier(
                        "claymore|great_sword|greatsword",
                        "bettercombat:claymore"),
                new CompatibilitySpecifier(
                        "great_hammer|greathammer|war_hammer|warhammer|maul",
                        "bettercombat:hammer"),
                new CompatibilitySpecifier(
                        "double_axe|doubleaxe|war_axe|waraxe|great_axe|greataxe",
                        "bettercombat:double_axe"),
                new CompatibilitySpecifier(
                        "scythe",
                        "bettercombat:scythe"),
                new CompatibilitySpecifier(
                        "halberd",
                        "bettercombat:halberd"),
                new CompatibilitySpecifier(
                        "glaive",
                        "bettercombat:glaive"),
                new CompatibilitySpecifier(
                        "spear",
                        "bettercombat:spear"),
                new CompatibilitySpecifier(
                        "lance",
                        "bettercombat:lance"),
                new CompatibilitySpecifier(
                        "anchor",
                        "bettercombat:anchor"),
                new CompatibilitySpecifier(
                        "battlestaff|battle_staff",
                        "bettercombat:battlestaff"),
                new CompatibilitySpecifier(
                        "claw",
                        "bettercombat:claw"),
                new CompatibilitySpecifier(
                        "fist|gauntlet",
                        "bettercombat:fist"),
                new CompatibilitySpecifier(
                        "trident|javelin|impaled",
                        "bettercombat:trident"),
                new CompatibilitySpecifier(
                        "katana",
                        "bettercombat:katana"),
                new CompatibilitySpecifier(
                        "rapier",
                        "bettercombat:rapier"),
                new CompatibilitySpecifier(
                        "sickle",
                        "bettercombat:sickle"),
                new CompatibilitySpecifier(
                        "soul_knife",
                        "bettercombat:soul_knife"),
                new CompatibilitySpecifier(
                        "dagger|knife",
                        "bettercombat:dagger"),
                new CompatibilitySpecifier(
                        "staff|wand|sceptre|stave|rod",
                        "bettercombat:wand"),
                new CompatibilitySpecifier(
                        "mace|hammer|flail",
                        "bettercombat:mace"),
                new CompatibilitySpecifier(
                        "axe",
                        "bettercombat:axe"),
                new CompatibilitySpecifier(
                        "coral_blade",
                        "bettercombat:coral_blade"),
                new CompatibilitySpecifier(
                        "twin_blade|twinblade",
                        "bettercombat:twin_blade"),
                new CompatibilitySpecifier(
                        "cutlass|scimitar|machete",
                        "bettercombat:cutlass"),
                new CompatibilitySpecifier(
                        "sword|blade",
                        "bettercombat:sword")
        };
        object.ranged_weapons = new CompatibilitySpecifier[]{
                new CompatibilitySpecifier(
                        "two_handed_crossbow",
                        "bettercombat:crossbow_two_handed_heavy"),
                new CompatibilitySpecifier(
                        "two_handed_bow",
                        "bettercombat:bow_two_handed_heavy")
        };
        return object;
    }

    public static FallbackConfig migrate(FallbackConfig oldConfig, FallbackConfig newConfig) {
        newConfig.fallback_compatibility = oldConfig.fallback_compatibility;
        return newConfig;
    }
}
