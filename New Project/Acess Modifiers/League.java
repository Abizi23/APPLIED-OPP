

import java.util.ArrayList;
import java.util.List;

class League {
    private String leagueName;
    protected List<Club> clubs;

    // Constructor to initialize league
    public League(String leagueName) {
        this.leagueName = leagueName;
        this.clubs = new ArrayList<>();
    }

    // Public method to add club to the league
    public void addClub(Club club) {
        clubs.add(club);
    }
    public void displayLeagueInfo() {
        System.out.println("League: " + leagueName);
        for (Club club : clubs) {
            club.displayClubInfo();
        


    
    }
    }



}
