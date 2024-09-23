public class Test {
    

public class Main {
    public static void main(String[] args) {
        
        Player p1 = new Player("Endrick BOoby", 28, "Forward", "Brazil");
        Player p2 = new Player("Lamine", 19, "Forward", "Espana");

        
        Club realMadrid = new Club("Real Madrid");
        Club barcelona = new Club("FC Barcelona");

        
        realMadrid.addPlayer(p1);
        barcelona.addPlayer(p2);

        
        League laLiga = new League("La Liga");
        laLiga.addClub(realMadrid);
        laLiga.addClub(barcelona);
        laLiga.displayLeagueInfo();
        System.out.println(p1.nationality);
        System.out.println(p2.shirtNumber);
        System.out.println(p1.position); 
        System.out.println(p2.getName());
        p1.showP_Info();
        p2.showP_Info();
    }
}

}
