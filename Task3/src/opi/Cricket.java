package opi;

public class Cricket extends Sports {
    String matchTypo;
    int over;
    Player player;
    Cricket(String matchTypo,int over,Player player)
    {
        this.matchTypo=matchTypo;
        this.over=over;
        this.player=player;
    }
    void display()
    {
        System.out.println("Match Type: " +matchTypo);
        System.out.println("Over of the match: " +over);
        System.out.println("Name of a player: " +player.playerName);
        System.out.println("Jersey number of a player: " +player.jerseyNumber);
    }
}
/*
        Name: Maherab Hossen Opi
        ID: 2012020104
        Section: C
        Email: cse_2012020104@lus.ac.bd
        Date: 11th September,2021
    */