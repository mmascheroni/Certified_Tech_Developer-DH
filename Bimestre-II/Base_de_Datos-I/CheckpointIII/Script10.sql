select video.titulo, video.cantidadReproducciones, count(idReaccion) as reacciones
from video
left join reaccion on reaccion.Video_idVideo = video.idVideo
group by video.titulo

