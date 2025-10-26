-- 1) Main Table Storage : PersonBio
IF OBJECT_ID('dbo.PersonBio','U') IS NULL
CREATE TABLE dbo.PersonBio(
    BusinessEntityID INT,
    FirstName NVARCHAR(50),
    LastName NVARCHAR(50),
    AddressLine1 NVARCHAR(60),
    AddressLine2 NVARCHAR(60) NULL,
    City NVARCHAR(30),
    StateProvinceName NVARCHAR(50) NULL,
    EmailAddress NVARCHAR(50) NULL,
    PhoneNumber NVARCHAR(25) NULL
);

-- 2) SplitByStateName : 5 tables in Package 
IF OBJECT_ID('dbo.StatesWithA','U') IS NULL
CREATE TABLE dbo.StatesWithA(
    BusinessEntityID INT, FirstName NVARCHAR(50), LastName NVARCHAR(50),
    AddressLine1 NVARCHAR(60), AddressLine2 NVARCHAR(60) NULL,
    City NVARCHAR(30), StateProvinceName NVARCHAR(50) NULL,
    EmailAddress NVARCHAR(50) NULL, PhoneNumber NVARCHAR(25) NULL
);
IF OBJECT_ID('dbo.StatesWithB','U') IS NULL
CREATE TABLE dbo.StatesWithB(
    BusinessEntityID INT, FirstName NVARCHAR(50), LastName NVARCHAR(50),
    AddressLine1 NVARCHAR(60), AddressLine2 NVARCHAR(60) NULL,
    City NVARCHAR(30), StateProvinceName NVARCHAR(50) NULL,
    EmailAddress NVARCHAR(50) NULL, PhoneNumber NVARCHAR(25) NULL
);
IF OBJECT_ID('dbo.StatesWithC','U') IS NULL
CREATE TABLE dbo.StatesWithC(
    BusinessEntityID INT, FirstName NVARCHAR(50), LastName NVARCHAR(50),
    AddressLine1 NVARCHAR(60), AddressLine2 NVARCHAR(60) NULL,
    City NVARCHAR(30), StateProvinceName NVARCHAR(50) NULL,
    EmailAddress NVARCHAR(50) NULL, PhoneNumber NVARCHAR(25) NULL
);
IF OBJECT_ID('dbo.StatesWithNull','U') IS NULL
CREATE TABLE dbo.StatesWithNull(
    BusinessEntityID INT, FirstName NVARCHAR(50), LastName NVARCHAR(50),
    AddressLine1 NVARCHAR(60), AddressLine2 NVARCHAR(60) NULL,
    City NVARCHAR(30), StateProvinceName NVARCHAR(50) NULL,
    EmailAddress NVARCHAR(50) NULL, PhoneNumber NVARCHAR(25) NULL
);
IF OBJECT_ID('dbo.StatesWithOthers','U') IS NULL
CREATE TABLE dbo.StatesWithOthers(
    BusinessEntityID INT, FirstName NVARCHAR(50), LastName NVARCHAR(50),
    AddressLine1 NVARCHAR(60), AddressLine2 NVARCHAR(60) NULL,
    City NVARCHAR(30), StateProvinceName NVARCHAR(50) NULL,
    EmailAddress NVARCHAR(50) NULL, PhoneNumber NVARCHAR(25) NULL
);

-- 3) ProductSalesInfo / SalesAggregate (Packages further) 
IF OBJECT_ID('dbo.ProductSalesInfo','U') IS NULL
CREATE TABLE dbo.ProductSalesInfo(
    ProductName NVARCHAR(100),
    CategoryName NVARCHAR(50),
    ListPrice DECIMAL(19,4),
    OrderDate DATE,
    OrderQty INT,
    SalesAmount DECIMAL(19,4),
    SalesQtr NVARCHAR(10)
);

IF OBJECT_ID('dbo.SalesAggregate','U') IS NULL
CREATE TABLE dbo.SalesAggregate(
    ProductName NVARCHAR(100),
    CategoryName NVARCHAR(50),
    TotalQty INT,
    TotalSales DECIMAL(19,4)
);



SELECT TOP 1 * FROM dbo.PersonBio;


SELECT TOP 10 * FROM ETL_Data.dbo.PersonBio;


-- for checking ProductSalesInfo ETL 
SELECT TOP 10 * FROM ETL_Data.dbo.ProductSalesInfo;
SELECT SalesQtr, COUNT(*) AS RowsPerQtr
FROM ETL_Data.dbo.ProductSalesInfo
GROUP BY SalesQtr
ORDER BY SalesQtr;

-- for checking SalesAggregate table
USE ETL_Data;
SELECT TOP 10 * FROM dbo.SalesAggregate;

SELECT TOP 5 * FROM dbo.StatesWithNull;
SELECT TOP 5 * FROM dbo.StatesWithA;
SELECT TOP 5 * FROM dbo.StatesWithB;
SELECT TOP 5 * FROM dbo.StatesWithC;
SELECT TOP 5 * FROM dbo.StatesWithOthers;
