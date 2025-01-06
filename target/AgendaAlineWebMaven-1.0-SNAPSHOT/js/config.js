/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/javascript.js to edit this template
 */
function applyBackground(seletor, caminhoImg) {
    const element = document.getElementById(seletor);
    if (element) {
        element.style.backgroundImage = 'url('+caminhoImg+')';
        console.log(caminhoImg);
    } else {
        console.warn(`Elemento com o seletor "${seletor}" não encontrado.`);
    }
}


