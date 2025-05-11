public class Main {
    public static void main(String[] args) {
        MenuItem[] daftarMenu = new MenuItem[5];

        daftarMenu[0] = new HotDrink("Cappuccino", 25000, true);
        daftarMenu[1] = new HotDrink("Americano", 20000, false);
        daftarMenu[2] = new SignatureDrink("Es Kopi Susu Gula Aren", 28000, false, "Kopi susu creamy dengan gula aren premium");
        daftarMenu[3] = new MenuItem("Air Mineral", 10000);

        for (MenuItem item : daftarMenu) {
            if (item != null) {
                item.tampilkanMenu();
                System.out.println("----------------------");
            }
        }
    }
}
