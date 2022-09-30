package Parse;

import java.io.File;

public class Employee {
	String empName;
	int empId;
	boolean mStatus;
	int[] phNo;
			
	
	public Employee(String empName,int empId,boolean mStatus, int[] phNo) {
		this.empName=empName;
		this.empId=empId;
		this.mStatus=mStatus;
		this.phNo=phNo;
		
		
	}
public Employee() {
	// TODO Auto-generated constructor stub
}

	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}


	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}


	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}


	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}


	/**
	 * @return the mStatus
	 */
	public boolean ismStatus() {
		return mStatus;
	}


	/**
	 * @param mStatus the mStatus to set
	 */
	public void setmStatus(boolean mStatus) {
		this.mStatus = mStatus;
	}


	/**
	 * @return the phNo
	 */
	public int[] getPhNo() {
		return phNo;
	}


	/**
	 * @param phNo the phNo to set
	 */
	public void setPhNo(int[] phNo) {
		this.phNo = phNo;
	}

}
