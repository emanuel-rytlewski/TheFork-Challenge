# TheFork-Challenge

<p align="center">
  <img src="images/logo.png" width="250" height="250"/>
</p>

## Description

TheFork is an e2e demo framework. It was developed using Java, Maven, and Selenium.

## Quickstart

Assuming Google Chrome and Git installed:

```bash
# For Mac
# install java 11 (skip if already installed)
brew tap AdoptOpenJDK/openjdk
brew cask install adoptopenjdk11

# install chromedriver (skip if already installed)
brew cask install chromedriver

# clone the project and launch the tests
git clone https://github.com/emanuel-rytlewski/TheFork-Challenge.git
cd TheFork

# For Windows
# install java 11 
choco install adoptopenjdk11

# install chromedriver (skip if already installed)
choco install chromedriver

# clone the project and launch the tests
git clone https://github.com/emanuel-rytlewski/TheFork-Challenge.git
cd TheFork 
```

This will execute all the tests using your local Chrome browser.


## Developer Installation

To install the dependencies we use *brew*. You can install it from here: <https://brew.sh/>

### 1. Install git

```bash
# For Mac
brew install git

# For Windows
choco install git
```

### 2. Install Java 11 SDK

```bash
# For Mac
brew tap AdoptOpenJDK/openjdk
brew cask install adoptopenjdk11

# For Windows
choco install AdoptOpenJDK/openjdk
choco install adoptopenjdk11
```

Test that java 11 is correctly installed with

```bash
java -version
```

If it was correctly installed you should see something like

 ```bash
openjdk version "11.0.6" 2020-01-14
OpenJDK Runtime Environment AdoptOpenJDK (build 11.0.6+10)
OpenJDK 64-Bit Server VM AdoptOpenJDK (build 11.0.6+10, mixed mode)
```

### 3. Install Maven

```bash
# For Mac
brew install maven

# For Windows
choco install maven
```

### 4. Install IntelliJ IDEA CE

IntelliJ IDEA CE can be installed from the jetbrains website: <https://www.jetbrains.com/idea/download/#section=mac>  
It can also be installed using brew:

```bash
# For Mac
brew cask install intellij-idea-ce

# For Windows
choco install intellij-idea-ce
```

### 5. Install chromedriver

```bash
# For Mac
brew cask install chromedriver

# For Windows
choco install chromedriver
```




