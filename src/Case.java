public class Case {

    case 1: System.out.println("You are standing in the foyer of an old house.\nYou see a dead scorpion.");
                    if (coins[0] > 0) {
        System.out.printf("There are %d coins in this room! Would you like to pick them up? (Y/N) ", coins[0]);
        if (scan.nextLine().charAt(0) == 'y') {
            userCoins += coins[0];
            coins[0] = 0;
        }
    }
    items[0] = "Dead scorpion";
                    System.out.println("Exit 'n'orth to the 'front room'. \nExit the Game (Q).");

    dir = scan.nextLine().toLowerCase();
                    if(dir.equals("n") || dir.equals("front room")){
        roomNo = 2;
    }
    //Spice this up
                    else if(!dir.equals("q")){
        System.out.println("You were actually dead the whole time. Game has ended.");
        return;
    }
                    break;

    case 2: System.out.println("You are standing in the front room.\nYou see a piano.");
                    if (coins[1] > 0) {
        System.out.printf("There are %d coins in this room! Would you like to pick them up? (Y/N) ", coins[1]);
        if (scan.nextLine().charAt(0) == 'y') {
            userCoins += coins[1];
            coins[1] = 0;
        }
    }
    items[1] = "Piano";
                    System.out.println("Exit 'w'est to the 'library'. \nExit 'e'ast to the 'kitchen'. \nExit 's'outh to the 'foyer'. \nExit the Game (Q).");
    dir = scan.nextLine().toLowerCase();
                    if(dir.equals("w") || dir.equals("library")){
        roomNo = 3;
    }
                    else if(dir.equals("e") || dir.equals("kitchen")){
        roomNo = 4;
    }
                    else if(dir.equals("s") || dir.equals("foyer")){
        roomNo = 1;
    }
    //Spice this up
                    else if(!dir.equals("q")){
        System.out.println("You were actually dead the whole time. Game has ended.");
        return;
    }
                    break;

    case 3: System.out.println("You are standing in a library.\nYou see spiders crawling on the bookshelves.");
                    if (coins[2] > 0) {
        System.out.printf("There are %d coins in this room! Would you like to pick them up? (Y/N) ", coins[2]);
        if (scan.nextLine().charAt(0) == 'y') {
            userCoins += coins[2];
            coins[2] = 0;
        }
    }
    items[2] = "Crawling spiders";
                    System.out.println("Exit 'e'ast to the 'front room'. \nExit 'n'orth to the 'dining room'. \nExit the Game (Q).");
    dir = scan.nextLine().toLowerCase();

                    if(dir.equals("e") || dir.equals("front room")){
        roomNo = 2;
    }
                    else if(dir.equals("n") || dir.equals("dining room")){
        roomNo = 5;
    }
    //Spice this up
                    else if(!dir.equals("q")){
        System.out.println("You were actually dead the whole time. Game has ended.");
        return;
    }
                    break;
}
