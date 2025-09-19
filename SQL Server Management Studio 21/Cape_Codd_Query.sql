/***************************/   
/* Name:Jonathan Stone */         
/* Course Name Intro to Database Systems  */   
/* Assignment #:  2  */   
/***************************/  

/* 2.1 */   
SELECT SKU, SKU_DESCRIPTION FROM INVENTORY;

/* 2.2 */
SELECT SKU_DESCRIPTION, SKU FROM INVENTORY;

/* 2.3 */
SELECT WarehouseID FROM INVENTORY;

/* 2.4 */
SELECT DISTINCT WarehouseID FROM INVENTORY;

/* 2.5 */
SELECT WarehouseID, SKU, SKU_Description, QuantityOnHand, QuantityOnOrder FROM INVENTORY;

/* 2.6 */
SELECT * FROM INVENTORY;

/* 2.7 */
SELECT SKU_Description, QuantityOnHand FROM INVENTORY WHERE QuantityOnHand > 0;

/* 2.8 */
SELECT SKU, SKU_Description, QuantityOnHand FROM INVENTORY WHERE QuantityOnHand = 0;

/* 2.9 */
SELECT SKU, SKU_Description, WarehouseID FROM INVENTORY WHERE QuantityOnHand = 0 ORDER BY WarehouseID ASC; 

/* 2.10 */
SELECT SKU, SKU_Description, WarehouseID FROM INVENTORY WHERE QuantityOnHand > 0 ORDER BY WarehouseID ASC, SKU ASC;
