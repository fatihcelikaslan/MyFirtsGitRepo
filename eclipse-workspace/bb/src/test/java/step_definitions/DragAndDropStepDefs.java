//package step_definitions;
//
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import pages.HerokuDragAndDropPage;
//import pages.HerokuappHomePage;
//import utilities.Driver;
//
//public class DragAndDropStepDefs {
//	
//	HerokuDragAndDropPage drag = new HerokuDragAndDropPage();
//	HerokuappHomePage herHomePage = new HerokuappHomePage();
//	
//	@Given("clicks to Drag and Drop link")
//	public void clicks_to_Drag_and_Drop_link() {
//		herHomePage.dragAndDropLink.click();
//	}
//
//	@Then("Moves A onto B")
//	public void moves_A_onto_B() {
//		Actions action = new Actions(Driver.getDriver());
//		action.dragAndDrop(drag.columnA, drag.columnB).perform();
//		
//	}
//
//}
