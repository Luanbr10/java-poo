# 📚 Desafio: Sistema de Controle de Estoque de Livraria

**Módulo 01:** Fundamentos de POO  
**Tópico:** Classes, Objetos, Construtores e `this`

---

## 🎯 Objetivo
Criar um sistema simples para gerenciar o estoque e as vendas de livros, aplicando os conceitos fundamentais de Orientação a Objetos: instanciação, manipulação de atributos e métodos com lógica de negócios.

---

## 📝 Requisitos Técnicos

### 1. Classe `Livro`
Deve representar um livro no sistema.

**Atributos:**
* `titulo` (Texto)
* `autor` (Texto)
* `preco` (Decimal/Double)
* `estoque` (Inteiro)

**Construtor:**
* Deve receber obrigatóriamente: `titulo`, `autor` e `preco`.
* O atributo `estoque` deve ser inicializado automaticamente com **0** (zero).
* **Importante:** Utilize a palavra-chave `this` para diferenciar atributos de parâmetros.

**Métodos:**
* `adicionarEstoque(int quantidade)`: Incrementa a quantidade atual do estoque.
* `vender(int quantidade)`:
    * Verifica se há estoque suficiente.
    * Se **sim**: diminui o estoque e imprime "Venda de [titulo] realizada!".
    * Se **não**: imprime "Estoque insuficiente para [titulo]!".
* `exibirDetalhes()`: Imprime no console todos os dados do livro (Título, Autor, Preço e Estoque atual).

---

### 2. Classe `Main` (Teste)
Deve simular o uso do sistema.

1.  Instancie **dois livros diferentes** (ex: "Clean Code" e "O Senhor dos Anéis").
2.  Tente realizar uma venda do primeiro livro (deve falhar, pois estoque é 0).
3.  Adicione estoque a ambos os livros.
4.  Realize uma venda válida em apenas um dos livros.
5.  Chame o método `exibirDetalhes()` para ambos, comprovando que a alteração em um objeto não afetou o outro.

---

## ✅ Saída Esperada (Exemplo)

```text
--- Tentativa de Venda Inicial ---
Estoque insuficiente para Clean Code!

--- Adicionando Estoque ---
Estoque atualizado.

--- Realizando Venda ---
Venda de Clean Code realizada!

--- Relatório Final ---
Livro: Clean Code | Autor: Robert C. Martin | Preço: 90.0 | Estoque: 4
Livro: O Senhor dos Anéis | Autor: Tolkien | Preço: 120.0 | Estoque: 10