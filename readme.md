# Pizza Bill Generator

## Overview

This project implements a simple pizza bill Generator in Java. It allows users to create different types of 
pizzas (Base and Deluxe Pizza), add extra toppings and cheese, and opt for takeaway service. The final bill is generated based on the selections made.

## Features

- **Pizza Types**: Choose between Base and Deluxe Pizzas.
- **Customization**: Add extra cheese and toppings.
- **Takeaway Option**: Select takeaway service for an additional charge.
- **Bill Generation**: View a detailed bill summarizing the costs.

## OOPs Features

- **Encapsulation**: Attributes like price and type are private, accessed through public methods.
- **Inheritance**: The `Pizza` class serves as a base for `DeluxPizza`, promoting code reuse.
- **Polymorphism**: Methods like `getBill()` can be overridden in subclasses for specific behavior.
- **Abstraction**: Common behaviors are defined in abstract classes or interfaces, allowing for flexible implementations.
- **Composition**: Toppings can be managed as separate objects, enhancing complexity and flexibility.
  
## Requirements
Java Development Kit (JDK) installed on your machine.

## Future Enhancements
- **Implement the DeluxPizza class for additional features.**
- **Add more customization options (like size or crust type).**
- **Implement a graphical user interface (GUI) for better user experience.**
