public class Problem3 {
    public static void main(String[] args) {

        Ship[] ships = new Ship[3];

        ships[0] = new Ship(
                "Titanic", "1912");

        ships[1] = new CruiseShip(
                "Royal Princess", "2013", 3600);

        ships[2] = new CargoShip(
                "Ever Given", "2018", 200000);

        for (Ship ship : ships) {
            ship.print();
            System.out.println();
        }
    }
}
