# Coin_Market_Cap
Verify that using CoinMarketCap application comparing the coin values after the filter Selenium Framework with Cucumber BDD framework for automation using Selenium Cucumber and TestNg
The framework has following features

POM Design Pattern Framework fully integrated with maven for depentancy management. Log4j enabled for logging Report Generation using Cucumber extent report. Using Plugins inside the runner class. Helper class to handle browser initialization ,taking screenshots etc. Centralized Configuration (Using Properties file) Hooks are blocks of code for that run before or after each scenario in the Cucumber execution cycle.

In this project using selenium automation tool with java programming launguage. Cucumber BDD framework. It contains multiple classes and files in its setup.I will give you a high level on how our Framework is setup.

Feature File- We have a feature file in which we will give the test steps as inputs. We use multiple keywords like, Scenario, Scenario Outlinr, Background, Examples, Hooks etc. Given- We provide the preconditons here When - We tell what has to be done for testing And - Anything contionuos action to the previous statement. Then- What will happen when we do something. Basically we do the validation here. But- Is for negative scenarios.

Property File- We will have a property file in which we can store data in a key-value pair

Base class- We have a seperate base class in which we will store all the methods necessary for the project.We will extend this class in Stepdefinition to access these methods.

POM class- For every webPage in the application, we have a corresponding pom page in which we locate and store the elements of that page using @FindBy annotation for re-using them inside the script.

Singleton Class - We employ Singleton page for creating a single instance through which we can access all the elements of these POM classes. We use FileREaderManager and ConfigurationReader to do this.

StepDefinition - We get the methods from the base class and the elements from the POM class and the object from singleton and also give logics inside the step methods.

Runner Class- We run the script from here using JUnit. We map the Feature file and stepdfinition by giving their paths in "Feature" and "glue" under CucumberOptions. We can give any Plugins for reports if we want. We use cucumber extent reports.

This is how my framework is set up.
