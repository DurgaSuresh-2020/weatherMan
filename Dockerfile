# Run instructions:
# Start docker desktop
    # and wait for it to be up.
# Open terminal
# To build a image named weatherman from this file :
    # docker build -t weatherman .
# To run container:
    # docker run weatherMan

# Below step give us all the setup environment dependencies (a linux machine, which has maven and JDK installed)
FROM maven:3.8.5-openjdk-18 AS build

# Set working directory
WORKDIR /usr/weatherMan

# Explictly copy the file we need and want.
COPY pom.xml .
COPY ./src src
COPY Dockerfile .

#To run TEST on the container
CMD mvn clean test


