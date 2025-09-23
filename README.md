# AutomationExercise E-commerce Automation Project

## 📌 Project Overview
This project automates end-to-end test scenarios of the [AutomationExercise](https://automationexercise.com/) application using **Selenium WebDriver**, **Java**, and **TestNG**.  
It is designed to replicate real-world automation practices with a modular and reusable framework structure following the **Page Object Model (POM)** design pattern.  

---

## 🛠 Tech Stack
- **Programming Language**: Java  
- **Automation Tool**: Selenium WebDriver  
- **Test Framework**: TestNG  
- **Build Tool**: Maven  
- **IDE**: Eclipse / IntelliJ IDEA  
- **Version Control**: Git & GitHub  

---

## 📂 Project Structure
automationexercise-automation/
│── src/main/java/
│ ├── pages/ # Page classes (HomePage, SignupPage, LoginPage, ContactUsPage, etc.)
│ └── utils/ # BaseTest, DriverFactory, ConfigReader
│
│── src/test/java/
│ └── tests/ # TestNG test classes organized by feature (login, contact, products, etc.)
│
│── testng.xml # Test suite configuration
│── pom.xml # Maven dependencies
│── README.md # Project documentation


---

## ✅ Test Scenarios Covered
The project covers **all 26 test cases** provided by AutomationExercise, grouped by feature:

### 🔐 User Authentication
- TC01 – Register User  
- TC02 – Login User with correct email and password  
- TC03 – Login User with incorrect email and password  
- TC04 – Logout User  
- TC05 – Register User with existing email  

### 📞 Contact Us
- TC06 – Contact Us Form  

### 🛍️ Products & Cart
- TC08 – Verify All Products and product detail page  
- TC09 – Search Product  
- TC12 – Add Products in Cart  
- TC13 – Verify Product quantity in Cart  
- TC17 – Remove Products From Cart  

### 🛒 Checkout Workflow
- TC14 – Place Order: Register while Checkout  
- TC15 – Place Order: Register before Checkout  
- TC16 – Place Order: Login before Checkout  
- TC24 – Download Invoice after purchase  

### 👤 Account Management
- TC07 – Verify Test Cases Page  
- TC10 – Verify Subscription in home page  
- TC11 – Verify Subscription in Cart page  
- TC18 – View Category Products  
- TC19 – View & Cart Brand Products  
- TC20 – Search Products and Verify Cart After Login  
- TC21 – Add review on product  
- TC22 – Add to cart from Recommended items  
- TC23 – Verify address details in checkout page  

### ⚡ Edge Cases
- Empty input fields (login/signup)  
- Invalid credentials handling  
- Negative checkout validations  

---

## 🚀 How to Run
1. Clone the repository  
   ```bash
   git clone https://github.com/your-username/automationexercise-automation.git
