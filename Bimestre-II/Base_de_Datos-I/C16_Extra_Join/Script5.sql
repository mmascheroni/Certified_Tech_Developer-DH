-- Obtener aquellos artistas que no han actuado en alguna película, según
-- nuestra base de datos.

select a.id, a.nombre, a.apellido, count(p.id)
from artista a
left join artista_x_pelicula axt on axt.artista_id = a.id
left join pelicula p on p.id = axt.pelicula_id
where p.id is null
group by a.id, a.nombre