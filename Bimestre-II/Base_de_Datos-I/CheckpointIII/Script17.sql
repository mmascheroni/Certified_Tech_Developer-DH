-- 17.	Mostrar los 5 videos de menor duración, listando el título del vídeo 
-- y el nombre de usuario y país al que corresponde.

select video.titulo, usuario.nombre, pais.nombre 
from usuario
inner join video on video.Usuario_idUsuario = usuario.idUsuario
inner join pais on pais.idPais = usuario.Pais_idPais
order by video.duracion
limit 5