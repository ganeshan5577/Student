# Student

**Create an application with Restful APIs using
Springboot for CRUD operation to a TABLE of STUDENT(s)
in a School in a MySqlDB**

**END POINT URI AND PARAMETER:-**

**create data with student.**
http://localhost:8080/api/v1/student/saveStudent

{
  
  "name": "XYZ",
  "dateOfBirth": "2024-05-18",  
  "joiningDate": "2024-05-18",
  "stdClass": "JAVA"
 
}

---------------------------------------------------
**fetching data with student**
http://localhost:8080/api/v1/student/byId/1,
http://localhost:8080/api/v1/student/byName/XYZ,
http://localhost:8080/api/v1/student/byClass/java,

---------------------------------------------------
**updating data with student**
http://localhost:8080/api/v1/student/updateStudent

{
  "id":1,
  "name": "abc",
  "dateOfBirth": "2020-06-13",  
  "joiningDate": "2024-01-06",
  "stdClass": "IT"
 
}
--------------------------------------------------------
**Databse Schema**
CREATE TABLE `STUDENT`.`student` 
CHANGE COLUMN `id` `id` INT NOT NULL AUTO_INCREMENT ,
CHANGE COLUMN `name` `name` VARCHAR(255) NULL DEFAULT NULL ,
CHANGE COLUMN `joining_date` `joining_date` DATETIME NULL DEFAULT NULL ,
CHANGE COLUMN `class` `class` VARCHAR(255) NULL DEFAULT NULL ;
