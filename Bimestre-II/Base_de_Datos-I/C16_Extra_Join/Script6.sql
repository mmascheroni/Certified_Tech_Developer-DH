-- Obtener aquellos artistas que han actuado en dos o más películas según
-- nuestra base de datos.

select a.id, a.nombre, a.apellido, count(p.id) as cantidadPeliculas
from artista a 
inner join artista_x_pelicula axt on axt.artista_id - a.id
inner join pelicula p on p.id = axt.pelicula_id
group by a.id, a.nombre
having cantidadPeliculas >= 2
order by cantidadPeliculas