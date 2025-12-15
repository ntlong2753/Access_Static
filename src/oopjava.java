public class oopjava {
    public static void main(String[] args) {
        // khởi tạo đối tượng thuộc class SinhVien
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien();
        sv1.hienThiThongTin();
        sv2.hienThiThongTin();
        SinhVien sv3 = new SinhVien("Long");
        sv3.hienThiThongTin();
        SinhVien sv4 = new SinhVien("Long",10.0);
        sv4.hienThiThongTin();
        System.out.println(sv4.getHoTen());
        System.out.println(sv4.getDiem());
        // thay đổi sv4
        sv4.setHoTen("Hachimi");
        sv4.setDiem(25);
        sv4.hienThiThongTin();
        // test phương thức có kiểu tr về
        double dtbsv4 = sv4.tinhDTB(10, 5);
        System.out.println("Điểm trung bình của hachimi là: " + dtbsv4);
        sv4.hienThiThongTin();

        // test phương thức toString
        System.out.println(sv4);

        sv4.checkHopLeDiem();
    }
}













