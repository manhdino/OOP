public class Employee3 {

    // Đề bài :
    /*
    Thông tin về nhân viên bao gồm: mã nhân viên(cả chữ và số), họ tên đầy đủ, địa chỉ, tuổi,
số điện thoại, mức lương, số năm kinh nghiệm. Hành động của nhân viên gồm làm việc, nghỉ
ngơi, nhận lương, đi du lịch. Thiết kế lớp mô tả đối tượng nhân viên như trên. Trong đó thiết kế
các phương thức khởi tạo có 0, 1, 2, ... 7 tham số theo thứ tự trên và thực hiện lời gọi đến
phương thức khởi tạo hợp lệ để khởi tạo giá trị ban đầu cho đối tượng. Viết các cặp
getter/setter cho từng thuộc tính. Cung cấp các đoạn chương trình để lọc và xét duyệt dữ liệu
đầu vào trước khi gán giá trị cho các thuộc tính trong các setter nếu cần thiết.
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

    public Employee3() {

        id = "";
        fullname = "";
        Address = "";
        age = 0;
        phoneNumbers = "";
        Salary = "";
        Experience = 0;

    }

    // Getter và Setter cho từng thuộc tính :
    private void ShowError(String message) {
        System.out.println(message);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id.isEmpty()) {
            ShowError("Mã không hợp lệ :");
        } else
            this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String salary) {
        Salary = salary;
    }

    public float getExperience() {
        return Experience;
    }

    public void setExperience(float experience) {
        Experience = experience;
    }

// Phương thức hành động :

    public void work(String job) {
        System.out.println(fullname + " đang làm : " + job);
    }

    public void relax() {
        System.out.println(fullname + " đang nghỉ ngơi ở nhà do dịch COVID");
    }

    public void GetSalary(String luong) {
        Salary = luong;
        System.out.println(fullname + "lương tháng này là : " + Salary);
    }

    public void Travel(String location) {
        System.out.println(fullname + " du lịch ở " + location);
    }
}
