DELIMITER $$
CREATE PROCEDURE  SP_empleados_por_ciudad(IN eCiudad VARCHAR(50))
BEGIN
	SELECT * from empleados
    where Ciudad = eCiudad;

END $$

CALL SP_empleados_por_ciudad('London');

