# E-Commerce Spring Boot Application

A comprehensive E-commerce application built with Spring Boot, featuring user management, product catalog, order processing, and a modern web interface.

## 🚀 Features

### Core Features
- **User Management**: Registration, authentication, and profile management
- **Product Catalog**: Product listing, search, filtering, and categorization
- **Shopping Cart**: Add/remove items, quantity management
- **Order Processing**: Order creation, tracking, and management
- **Review System**: Product reviews and ratings
- **Admin Panel**: Product and user management for administrators

### Technical Features
- **Spring Boot 3.2.0**: Latest Spring Boot version with Java 17
- **Spring Security**: Authentication and authorization
- **Spring Data JPA**: Database operations with Hibernate
- **MySQL Database**: Primary database with H2 for testing
- **RESTful APIs**: Complete REST API for frontend integration
- **Thymeleaf**: Server-side templating for web pages
- **Bootstrap 5**: Modern, responsive UI design
- **JWT Authentication**: Stateless authentication
- **Email Integration**: Order confirmations and notifications
- **File Upload**: Product image management
- **Actuator**: Application monitoring and health checks

## 🛠️ Prerequisites

- Java 17 or higher
- Maven 3.6+
- MySQL 8.0+ (or use H2 for development)
- IDE (IntelliJ IDEA, Eclipse, or VS Code)

## 📦 Installation & Setup

### 1. Clone the Repository
```bash
git clone <repository-url>
cd ecommerce-spring-boot
```

### 2. Database Setup
#### Option A: MySQL (Recommended for Production)
1. Create a MySQL database:
```sql
CREATE DATABASE ecommerce_db;
```

2. Update `application.properties` with your database credentials:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_db
spring.datasource.username=your_username
spring.datasource.password=your_password
```

#### Option B: H2 (Development/Testing)
The application is configured to use H2 in-memory database by default for development.

### 3. Build and Run
```bash
# Clean and build the project
mvn clean install

# Run the application
mvn spring-boot:run
```

### 4. Access the Application
- **Main Application**: http://localhost:8080/ecommerce
- **H2 Console**: http://localhost:8080/ecommerce/h2-console
- **Actuator**: http://localhost:8080/ecommerce/actuator

## 📚 API Documentation

### User Management
```
GET    /api/users                    - Get all users
GET    /api/users/{id}               - Get user by ID
POST   /api/users                    - Create new user
PUT    /api/users/{id}               - Update user
DELETE /api/users/{id}               - Delete user
```

### Product Management
```
GET    /api/products                 - Get all products (paginated)
GET    /api/products/{id}            - Get product by ID
POST   /api/products                 - Create new product
PUT    /api/products/{id}            - Update product
DELETE /api/products/{id}            - Delete product
GET    /api/products/featured        - Get featured products
GET    /api/products/search          - Search products
GET    /api/products/category/{id}   - Get products by category
```

### Order Management
```
GET    /api/orders                   - Get all orders
GET    /api/orders/{id}              - Get order by ID
POST   /api/orders                   - Create new order
PUT    /api/orders/{id}              - Update order status
```

## 🗄️ Database Schema

### Core Entities
- **User**: Customer and admin user accounts
- **Product**: Product catalog with categories
- **Category**: Product categorization
- **Order**: Customer orders
- **OrderItem**: Individual items in orders
- **Review**: Product reviews and ratings

### Key Relationships
- User → Orders (One-to-Many)
- Product → OrderItems (One-to-Many)
- Category → Products (One-to-Many)
- Product → Reviews (One-to-Many)

## 🔧 Configuration

### Application Properties
Key configuration options in `application.properties`:

```properties
# Server Configuration
server.port=8080
server.servlet.context-path=/ecommerce

# Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_db
spring.datasource.username=root
spring.datasource.password=root

# JPA Configuration
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

# Security Configuration
jwt.secret=your-secret-key-here
jwt.expiration=86400000

# Mail Configuration
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=your-email@gmail.com
spring.mail.password=your-app-password
```

## 🚀 Deployment

### Local Development
```bash
mvn spring-boot:run
```

### Production Deployment
1. Build the JAR file:
```bash
mvn clean package
```

2. Run the JAR file:
```bash
java -jar target/ecommerce-spring-boot-0.0.1-SNAPSHOT.jar
```

### Docker Deployment
```bash
# Build Docker image
docker build -t ecommerce-app .

# Run Docker container
docker run -p 8080:8080 ecommerce-app
```

## 🧪 Testing

### Unit Tests
```bash
mvn test
```

### Integration Tests
```bash
mvn verify
```

### API Testing
Use tools like Postman or curl to test the REST APIs:

```bash
# Get all products
curl http://localhost:8080/ecommerce/api/products

# Create a new user
curl -X POST http://localhost:8080/ecommerce/api/users \
  -H "Content-Type: application/json" \
  -d '{"username":"testuser","email":"test@example.com","password":"password123","firstName":"John","lastName":"Doe"}'
```

## 📁 Project Structure

```
src/
├── main/
│   ├── java/com/ecommerce/
│   │   ├── config/          # Configuration classes
│   │   ├── controller/      # REST controllers
│   │   ├── entity/          # JPA entities
│   │   ├── repository/      # Data access layer
│   │   ├── service/         # Business logic
│   │   └── EcommerceApplication.java
│   └── resources/
│       ├── templates/       # Thymeleaf templates
│       ├── static/          # Static resources
│       └── application.properties
└── test/                    # Test classes
```

## 🔒 Security

- **Spring Security**: Authentication and authorization
- **JWT Tokens**: Stateless authentication
- **Password Encryption**: BCrypt password hashing
- **CORS Configuration**: Cross-origin resource sharing
- **Input Validation**: Bean validation annotations

## 📈 Monitoring

- **Spring Boot Actuator**: Health checks and metrics
- **Logging**: Comprehensive logging configuration
- **Database Monitoring**: JPA query logging

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Add tests for new functionality
5. Submit a pull request

## 📄 License

This project is licensed under the MIT License - see the LICENSE file for details.

## 🆘 Support

For support and questions:
- Create an issue in the repository
- Contact: support@ecommerce.com

## 🔄 Version History

- **v1.0.0**: Initial release with core e-commerce functionality
- **v1.1.0**: Added review system and enhanced security
- **v1.2.0**: Improved UI and added admin panel

---

**Happy Shopping! 🛒**
