package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.AgresorDTO;
import beans.DenunciaDTO;
import beans.ProductoDTO;
import service.DenunciaService;

/**
 * Servlet implementation class ServletDenuncia
 */
@WebServlet("/ServletDenuncia")
public class ServletDenuncia extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	DenunciaService serviDenuncia = new DenunciaService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDenuncia() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	      String xtipo = request.getParameter("tipo");

	      if (xtipo.equals("listar")) {
	         listar(request, response);

	      }
	      
			else if (xtipo.equals("registrar")) {
				registrar(request, response);
			
			}
	   }

	      
	  	private void registrar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			/*
				int marca, stock;
		String des = request.getParameter("txt_des");
		double pre = Double.parseDouble(request.getParameter("txt_pre"));
		stock = Integer.parseInt(request.getParameter("txt_stock"));
		marca = Integer.parseInt(request.getParameter("cbo_marca"));
		ProductoDTO obj = new ProductoDTO();
		obj.setDescripcion(des);
		obj.setPrecio(pre);
		obj.setStock(stock);
		obj.setCodMarca(marca);
		serviProducto.registraProducto(obj);
		listar(request, response);
			*/
		}

		
		private void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			/*
			request.setAttribute("data", serviProducto.listaProducto());
		request.getRequestDispatcher("listarProducto.jsp").forward(request, response);
			*/
		}
	      
}
