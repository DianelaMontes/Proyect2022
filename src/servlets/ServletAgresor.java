package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.AgresorDTO;
import service.AgresorService;

/**
 * Servlet implementation class ServletAgresor
 */
@WebServlet("/ServletAgresor")
public class ServletAgresor extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	AgresorService serviAgresor = new AgresorService();
	

    /**
     * Default constructor. 
     */
    public ServletAgresor() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}*/
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	      String xtipo = request.getParameter("tipo");

	      if (xtipo.equals("listar")) {

	         listar(request, response);

	      }
	      else if (xtipo.equals("buscar")) {
				buscar(request, response);
			}
			else if (xtipo.equals("registrar")) {
				registrar(request, response);
			}
			else if (xtipo.equals("actualizar")) {
				actualizar(request, response);
			}
			else if (xtipo.equals("eliminar")) {
				eliminar(request, response);
			}

	   }

	private void eliminar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String dni = request.getParameter("dni");
		serviAgresor.eliminarAgresor(dni);
		listar(request, response);
		
	}

	private void actualizar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombre, apellido;
		
		
	}

	private void registrar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String cod, nombre, apellido, dni, sexo;
		
		cod = request.getParameter("txt_cod");
		nombre = request.getParameter("txt_nombre");
		apellido = request.getParameter("txt_apellido");
		dni = request.getParameter("txt_dni");
		sexo = request.getParameter("cbo_sexo");
		AgresorDTO obj = new AgresorDTO();
		obj.setCodagr(cod);
		obj.setNomagr(nombre);
		obj.setApeagr(apellido);
		obj.setDni(dni);
		obj.setSexo(sexo);
		serviAgresor.registrarAgresor(obj);
		listar(request, response);
		
	}

	private void buscar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String dni = request.getParameter("dni");
		request.setAttribute("Producto", serviAgresor.buscarAgresor(dni));
		request.getRequestDispatcher("actualizarAgresor.jsp").forward(request, response);
		
	}

	private void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("data", serviAgresor.listarAgresor());
		request.getRequestDispatcher("listarAgresor.jsp").forward(request, response);
		
	}
	
}
