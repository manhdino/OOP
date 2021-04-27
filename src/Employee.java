public class Employee {
    /*
    Thông tin nhân viên :
    mã nhân viên(cả chữ và số), họ tên đầy đủ, địa chỉ, tuổi,
số điện thoại, mức lương, số năm kinh nghiệm. Hành động của nhân viên gồm làm việc, nghỉ
ngơi, nhận lương, đi du lịch. Thiết kế lớp mô tả đối tượng nhân viên như trên. Trong đó thiết kế
các phương thức khởi tạo có 0, 1, 2, ... 7 tham số theo thứ tự trên và thực hiện lời gọi đến
phương thức khởi tạo hợp lệ để khởi tạo giá trị ban đầu cho đối tượng.

     */

    // Các thuộc tính :

    public String id;
    public String fullname;
    public String Address;
    public int age;
    public String phoneNumbers;
    public String Salary;
    public float Experience;


    // Các phương thức khởi tạo :
    // mặc định

    public Employee(){

        id = "";
        fullname = "";
        Address = "";
        age = 0;
        phoneNumbers = "";
        Salary = "";
        Experience = 0;

    }

    // phương thức khởi tạo 1 tham số là mã id :

    public Employee(String id) {
        this.id = id;
    }
    // Phương thức khởi tạo 2 tham số :


    public Employee(String id, String fullname) {
        this(id);
        this.fullname = fullname;
    }
    // Phương thức khởi tạo 3 tham số :


    public Employee(String id, String fullname, String address) {
        this(id,fullname);
        Address = address;
    }
    // Phương thức khởi tạo 4 tham số :


    public Employee(String id, String fullname, String address, int age) {
        this(id,fullname,address);
        this.age = age;
    }
    // Phương thức khởi tạo 5 tham số :


    public Employee(String id, String fullname, String address, int age, String phoneNumbers) {
        this(id,fullname,address,age);
        this.phoneNumbers = phoneNumbers;
    }
   // Phương thức khởi tạo 6 tham số :


    public Employee(String id, String fullname, String address, int age, String phoneNumbers, String salary) {
        this(id,fullname,address,age,phoneNumbers);
        this.Salary = salary;
    }
    // Phương thức khởi tạo 7 tham số :


    public Employee(String id, String fullname, String address, int age, String phoneNumbers, String salary, float experience) {
       this(id,fullname,address,age,phoneNumbers,salary);
        Experience = experience;
    }

   // Phương thức hành động :

    public void work(String job){
        System.out.println(fullname + " đang làm : " + job);
    }

    public void relax(){
        System.out.println(fullname + " đang nghỉ ngơi ở nhà do dịch COVID");
    }

    public void GetSalary(String luong){
        Salary = luong;
        System.out.println(fullname + "lương tháng này là : " + Salary);
    }

    public void Travel(String location){
        System.out.println(fullname + " du lịch ở " + location);
    }

}
