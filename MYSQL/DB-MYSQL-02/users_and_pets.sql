#Seleccionar todo de una tabla
SELECT * FROM `users`;

#Seleccionar solo una columna
SELECT `first_name` FROM `users`;

#Insertar datos a table pets 

INSERT INTO `pets` 
(first_name, fav_food,`type`, users_idusers)
VALUES
('Toby','Croquetas','Doggo',1),
('Nicky','Caldito con tortillas','Doggo',2),
('Pepperoni','Huesitos de manzana','Doggo',3),
('Peppe','Semillas de girasol','Cotorro',3);

#Seleccionar todo de una tabla
SELECT * FROM `pets`;

#Filtrar por FK para identificar a owners
SELECT * FROM `pets`
WHERE users_idusers=3;

INSERT INTO `users` 
(first_name, last_name, fav_food)
VALUES ('Daniela','Ruiz','Pozole'),
('Luisa','Castillo','Enchiladas Suizas'),
('Jorge','Recillas','Torta ahogada'),
('Jonathan','Dominguez','Carne en su Jugo'),
('Axel','Reinaga','Mole');

INSERT INTO `pets` 
(first_name, fav_food,`type`, users_idusers)
VALUES
('Nina','Pllito','Gato',4),
('Boster','Jamon','Doggo',5),
('Lucyfugo','Atun','Gato',6),
('Sasha','Tacos','Doggo',7),
('Betty','Pollo','Gato',8);

SELECT * FROM `pets`;
