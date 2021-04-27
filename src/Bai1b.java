public class Bai1b {
    public static void main(String[] args) {
        Cat Meo = new Cat("Hoàng Thượng",1.25f,2.4);
        Cat Meo1 = new Cat("Màu vàng trắng","Xanh Dương");
        Cat Meo2 = new Cat (10,2);
        System.out.println("Mèo của tôi tên là : " + Meo.name);
        System.out.println("Chiều cao là : " + Meo.height + " - Cân nặng là : " + Meo.weight);
        System.out.println("Nó có màu lông rất đẹp : " + Meo1.Color + " - Màu mắt cũng rất Ok : " + Meo1.ColorEyes);
        System.out.println("Nó sinh ngày mùng : " + Meo2.DateofBirth + " - Hiện tại nó : " + Meo2.year + " tuổi");
    }
}
