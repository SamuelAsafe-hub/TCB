document.getElementById("btnSalvar").addEventListener("click", async () => {

    // Montar Objeto
  const usuario = {
    nickname: document.getElementById("nickname").value,
    senha: document.getElementById("senha").value,
    saldo: parseFloat(document.getElementById("saldo").value) || 0
  };

  // Navegador chama rota do Java
  const resp = await fetch("/api/usuarios", {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(usuario) // Converte em JSON para viajar pela rede.
  });

  const dados = await resp.json();
  const msg = document.getElementById("mensagem");

  if (resp.ok) {
    msg.textContent = dados.mensagem;
  } else {
    msg.textContent = "Erro: " + dados.erro;
  }
});