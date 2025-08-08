# API Gateway - Central Request Router

The API Gateway serves as the single entry point for all client requests in the School Management System. It handles routing, authentication, rate limiting, and provides a unified API interface.

## 🎯 Key Features

- **Service Routing**: Routes requests to appropriate microservices
- **Authentication**: JWT token validation and user context
- **Rate Limiting**: Prevents API abuse with configurable limits
- **CORS Handling**: Cross-origin resource sharing support
- **Circuit Breaker**: Resilience patterns for service failures
- **Request Logging**: Comprehensive request/response logging

## 🚀 Quick Start

### Local Development
```bash
# Ensure Eureka Server is running first
cd infrastructure/api-gateway
mvn spring-boot:run