package fr.paradoxal.paradox_mods.dev;

import fr.paradoxal.paradox_mods.util.Reference;

public class DevMain {
    public DevMain(){

    }

    public void debug(String file,String msg){
        if(Reference.getDEVMODS()==true) {
            System.out.println(ConsoleColors.CYAN + "[Paradoxal]" + ConsoleColors.PURPLE + "[Debug] - " + ConsoleColors.BLUE + file + ConsoleColors.GREEN + " - " + msg + ConsoleColors.RESET);
        }
    }
}
