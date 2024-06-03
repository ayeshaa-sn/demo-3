import java.util.ArrayList;
import java.util.List;

public class Student {
    private String id;
    private  String name;
    private String address;
    private String residenceStatus;
    private String mobile;

    public Student(String id,String name,String address,String residenceStatus,String mobile){
        this.id=id;
        this.name=name;
        this.address=address;
        this.residenceStatus=residenceStatus;
        this.mobile= mobile;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getResidenceStatus() {
        return residenceStatus;
    }

    public String getMobile() {
        return mobile;
    }
}
