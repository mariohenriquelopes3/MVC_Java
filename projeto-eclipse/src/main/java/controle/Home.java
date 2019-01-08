package controle;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.HomeDAO;

@WebServlet("/home/index.java")
public class Home extends MyServlet {

	private static final long serialVersionUID = 1L;

	private List<modelo.Home> lista;

	@Override
	protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
		this.executa(req, resp);
	}

	protected void doPost(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
		this.executa(req, resp);
	}

	@Override
	protected void executa(final HttpServletRequest req, final HttpServletResponse resp) throws IOException, ServletException {
		super.executa(req, resp);

		this.lista = HomeDAO.findAll();

		final RequestDispatcher rd = req.getRequestDispatcher("/view/home/index.jsp");
		rd.forward(req, resp);
	}

	public List<modelo.Home> getLista() {
		return this.lista;
	}

}
