## Purpose

This repository is created to:
- Learn Playwright with Java from basics to advanced level
- Implement real-world automation best practices
- Prepare for QA Automation Engineer interviews (3–4 years experience)
- Build a scalable and maintainable test automation framework

## Tech Stack

- Java 11+
- Playwright for Java
- Maven
- TestNG / JUnit (depending on what you use)
- IntelliJ IDEA

## Project Structure

PlaywrightLearning/
│
├── src
│   ├── main
│   │   └── java
│   │       ├── pages                 # Page Object classes
│   │       │   └── LoginPage.java
│   │       │
│   │       ├── factory               # Playwright setup / browser factory
│   │       │   └── PlaywrightFactory.java
│   │       │
│   │       ├── utils                 # Utilities (config, helpers)
│   │       │   └── ConfigReader.java
│   │       │
│   │       └── constants             # Constants (timeouts, paths)
│   │           └── FrameworkConstants.java
│   │
│   └── test
│       ├── java
│       │   ├── stepDefinitions       # Cucumber step definitions
│       │   │   └── LoginSteps.java
│       │   │
│       │   ├── hooks                 # Cucumber hooks
│       │   │   └── Hooks.java
│       │   │
│       │   └── runners               # Test runners
│       │       └── TestRunner.java
│       │
│       └── resources
│           ├── features              # Gherkin feature files
│           │   └── login.feature
│           │
│           └── config                # Environment configs
│               └── config.properties
│
├── docs                               # Learning notes & interview prep
│   ├── 01_Playwright_Introduction.md
│   ├── 02_Playwright_Architecture.md
│   ├── 03_Locators.md
│   └── interview_notes.md
│
├── pom.xml
└── README.md