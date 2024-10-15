package entity;

import service.StudentService;

public class StudentEntity {
    StudentService service=new StudentService();
    public void entity(){
        System.out.println("i am in entity");
        service.service();
    }
}
