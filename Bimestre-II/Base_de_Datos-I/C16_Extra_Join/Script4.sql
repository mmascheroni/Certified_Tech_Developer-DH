-- Obtener las películas que no se le han asignado artistas en nuestra base de
-- datos.

select p.id, p.titulo, count(a.id) as cantidadArtistas
from pelicula p
left join artista_x_pelicula atx on atx.pelicula_id = p.id
left join artista a on a.id = atx.artista_id
where a.id is null
group by p.id, p.titulo