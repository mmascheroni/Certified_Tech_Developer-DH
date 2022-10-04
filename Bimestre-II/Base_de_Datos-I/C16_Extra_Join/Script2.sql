-- Obtener las películas donde han participado más de un artista según nuestra
-- base de datos.

select p.id, p.titulo, count(atx.artista_id) as cantidadArtistas 
from pelicula p
inner join artista_x_pelicula atx on atx.pelicula_id = p.id
inner join artista a on a.id = atx.artista_id
group by p.id, p.titulo
order by cantidadArtistas