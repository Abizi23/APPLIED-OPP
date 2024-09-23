

import java.util.ArrayList;
import java.util.List;

public class Club {
    private String clubName; // Private to encapsulate club name
    protected List<Player> players; // Protected to allow access in subclasses

    // Constructor to initialize club
    public Club(String clubName) {
        this.clubName = clubName;
        this.players = new ArrayList<>();
    }

    // Public method to add player to the club
    public void addPlayer(Player player) {
        players.add(player);
    }
    public void displayClubInfo() {
        System.out.println("Club: " + clubName);
        for (Player player : players) {
            player.show();
        }
    }


    
    public String getClubName() {
        return clubName;
    }
}
