import java.util.ArrayList;

public class Game {
    public static void main(String[] args) {

        ArrayList <Gans> spelers = new ArrayList<>();
        var speler1 = new Gans("Rood");
        var speler2 = new Gans("Geel");

        spelers.add(speler1);
        spelers.add(speler2);

        while (true) {
            for (Gans speler: spelers) {
                System.out.println(speler.kleur);
            }
        }


        }
    }
