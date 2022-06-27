package NhanVien;

public class NVPartTime extends NhanVien {

    private double thoiGianLamViec;
    private static double luongTheoGio = 18000;

    public NVPartTime() {
    }

    public void setLuongTheoGio(double s) {
        luongTheoGio = s;
    }

    public double getThoiGianLamViec() {
        return thoiGianLamViec;
    }

    public double getLuongTheoGio() {
        return this.luongTheoGio;
    }

    public void setThoiGianLamViec(double s) {
        this.thoiGianLamViec = s;
    }

    @Override
    public double tinhLuong() {
        return this.thoiGianLamViec * luongTheoGio;
    }

    @Override
    public void inThongTin() {
        System.out.println("Nhan vien Past-Time:");
        System.out.println("Ho va ten: " + super.getTenNhanVien());
        System.out.println("So gio lam viec: " + this.getThoiGianLamViec());
        System.out.println("Luong: " + tinhLuong());
    }

    public NVPartTime(String name, double thoiGianLamViec) {
        setTenNhanVien(name);
        this.thoiGianLamViec = thoiGianLamViec;
    }
}
