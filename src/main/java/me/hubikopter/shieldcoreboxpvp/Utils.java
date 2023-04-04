package me.hubikopter.shieldcoreboxpvp;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import java.util.HashSet;
import java.util.Random;

public class Utils {

    static ShieldCoreBoxPVP plugin;

    public Utils(ShieldCoreBoxPVP plugin) {
        Utils.plugin = plugin;
    }

    //List of all the unsafe blocks
    public static HashSet<Material> bad_blocks = new HashSet<>();

    static {
        bad_blocks.add(Material.LAVA);
        bad_blocks.add(Material.FIRE);
        bad_blocks.add(Material.CACTUS);
    }

    public static Location generateLocation(Player player) {
        //Generate Random Location
        Random random = new Random();

        int x = random.nextInt(150); //25000 is default
        int z = random.nextInt(400);
        int y = 150;


        if (z < 200) {
            player.sendMessage("blad");
        } else {
            Location randomLocation = new Location(player.getWorld(), -x, y, z);
            y = 150;
            randomLocation.setY(y);
        }
        Location randomLocation = new Location(player.getWorld(), -x, y, z);


        return randomLocation;
    }





    public static Location findSafeLocation(Player player){

        Location randomLocation = generateLocation(player);

        while (!isLocationSafe(randomLocation)){
            //Keep looking for a safe location
            randomLocation = generateLocation(player);
        }
        return randomLocation;
    }

    public static boolean isLocationSafe(Location location){

        int x = location.getBlockX();
        int y = location.getBlockY();
        int z = location.getBlockZ();
        //Get instances of the blocks around where the player would spawn
        Block block = location.getWorld().getBlockAt(x, y, z);
        Block below = location.getWorld().getBlockAt(x, y - 1, z);
        Block above = location.getWorld().getBlockAt(x, y + 1, z);

        //Check to see if the surroundings are safe or not
        return !(bad_blocks.contains(below.getType())) || (block.getType().isSolid()) || (above.getType().isSolid());
    }

    public static boolean isInLoc(final Location loc, final Location targetLocation, final int distance) {
        final int distancex = Math.abs(loc.getBlockX() - targetLocation.getBlockX());
        final int distancez = Math.abs(loc.getBlockZ() - targetLocation.getBlockZ());
        return distancex <= distance && distancez <= distance;
    }


    public void clearMap(Location loc, int y, int size){
        final int lx =loc.getBlockX() - size / 2;
        final int rx=loc.getBlockX() + size / 2;
        final int lz =loc.getBlockZ() - size / 2;
        final int rz= loc.getBlockZ() + size /2;
        for (int x = lx; x <= rx; ++x) {
            for (int z = lz; z <= rz; z++) {
                final Block block = Bukkit.getWorld("world").getBlockAt(x, y, z);
                final Material blockType = block.getType();
                if (blockType == Material.AIR | blockType == Material.COBWEB | blockType == Material.OBSIDIAN) {
                    block.setType(Material.AIR);
                }
            }
        }
    }
}


