public class Bai1d {
    public static void main(String[] args) {
        Adress HoanToan = new Adress(23, 141);
        Adress HoanToan2 = new Adress("Đường 90", "Xóm I");
        Adress HoanToan3 = new Adress("Tân An", "Thanh Hà", "Hải Dương");

        System.out.println("Nhà tôi ở số nhà: " + HoanToan.SoNha + " - Ngõ: " + HoanToan.Ngo);
        System.out.println("Nằm trên: " + HoanToan2.TenDuong + " - ở: " + HoanToan2.TenXom);
        System.out.println("Xã: " + HoanToan3.TenXa + " - Huyện: " + HoanToan3.TenHuyen + " - Tỉnh: " + HoanToan3.TenTinh);
    }
}
