public class Bai1c {
    public static void main(String[] args) {
        NhanVien manhdino = new NhanVien();
        manhdino.ID = "deptroai2001";
        manhdino.adress = "Thanh Hà - Hải Dương ";
        manhdino.age = 20;
        manhdino.fullname = "Nguyễn Viết Mạnh";
        manhdino.phoneNumbers = "0866020132";
        manhdino.Salary = "10000$";
        manhdino.yearOfExperience = 7;
        System.out.println("Tôi tên là : " + manhdino.fullname);
        System.out.println("Tôi ở : " + manhdino.adress);
        System.out.println("Năm nay tôi : " + manhdino.age + " tuổi");
        System.out.println("Số điện thoại của tôi là : " + manhdino.phoneNumbers);
        System.out.println("Lương hàng tháng của tôi là : " + manhdino.Salary);
        System.out.println("Tôi có " + manhdino.yearOfExperience + " năm trong nghề lập trình");
        manhdino.DoWork("nghỉ ở nhà do có dịch COVID ");
    }
}
