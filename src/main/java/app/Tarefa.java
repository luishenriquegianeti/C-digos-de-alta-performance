package app;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Tarefa extends Atividade {
    private boolean isConcluido;

    public Tarefa(String descricao, boolean isConcluido){
        this.setDescricao(descricao);
        this.setConcluido(isConcluido);
    }

    @Override
    public String getDetalhes(){
        return this.getDescricao() + "(" + this.isConcluido() + ")";
    }
}
