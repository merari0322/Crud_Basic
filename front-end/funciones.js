document.addEventListener("DOMContentLoaded", function() {
    let activeMenu = null; // Guardará el menú abierto

    // Lista de botones con sus respectivos menús
    let botones = [
        { boton: "boton1", menu: "menu1" },
        { boton: "boton2", menu: "menu2" }
    ];

    botones.forEach(item => {
        let boton = document.getElementById(item.boton);
        let menu = document.getElementById(item.menu);

        // Evento para abrir el menú al pasar el cursor
        boton.addEventListener("mouseenter", function() {
            // Cerrar el menú anterior si hay uno abierto
            if (activeMenu && activeMenu !== menu) {
                activeMenu.style.display = "none";
            }
            // Mostrar el menú actual
            menu.style.display = "block";
            activeMenu = menu;
        });

        // Evento para cerrar el menú cuando el cursor salga del botón y el menú
        boton.addEventListener("mouseleave", function(event) {
            setTimeout(() => {
                if (!menu.matches(":hover") && !boton.matches(":hover")) {
                    menu.style.display = "none";
                    activeMenu = null;
                }
            }, 200); // Agregamos un pequeño retraso para evitar cierres bruscos
        });

        menu.addEventListener("mouseleave", function() {
            menu.style.display = "none";
            activeMenu = null;
        });
    });
});
