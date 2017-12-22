package com.ct.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ct.utilities.Driver;

public class EmploymentInfoPage {
	public EmploymentInfoPage() {
        PageFactory.initElements(Driver.getInstance(), this);
    }
	
	//------
	@FindBy(xpath="//h2[.='Employment Information']")
	public WebElement EmpInformationSign;
	
	
//----------dropdown--selectors---------------------
	@FindBy(xpath="//select[@name='Dropdown']")
	public WebElement Title;
	
	@FindBy(xpath="//select[@name='Dropdown1']")
	public WebElement Department;
	
	@FindBy(xpath="//select[@name='Dropdown2']")
	public WebElement durationOfEmp;
	
	@FindBy(xpath="//select[@name='Dropdown3']")
	public WebElement purposeOfLoan;
	
	@FindBy(xpath="//select[@name='Dropdown4']")
	public WebElement supervisor;
//----------------dorpdown-- errormessage-------	
	@FindBy(xpath="//p[@id='error-Dropdown']")
	public WebElement titleErrorMessage ;
	
	@FindBy(xpath="//p[@id='error-Dropdown1']")
	public WebElement departmentErrorMessage;
	
	@FindBy(xpath="//p[@id='error-Dropdown2']")
	public WebElement durOfEmpErrorMessage ;
	
	@FindBy(xpath="//p[@id='error-Dropdown3']")
	public WebElement purOfLoanErrorMessage;
	
	@FindBy(xpath="//p[@id='error-Dropdown4']")
	public WebElement superviserErrorMessage ;
	//sorry there is no next and previus button due to my project is not running
	// I gonna fix as soon as possible
	
}
