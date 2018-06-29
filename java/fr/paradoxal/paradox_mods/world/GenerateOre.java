package fr.paradoxal.paradox_mods.world;

import fr.paradoxal.paradox_mods.Main;
import fr.paradoxal.paradox_mods.init.ModBlocks;
import fr.paradoxal.paradox_mods.util.Reference;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class GenerateOre implements IWorldGenerator {
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        Main.logger.loggerinfo("GenerateOre","Génération des minerai");
        switch (world.provider.getDimensionType())
        {
            case OVERWORLD:
                if(Reference.getDEVMODS()==true)
                {
                    generateSurface(world, random, chunkX * 16, chunkZ * 16);
                }
                else {
                    if (world.getWorldInfo().getWorldName() == "minage") {
                        generateSurface(world, random, chunkX * 16, chunkZ * 16);
                    }
                    else
                    {
                        Main.logger.loggerinfo("GenerateOre","Pas mon de minage");
                    }
                }
            case NETHER:
                generateNether(world,random,chunkX*16,chunkZ*16);
            case THE_END:
                generateEnd(world,random,chunkX*16,chunkZ*16);
        }
    }

    private  void generateEnd(World world,Random random,int x,int z){

    }

    private void generateNether(World world,Random random,int x, int z)
    {

    }

    private void generateSurface(World world,Random random,int x, int z)
    {
        generateOre(ModBlocks.solar_ore.getDefaultState(),world,random,x,z,5,50,8,13,BlockMatcher.forBlock(Blocks.STONE));
        generateOre(ModBlocks.lunar_ore.getDefaultState(),world,random,x,z,5,50,8,13,BlockMatcher.forBlock(Blocks.STONE));
        generateOre(ModBlocks.dark_ore.getDefaultState(),world,random,x,z,5,10,4,4,BlockMatcher.forBlock(Blocks.STONE));
        generateOre(ModBlocks.paradox_ore.getDefaultState(),world,random,x,z,5,10,4,4,BlockMatcher.forBlock(Blocks.STONE));
    }
    private void generateOre(IBlockState ore , World world , Random random , int x , int z , int miny , int maxy , int maxVienSize, int chances, BlockMatcher blockMatcher){
        int detaY = maxy - miny;
        int veinsize = random.nextInt(maxVienSize +1);

        for(int i = 0; i <chances; i++)
        {
            BlockPos pos = new BlockPos(x+random.nextInt(16),miny + random.nextInt(detaY),z+random.nextInt(16));

            WorldGenMinable generator = new WorldGenMinable(ore,veinsize,blockMatcher);
            generator.generate(world,random,pos);
        }
    }
}
