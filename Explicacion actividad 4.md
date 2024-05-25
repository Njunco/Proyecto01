1. Actualizar la fecha de vencimiento de una tarea
Historia de usuario: Como usuario, quiero poder actualizar la fecha de vencimiento de una tarea para reflejar el plazo correcto.

Implementación:

Modelo: Se añadió un campo dueDate de tipo Date a la entidad Task.
![image](https://github.com/Njunco/Proyecto01/assets/169322219/36a1b167-ea3f-44e2-b073-4597d8ba4464)

Servicio: Se añadió el método updateDueDate en TaskService.
![image](https://github.com/Njunco/Proyecto01/assets/169322219/95bf401f-fa35-4c5f-bc84-a89bf91cac5c)

Controlador: Se añadió el endpoint correspondiente en TaskController.
![image](https://github.com/Njunco/Proyecto01/assets/169322219/9d183ce7-922a-4c60-bd5f-51da8a624cfc)

2. Asignar una tarea a un usuario específico
Historia de usuario: Como usuario, quiero poder asignar una tarea a un usuario específico para organizar mejor las responsabilidades.

Implementación:

Modelo: Se añadió un campo assignedUser de tipo String a la entidad Task.
![image](https://github.com/Njunco/Proyecto01/assets/169322219/b9fb5ef3-3853-4bab-aaa3-0e61ecb14e6d)

Servicio: Se añadió el método assignUser en TaskService.

![image](https://github.com/Njunco/Proyecto01/assets/169322219/30fb5ac1-5d6a-4a82-8813-263678e0817a)

Controlador: Se añadió el endpoint correspondiente en TaskController.

![image](https://github.com/Njunco/Proyecto01/assets/169322219/7867dd9d-f52a-44b0-b155-3aff96ff4772)

3. Agregar etiquetas a una tarea
Historia de usuario: Como usuario, quiero poder agregar etiquetas a una tarea para organizar y categorizar mejor mis tareas.

Implementación:

Modelo: Se añadió un campo tags de tipo List<String> a la entidad Task usando @ElementCollection.
![image](https://github.com/Njunco/Proyecto01/assets/169322219/f57a9927-3617-47d1-8407-9704431b697e)

Servicio: Se añadió el método addTags en TaskService.
![image](https://github.com/Njunco/Proyecto01/assets/169322219/1bd348ef-6b19-4c15-be09-1baf758b9303)

Controlador: Se añadió el endpoint correspondiente en TaskController.

![image](https://github.com/Njunco/Proyecto01/assets/169322219/9313780c-67d0-4463-9256-d5a07888b759)

4. Priorizar una tarea
Historia de usuario: Como usuario, quiero poder establecer la prioridad de una tarea para poder gestionar mejor mis tareas más importantes.

Implementación:

Modelo: Se añadió un campo priority de tipo String a la entidad Task
![image](https://github.com/Njunco/Proyecto01/assets/169322219/f7174cc3-fe67-45b7-892d-45d2ac9b9f28)

Servicio: Se añadió el método setPriority en TaskService.

![image](https://github.com/Njunco/Proyecto01/assets/169322219/151e5221-5ffb-46f7-901b-e1110158bf3a)

Controlador: Se añadió el endpoint correspondiente en TaskController.
![image](https://github.com/Njunco/Proyecto01/assets/169322219/0e30d69e-37ec-42a5-af0d-f0e01b3a72be)

5. Agregar comentarios a una tarea
Historia de usuario: Como usuario, quiero poder agregar comentarios a una tarea para tener un registro de notas o discusiones relacionadas con la tarea.

Implementación:

Modelo: Se añadió un campo comments de tipo List<String> a la entidad Task usando @ElementCollection.
![image](https://github.com/Njunco/Proyecto01/assets/169322219/12d3a7ca-042a-4bf6-bf05-56249bf532c6)

Servicio: Se añadió el método addComments en TaskService.
![image](https://github.com/Njunco/Proyecto01/assets/169322219/d7f10f44-2d12-41a6-bc84-7bb4d86b93ca)

Controlador: Se añadió el endpoint correspondiente en TaskController.

![image](https://github.com/Njunco/Proyecto01/assets/169322219/a984aeab-d987-45b8-a066-ba44559854a3)


