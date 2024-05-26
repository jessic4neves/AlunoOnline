package br.com.alunoonline.api.repository;

import br.com.alunoonline.api.model.FinanceiroAluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinanceiroAlunoRepository extends JpaRepository <FinanceiroAluno, Long> {

}
