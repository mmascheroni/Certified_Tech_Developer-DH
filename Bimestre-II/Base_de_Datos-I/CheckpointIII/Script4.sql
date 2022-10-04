-- 4.	Listar las 10 etiquetas menos usadas.

select e.idEtiqueta, e.nombre, count(e.idEtiqueta) as cantidad from etiqueta e
inner join video_etiqueta ve on ve.Etiqueta_idEtiqueta = e.idEtiqueta
inner join video v on v.idVideo = ve.Video_idVideo
group by e.idEtiqueta, e.nombre
order by cantidad
limit 10;

SELECT Etiqueta_idEtiqueta,e.nombre ,COUNT(*)  as cantidad 
FROM video_etiqueta ve 
INNER JOIN etiqueta e 
	ON ve.Etiqueta_idEtiqueta = e.idEtiqueta
GROUP BY Etiqueta_idEtiqueta,e.nombre
ORDER BY cantidad ASC LIMIT 10;