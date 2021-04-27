public class Student3 {
    // Tính đóng gói dữ liệu:

    // Các thuộc tính :

    private String studentId;
    private String fullname;
    private float  cpa;
    private String address;
    private String email;
    private String univercity;
    private int    dateOfbirth;


    // Getter : đọc dữ liệu ra :
    public  String getStudentId(){        // nên để S chỗ getStudentId cho phân biệt với studentId
        return studentId;
    }

    // Setter : Thay đổi dữ liệu của đối tượng :
    public void setStudentId(String studentId){
        this.studentId = studentId;
    }

    public String getFullname(){
        return fullname;
    }

    public void setFullname(String fullname){
        if(!isValid(fullname)){
            ShowError("Tên không hợp lệ ");
        }
        else
          this.fullname = fullname;
    }

    private boolean isValid(String fullname) {
        if(fullname.isEmpty()){
           return false;
        }
        if(fullname.matches(".*[^a-zA-Z\\s]+.*")){
            return false;
        }
        return true;
    }


    private void ShowError(String message){
        System.out.println(message);
    }
    public float getCpa(){
        return cpa;
    }

    public void setCpa(float cpa){
        this.cpa = cpa;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getUnivercity(){
        return univercity;
    }

    public void setUnivercity(String univercity){
        this.univercity = univercity;
    }

    public int getDateOfbirth(){
        return dateOfbirth;
    }

    public void setDateOfbirth(int dateOfbirth){
        this.dateOfbirth = dateOfbirth;
    }










}
