# Worldline Acquiring Java SDK

## Introduction

The Java SDK helps you to communicate with the Worldline Acquiring API. Its primary features are:

* convenient Java wrapper around the API calls and responses
    * marshalls Java request objects to HTTP requests
    * unmarshalls HTTP responses to Java response objects or Java exceptions
* handling of all the details concerning authentication
* handling of required metadata

See the [Worldline Acquiring Documentation](https://docs.acquiring.worldline-solutions.com/Developer-Tools/sdk/java) for more information on how to use the SDK.

## Structure of this repository

This repository consists out of four main components:

1. The source code of the SDK itself: `/src/main/java/` and `/src/main/generated/` 
2. The source code of the SDK unit tests: `/src/test/java/`
3. The source code of the integration tests: `/src/it/java/`

## Installation

Assuming you have [Maven](http://maven.apache.org/) installed, simply include the SDK as a Maven dependency:

    <dependency>
      <groupId>com.worldline-solutions.acquiring</groupId>
      <artifactId>acquiring-sdk-java</artifactId>
      <version>x.y.z</version>
    </dependency>

Alternatively, download the latest version of the SDK from GitHub. Choose the `acquiring-sdk-java-x.y.z-bin.zip` file from the [releases](https://github.com/Worldline-Acquiring/acquiring-sdk-java/releases) page, where `x.y.z` is the version number. Add all JAR files inside the `lib` folder of this file to your project, except for `acquiring-sdk-java-x.y.z-javadoc.jar` and `acquiring-sdk-java-x.y.z-sources.jar`.

## Building the repository

This repository uses [Maven](http://maven.apache.org/) to build. To build the SDK, execute the following command from its root directory (which contains the `pom.xml` file):

    mvn -clean package

The build will generate the following files in the `target` directory, where `x.y.z` is the version number:
* `acquiring-sdk-java-x.y.z.jar`, containing the compiled class files
* `acquiring-sdk-java-x.y.z-javadoc.jar`, containing the generated Javadoc
* `acquiring-sdk-java-x.y.z-sources.jar`, containing the source code
* `acquiring-sdk-java-x.y.z-src.zip`, containing the contents of this folder
* `acquiring-sdk-java-x.y.z-bin.zip`, containing the necessary JAR files for standalone deployments

To use it add all JAR files inside the `lib` folder of the `acquiring-sdk-java-x.y.z-bin.zip` file to your project, except for `acquiring-sdk-java-x.y.z-javadoc.jar` and `acquiring-sdk-java-x.y.z-sources.jar`.
