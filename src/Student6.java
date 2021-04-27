public class Student6 {
    private  String name;            // Biến của đối tượng : Mô tả thuộc tính đặc điểm của đối tượng được tạo ra trong main
    public static int NumofStudent6 = 0;      // Biến static (Biến của lớp) : Không phụ thuộc vào đối tượng

    public static String univercity = "HUST";
    // Phương thức của lớp :
    // Mỗi lần tạo 1 đối tượng NumofStudent sẽ tăng lên 1 để ghi nhận đối tượng mới nếu ko có keyword static thì sẽ không tăng lên
    public  Student6(){
        System.out.println(NumofStudent6);
    }
    public Student6(String thename){
        name = thename;
        NumofStudent6 ++;
        System.out.println("Sinh viên thứ " + NumofStudent6 +": "+ name);
    }

    // Phương thức tĩnh : Có thể gọi mà không cần khởi tạo đối tượng tuy nhiên  phương thức static không thể động đến
    // thuộc tính ví dụ không thể truyền name vào chỗ "Mạnh đẹp troai vl"

    public static  void getName(){
        System.out.println("Mạnh đẹp troai vl");
    }

}
