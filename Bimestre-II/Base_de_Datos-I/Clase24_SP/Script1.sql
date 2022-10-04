-- 1) Cálculo de edad 
-- a) Crear un SP que muestre apellidos, nombres y edad de cada empleado, debe calcular 
-- la edad de los empleados a partir de la fecha de nacimiento y que tengan entre n y n años de edad. 
-- b) Ejecutar el SP indicando un rango de edad entre 50 y 60 años de edad.

DELIMITER $$
CREATE PROCEDURE SP_calculo_edad()
BEGIN
	SELECT Apellido, Nombre, TIMESTAMPDIFF(YEAR,FechaNacimiento,CURDATE()) AS Edad 
    FROM empleados
    HAVING Edad BETWEEN 50 AND 60;
END $$
DROP PROCEDURE SP_calculo_edad;
CALL SP_calculo_edad();