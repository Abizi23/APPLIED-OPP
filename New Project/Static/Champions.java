public class Champions{
    private static char start='A';

    private String club;
    private String country;

    {
        club="Champion"+" "+" "+ start;
        start++;
        System.out.println(club);
    }

    Champions(String club, String country){
        this.club=club;
        this.country=country;

    }


    public String getClub() {
        return club;
    }

    public String getCountry() {
        return country;
    }




}