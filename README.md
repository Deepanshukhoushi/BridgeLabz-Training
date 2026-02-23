# BridgeLabz Training 
## 🗓 Week 8 : DBMS, SQL & JDBC Fundamentals
### 🗓 Day 01 – DBMS Fundamentals, Indexing & SQL Best Practices 
**(Date: 06-Feb-2026)**
- Studied SQL RDBMS industry standards and database design principles.
- Revised normalization forms:
  - 1NF, 2NF, 3NF, BCNF, 4NF
- Learned types of keys:
  - Primary, Foreign, Candidate, Composite, Unique
- Practiced all major SQL command groups:
  - DDL, DML, DQL, DCL, TCL
- Implemented joins:
  - INNER, LEFT, RIGHT, FULL, CROSS, SELF
- Worked with complex queries:
  - Subqueries and correlated subqueries
  - EXISTS and derived tables
- Learned advanced SQL concepts:
  - Window functions
  - CTE and recursive CTE
  - Transactions and isolation levels
- Studied indexing in detail:
  - Primary, Unique, Composite, Full-Text indexes
  - Clustered and non-clustered indexes
- Analyzed query performance using:
  - `EXPLAIN` and execution plans
- Applied indexing best practices and optimization rules.
- Solved SQL practice exercises and tuning scenarios.
- Committed and pushed all work.
- 🔗 **Code Link:**  
👉 [DBMS & SQL Practice](https://github.com/Deepanshukhoushi/BridgeLabz-Training/tree/dbms-jdbc-practice/dbms-jdbc-practice/gcr-codebase/MySQLPractice/com)

---

### 🗓 Day 02 – JDBC Fundamentals, Database Connectivity & Best Practices  
**(Date: 07-Feb-2026)**  

-  Studied JDBC Architecture & Workflow
- JDBC API  
- JDBC Drivers:
  - Type 1 (JDBC-ODBC Bridge)
  - Type 2 (Native-API Driver)
  - Type 3 (Network Protocol Driver)
  - Type 4 (Thin Driver)
- DriverManager  
- DataSource  

- Core JDBC Components
- `Connection`
- `Statement`
- `PreparedStatement`
- `CallableStatement`
- `ResultSet`

- Database Connectivity Implementation
- Used MySQL JDBC Driver  
- Configured:
  - Connection URL  
  - Username & Password  
- Used `try-with-resources` for safe resource handling  

- Practiced CRUD Operations
- `INSERT`
- `SELECT`
- `UPDATE`
- `DELETE`

- PreparedStatement Usage
- Prevented SQL Injection  
- Implemented parameterized queries  
- Improved execution performance  

- ResultSet Handling
- Iterated records using `while(rs.next())`
- Retrieved different data types (`getInt`, `getString`, `getDouble`)
- Used `ResultSetMetaData` for column information  

- Transaction Management
- Disabled auto-commit:
  connection.setAutoCommit(false);

- 🔗 **Code Link:**  
👉 [JDBC Practice](https://github.com/Deepanshukhoushi/BridgeLabz-Training/tree/dbms-jdbc-practice/dbms-jdbc-practice/gcr-codebase/JDBCPractice/src/main/java/com/jdbc)

---