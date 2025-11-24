# 🔐 Desafio: Sistema de Autenticação (Login)

**Módulo 01:** Fundamentos - Modificadores de Acesso
**Conceito Chave:** Encapsulamento (`private` vs `public`)

---

## 🎯 Objetivo
Criar uma classe `Usuario` que proteja as credenciais de acesso, permitindo autenticação e troca de senha segura, sem expor os dados sensíveis diretamente.

---

## 📝 Requisitos Técnicos

### 1. Classe `Usuario`
**Pacote:** `codigos.modulo01_basico.aula02_desafio_acesso`

**Atributos (ENCAPSULADOS/PRIVATE):**
* `login` (String) - O nome de usuário.
* `senha` (String) - A senha secreta.

**Construtor:**
* Deve receber `login` e `senha` iniciais.
* Exibir mensagem: "Usuário [login] criado com sucesso."

**Métodos Públicos (A Interface):**
1.  **`logar(String loginTentativa, String senhaTentativa)`:**
    * Verifica se o login E a senha informados batem com os atributos armazenados.
    * Se baterem: Imprime "Acesso Concedido!".
    * Se errarem: Imprime "Acesso Negado: Credenciais Inválidas".

2.  **`trocarSenha(String senhaAtual, String novaSenha)`:**
    * Regra de Segurança: Só permite trocar a senha SE a `senhaAtual` informada for igual à senha guardada no objeto.
    * Se acertar a atual: Atualiza o atributo `senha` com a `novaSenha` e avisa o sucesso.
    * Se errar a atual: Avisa "Permissão Negada: Senha atual incorreta".

---

### 2. Classe `Main` (Teste de Invasão)
**Pacote:** `codigos.modulo01_basico.aula02_desafio_acesso`

1.  Crie um usuário (ex: login "admin", senha "1234").
2.  **Teste de Invasão:** Tente acessar `usuario.senha` diretamente (comente essa linha para o código rodar, mas prove que é impossível).
3.  **Teste de Login:**
    * Tente logar com senha errada.
    * Tente logar com a senha certa.
4.  **Teste de Troca de Senha:**
    * Tente trocar a senha informando a senha atual errada.
    * Troque a senha corretamente (de "1234" para "admin123").
5.  **Re-teste:** Tente logar com a senha antiga (deve falhar) e com a nova (deve funcionar).

---