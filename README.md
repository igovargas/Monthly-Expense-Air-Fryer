# 🔌 Air Fryer Power Consumption Calculator

A simple Java program that helps users estimate the **monthly energy cost** of using an Air Fryer at home.  
Great for personal budgeting and understanding the impact of daily appliance usage on your electricity bill.

## 📋 Features

- User-friendly prompts to guide input
- Accepts Air Fryer power in **kW** or **Wh** (automatically converts if needed)
- Calculates:
  - Daily energy consumption
  - Daily and monthly cost based on usage and local energy rate
- Clear console output, formatted for readability

## 🧮 How It Works

The program asks the user for:

1. How many times per day the Air Fryer is used  
2. Average usage time (in minutes) per use  
3. The appliance's power (kW or Wh)  
4. The local cost per kWh (R$)

## 🛠️ Technologies

- Language: **Java**
- No external libraries required

## 🚀 Getting Started

### Prerequisites

- Java JDK 8 or later
- Any text editor or IDE (e.g., VS Code, IntelliJ)

### Running the Program

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/airfryer-consumption-calculator.git
2. Compile and run
   ```bash
   javac ConsumoAirFryer.java
   java ConsumoAirFryer

### Aplication exemple:

Let's calculate your monthly Air Fryer spending.
How many times do you use your Air Fryer per day?
> 2
What is your average usage, in minutes?
> 15
What is the power (kW) of the Air Fryer?
> 1500
Input interpreted as Wh. Converted to: 1.5 kW
What is your kWh rate (R$)?
> 0.9
Your monthly expense is R$40.5 with Air Fryer.

### This project was created for learning purposes — to practice:

- Java basics
- Input validation
- Arithmetic logic
- Clean code and user interaction in the terminal
