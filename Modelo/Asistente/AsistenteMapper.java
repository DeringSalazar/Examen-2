package Modelo.Asistente;

import Modelo.Mapper.Mapper;

public class AsistenteMapper implements Mapper<Asistente,AsistenteDTO>{

    @Override
    public AsistenteDTO toDto(Asistente ent) {
        if(ent==null){
            return null;
        }
        return new AsistenteDTO(
                ent.getCedula(), 
                ent.getNombre(), 
                ent.getTelefono(), 
                ent.getCorreo()
        );
    }

    @Override
    public Asistente toEntity(AsistenteDTO dto) {
        if(dto==null){
            return null;
        }
        return new Asistente(
                dto.getCedula(), 
                dto.getNombre(), 
                dto.getTelefono(),
                dto.getCorreo()
        );
    }
    
}
