//import java.lang.reflect.Constructor;

public class SinhVien {
    // khởi tạo thuộc tính ( gống với biến )
    private String hoTen;
    private double diem;
    // * constructor mặc định
    // khởi tạo giá trị mặc định
    // ngay khi đối tượng vừa được tạo ra
    public SinhVien(){
        hoTen = "No name";
        diem = 0.0;
    }
    // Alt + Ins
    public SinhVien(String hoTen){
        this.hoTen = hoTen;
    }
    public SinhVien(String hoTen, double diem){
        this.hoTen = hoTen;
        this.diem = diem;
    }
    // phương thức không có kiểu trả về
    public void hienThiThongTin(){
        System.out.println(hoTen + " : " + diem);
    }

    // get, set
    // 1. get
    public String getHoTen() {
        return hoTen;
    }

    public double getDiem() {
        return diem;
    }

    // 2. set
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    // phương thức có kiểu trả về
    public double tinhDTB(double diemToan, double diemVan){
        return (diemToan + diemVan) / 2;
    }
    // toString

    public String toString() {
        return hoTen + " " + diem;
    }
    // suport Method và Service Method
    // 1.1 Suport Method
    // kiểm tra điểm khi nhập hồ sơ cho sinh viên
    private boolean checkDiem(){
        return this.diem >= 24;
    }
    // 1.2. Servive Method
    public void checkHopLeDiem (){
        if(checkDiem()){
            System.out.println("Mày đã đạt");
        }
        else{
            System.out.println("Mày đã tạch");
        }
    }
}




















