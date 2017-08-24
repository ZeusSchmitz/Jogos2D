<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript" src="calcula.js"></script>
    <link rel="stylesheet" type="text/css" href="estiloCalc.css">
    <title>Calculadora Online</title>
  </head>
  <body>
    <form action="Servlet" name="calculo">
      <div id="interface">
        <h1>CALCULADORA</h1>
        <div id="fundo-tabela">
          <table class="calculadora" id="calc" border="1">
            <br>
            <tr>
              <td colspan="3" id="calc-td-result">
                <input type="text" name="calc-result"  maxlength="9" size="9" placeholder="0" 
                       id="calc-result" readonly="readonly" value="<%=request.getAttribute("calc-result")%>">
              </td>
              <td></td>
              <td>
                <input type="button" name="btnC" value="C" id="btn" onclick="limpar()" >  				
              </td>	
              <td>
                <input type="button" name="btnCE" value="CE" id="btn" onclick="limpar()">  				
              </td>	
            </tr>

            <tr>
              <td>
                <input type="button" name="btn7" value="7" id="btn" onclick="botao(value)">  				
              </td>	
              <td >
                <input type="button" name="btn8" value="8" id="btn" onclick="botao(value)">  				
              </td>	
              <td>
                <input type="button" name="btn9" value="9" id="btn" onclick="botao(value)">  				
              </td>	
              <td></td>  			  
              <td>
                <input type="button" name="btnMaisMenos" value="+/-" id="btn" onclick="numEspec('+-')">  				
              </td>	  			  
              <td>
                <input type="button" name="btnPorc" value="%" id="btn" onclick="numEspec('porc')">  				
              </td>	
            </tr>

            <tr>
              <td>
                <input type="button" name="btn4" value="4" id="btn" onclick="botao(value)">  				
              </td>	
              <td>
                <input type="button" name="btn5" value="5" id="btn" onclick="botao(value)">  				
              </td>	
              <td>
                <input type="button" name="btn6" value="6" id="btn" onclick="botao(value)">  				
              </td>
              <td></td>	  			  
              <td>
                <input type="button" name="btnMais" value="+" id="btn" onclick="botao(value)">  				
              </td>	
              <td>
                <input type="button" name="btnMenos" value="-" id="btn" onclick="botao(value)">  				
              </td>	
            </tr>

            <tr>
              <td>
                <input type="button" name="btn1" value="1" id="btn" onclick="botao(value)">  				
              </td>	
              <td>
                <input type="button" name="btn2" value="2" id="btn" onclick="botao(value)">  				
              </td>	
              <td>
                <input type="button" name="btn3" value="3" id="btn" onclick="botao(value)">  				
              </td>	  			  
              <td></td>
              <td>
                <input type="button" name="btnX" value="*" id="btn" onclick="botao(value)">  				
              </td>	
              <td>
                <input type="button" name="btnDivi" value="/" id="btn" onclick="botao(value)">  				
              </td>	
            </tr>

            <tr>
              <td>
                <input type="button" name="btn0" value="0" id="btn" onclick="botao(value)">  				
              </td>	
              <td>
                <input type="button" name="btnPonto" value="." id="btn" onclick="botao(value)">  				
              </td>	
              <td colspan="3">
                <input type="button" name="btn" id="btn" disabled="disabled">  				
              </td>
              <td>
                <input type="button" name="btnIgual" value="=" id="btn" onclick="calcula()">  				
              </td>	
            </tr>
          </table>
        </div>
      </div>
      <input hidden="true" id="total" name="total">
    </form>
  </body>
</body>
</html>
