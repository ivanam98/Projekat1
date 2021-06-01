INSERT INTO USERA (ID, DATE_OF_BIRTH, EMAIL_ADDRESS, FIRST_NAME, LAST_NAME, PASSWORD, PHONE_NUMBER, ROLE, USERNAME) VALUES
	('1', '02-04-2021', 'ab@gmail.com', 'a', 'b', 'a', '065', 'admin', 'a');
	
INSERT INTO FITNESS_CENTAR (ID, ADDRESS , E_MAIL_OF_CENTAR , NAME , NUMBER_OF_CENTAR ) VALUES
	('1', 'Blue street 6372', 'active@gmail.com', 'Active', '86947394' ), 
	('2', 'Red street 672', 'strong@gmail.com', 'Strong fit', '79977394' ), 
	('3', 'Big street 7', 'fit@gmail.com', 'Fit fit', '89690' );
	
INSERT INTO COACH (ID, FITNESS_CENTAR_ID) values
	('1', '1');

INSERT INTO WORKOUT (NAME , DESCRIPTION , TYPE_OF_WORKOUT , WORKOUT_DURATION , COACH_ID ) VALUES
	('Chest workout', 'One hour of chest workout', 'group workout', '60', '1'),
	('Leg day', 'short workout but strong', 'personal workout', '35', '1');

INSERT INTO HALL (ID , CAPACITY , FITNESS_CENTAR_ID ) VALUES
	('5', '20', '2'), 
	('2', '10', '3');