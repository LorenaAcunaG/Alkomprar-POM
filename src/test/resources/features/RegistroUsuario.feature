#language:es
Característica: : Registro de usuario en la pagina de Alkomprar
  yo como usuario quiero registrarme en la pagina alkomprar
  para comprar productos.

  @RegistroExitoso
  Escenario: Registro de usuario exitoso.
    Dado que el usuario abre la pagina alkomprar
    Cuando cuando el usuario haga hover en mi cuenta y selecciona mi perfil
    Y el usuario ingresa un correo no registrado, da click en siguiente
    Y el usuario ingresa los campos solicitados, acepta terminos y condiciones y da click en continuar
    Entonces el usuario podra ver un mensaje de mi cuenta en la plataforma.