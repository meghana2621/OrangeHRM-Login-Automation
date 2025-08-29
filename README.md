# OrangeHRM Login Automation

This is a **Selenium + TestNG automation project** for testing the **Login functionality** of [OrangeHRM demo](https://opensource-demo.orangehrmlive.com/).

---

## Project Overview
- Automates login tests for OrangeHRM.
- Uses **Java**, **Selenium WebDriver**, and **TestNG**.
- Generates console logs for test execution.
- Can be extended to include more test cases and modules.

---

## Test Cases Implemented

### 1. Valid Login
- **Steps:**
  1. Open OrangeHRM login page
  2. Enter valid username and password
  3. Click Login
- **Expected Result:** User successfully logs in.

### 2. Invalid Password
- **Steps:**
  1. Open OrangeHRM login page
  2. Enter valid username and wrong password
  3. Click Login
- **Expected Result:** Error message displayed: "Invalid credentials".

### 3. Blank Username or Password 
- **Steps:**
  1. Open OrangeHRM login page
  2. Leave username or password blank
  3. Click Login
- **Expected Result:** Error message displayed: "Required".

---