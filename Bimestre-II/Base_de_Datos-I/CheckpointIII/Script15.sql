-- 15.	Generar un informe estilo ranking de avatars utilizados por país.

select avatar.nombre, pais.nombre , count(*) as cantidad
from usuario
inner join avatar on avatar.idAvatar = usuario.Avatar_idAvatar
inner join pais on pais.idPais = usuario.Pais_idPais
group by avatar.nombre, pais.nombre
order by cantidad DESC

