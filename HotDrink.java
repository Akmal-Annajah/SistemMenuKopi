public class HotDrink extends MenuItem {
    private boolean adaLatteArt;

    public HotDrink(String nama, double harga, boolean adaLatteArt) {
        super(nama, harga);
        this.adaLatteArt = adaLatteArt;
    }

    public boolean isAdaLatteArt() {
        return adaLatteArt;
    }

    public void setAdaLatteArt(boolean adaLatteArt) {
        this.adaLatteArt = adaLatteArt;
    }

    @Override
    public void tampilkanMenu() {
        super.tampilkanMenu();
        System.out.println("Latte Art: " + (adaLatteArt ? "Ya" : "Tidak"));
    }
}
