public class SignatureDrink extends HotDrink {
    private String deskripsi;

    public SignatureDrink(String nama, double harga, boolean adaLatteArt, String deskripsi) {
        super(nama, harga, adaLatteArt);
        this.deskripsi = deskripsi;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    @Override
    public void tampilkanMenu() {
        super.tampilkanMenu();
        System.out.println("Deskripsi: " + deskripsi);
    }
}
