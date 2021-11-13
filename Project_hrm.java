package O_hrm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project_hrm 
{

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "E:\\selenium jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(6000);
		
		driver.findElement(By.linkText("Forgot your password?")).click();							//forget pass
		driver.findElement(By.id("securityAuthentication_userName")).sendKeys("Admin");
		driver.findElement(By.id("btnSearchValues")).click();
		driver.navigate().back();
		driver.findElement(By.id("btnCancel")).click();
			
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");									//login
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(6000);
		
		
		//subscribe
		
		driver.findElement(By.id("Subscriber_link")).click();
		driver.findElement(By.id("subscriber_name")).sendKeys("");
		driver.findElement(By.id("subscriber_email")).sendKeys("");
		driver.findElement(By.id("btnSubscribe")).click();
		
		Thread.sleep(6000);
		
		//welcome
		
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.id("aboutDisplayLink")).click();
		driver.findElement(By.className("close")).click();
		
		driver.findElement(By.linkText("Support")).click();
	
		
		Thread.sleep(6000);
		//myinfo
		
		
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.id("personal_txtEmpFirstName")).sendKeys("Paul");
		driver.findElement(By.id("personal_txtEmpMiddleName")).sendKeys("Col");
		driver.findElement(By.id("personal_txtEmpLastName")).sendKeys("Collings");
		driver.findElement(By.id("personal_txtEmployeeId")).sendKeys("0024");
		driver.findElement(By.id("personal_txtOtherID")).sendKeys("00");
		driver.findElement(By.id("personal_txtLicenNo")).sendKeys("125");
		
		driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='content']/div[@id='employee-details']/div[@id='pdMainContainer']/div[2]/form[1]/fieldset[1]/ol[2]/li[4]/img[1]")).click();
		Select slexpiy=new Select(driver.findElement(By.className("ui-datepicker-year")));
		slexpiy.selectByValue("2030");
		Select slexpim=new Select(driver.findElement(By.className("ui-datepicker-month")));
		slexpim.selectByValue("7");
		driver.findElement(By.linkText("18")).click();
		
		driver.findElement(By.id("personal_txtSINNo")).sendKeys("10");
		Thread.sleep(6000);
		
		driver.findElement(By.id("personal_optGender_2")).click();
		
		Select smstatus=new Select(driver.findElement(By.id("personal_cmbMarital")));
		smstatus.selectByValue("Single");
		Select snat=new Select(driver.findElement(By.id("personal_cmbNation")));
		snat.selectByValue("82");
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='content']/div[@id='employee-details']/div[@id='pdMainContainer']/div[2]/form[1]/fieldset[1]/ol[3]/li[4]/img[1]")).click();
		Select doby=new Select(driver.findElement(By.className("ui-datepicker-year")));
		doby.selectByValue("2030");
		Select dobm=new Select(driver.findElement(By.className("ui-datepicker-month")));
		dobm.selectByValue("7");
		driver.findElement(By.linkText("18")).click();
		
		driver.findElement(By.id("btnSave")).click();
		
		//custom fileds
		driver.findElement(By.id("btnEditCustom")).click();
		
	//	driver.findElement(By.id("custom2")).sendKeys("");
	
		Select blood=new Select(driver.findElement(By.name("custom1")));
		blood.selectByValue("O-");
		driver.findElement(By.id("btnEditCustom")).click();
		
	//	driver.findElement(By.className("checkboxAtch")).click();
	//	driver.findElement(By.id("btnDeleteAttachment")).click();
		
		//contact details
		Thread.sleep(6000);
		driver.findElement(By.linkText("Contact Details")).click();
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.id("contact_street1")).sendKeys("bypass");
		driver.findElement(By.id("contact_street2")).sendKeys("bypass");
		driver.findElement(By.id("contact_city")).sendKeys("akkalkot");
		driver.findElement(By.id("contact_province")).sendKeys("maharashtra");
		driver.findElement(By.id("contact_emp_zipcode")).sendKeys("413216");
		Select scountry=new Select(driver.findElement(By.id("contact_country")));
		scountry.selectByValue("CA");
		driver.findElement(By.id("contact_emp_hm_telephone")).sendKeys("12121212");
		driver.findElement(By.id("contact_emp_mobile")).sendKeys("145236987");
		driver.findElement(By.id("contact_emp_work_telephone")).sendKeys("112-898-7612");
		driver.findElement(By.id("contact_emp_work_email")).sendKeys("paul1@osohrm.com");
		driver.findElement(By.id("contact_emp_oth_email")).sendKeys("c@mail.com");
		driver.findElement(By.id("btnSave")).click();
		
		Thread.sleep(6000);
		//attachment
		driver.findElement(By.id("btnAddAttachment")).click();
		driver.findElement(By.id("ufile")).sendKeys("C:\\Users\\Shahista Mulla\\Documents\\blank_selenium.txt");
		driver.findElement(By.id("txtAttDesc")).sendKeys("");
		driver.findElement(By.id("btnSaveAttachment")).click();
		//comments
		driver.findElement(By.className("editLink")).click();
		driver.findElement(By.id("txtAttDesc")).sendKeys("this is selenium doc");
		driver.findElement(By.id("btnCommentOnly")).click();
		//download
		driver.findElement(By.linkText("blank_selenium.txt")).click();
	
		Thread.sleep(6000);
		//emergency cntact
		driver.findElement(By.linkText("Emergency Contacts")).click();
		driver.findElement(By.id("btnAddContact")).click();
		driver.findElement(By.id("emgcontacts_name")).sendKeys("kraj");
		driver.findElement(By.id("emgcontacts_relationship")).sendKeys("bro");
		driver.findElement(By.id("emgcontacts_homePhone")).sendKeys("11223344");
		driver.findElement(By.id("emgcontacts_mobilePhone")).sendKeys("00000");
		driver.findElement(By.id("emgcontacts_workPhone")).sendKeys("124565");
		driver.findElement(By.id("btnSaveEContact")).click();
		//attachment
		driver.findElement(By.id("btnAddAttachment")).click();
		driver.findElement(By.id("ufile")).sendKeys("C:\\Users\\Shahista Mulla\\Documents\\blank_selenium.txt");
		driver.findElement(By.id("txtAttDesc")).sendKeys("selenium file");
		driver.findElement(By.id("btnSaveAttachment")).click();
		
		Thread.sleep(6000);
		//dependents
		driver.findElement(By.linkText("Dependents")).click();
		driver.findElement(By.id("btnAddDependent")).click();
		driver.findElement(By.id("dependent_name")).sendKeys("kkkkk");
		Select srel=new Select(driver.findElement(By.id("dependent_relationshipType")));
		srel.selectByValue("child");
		//date
		driver.findElement(By.xpath("//*[@id=\"frmEmpDependent\"]/fieldset/ol/li[4]/img")).click();
		Select sdoby=new Select(driver.findElement(By.className("ui-datepicker-year")));
		sdoby.selectByValue("1998");
		Select sdobm=new Select(driver.findElement(By.className("ui-datepicker-month")));
		sdobm.selectByValue("5");
		driver.findElement(By.linkText("18")).click();
		
		driver.findElement(By.id("btnSaveDependent")).click();
		//attachment
		Thread.sleep(6000);
		driver.findElement(By.id("btnAddAttachment")).click();
		driver.findElement(By.id("ufile")).sendKeys("C:\\Users\\Shahista Mulla\\Documents\\blank_selenium.txt");
		driver.findElement(By.id("txtAttDesc")).sendKeys("");
		driver.findElement(By.id("btnSaveAttachment")).click();
		//immigration
		driver.findElement(By.linkText("Immigration")).click();
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("immigration_type_flag_1")).click();
		driver.findElement(By.id("immigration_number")).sendKeys("121212");
		
		driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='content']/div[1]/div[2]/div[2]/form[1]/fieldset[1]/ol[1]/li[3]/img[1]")).click();
		Select isdy=new Select(driver.findElement(By.className("ui-datepicker-year")));
		isdy.selectByValue("1998");
		Select isdm=new Select(driver.findElement(By.className("ui-datepicker-month")));
		isdm.selectByValue("5");
		driver.findElement(By.linkText("18")).click();
		
		driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='content']/div[1]/div[2]/div[2]/form[1]/fieldset[1]/ol[1]/li[4]/img[1]")).click();
		Select expdy=new Select(driver.findElement(By.className("ui-datepicker-year")));
		expdy.selectByValue("2020");
		Select expdm=new Select(driver.findElement(By.className("ui-datepicker-month")));
		expdm.selectByValue("5");
		driver.findElement(By.linkText("18")).click();
		
		Thread.sleep(6000);
		
		driver.findElement(By.id("immigration_i9_status")).sendKeys("");
		
		Select isby=new Select(driver.findElement(By.id("immigration_country")));
		isby.selectByValue("IN");
		
		driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='content']/div[1]/div[2]/div[2]/form[1]/fieldset[1]/ol[1]/li[7]/img[1]")).click();
		Select erdy=new Select(driver.findElement(By.className("ui-datepicker-year")));
		erdy.selectByValue("2021");
		Select erdm=new Select(driver.findElement(By.className("ui-datepicker-month")));
		erdm.selectByValue("5");
		driver.findElement(By.linkText("18")).click();
		
		driver.findElement(By.id("immigration_comments")).sendKeys("");
		driver.findElement(By.id("btnSave")).click();
		
		Thread.sleep(6000);
		// for select visa
		
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("immigration_type_flag_2")).click();
		driver.findElement(By.id("immigration_number")).sendKeys("00000");
		
		driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='content']/div[1]/div[2]/div[2]/form[1]/fieldset[1]/ol[1]/li[3]/img[1]")).click();
		Select visdy=new Select(driver.findElement(By.className("ui-datepicker-year")));
		visdy.selectByValue("1998");
		Select visdm=new Select(driver.findElement(By.className("ui-datepicker-month")));
		visdm.selectByValue("5");
		driver.findElement(By.linkText("18")).click();
		
		driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='content']/div[1]/div[2]/div[2]/form[1]/fieldset[1]/ol[1]/li[4]/img[1]")).click();
		Select vexpdy=new Select(driver.findElement(By.className("ui-datepicker-year")));
		vexpdy.selectByValue("2020");
		Select vexpdm=new Select(driver.findElement(By.className("ui-datepicker-month")));
		vexpdm.selectByValue("5");
		driver.findElement(By.linkText("18")).click();
		
		Thread.sleep(6000);
		
		driver.findElement(By.id("immigration_i9_status")).sendKeys("");
		
		Select visby=new Select(driver.findElement(By.id("immigration_country")));
		visby.selectByValue("IN");
		
		driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='content']/div[1]/div[2]/div[2]/form[1]/fieldset[1]/ol[1]/li[7]/img[1]")).click();
		Select verdy=new Select(driver.findElement(By.className("ui-datepicker-year")));
		verdy.selectByValue("2021");
		Select verdm=new Select(driver.findElement(By.className("ui-datepicker-month")));
		verdm.selectByValue("5");
		driver.findElement(By.linkText("18")).click();
		
		driver.findElement(By.id("immigration_comments")).sendKeys("");
		driver.findElement(By.id("btnSave")).click();
		
		Thread.sleep(6000);
		//attachment
		driver.findElement(By.id("btnAddAttachment")).click();
		driver.findElement(By.id("ufile")).sendKeys("C:\\Users\\Shahista Mulla\\Documents\\blank_selenium.txt");
		driver.findElement(By.id("txtAttDesc")).sendKeys("");
		driver.findElement(By.id("btnSaveAttachment")).click();

		Thread.sleep(6000);
		
		//job
		
		driver.findElement(By.linkText("Job")).click();
		
		
		driver.findElement(By.linkText("Salary")).click();
		driver.findElement(By.linkText("Tax Exemptions")).click();
		driver.findElement(By.linkText("Report-to")).click();
		driver.findElement(By.linkText("Qualifications")).click();
		
		Thread.sleep(6000);
		
		//directory
		
		driver.findElement(By.id("menu_directory_viewDirectory")).click();
		
		driver.findElement(By.id("searchDirectory_emp_name_empName")).sendKeys("Odis Adalwin");
		Select sjob=new Select(driver.findElement(By.id("searchDirectory_job_title")));
		sjob.selectByValue("0");
		Select slocation=new Select(driver.findElement(By.id("searchDirectory_location")));
		slocation.selectByValue("-1");
		driver.findElement(By.id("searchBtn")).click();
		
		driver.findElement(By.id("resetBtn")).click();
				
		Select sjob1=new Select(driver.findElement(By.id("searchDirectory_job_title")));
		sjob1.selectByValue("5");
		Select slocation1=new Select(driver.findElement(By.id("searchDirectory_location")));
		slocation1.selectByValue("-1");
		driver.findElement(By.id("searchBtn")).click();
		
		Thread.sleep(6000);
		//maintenance
		//purge record
		driver.findElement(By.id("menu_maintenance_purgeEmployee")).click();
		driver.findElement(By.id("confirm_password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"frmPurgeEmployeeAuthenticate\"]/div/div/input")).click();
		
		WebElement we=driver.findElement(By.id("employee_empName"));
		we.sendKeys("asdf");
		we.sendKeys(Keys.ENTER);
		//candidate record				
		driver.findElement(By.id("menu_maintenance_PurgeRecords")).click();
		driver.findElement(By.id("menu_maintenance_purgeCandidateData")).click();
		driver.findElement(By.id("confirm_password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"frmPurgeEmployeeAuthenticate\"]/div/div/input")).click();
				
		WebElement we1=driver.findElement(By.id("candidate_empName"));
		we1.sendKeys("S");
		we1.sendKeys(Keys.ENTER);
		driver.findElement(By.className("search_employee")).click();
			
		//access record		
		driver.findElement(By.id("menu_maintenance_accessEmployeeData")).click();
		driver.findElement(By.id("confirm_password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"frmPurgeEmployeeAuthenticate\"]/div/div/input")).click();
				
		WebElement we2=driver.findElement(By.id("employee_empName"));
		we2.sendKeys("a");
		we2.sendKeys(Keys.ENTER);
		driver.findElement(By.className("search_employee")).click();
				
		//		driver.findElement(By.id("btnDelete")).click();
		//		driver.findElement(By.id("modal_confirm")).click();

		Thread.sleep(6000);
		
		//buzz
		
		driver.findElement(By.id("menu_buzz_viewBuzz")).click();
		driver.findElement(By.id("createPost_content")).sendKeys("this is your info");
	
		driver.findElement(By.id("tabLink2")).click();
	
		driver.findElement(By.id("tabLink3")).click();
		driver.findElement(By.id("createVideo_content")).sendKeys("");
		
		
	//	driver.findElement(By.className("submitBtn btnSaveVideo")).click();
		
		Thread.sleep(6000);
		
		driver.findElement(By.id("rightBarHeadingAnniv")).click();
		driver.findElement(By.id("rightBarHeadingMl")).click();
		driver.findElement(By.id("rightBarHeadingMc")).click();
		
		Thread.sleep(6000);
		//logout
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		
		driver.close();

		

	}

}
