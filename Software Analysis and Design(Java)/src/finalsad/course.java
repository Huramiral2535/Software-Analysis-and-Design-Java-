/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalsad;

/**
 *
 * @author pc
 */
public class course {
    private course_description course_info;
    private member teacher;
    private location room;
    private semester year;

    /**
     * @return the course_info
     */
    public course_description getCourse_info() {
        return course_info;
    }

    /**
     * @param course_info the course_info to set
     */
    public void setCourse_info(course_description course_info) {
        this.course_info = course_info;
    }

    /**
     * @return the teacher
     */
    public member getTeacher() {
        return teacher;
    }

    /**
     * @param teacher the teacher to set
     */
    public void setTeacher(member teacher) {
        this.teacher = teacher;
    }

    /**
     * @return the room
     */
    public location getRoom() {
        return room;
    }

    /**
     * @param room the room to set
     */
    public void setRoom(location room) {
        this.room = room;
    }

    /**
     * @return the year
     */
    public semester getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(semester year) {
        this.year = year;
    }

    public String toString(){
        return "Course Name: " + course_info.getName() + "\nTeacher's Name: " + teacher.getName() + "\nSemester: " + year.getSemester() + "\nLocation: " + room.getLoca();
    }
}
