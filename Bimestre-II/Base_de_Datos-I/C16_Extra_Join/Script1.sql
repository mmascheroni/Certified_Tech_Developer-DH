-- Obtener los artistas que han actuado en una o más películas.

select a.id, a.nombre, a.apellido 
from artista a
inner join artista_x_pelicula axp on axp.artista_id = a.id
inner join pelicula p on p.id = axp.pelicula_id
group by a.id, a.nombre, a.apellido;

