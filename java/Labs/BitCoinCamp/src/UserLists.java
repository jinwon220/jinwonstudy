/**
 프로젝트 : 비트코인 캠프 시스템
 파일이름 : UserLists.java
 날    짜 : 2018. 2. 23.
 작성자명 : 김 희 준
*/
 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
/**
 클래스명 : UserLists
 날    짜 : 2018. 2. 23.
 작성자명 : 김 희 준
 */
public class UserLists {
    
    private static UserLists userLists;
    private Map<String, Student> studentList;
    private Map<String, Staff> staffList;
    private Map<String, Teacher> teacherList;
    
    /**
     날    짜 : 2018. 2. 23.
     기    능 : Singleton 패턴을 이용해서 하나의 객체만 만들어서 공유
     작성자명 : 김 희 준
     */
    public static UserLists getInstance() {
        if(userLists == null) {
            userLists = new UserLists();
        }
        return userLists;
    }
    
    private UserLists() {
        studentList = new HashMap<>();
        staffList = new HashMap<>();
        teacherList = new HashMap<>();
        
        FileReader fr = null;
        BufferedReader br = null;
        
        File student = new File("member/student");
        File teacher = new File("member/teacher/");
        File sfaff = new File("member/staff");
        
        try {
            if(!student.exists()) {
                System.out.println("studnet 디렉토리가 존재하지 않습니다.");
            }else {
                File[] studentFileList = student.listFiles();
                for(int i = 0; i < studentFileList.length; i++) {
                    fr = new FileReader(studentFileList[i]);
                    br = new BufferedReader(fr);
                    
                    String line = br.readLine();
                    String[] std = line.split(" ");
                    
                    studentList.put(std[0], new Student(std[0], std[1], std[2], Integer.parseInt(std[3]), std[4]));
                }
            }
            
            if(!teacher.exists()) {
                System.out.println("teacher 디렉토리가 존재하지 않습니다.");
            }else {
                File[] teacherFileList = teacher.listFiles();
                for(int i = 0; i < teacherFileList.length; i++) {
                    fr = new FileReader(teacherFileList[i]);
                    br = new BufferedReader(fr);
                    
                    String line = br.readLine();
                    String[] std = line.split(" ");
                    
                    teacherList.put(std[0], new Teacher(std[0], std[1], std[2], Integer.parseInt(std[3]), std[4]));
                }
            }
            
            if(!sfaff.exists()) {
                System.out.println("sfaff 디렉토리가 존재하지 않습니다.");
            }else {
                File[] sfaffFileList = sfaff.listFiles();
                for(int i = 0; i < sfaffFileList.length; i++) {
                    fr = new FileReader(sfaffFileList[i]);
                    br = new BufferedReader(fr);
                    
                    String line = br.readLine();
                    String[] std = line.split(" ");
                    
                    staffList.put(std[0], new Staff(std[0], std[1], std[2], Integer.parseInt(std[3]), std[4]));
                }
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
    }
 
    public Map<String, Student> getStudentList() {
        return studentList;
    }
 
    public Map<String,Staff> getStaffList() {
        return staffList;
    }
 
    public Map<String, Teacher> getTeacherList() {
        return teacherList;
    }
}