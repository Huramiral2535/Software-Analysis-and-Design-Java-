/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalsad;
import java.util.*;
import java.io.*;
/**
 *
 * @author pc
 */
public class FinalSAD {

    public static void main(String[] args) {
        ArrayList<member> teachers = new ArrayList();
        ArrayList<member> admins = new ArrayList();
        Scanner sc = new Scanner(System.in);
        course_pool pool = new course_pool();
        ArrayList<course> opened_courses = new ArrayList();
        ArrayList<location> locations = new ArrayList();;
        location loca1= new location();
        location loca2= new location();
        loca1.setLoca("B7");
        loca2.setLoca("B8");
        locations.add(loca1);
        locations.add(loca2);
        
        admin_staff staff = new admin_staff();
        staff.setMember("Kemal",100,0);
        staff.setAuthority();
        admins.add(staff);
        
        faculty_member hoca = new faculty_member();
        hoca.setMember("Enes",200,0);
        hoca.setAuthority();
        teachers.add(hoca);        
        
        member temp = new member();
        int active1 = 0;
        while (active1 == 0){
            System.out.println("Please sign in with ID:");  
            int signid = sc.nextInt();
            System.out.println("Password:");
            int password = sc.nextInt();
            
            for (member type: teachers){
                if(signid == type.getUid() && password == type.getPassword()){
                    temp = type;
                    active1 = 1;
                }
            }
            for (member type: admins){
                if(signid == type.getUid() && password == type.getPassword()){
                    temp = type;
                    active1 = 1;
                }
            }
            if (temp.getName() == null){
                    System.out.println("Error: Wrong UID or Password.");
                    System.out.println("Retry? (1 for Yes/2 for No)");
                    int retry = sc.nextInt();
                    if (retry == 2){   
                        System.exit(0);
                    }                   
            }
        }
        int active2 = 2;
        while(active2 == 2){
            System.out.println("-------*-------");
            if (temp.getAutharity() == 3){
                System.out.println("Choose action:\n1. Add Course\n2. See Openable Courses\n3. Open Course For Semester\n4. Opened Courses For Semester");
                int action = sc.nextInt();
                switch(action){
                    case 1:
                        pool.addtoPool();
                        break;
                    case 2:
                        System.out.println(pool.seeCourses());
                        break;
                    case 3:                           
                        System.out.println("Enter Course ID:");
                        int temp1 = 0;  

                        boolean flag;
                        do{
                            try{
                                Scanner sc2 = new Scanner(System.in);
                                temp1=sc2.nextInt();
                                flag=false;
                            }
                            catch(Exception e){
                            System.out.println("Input Error!\nEnter Course ID:");
                            flag=true;
                            }
                        }
                        while(flag);
                        course_description temp2 = new course_description();
                        for (course_description temp3 : pool.courses){
                            if(temp3.getId() == temp1){
                                temp2 = temp3;
                            }
                        }
                        System.out.println("Choose Teacher:(Enter name)");
                        String teach = sc.next();
                        member temp5 = new member();
                        for (member temp4: teachers){
                            if(teach.equals(temp4.getName())){
                                temp5 = temp4;
                            }
                        }
                        System.out.println("Choose Location For Course:\n");
                        int i = 1;
                        for (location loca: locations){
                            System.out.println(i  +". " + loca.getLoca());
                            i++;
                            }
                        int k = sc.nextInt();
                        k = k-1;
                        location temp6 = new location();
                        temp6 = locations.get(k);
                        System.out.println("Enter Current Year:");
                        int year = sc.nextInt();
                        System.out.println("Enter Current Semester:");
                        String semester = sc.next();
                        semester temp7 = new semester();
                        temp7.setSemester(semester);
                        temp7.setYear(year);
                        course termlycourse = new course();
                        termlycourse = pool.openCourse(temp2, temp5, temp6, temp7);
                        opened_courses.add(termlycourse);                            


                        break;
                    case 4:
                        for(course list: opened_courses){
                            System.out.println("-------*-------");
                            System.out.println(list.toString());
                        }
                        break;
                }
            
            }
            System.out.println("-------*-------");
            System.out.println("End the system?\n For Yes Press 1\n For No Press 2");
            active2 = sc.nextInt();
        }
    } 
}

