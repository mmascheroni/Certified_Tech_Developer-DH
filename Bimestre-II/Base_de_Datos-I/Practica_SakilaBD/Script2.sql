-- Generar un reporte que indique: el id del cliente, la cantidad de alquileres y
-- el monto total para todos los clientes que hayan gastado más de 150 dólares
-- en alquileres.

select customer_id, count(rental_id) as cantidadAlquileres, sum(amount) as montoTotal
from payment
group by customer_id
having montoTotal > 150
order by montoTotal;