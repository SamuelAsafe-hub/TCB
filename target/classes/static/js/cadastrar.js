document.getElementById("btnCadastrar").addEventListener("click", async () => {
  const msg = document.getElementById("mensagem");

  const usuario = {
    nickname: document.getElementById("nickname").value,
    senha: document.getElementById("senha").value
  };

  if (!usuario.nickname || !usuario.senha) {
    msg.textContent = "Preencha o nickname e a senha";
    return;
  }

  const resp = await fetch("/api/usuarios", {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(usuario)
  });

  let dados = {};
  try { dados = await resp.json(); } catch (e) {}

  if (resp.ok) {
    window.location.href = "login.html";
  } else {
    msg.textContent = "Erro: " + (dados.erro || resp.status);
  }
});