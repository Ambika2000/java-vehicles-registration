DROP TABLE IF EXISTS vehicle;

CREATE TABLE vehicle (
  Number VARCHAR(10) NOT NULL,
  State_Code VARCHAR(2), 
  RTO_Code int, 
  RTO_Count int, 
  Vehicle_Type VARCHAR(255),
  primary key (Number)
);