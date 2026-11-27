const form = document.getElementById("DadosAtividade");
const btnAbrir = document.getElementById("btnCdsAtividade");

btnAbrir.addEventListener("click", () => {
  form.hidden = false;      // mostra o formulário
  btnAbrir.hidden = true;   // esconde o botão "Cadastrar"
});

document.getElementById("btnCancelar").addEventListener("click", () => {
  form.hidden = true;       // esconde o formulário
  btnAbrir.hidden = false;  // mostra o botão de novo
});