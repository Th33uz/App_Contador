📱 Projeto - Contador em Kotlin

Aplicativo Android desenvolvido em Kotlin com a finalidade de implementar um contador simples.

📖 Descrição

O app permite ao usuário incrementar e decrementar valores em um contador de forma prática e intuitiva.
Ele foi desenvolvido como exercício para praticar desenvolvimento Android com Kotlin, utilizando ConstraintLayout para a interface.

⚙️ Funcionalidades

➕ Incrementar valores no contador.

➖ Decrementar valores no contador.

🚫 Impede que o contador tenha números negativos, exibindo uma Snackbar de aviso.

📲 Interface simples e funcional.

🛠️ Tecnologias utilizadas

Linguagem: Kotlin

Interface: XML (ConstraintLayout)

SDK: Android SDK

Biblioteca usada: com.google.android.material (para Snackbar)

▶️ Como executar

Clone o repositório do projeto.

git clone https://github.com/Th33uz/contador-kotlin.git


Abra o projeto no Android Studio.

Conecte um dispositivo Android físico ou use um emulador.

Clique em Run ▶️ para executar o app.

📂 Estrutura do Projeto

MainActivity.kt → lógica do contador.

activity_main.xml → layout da interface.

🖥️ Exemplo de uso

Valor inicial: 0

Ao clicar em ➕ → 1

Ao clicar em ➖ → 0

Se tentar reduzir abaixo de 0, aparece:

Não pode números negativos!

📌 Observações

Projeto criado para aprendizado em Kotlin e Android Studio.

Pode ser expandido para incluir limite máximo, reset do contador ou até salvamento de estado.
