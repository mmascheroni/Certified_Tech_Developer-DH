-- Obtener aquellos artistas que han actuado en alguna película, incluso
-- aquellos que aún no lo han hecho, según nuestra base de datos.

select a.id, a.nombre, a.apellido, p.titulo 
from artista a
left join artista_x_pelicula atx on atx.artista_id = a.id
left join pelicula p on p.id = atx.pelicula_id
where p.id is null