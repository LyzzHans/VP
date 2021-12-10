package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        {
            System.out.println("888     888 d8b         888                      888     8888888b.           888    \n" +
                    "888     888 Y8P         888                      888     888   Y88b          888    \n" +
                    "888     888             888                      888     888    888          888    \n" +
                    "Y88b   d88P 888 888d888 888888 888  888  8888b.  888     888   d88P  .d88b.  888888 \n" +
                    " Y88b d88P  888 888P\"   888    888  888     \"88b 888     8888888P\"  d8P  Y8b 888    \n" +
                    "  Y88o88P   888 888     888    888  888 .d888888 888     888        88888888 888    \n" +
                    "   Y888P    888 888     Y88b.  Y88b 888 888  888 888     888        Y8b.     Y88b.  \n" +
                    "    Y8P     888 888      \"Y888  \"Y88888 \"Y888888 888     888         \"Y8888   \"Y888 ");


            System.out.println("Welcome to Virtual Pet!");
            System.out.println("Please choose a name for your new pet: ");
            String petName = scanner.nextLine();
            System.out.println("What species is your new pet? ");
            String petSpecies = scanner.nextLine();
            VirtualPet pet1 = new VirtualPet(petName, petSpecies);
            System.out.println("Congratulations! We hope that you and your new pet " + petName + ", the " + petSpecies + " become the best of friends!");

            System.out.println("Please Select from the menu below.");

            System.out.println("Press 1 to feed your Pet");
            System.out.println("Press 2 to give your Pet water");
            System.out.println("Press 3 to play with your Pet");
            System.out.println("Press 4 to take your Pet to the Vet");
            System.out.println("Press Q to quit");
            String userChoice = scanner.nextLine();

            while (!userChoice.equals("Q")) {
                if (userChoice.equals("1")) {
                    System.out.println("Yummy! " + petName + " is happy that you fed them");
                    System.out.println("Its hunger level is now: " + pet1.getPetHunger());
                    //scanner.next();
                    pet1.feed();

                } else if (userChoice.equals("2")) {
                    System.out.println("Phew, " + petName + "  is happy for some cold water");
                    System.out.println("Its thirst level is now: " + pet1.getPetThirst());
                    //scanner.nextLine();
                    pet1.water();
                } else if (userChoice.equals("3")) {
                    System.out.println("Yay, " + petName + "  is happy to spend time with you");
                    System.out.println("Its boredom level is now: " + pet1.getPetBoredom() + pet1.getPetThirst());
                   // scanner.nextLine();
                    pet1.play();
                } else if (userChoice.equals("4")) {
                    System.out.println("The vet took great care of " + petName + "  and they are feeling much better. Their health level is now: " + pet1.getPetHealth());
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
                } else {
                    System.out.println("I'm sorry, I do not understand your request");
                }
                System.out.println("Press 1 to feed your Pet");
                System.out.println("Press 2 to give your Pet water");
                System.out.println("Press 3 to play with your Pet");
                System.out.println("Press 4 to take your Pet to the Vet");
                System.out.println("Press Q to quit");
                userChoice = scanner.nextLine();

            }

            while (pet1.petIsAlive()) {

                pet1.gameTick();
                System.out.println(pet1.getPetHunger());
            }

            System.out.println("Thank you for playing Virtual Pet!");

        }
    }
}









