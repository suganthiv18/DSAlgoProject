package StepDefinitions;

import PageObjects.TreePage;
import Utilities.LoggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TreeStepDefinition {
	
	TreePage tree = new TreePage();
	
	@Given("The user is on the Tree page")
	public void the_user_is_on_the_tree_page() {
	  tree.click_getstartedTree();
	}
	@When("User click on Overview of Trees page")
	public void user_click_on_overview_of_trees_page() {
	   tree.click_OverviewofTree();
	}
	@Then("The user should be redirected to Overview of Trees page")
	public void the_user_should_be_redirected_to_overview_of_trees_page() {
		String title=tree.getTitle();
		LoggerLoad.info("Title of current page is : " + title);
	}
	@When("User click on Terminologies page")
	public void user_click_on_terminologies_page() {
	   tree.click_Terminologies();
	}
	@Then("The user should be redirected to Terminologies page")
	public void the_user_should_be_redirected_to_terminologies_page() {
		String title=tree.getTitle();
		LoggerLoad.info("Title of current page is : " + title);
	}

	@When("User click on Type of Trees page")
	public void user_click_on_type_of_trees_page() {
	   tree.click_TypeOfTrees();;
	}
	@Then("The user should be redirected to Type of Trees page")
	public void the_user_should_be_redirected_to_type_of_trees_page() {
		String title=tree.getTitle();
		LoggerLoad.info("Title of current page is : " + title);
	}
	@When("User click on Tree Traversals page")
	public void user_click_on_tree_traversals_page() {
	   tree.click_TreeTraversals();;
	}
	@Then("The user should be redirected to Tree Traversals page")
	public void the_user_should_be_redirected_to_tree_traversals_page() {
		String title=tree.getTitle();
		LoggerLoad.info("Title of current page is : " + title);
	}
	@When("User click on Traversals Illustration page")
	public void user_click_on_traversals_illustration_page() {
	   tree.click_TravelIllustrations();
	}
	@Then("The user should be redirected to Traversals Illustration page")
	public void the_user_should_be_redirected_to_traversals_illustration_page() {
		String title=tree.getTitle();
		LoggerLoad.info("Title of current page is : " + title);
	}
	@When("User click on Binary Trees page")
	public void user_click_on_binary_trees_page() {
	   tree.click_BinaryTree();
	}
	@Then("The user should be redirected to Binary Trees page")
	public void the_user_should_be_redirected_to_binary_trees_page() {
		String title=tree.getTitle();
		LoggerLoad.info("Title of current page is : " + title);
	}
	@When("User click on Type of Binary Trees page")
	public void user_click_on_type_of_binary_trees_page() {
	   tree.click_TypeOfBinaryTrees();
	}
	@Then("The user should be redirected to Type of Binary Trees page")
	public void the_user_should_be_redirected_to_type_of_binary_trees_page() {
		String title=tree.getTitle();
		LoggerLoad.info("Title of current page is : " + title);
	}
	@When("User click on Implementation in Python page")
	public void user_click_on_implementation_in_python_page() {
	   tree.click_ImplementationInPython();
	}
	@Then("The user should be redirected to Implementation in Python page")
	public void the_user_should_be_redirected_to_implementation_in_python_page() {
		String title=tree.getTitle();
		LoggerLoad.info("Title of current page is : " + title);
	}
	@When("User click on Binary Tree Traversals page")
	public void user_click_on_binary_tree_traversals_page() {
	   tree.click_BinaryTreeTraversal();
	}
	@Then("The user should be redirected to Binary Tree Traversals page")
	public void the_user_should_be_redirected_to_binary_tree_traversals_page() {
		String title=tree.getTitle();
		LoggerLoad.info("Title of current page is : " + title);
	}
	@When("User click on Implementation of Binary Trees page")
	public void user_click_on_implementation_binary_trees_page() {
	   tree.click_ImplementationOfBinaryTrees();
	}
	@Then("The user should be redirected to Implementation of Binary Trees page")
	public void the_user_should_be_redirected_to_implementation_binary_trees_page() {
		String title=tree.getTitle();
		LoggerLoad.info("Title of current page is : " + title);
	}
	@When("User click on Applications of Binary trees page")
	public void user_click_on_applications_of_binary_trees_page() {
	   tree.click_ApplicationsOfBinaryTrees();
	}
	@Then("The user should be redirected to Applications of Binary trees page")
	public void the_user_should_be_redirected_to_applications_of_binary_trees_page() {
		String title=tree.getTitle();
		LoggerLoad.info("Title of current page is : " + title);
	}
	@When("User click on Binary Search Trees page")
	public void user_click_on_binary_search_trees_page() {
	   tree.click_BinarySearchTrees();
	}
	@Then("The user should be redirected to Binary Search Trees page")
	public void the_user_should_be_redirected_to_binary_search_trees_page() {
		String title=tree.getTitle();
		LoggerLoad.info("Title of current page is : " + title);
	}
	@When("User click on Implementation Of BST page")
	public void user_click_on_implementation_of_bst_page() {
	   tree.click_ImplementationOfBst();
	}
	@Then("The user should be redirected to Implementation Of BST page")
	public void the_user_should_be_redirected_to_implementation_of_bst_page() {
		String title=tree.getTitle();
		LoggerLoad.info("Title of current page is : " + title);
	}
	
}

