package virtual_pet;

public class VirtualPet {

    public String petName;
    public String petSpecies;
    private int petBoredom = 80;
    private int petHunger = 30;
    private int petThirst = 20;
    private int petHealth = 30;
    public boolean isAlive = true;


    public VirtualPet(String petName, String petSpecies) {

        this.petName = petName;
        this.petSpecies = petSpecies;


    }


    public int getPetHunger() {
        return petHunger;
    }

    public int getPetThirst() {
        return petThirst;
    }

    public int getPetBoredom() {
        return petBoredom;
    }


    public void feed() {
        petHunger -= 5;
    }

    public void water() {
        petThirst -= 5;
    }

    public void vet() {
        petHealth += 30;
    }

    public void play() {
        petBoredom -= 20;
        petThirst += 10;
    }


    public int getPetHealth() {

        return petHealth;
    }


    public boolean petIsAlive() {
        return isAlive;
    }


    public void gameTick() {
        petHunger += 20;
        petThirst += 20;
        petBoredom += 20;
        petHealth -= 10;


        if (petHunger <= 100 && petThirst <= 100 && petHealth <= 0) {
            System.out.println("RIP: " + petName + "  _  /)\n" +
                    "                 mo / )\n" +
                    "                 |/)\\)\n" +
                    "                  /\\_\n" +
                    "                  \\__|=\n" +
                    "                 (    )\n" +
                    "                 __)(__\n" +
                    "           _____/      \\\\_____\n" +
                    "          |                  ||\n" +
                    "          |  _     ___   _   ||\n" +
                    "          | | \\     |   | \\  ||\n" +
                    "          | |  |    |   |  | ||\n" +
                    "          | |_/     |   |_/  ||\n" +
                    "          | | \\     |   |    ||\n" +
                    "          | |  \\    |   |    ||\n" +
                    "          | |   \\. _|_. | .  ||\n" +
                    "          |                  ||\n" +
                    "  *       | *   **    * **   |**      **\n" +
                    "   \\))ejm96/.,(//,,..,,\\||(,,.,\\\\,.((//");
            isAlive = false;
        } else if (petHunger <= 60 && petThirst <= 60 && petHealth <= 30) {
            System.out.println("Please take your pet to the vet!");
            System.out.println("                  xXXx\n" +
                    "                 (XXXX)\n" +
                    "       .xX308XXX..xXXx..XXX308XXXx.\n" +
                    "  .xXXX308X308X308X308X308X308X308XXXXx.\n" +
                    "   ~`\\XX308X308X308X308X308X308X308X/'~\n" +
                    "        ``````/ .\\XXXX /   \\ '''''\n" +
                    "             :  <~XXXX(./;  ;\n" +
                    "              `. `'XXX:/' ,'\n" +
                    "                `:.  `\\ /'\n" +
                    "                :  `:. ;\n" +
                    "                 :.  :/\n" +
                    "               ,' :x.  `.\n" +
                    "               :  `XXX /\n" +
                    "                `.  `:x\n" +
                    "                .'`.  `;\n" +
                    "                ;.:XXx:\n" +
                    "                  `XX'\n" +
                    "\n" +
                    "------------------------------------------------\n" +
                    "Thank you for visiting https://asciiart.website/\n" +
                    "This ASCII pic can be found at\n" +
                    "https://asciiart.website/index.php?art=logos%20and%20insignias/caduceus\n");


        }


    }
}



