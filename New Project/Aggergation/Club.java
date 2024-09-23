import java.util.List;

class Club {

    
    private String clubName;
    private List<Players> players;

    public String getClubName() {
        return clubName;
    }

    public List<Players> getPlayer() {
        return players;
    }




    
    

    public Club(String clubName, List<Players> players) {
        this.clubName = clubName;
        this.players = players;
    }

    public void addStudent(Players player)
    {
        players.add(player);
    }
    public String toString() {
        return "Club: " + clubName + ", Players: " + players;
    }
}