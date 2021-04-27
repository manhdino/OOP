public class Adress {
    /*
        Lớp về địa chỉ nhà :
        Thông tin về địa chỉ gồm: số nhà, ngõ, tên đường, tên xóm, tên xã/phường,
quận(huyện)/thị trấn, tỉnh/thành phố. Viết lớp mô tả thông tin về địa chỉ như trên.
     */

    //  Các thuộc tính :

     public int SoNha;
     public int Ngo;
     public String TenDuong;
     public String TenXom;
     public String TenXa;
     public String TenHuyen;
     public String TenTinh;

     // Các Constructors :    Phương thức khởi tạo :

    public Adress(int sonha,int ngo){
        SoNha = sonha;           // bên trái là các thuộc tính còn  bên phải là các tham số
        Ngo = ngo;
    }
    public Adress(String tenduong,String tenxom){
        TenDuong = tenduong;
        TenXom = tenxom;
    }
    public Adress(String tenxa,String tenhuyen,String tentinh){
        TenXa = tenxa;
        TenHuyen = tenhuyen;
        TenTinh = tentinh;
    }
}
