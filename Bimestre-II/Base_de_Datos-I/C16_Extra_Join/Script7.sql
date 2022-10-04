-- Obtener aquellas películas que tengan asignado uno o más artistas, incluso
-- aquellas que aún no le han asignado un artista en nuestra base de datos.

select p.id, p.titulo, count(a.id) as cantidadArtistas
from pelicula p
left join artista_x_pelicula axt on axt.pelicula_id = p.id
left join artista a on a.id = axt.artista_id
group by p.id, p.titulo
order by cantidadArtistas