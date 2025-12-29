## Overview
A distributed calendar system built with Spring Boot and Spring Cloud,
supporting user scheduling, event management, and notification delivery.

## Architecture
- API Gateway
- User Service
- Calendar Service
- Event Service
- Notification Service

## Tech Stack
- Java
- Spring Boot
- Spring Cloud
- JWT Authentication
- Kafka / RabbitMQ
- Docker

## Key Design Decisions
- Designed microservice-based architecture with clear service boundaries
- Used RESTful APIs for synchronous workflows and message queues for asynchronous notifications
- Implemented stateless authentication using JWT for scalability

## Reliability & Scalability
- Applied retry and timeout strategies for inter-service communication
- Considered service isolation and fault tolerance
- Prepared the system for horizontal scaling using containerization
