-- 13.	Listar la cantidad total de reacciones por cada tipo de reacción, en el período 
-- del 01-01-2021 al 01-04-2021

select count(idReaccion) as reacciones, tiporeaccion.nombre
from reaccion
inner join tiporeaccion on tiporeaccion.idTipoReaccion = reaccion.TipoReaccion_idTipoReaccion
where tiporeaccion.fecha between '2021-01-01' AND '2021-04-01'
group by tiporeaccion.nombre
