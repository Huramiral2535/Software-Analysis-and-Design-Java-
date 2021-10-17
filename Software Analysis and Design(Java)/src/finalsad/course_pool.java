/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalsad;

import java.util.*;

/**
 *
 * @author pc
 */
public class course_pool {

    public ArrayList<course_description> courses;
    public course_description courseone;
    private Scanner scan;
    
    public void addtoPool(){
        courses = new ArrayList();
        course_description temp = new course_description();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Course ID:");
        int id = sc.nextInt();
        System.out.println("Enter Course Name:");
        String name = sc.next();
        System.out.println("Enter Course Info:");
        String info = sc.next();
        temp.setAll(id, name, info);
        courses.add(temp);
    }
    
    public String seeCourses(){
        int i = 0;
        String text = new String();
        for (course_description item : courses){
            text += "Course Name: " + item.getName() + " Course ID: " + item.getId() + " Course Info: " + item.getInfo() + "\n";
            i++;
        }
        return text;
    }
    
    public course openCourse(course_description temp, member teacher, location loca, semester year){
        course coursely = new course();
        coursely.setCourse_info(temp);
        coursely.setTeacher(teacher);
        coursely.setRoom(loca);
        coursely.setYear(year);
        return coursely;     
    }
}
