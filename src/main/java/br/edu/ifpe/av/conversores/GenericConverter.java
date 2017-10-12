package br.edu.ifpe.av.conversores;

import java.io.Serializable;
import java.util.Map;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.edu.ifpe.av.conversores.entidade.SampleEntity;

@FacesConverter("generic")

public class GenericConverter implements Converter, Serializable {

    public Object getAsObject(FacesContext ctx, UIComponent component, String value) {
        if (value != null) {
            return this.getAttributesFrom(component).get(value);
        }
        return null;
    }

   
    public String getAsString(FacesContext ctx, UIComponent component, Object value) {

        if (value != null
                && !"".equals(value)) {

            SampleEntity entity = (SampleEntity) value;

            // adiciona item como atributo do componente
            this.addAttribute(component, entity);

            Integer id = entity.getId();
            if (id != null) {
                return String.valueOf(id);
            }
        }

        return (String) value;
    }

    protected void addAttribute(UIComponent component, SampleEntity o) {
        String key = o.getId().toString(); // codigo da empresa como chave neste caso
        this.getAttributesFrom(component).put(key, o);
    }

    protected Map<String, Object> getAttributesFrom(UIComponent component) {
        return component.getAttributes();
    } 

}
