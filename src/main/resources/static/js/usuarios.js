// Call the dataTables jQuery plugin
$(document).ready(function() {
	cargarUsuarios();
	$('#usuarios').DataTable();
});

async function cargarUsuarios() {
	const request = await fetch("api/usuarios", {
		method: "get",
		headers: {
			'Accept': 'application/json',
			'Content-Type': 'application/json'
		}
	});
	
	const usuarios = await request.json();
	
	let usuarioHtml = '';
	for (const usuario in usuarios) {
		usuarioHtml += '<tr><td>'+usuarios[usuario].id+'</td><td>'+usuarios[usuario].nombre+' </td><td>'+usuarios[usuario].email+'</td><td>'+usuarios[usuario].email+'</td><td><a href="#" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a></td></tr>';		
	}
	
	document.querySelector('#usuarios tbody').outerHTML = usuarioHtml;
}