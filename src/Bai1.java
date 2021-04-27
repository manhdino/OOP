public class Bai1 {
    public static void main(String[] args) {
        Student manh = new Student("Nguyễn Viết Mạnh ","20194325");
        Student manh2 = new Student("HUST","tim khong thay",10);
        manh.avgGrade = 3.34f;
        manh.address = "Hải Dương";
        manh.email = "manhnguyen1238@gmail.com";
        System.out.println();
        System.out.println("Tên tôi là " + manh.fullName + "đẹp troai vl");
        System.out.println("MSSV: " + manh.studentId);
        System.out.println("Quê của tôi ở : " + manh.address);
        System.out.println("Liên hệ vs tôi qua mail : " + manh.email);
        System.out.println("Điểm trung bình của tôi là : " + manh.avgGrade);
        System.out.println("Hiện tại tôi đang hk ở : " + manh2.Univercity);
        System.out.println("Tình trạng hiện tại của bạn gái : " + manh2.Girlfriend);
        System.out.println("Ngày sinh của tôi : " + manh2.DataofBirth);
        manh.doHomework("Lập trình HĐT");

    }
}
