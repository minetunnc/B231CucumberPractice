package techproed.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import techproed.pages.ToDoPage;
import techproed.utilities.Driver;
import techproed.utilities.WaitUtils;

import java.util.List;

public class TodoListStepDefinition {
    Actions actions = new Actions(Driver.getDriver());
    ToDoPage toDoPage = new ToDoPage();

    @Given("go to the url")
    public void goToTheUrl() {
        Driver.getDriver().get("http://webdriveruniversity.com/To-Do-List/index.html");
    }

    @When("add todo list")
    public void addTodoList(List<String> worklist) {

        for( String w : worklist ){
            actions.click(toDoPage.addNewTodo).
                    sendKeys(w).
                    sendKeys(Keys.ENTER).
                    perform();
        }
    }

    @And("cross off all todo items")
    public void crossOffAllTodoItems() {
        List<WebElement> todos =  toDoPage.todoList;

        //1.yol
     /* for( WebElement w : todos){
          w.click();
      }*/

        //2. yol
        // todos.forEach(t->t.click());

        //3.yol
        todos.forEach(WebElement::click);

    }

    @And("delete all todo items")
    public void deleteAllTodoItems() {
        List<WebElement> deleteButtons = toDoPage.deleteButtonList;
        deleteButtons.forEach(t->t.click());
    }

    @Then("verify that all todo items have been deleted")
    public void verifyThatAllTodoItemsHaveBeenDeleted() {

        WaitUtils.waitFor(2);
        List<WebElement> todos = toDoPage.todoList;
        Assert.assertTrue(todos.isEmpty());
        Assert.assertEquals(0,todos.size());

    }
}