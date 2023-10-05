package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import PageObjects.GraphPage;
import Utilities.LoggerLoad;

public class GraphStepDefinition {

	GraphPage graph = new GraphPage();
	
	@Given("The user is on the Graph page")
	public void the_user_is_on_the_graph_page() {
		LoggerLoad.info("The user is on Graph Page");
		graph.clickgraph();
	}

	@When("User click on Graph page in Python")
	public void the_user_click_on_graph_page_in_python() {
		LoggerLoad.info("The user clicks Graph Page link");
		graph.clickgraphPage();

	}

	@Then("The user should be redirected to Graph page")
	public void the_user_should_be_redirected_to_graph_page() {
		LoggerLoad.info("The user should be redirected to Graph page");
		String title=graph.getTitle();
		LoggerLoad.info("Title of current page is : " + title);

	} 
	
	
	@When("User click on Graph Representations in Python")
	public void the_user_click_on_graph_representations_in_python() {
		LoggerLoad.info("User click on Graph Representations in Python");
		graph.clickgraphrep();

	}

	@Then("The user should be redirected to Graph Representations page")
	public void the_user_should_be_redirected_to_graph_representations_page() {
		LoggerLoad.info("The user should be redirected to Graph Representations page");
		String title=graph.getTitle();
		LoggerLoad.info("Title of current page is : " + title);

	} 
}