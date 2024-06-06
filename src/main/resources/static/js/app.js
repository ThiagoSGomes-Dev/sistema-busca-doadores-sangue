document
  .getElementById("search-form")
  .addEventListener("submit", function (event) {
    event.preventDefault();

    const nome = document.getElementById("nome").value;
    fetch(`https://sbdsp-2024-api.up.railway.app/doador/searchuser?nome=${nome}`)
      .then((response) => response.json())
      .then((data) => {
        const results = document.getElementById("results");
        results.innerHTML = "";
        if (data.length === 0) {
          results.innerHTML = "<p>Nenhum doador encontrado.</p>";
        } else {
          data.forEach((donor) => {
            const donorDiv = document.createElement("div");
            donorDiv.className = "donor";
            donorDiv.innerHTML = `
                            <p><strong>Nome:</strong> ${donor.nome}</p>
                            <p><strong>Tipo Sanguíneo:</strong> ${donor.tipo}</p>
                            <p><strong>Bairro:</strong> ${donor.bairro}</p>
                            <p><strong>Foto:</strong> <a href="${donor.fotoUrl}" target="_blank">Ver Foto</a></p>
                        `;
            results.appendChild(donorDiv);
          });
        }
      })
      .catch((error) => {
        console.error("Error:", error);
      });
  });
