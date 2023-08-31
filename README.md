# Spring Kafka Setup Guide

Welcome to the Spring Kafka Setup Guide! This guide will walk you through the process of setting up and using Spring Kafka with ZooKeeper and Kafka. Spring Kafka is a powerful integration framework for Apache Kafka, a distributed event streaming platform. ZooKeeper is used to manage coordination among Kafka brokers.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Setting up ZooKeeper and Kafka](#setting-up-zookeeper-and-kafka)
- [Reading Kafka Events](#reading-kafka-events)
- [Contributing](#contributing)
- [Resources](#resources)
- [License](#license)

## Prerequisites

Before you start, make sure you have the following:

- **Java JDK**: Installed with version X.X or higher.
- **Apache Kafka and ZooKeeper**: Follow the instructions below to set them up.
- **GitHub Project**: Your project should be hosted on GitHub.

## Setting up ZooKeeper and Kafka

1. **Start ZooKeeper:**

   - On Windows:
   
     ```sh
     zookeeper-server-start.bat ..\..\config\zookeeper.properties
     ```

2. **Start Kafka Broker:**

   - On Windows:
   
     ```sh
     kafka-server-start.bat ..\..\config\server.properties
     ```

## Reading Kafka Events

To read events from a Kafka topic, follow these steps:

1. Open a terminal window.

2. Navigate to your Kafka installation directory.

3. Run the following command:
   
   ```sh
   kafka-console-consumer.bat --topic halfacode --from-beginning --bootstrap-server localhost:9092
