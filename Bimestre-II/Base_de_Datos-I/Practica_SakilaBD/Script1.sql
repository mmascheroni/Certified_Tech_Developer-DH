-- Generar un reporte que responda la pregunta: ¿cuáles son los diez clientes
-- que más dinero gastan y en cuantos alquileres lo hacen?

select c.first_name, sum(p.amount) as GastoTotal,  count(p.rental_id) as TotalAlquileres from customer as c
join payment as p on p.customer_id = c.customer_id
Group By c.first_name
order by amount DESC;
