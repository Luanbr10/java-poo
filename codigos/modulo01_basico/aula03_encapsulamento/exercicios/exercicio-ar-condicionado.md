# ❄️ Desafio: Ar Condicionado Inteligente

**Módulo 01:** Encapsulamento e Validação

---

## 🎯 Objetivo
Implementar uma classe `ArCondicionado` onde a temperatura é rigorosamente controlada por Encapsulamento. O aparelho só funciona dentro de uma faixa segura de operação.

---

## 📝 Requisitos

### 1. Classe `ArCondicionado`
**Atributos (Privados):**
* `modelo` (String)
* `temperatura` (int)

**Construtor:**
* Recebe o `modelo` e a `temperaturaInicial`.
* **Regra:** Deve usar o método `setTemperatura` internamente para garantir que o objeto não nasça com valor inválido.

**Métodos (Getters e Setters):**
* `getModelo()` / `setModelo()`: Padrão.
* `getTemperatura()`: Padrão.
* **`setTemperatura(int novaTemp)` (O Guardião):**
    * O aparelho só suporta temperaturas entre **15°C e 30°C**.
    * **Se** a `novaTemp` estiver dentro da faixa (15 a 30): Atualiza o atributo.
    * **Se** estiver fora (ex: 10 ou 40): **Não muda** a temperatura e imprime um aviso: "⚠️ Temperatura inválida! O sistema suporta apenas entre 15°C e 30°C."

**Método Extra:**
* `exibirStatus()`: Mostra "Modelo: X | Temperatura Atual: Y".

---

### 2. Classe `Main`

1.  Instancie um Ar Condicionado (ex: "LG Dual Inverter") tentando iniciar com **40°C** (O construtor deve barrar e definir um padrão ou manter 0/null dependendo da sua lógica, ou você pode definir um padrão de segurança no setter). *Dica: Se falhar, defina 20°C como padrão no setter ou inicie com um valor seguro.*
2.  Tente mudar para **10°C** (Deve falhar e manter o valor anterior).
3.  Tente mudar para **22°C** (Deve funcionar).
4.  Tente mudar para **35°C** (Deve falhar).
5.  Exiba o status final.