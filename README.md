# Finite State Machine

## Project Overview
This project is a Java implementation of a Finite State Machine (FSM) designed to validate identifiers and numerical constants in a given programming language. This FSM is used to perform part of the syntatctic analysis of a compiler.

## Features
- **Input Validation**: Check if a sequence of characters is a valid identifier or a numerical constant within the context of a programming language. Here the constraints are as follows:
  - identifiers:
    - can contain only lowercase letters
    - can contain 0 or multiple digits but the digits need to be at the end
  - numerical constants:
	  - a valid number, optionally with a + or - sign in front

- **State Transition Viewer**: Given a current state and a symbol, view the next state according to the FSM's transition rules.

- **FSM to Regular Grammar Conversion**: Convert the defined FSM into a regular grammar representation, enabling further analysis and application of language theory concepts.

## About Finite State Machines
A Finite State Machine (FSM) is a computational model used to design and analyze the behavior of systems and software. It consists of a limited number of states and transitions between these states. At any given time, the FSM is in one state, and based on input or events, it transitions to another state, possibly performing certain actions during this transition. The simplicity and effectiveness of FSMs make them a powerful tool for modeling complex systems across a wide range of applications such as:

- development of user interfaces, where the system's response to user input can be modeled as transitions between different states
- in game development, FSMs manage game character behaviors, making decisions based on the game's current state
- design of communication protocols, where they ensure data is sent, received, and processed correctly across networks
