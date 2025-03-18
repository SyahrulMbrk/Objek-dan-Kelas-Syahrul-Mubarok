package syahrul2309066.objekdankelasgenap;

public class ObjekdanKelasGenap {

    public static class PersegiPanjang { 
        private int panjang, lebar;

        public PersegiPanjang() {
            this.panjang = 0;
            this.lebar = 0;
        }

        public PersegiPanjang(int panjangBaru, int lebarBaru) {
            this.panjang = panjangBaru;
            this.lebar = lebarBaru;
        }

        public int getPanjang() {
            return panjang;
        }

        public void setPanjang(int panjang) {
            this.panjang = panjang;
        }

        public int getLebar() {
            return lebar;
        }

        public void setLebar(int lebar) {
            this.lebar = lebar;
        }

        public int getLuas() {
            return panjang * lebar;
        }

        public int getKeliling() {
            return 2 * (panjang + lebar);
        }
    }

    public static void main(String[] args) {
        PersegiPanjang perpan1 = new PersegiPanjang(1, 1);
        PersegiPanjang perpan2 = new PersegiPanjang(30, 40);
        PersegiPanjang perpan3 = new PersegiPanjang(25, 35);
        
        tampilkanDetail(perpan1, "Persegi Panjang 1");
        tampilkanDetail(perpan2, "Persegi Panjang 2");
        tampilkanDetail(perpan3, "Persegi Panjang 3");
    }

    public static void tampilkanDetail(PersegiPanjang pp, String nama) {
        System.out.println(nama + ":");
        System.out.println("Panjang: " + pp.getPanjang());
        System.out.println("Lebar: " + pp.getLebar());
        System.out.println("Luas: " + pp.getLuas());
        System.out.println("Keliling: " + pp.getKeliling());
        System.out.println();
    }
}
