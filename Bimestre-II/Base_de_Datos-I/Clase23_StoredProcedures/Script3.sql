DELIMITER $$
CREATE PROCEDURE  SP_clientes_por_pais(IN cPais VARCHAR(50))
BEGIN
	SELECT Pais, count(ClienteID) as CantidadClientes from clientes
    where Pais = cPais
    Group by Pais;

END $$

CALL SP_clientes_por_pais('Portugal');