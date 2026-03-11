# Common Config Plugin

[![Build Status](https://github.com/Akazukin-Team/Java-Common-Plugin-Config/actions/workflows/build.yml/badge.svg)](https://github.com/Akazukin-Team/Java-Common-Plugin-Config/actions/workflows/build.yml)

A common config plugin for store config

---

## Table of Contents

- [Features](#features)
- [Getting Started](#getting-started)
    - [Prerequisites](#prerequisites)
    - [Installation](#installation)
- [Contributing](#contributing)
- [Build Instructions](#build-instructions)
- [Continuous Integration](#continuous-integration)
- [License](#license)
- [Contact](#contact)

---

## Features

- <PLACEHOLDER_FEATURES>

---

## Getting Started

### Prerequisites

Make sure you have the following installed:

- **Java Development Kit (JDK)** version 17 or later.

---

### Installation

#### Using Maven

1. Add the following repository to the `<repositories>` block in your `pom.xml` file:

   ```xml
   <repository>
       <id>akazukin-repo</id>
       <name>Akazukin Repository</name>
       <url>https://maven.akazukin.org/refer/maven-public-plugins/</url>
   </repository>
   ```

2. Add the dependency to the `<dependencies>` block in your `pom.xml` file:
   ```xml
   <dependency>
       <groupId>org.akazukin</groupId>
       <artifactId>common-config</artifactId>
       <version>VERSION</version>
   </dependency>
   ```

---

#### Using Gradle

1. Add the repository to the `repositories` block in your `build.gradle` file:

   ```groovy
   maven {
       name = 'Akazukin Repository'
       url = 'https://maven.akazukin.org/refer/maven-public-plugins/'
   }
   ```

2. Add the dependency to the `dependencies` block in your `build.gradle` file:
   ```groovy
   implementation 'org.akazukin:common-config:<VERSION>'
   ```

---

## Contributing

Please read the [Contribution Guide](./.github/CONTRIBUTING.md) carefully and follow the coding conventions and
guidelines when making your changes.

---

## Build Instructions

To build the project from source, follow these steps:

1. Clone the repository:

   ```shell
   git clone https://github.com/Akazukin-Team/Java-Common-Plugin-Config.git
   cd Java-Common-Plugin-Config
   ```

2. Build the project with Gradle:

   ```shell
   ./gradlew build
   ```

   The compiled JAR file will be located in the `build/libs/` directory.

3. Publish to the local Maven repository using the `maven-publish` plugin:
   ```shell
   ./gradlew publishToMavenLocal
   ```

---

## Continuous Integration

This project uses GitHub Actions for Continuous Integration (CI).
Every push to the production or development branch automatically triggers the build and test workflow.

---

## License

This project is licensed under the terms described in the [License](LICENSE) file.

---

## Contact

If you need further assistance or wish to contact us directly,
please refer to the [Support](./.github/SUPPORT.md) page.

---
