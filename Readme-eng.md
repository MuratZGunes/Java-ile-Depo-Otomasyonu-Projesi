# Java-Based Warehouse Automation Project

## Project Description
This project is a **JavaFX-based automation system** developed for **warehouse and dealer management**. It allows warehouse managers to perform product and dealer operations quickly, securely, and easily. Users can access product prices and sales information effortlessly.

---

## Purpose of the Program
- **Data Management**:  
  - Practical recording and updating of product and dealer data.
- **Alert System**:  
  - Warns users when required fields are left empty.
- **Security**:  
  - Admin and personnel authorization using username and password.
- **Data Storage**:  
  - All data is securely stored in `.txt` files.

---

## User Roles
1. **Admin Access**:  
   - Full access to product and dealer tables.  
   - Authority to add, update, and delete data.

2. **Personnel Access**:  
   - Authority to add and edit products in the product table.  
   - View-only access to the dealer table.

---

## Features
- **Login System**:  
   - Separate passwords for admin and personnel.  
   - Informational messages for incorrect logins.

- **Product Operations**:  
   - Add, delete, and update products.  
   - Automatically transfer product data to the table and manually save.

- **Dealer Operations**:  
   - Add, delete, and update dealers (admin only).  
   - Edit dealer contact information.

- **Data Storage**:  
   - Product and dealer data are stored in `.txt` files.

---

## Classes and Their Contents
1. **PrimaryController**:  
   - Handles login operations (Admin and personnel logins).
2. **AdmingirisController**:  
   - Admin panel: Access to product and dealer operations.
3. **UrunIslemleriController**:  
   - Adding, deleting, updating, and saving products, and navigating to dealer operations.
4. **BayiUrunIslemleriController**:  
   - Adding, deleting, updating, and saving dealers, and navigating to product operations.
5. **PersonelgirisController**:  
   - Personnel panel: Product operations and viewing dealers.
6. **PersonelUrunListesiDuzenleController**:  
   - Authority to add, update, and view products.
7. **PersonelBayiListesiGoruntuleController**:  
   - View-only access to the dealer table.
8. **tablo.java**:  
   - Class that holds product information.
9. **bayi.java**:  
   - Class that holds dealer information.
10. **tablokontrol.java**:  
    - Interface defining operations for product and dealer tables.

---

## Project Structure
```
src/  
│  
├── controller/  
│   ├── PrimaryController.java  
│   ├── AdmingirisController.java  
│   ├── UrunIslemleriController.java  
│   ├── BayiUrunIslemleriController.java  
│   ├── PersonelgirisController.java  
│   ├── PersonelUrunListesiDuzenleController.java  
│   └── PersonelBayiListesiGoruntuleController.java  
│  
├── model/  
│   ├── bayi.java  
│   └── tablo.java  
│  
├── interface/  
│   └── tablokontrol.java  
│  
├── resources/  
│   └── FXML files  
│  
└── App.java  
```

---

## Installation Steps
1. **Clone the Repository**:  
   ```bash
   git clone https://github.com/MuratZGunes/Java-ile-Depo-Otomasyonu-Projesi.git
   ```
2. **Install JavaFX SDK**:  
   - Download and add the JavaFX SDK to your IDE settings.
3. **Open the Project in an IDE**:  
   - IntelliJ IDEA, Eclipse, or NetBeans can be used.
4. **Run the Project**:  
   - Start the application by running the `App.java` file.

---

## UML Diagram
The UML diagram showing the overall structure of the project:  
![uml](https://github.com/user-attachments/assets/488a6087-54f6-46c9-b0e3-3b4872b0dc7a)

---

## Requirements
- **Java JDK 11 or higher**  
- **JavaFX SDK**

---

## Contributing
To contribute to the project:  
1. Fork the repository  
2. Make your changes  
3. Submit a Pull Request  

---

## License  
This project is licensed under the MIT License. For more details, see the [LICENSE](LICENSE) file.

---

## Contact
**Project Owner**: Murat S. Güneş  
- **GitHub**: [MuratZGunes](https://github.com/MuratZGunes)  
- **Email**: muratsegunes@gmail.com
