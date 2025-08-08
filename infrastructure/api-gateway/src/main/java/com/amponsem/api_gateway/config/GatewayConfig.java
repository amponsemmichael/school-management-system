package com.amponsem.api_gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                // User Service Routes
                .route("user-service", r -> r.path("/api/v1/users/**")
                        .uri("lb://user-service"))
                
                // Student Service Routes
                .route("student-service", r -> r.path("/api/v1/students/**")
                        .uri("lb://student-service"))
                
                // Staff Service Routes
                .route("staff-service", r -> r.path("/api/v1/staff/**")
                        .uri("lb://staff-service"))
                
                // Class Service Routes
                .route("class-service", r -> r.path("/api/v1/classes/**", "/api/v1/subjects/**")
                        .uri("lb://class-service"))
                
                // Attendance Service Routes
                .route("attendance-service", r -> r.path("/api/v1/attendance/**")
                        .uri("lb://attendance-service"))
                
                // Grades Service Routes
                .route("grades-service", r -> r.path("/api/v1/grades/**", "/api/v1/reports/**")
                        .uri("lb://grades-service"))
                
                // Fees Service Routes
                .route("fees-service", r -> r.path("/api/v1/fees/**", "/api/v1/payments/**")
                        .uri("lb://fees-service"))
                
                // Notification Service Routes
                .route("notification-service", r -> r.path("/api/v1/notifications/**")
                        .uri("lb://notification-service"))
                
                // Authentication Routes (Public)
                .route("auth-routes", r -> r.path("/api/v1/auth/**")
                        .uri("lb://user-service"))
                
                // Eureka Server UI (Development only)
                .route("eureka-server", r -> r.path("/eureka/**")
                        .uri("http://localhost:8761"))
                
                .build();
    }
}

