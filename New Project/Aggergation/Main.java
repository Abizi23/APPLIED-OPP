import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Players A = new Players("Odegaard", 8);
        Players B = new Players("Saliba", 2);
        Players C = new Players("Palmer", 20);
        Players D = new Players("Felix", 14);

        
        List<Players> Arsenal_players = new ArrayList<>();
        Arsenal_players.add(A);
        Arsenal_players.add(B);

        
        List<Players> Chelsea_players = new ArrayList<>();
        Chelsea_players.add(C);
        Chelsea_players.add(D);

        
        Club Arsenal = new Club("Arsenal", Arsenal_players);
        Club Chelsea = new Club("Chelsea", Chelsea_players);

        
        List<Club> clubs = new ArrayList<>();
        clubs.add(Arsenal);
        clubs.add(Chelsea);

        System.out.println(Arsenal);
        
    }
}
