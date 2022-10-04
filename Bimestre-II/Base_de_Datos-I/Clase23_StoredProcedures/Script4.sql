DELIMITER $$
CREATE PROCEDURE  SP_productos_sin_stock(IN pCantidad INT)
BEGIN
	SELECT p.ProductoNombre, p.UnidadesStock, c.CategoriaNombre from productos as p
    INNER JOIN categorias as c ON c.CategoriaID = p.CategoriaID
    where p.UnidadesStock <= pCantidad
    order by p.UnidadesStock;
END $$
CALL SP_productos_sin_stock(10);
