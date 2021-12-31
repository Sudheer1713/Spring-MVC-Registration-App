/**
 * 
 */
package com.sudheer.bindings;

import java.util.Arrays;

/**
 * @author Sudheer
 *
 */
public class User {
	
	private String name;
	private String email;
	private String gender;
	private String course;
	private String[] timings;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the course
	 */
	public String getCourse() {
		return course;
	}
	/**
	 * @param course the course to set
	 */
	public void setCourse(String course) {
		this.course = course;
	}
	/**
	 * @return the timings
	 */
	public String[] getTimings() {
		return timings;
	}
	/**
	 * @param timings the timings to set
	 */
	public void setTimings(String[] timings) {
		this.timings = timings;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", gender=" + gender + ", course=" + course + ", timings="
				+ Arrays.toString(timings) + "]";
	}
	
	

}
