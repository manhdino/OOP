public class Bai3 {
    public static void main(String[] args) {
        Student3 Manh = new Student3();
//        var studentId = Manh.getStudentId();              // Gán cho biến studentId
//        System.out.println(studentId);

     // Gán dữ liệu cho đối tượng :

        Manh.setStudentId("20194325");
        Manh.setAddress("Thanh Hà - Hải Dương");
        Manh.setCpa(3.53f);
        Manh.setEmail("manhnguyen1238@gmail.com");
        Manh.setDateOfbirth(10);
        Manh.setFullname("Nguyen Viet Manh");
        Manh.setUnivercity("HUST");

        System.out.println("Họ và tên: " + Manh.getFullname() + " - MSSV: " + Manh.getStudentId());
        System.out.println("Nơi ở: " + Manh.getAddress());
        System.out.println("Nơi học tập: " + Manh.getUnivercity());
        System.out.println("Cpa: " + Manh.getCpa());
        System.out.println("Liên hệ qua mail: " + Manh.getEmail());
    }

}
