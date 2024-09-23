import java.util.List;

public class League {
    
    private String LeagueName;
    private List<Club> clubs;
    public League(String LeagueName, List<Club> clubs) {
        this.LeagueName = LeagueName;
        this.clubs = clubs;
    }

    
    public String getLeagueName() {
        return LeagueName;
    }


    public List<Club> getClubs() {
        return clubs;
    }


    public void addClub(Club club){
        clubs.add(club);
    }

    
    
    
    
    
    

    
    
    
    

}
