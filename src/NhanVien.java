public class NhanVien {
      /*
        Lớp NhanVien dùng để mô tả :
        Thông tin về nhân viên bao gồm: mã nhân viên(cả chữ và số), họ tên đầy đủ, địa chỉ, tuổi,
số điện thoại, mức lương, số năm kinh nghiệm. Hành động của nhân viên gồm làm việc, nghỉ
ngơi, nhận lương, đi du lịch. Thiết kế lớp mô tả đối tượng nhân viên như trên. Bỏ qua phương
thức khởi tạo.
       */

    // Các thuộc tính :

       public String ID;
       public String fullname;
       public String adress;
       public int age;
       public String phoneNumbers;
       public String Salary;
       public int yearOfExperience;

     // methods: Phương thức mô tả hành động :

    // đang làm gì :
    public void DoWork(String lamgi){
        System.out.println(fullname + " đang " + lamgi);
    }
}
