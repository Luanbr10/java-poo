# 💼 Desafio: Sistema de RH (Herança)

**Módulo 01:** Herança (`extends`, `super`, `protected`)

---

## 🎯 Objetivo
Modelar um sistema onde diferentes tipos de colaboradores compartilham características, mas possuem dados específicos.

---

## 📝 Requisitos

### 1. Classe Base: `Funcionario`
Representa qualquer empregado da empresa.

**Atributos (Protected):**
* `nome` (String)
* `cpf` (String)
* `salario` (double)

**Construtor:**
* Deve receber e inicializar todos os 3 atributos.

**Métodos:**
* Getters para todos os atributos.
* `exibirDados()`: Imprime nome, CPF e salário.

---

### 2. Subclasse: `Gerente`
Um Gerente **é um** Funcionário, mas tem responsabilidades extras.

**Herança:**
* Estende `Funcionario`.

**Atributos Exclusivos:**
* `departamento` (String) - Ex: "TI", "Vendas".
* `senha` (int) - Para acessar sistemas restritos.

**Construtor:**
* Deve receber: `nome`, `cpf`, `salario`, `departamento` e `senha`.
* **Regra:** Use `super(...)` para passar os dados comuns para da classe pai.

**Método Exclusivo:**
* `autenticar(int senhaTentativa)`:
    * Se a senha bater com a senha do gerente, imprime "Acesso Permitido ao sistema de Gerência".
    * Se não, imprime "Acesso Negado".

---

### 3. Classe `Main`

1.  Crie um objeto do tipo `Funcionario` (ex: um estagiário).
2.  Crie um objeto do tipo `Gerente`.
3.  Mostre os dados de ambos (use o `exibirDados()` herdado).
4.  Teste o método exclusivo do gerente (`autenticar`), provando que o funcionário comum **não** tem acesso a isso.