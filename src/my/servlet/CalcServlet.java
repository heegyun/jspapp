package my.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.*;


/**
 * Servlet implementation class CalcServlet
 */
@WebServlet("/CalcServlet")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 변수 선언
		int  num1,num2;
		int result;
		String op;

		// 클라이언트 응답시 전달될 컨텐트에 대한 타잎 설정과 캐릿터셋 지정
		response.setContentType("text/html; charset=UTF-8");

		//클라이언트 응답을 위한 출력 스트림 확보
		PrintWriter out = response.getWriter();
		
		// HTML 폼을 통해 전달된 num1, num2 파라미터 값을 변수에 할당한다.
		//이때 getParameter() 메서드는 문자열을 리턴하므로 숫자형 데이터의 경우 Integer.parseInt() 를 통해 int로 변환 한다.
		num1 = Integer.parseInt(request.getParameter("num1"));
		num2 = Integer.parseInt(request.getParameter("num2"));
		op = request.getParameter("operator");
		// calc() 메서드 호출로 결과를 받아 온다.
		result = calc(num1,num2,op);

		// 출력 스트림을 통해 화면을 구성 한다.
		out.println("<HTML>");
		out.println("<HEAD><TITLE>계산기</TITLE></HEAD>");
		out.println("<BODY><center>");
		out.println("<H2>계산결과</H2>");
		out.println("<HR>");
		out.println(num1+" "+op+" "+num2+" = "+result);
		out.println("</BODY></HTML>");
	}

	//실제 계산 기능을 수행하는 메서드
	public int calc(int num1, int num2, String op) {
		int result = 0;

		if(op.equals("+")) {
			result = num1 + num2;
		}
		else if(op.equals("-")) {
			result = num1 - num2;
		}
		else if(op.equals("*")) {
			result = num1 * num2;
		}
		else if(op.equals("/")) {
			result = num1 / num2;
		}
		return result;
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
				doGet(request,response);
		}
	
}
