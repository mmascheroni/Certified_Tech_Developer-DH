-- 8.	Listar la cantidad de videos según sean públicos o privados.

select  (
	case
		when privado = 0 then 'publico'
        when privado = 1 then 'privado'
	end 
) as Privado, count(*) as cantidad
from video
group by privado